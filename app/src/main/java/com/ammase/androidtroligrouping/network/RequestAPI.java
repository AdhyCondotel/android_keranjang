package com.ammase.androidtroligrouping.network;

import com.ammase.androidtroligrouping.model.ResponseTroli;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

public interface RequestAPI {

    @GET("/{token_device}/m/lkeranjang2")
    Observable<ResponseTroli> getResultTroli(@Header("Authorization") String Auth,
                                             @Path("token_device") String Token);

}