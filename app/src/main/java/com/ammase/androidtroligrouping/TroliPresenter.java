package com.ammase.androidtroligrouping;

import com.ammase.androidtroligrouping.model.ResponseTroli;
import com.ammase.androidtroligrouping.network.NetworkClient;
import com.ammase.androidtroligrouping.network.RequestAPI;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by programmer on 11/6/17.
 */

public class TroliPresenter {
    private TroliView view;
    private CompositeDisposable mCompositeDisposable;

    public TroliPresenter(TroliView view) {
        this.view = view;
    }

    public void LoadData(String Auth, String Token) {
        RequestAPI requestAPI = NetworkClient.getRetrofit().create(RequestAPI.class);
        if (mCompositeDisposable == null) mCompositeDisposable = new CompositeDisposable();
        mCompositeDisposable.add(requestAPI.getResultTroli("Bearer "+Auth, Token)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(
                        responseAuth -> combineSuccessObserver(responseAuth),
                        throwable -> combineErrorObserver(throwable)
                )
        );
    }

    private void combineSuccessObserver(ResponseTroli responseAuth) {
        view.handleLoadSuccess(responseAuth);
    }

    private void combineErrorObserver(Throwable throwable) {
        view.handleLoadError(throwable);
    }
}
