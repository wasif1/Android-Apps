package com.ny.times.ApiClient;


import com.ny.times.Models.NyTimesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * This is Retrofit API Interface to call the API endpoints
 */

public interface ApiInterface {

    /* ============== */
    /*      APIs      */
    /* ============== */

    // NY TIMES MOST POPULAR ARTICLES
    @GET("svc/mostpopular/v2/mostviewed/{section}/{period}.json")
    Call<NyTimesResponse> getNyTimesMostPopularArticles(
            @Path("section") String section,
            @Path("period") String period,
            @Query("api-key") String api_key
    );

}
