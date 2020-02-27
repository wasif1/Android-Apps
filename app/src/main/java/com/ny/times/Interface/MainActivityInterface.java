package com.ny.times.Interface;

import com.ny.times.Models.NyTimesResponse;

/**
 * CALL BACKS
 */
public interface MainActivityInterface {

    /**
     * SUCCESS WITH COMPLETE DATA
     */
    void success(NyTimesResponse response);

    /**
     * FAILURE WITH ERROR MESSAGE
     */
    void failure(String error);

    /**
     * SHOW/HIDE LOADER
     */
    void viewLoader(boolean show);
}
