package com.example.unittesting

object Validator {
    private const val PASSWORD_MIN_COUNT = 5

    /**
     * @param userRegister data class to be validate
     */
    fun registerValidator(userRegister: UserRegister): Boolean {
        userRegister.apply {
            if (userName.isEmpty()) return false
            if (password.isEmpty()) return false
            if (password != confirmedPassword) return false
            if (password.length < PASSWORD_MIN_COUNT) return false
            return true
        }
    }
}