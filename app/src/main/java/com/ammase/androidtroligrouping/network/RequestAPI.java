package com.ammase.androidtroligrouping.network;

import com.ammase.androidtroligrouping.model.ResponseGetTroli;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

public interface RequestAPI {
    @GET("/{token_device}/m/lkeranjang2")
    Observable<ResponseGetTroli> getResultKeranjang(@Header("Authorization") String Auth,
                                                    @Path("token_device") String TokenDevice);

}