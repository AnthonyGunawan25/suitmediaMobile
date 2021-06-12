package com.example.suitmedia;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Service {
    @GET("596dec7f0f000023032b8017")
    Call<Guest> getGuest();

}
