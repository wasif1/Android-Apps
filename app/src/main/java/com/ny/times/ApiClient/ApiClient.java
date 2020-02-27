package com.ny.times.ApiClient;


import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ny.times.BuildConfig;
import com.ny.times.Utills.Constants;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * This is Retrofit API Client to setup Retrofit
 */


public class ApiClient {

    // RETROFIT OBJECT
    public static ApiClient Instance;
    public static Retrofit retrofit;
    private static OkHttpClient client;


    /**
     * GET API CLIENT
     */
    private ApiClient(Context context) {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        Gson gson = new GsonBuilder()
                .create();

        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        client = new OkHttpClient().newBuilder()
                .connectTimeout(120, TimeUnit.SECONDS)
                .readTimeout(120, TimeUnit.SECONDS)
                .writeTimeout(120, TimeUnit.SECONDS)
                .addInterceptor(interceptor)
                .build();

        client.dispatcher().cancelAll();

        retrofit = new Retrofit.Builder()
                .baseUrl(Constants.BaseUrl)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }

    /**
     * CREATE API INSTANCE
     * will not catch unauthenticated error
     */
    public static synchronized ApiClient getInstance() {
        if (Instance == null) {
            Instance = new ApiClient(null);
        }
        return Instance;
    }


    public ApiInterface getApi() {
        return retrofit.create(ApiInterface.class);
    }


    public static void cancelAll() {
        client.dispatcher().cancelAll();
    }
}
