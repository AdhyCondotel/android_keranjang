package com.ammase.androidtroligrouping;

import com.ammase.androidtroligrouping.model.ResponseTroli;

/**
 * Created by programmer on 11/6/17.
 */

public interface TroliView {
    void handleLoadError(Throwable throwable);
    void handleLoadSuccess(ResponseTroli responseAuth);
}
