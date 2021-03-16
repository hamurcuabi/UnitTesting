package com.example.unittesting

import android.content.Context

/**
 * Created by EmreHamurcu on 3/16/2021.
 */
class ResourceComparer {

    fun isEqual(context: Context, string: String, resId: Int): Boolean {
        return context.getString(resId) == string
    }
}