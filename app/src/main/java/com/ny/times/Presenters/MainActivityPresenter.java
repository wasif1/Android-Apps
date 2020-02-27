package com.ny.times.Presenters;

import android.app.Activity;

import com.ny.times.ApiClient.ApiClient;
import com.ny.times.Interface.MainActivityInterface;
import com.ny.times.Models.NyTimesResponse;
import com.ny.times.R;
import com.ny.times.Utills.InternetCheckHelper;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivityPresenter {

    private Activity activity;
    private MainActivityInterface mainActivityInterface;

    public MainActivityPresenter(Activity activity, MainActivityInterface mainActivityInterface) {
        this.activity = activity;
        this.mainActivityInterface = mainActivityInterface;
    }


    /**
     * CALL THE API FOR GETTING MOST POPULAR NY TIMES ARTICLES
     */
    public void getNYTimesArticles(String section, String period, String api_key) {

        if (mainActivityInterface != null) {
            // IF NO INTERNET
//            if (!InternetCheckHelper.isConnected()) {
//                mainActivityInterface.failure(activity.getResources().getString(R.string.no_internet));
//            } else {

            mainActivityInterface.viewLoader(true);

            Call<NyTimesResponse> call = ApiClient
                    .getInstance().getApi()
                    .getNyTimesMostPopularArticles(section, period, api_key);

            call.enqueue(new Callback<NyTimesResponse>() {
                @Override
                public void onResponse(Call<NyTimesResponse> call, Response<NyTimesResponse> response) {
                    mainActivityInterface.viewLoader(false);
                    mainActivityInterface.success(response.body());
                }

                @Override
                public void onFailure(Call<NyTimesResponse> call, Throwable t) {
                    mainActivityInterface.viewLoader(false);
                    mainActivityInterface.failure(t.getMessage());
                }
            });
//            }
        }
    }


}
