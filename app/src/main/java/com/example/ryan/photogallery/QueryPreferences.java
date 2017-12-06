package com.example.ryan.photogallery;

import android.content.Context;
import android.preference.Preference;
import android.preference.PreferenceManager;

/**
 * Created by Ryan on 12/4/2017.
 */

public class QueryPreferences {

    private static final String PREF_SEARCH_QUERY = "searchQuery";
    private static final String PREF_LAST_RESULT_ID = "lastResultId";

    public static String getStoredQuery(Context context){
        return PreferenceManager.getDefaultSharedPreferences(context).getString(PREF_SEARCH_QUERY, null);
    }
    public static void setStoredQuery(Context context, String query)
    {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString(PREF_SEARCH_QUERY, query).apply();

    }

    public static String getLastResultId(Context context){
        return PreferenceManager.getDefaultSharedPreferences(context).getString(PREF_LAST_RESULT_ID, null);

    }

    public static void setLastResultId(Context context, String lastResultId){
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString(PREF_LAST_RESULT_ID, lastResultId).apply();


    }
}
