package com.example.unittesting

import android.content.Context
import android.util.Log
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

/**
 * Created by EmreHamurcu on 3/16/2021.
 */
class ResourceComparerTest {

    private lateinit var resourceComparer: ResourceComparer

    @Before
    fun setup() {
        Log.d("TAG", "setup: ")
        resourceComparer = ResourceComparer()
    }

    @After
    fun afterSetup() {
        Log.d("TAG", "afterSetup: ")
    }

    @Test
    fun stringResourcesSameAsGivenString_returnsTrue() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context, "UnitTesting", R.string.app_name)
        assertThat(result).isTrue()
    }

    @Test
    fun stringResourcesDifferentAsGivenString_returnsFalse() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context, "Helloo", R.string.app_name)
        assertThat(result).isFalse()
    }
}