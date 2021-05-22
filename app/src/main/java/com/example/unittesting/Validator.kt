package com.example.unittesting

object Validator {
    private const val PASSWORD_MIN_COUNT = 5
    const val DEFAULT_PASSWORD = "212344"

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

    fun generateRegisterObject(name: String): UserRegister {
        return UserRegister(userName = name, DEFAULT_PASSWORD, DEFAULT_PASSWORD)
    }

    fun checkPosition(rcvList: ArrayList<RcvItem>): Boolean {
        val filteredList = rcvList.filter {
            it.isChecked && it.position % 2 == 0
        }
        return filteredList.isEmpty()
    }
}

fun String.isNullOrTextNull(): Boolean {
    return this.isBlank() || this == "null"
}