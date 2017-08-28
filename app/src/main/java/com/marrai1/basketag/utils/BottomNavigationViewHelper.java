package com.marrai1.basketag.utils;

import android.util.Log;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

/**
 * Created by marrai1 on 26/08/2017.
 */

public class BottomNavigationViewHelper 
{
    private static final String TAG = "BottomNavigationViewHel";

    public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx)
    {
        Log.d(TAG, "setupBottomNavigationView: Setting up BottomNavigationView");
        bottomNavigationViewEx.enableAnimation(true);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
    }
}
