package com.example.unittesting

import androidx.core.util.PatternsCompat

/**
 * Created by EmreHamurcu on 3/11/2021.
 */
object Validator {

    private val existingUser = listOf("emre", "ali", "ela")

    fun signupValidator(
        userName: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        if (userName.isEmpty() || password.isEmpty()) return false
        if (userName in existingUser) return false
        if (password != confirmedPassword) return false
        if (password.count { it.isDigit() } < 2) return false
        return true
    }
}