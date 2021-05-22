package com.example.unittesting

import com.example.unittesting.Validator.DEFAULT_PASSWORD
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test


/**
 * Rev           1.0
 * Author        hamurcuabi
 * Date          5/22/2021
 * FileName
 */
class ValidatorTest {

    private lateinit var userRegister: UserRegister

    @Before
    fun prepareData() {
        println("Before")
        userRegister = UserRegister("Emre", "12345", "12345")
    }

    @After
    fun tearDown() {
        println("after")
    }

    @Test
    fun test_username_invalid_returns_false() {
        val result = Validator.registerValidator(userRegister.copy(""))
        assertThat(result).isFalse()
    }

    @Test
    fun test_password_invalid_returns_false() {
        val result = Validator.registerValidator(userRegister.copy(""))
        assertThat(result).isFalse()
    }

    @Test
    fun test_valid_userRegisterObjet_returns_true() {
        val result = Validator.registerValidator(userRegister)
        assertThat(result).isTrue()
    }

    @Test
    fun test_generateRegisterObject_with_name_return_false() {
        val name = "Emre"
        val expected = UserRegister("dsafds", DEFAULT_PASSWORD, DEFAULT_PASSWORD)

        val result = Validator.generateRegisterObject(name)

        assertThat(result).isNotEqualTo(expected)

    }

    @Test
    fun test_generateRegisterObject_with_name_return_true() {
        val name = "Emre"
        val expected = UserRegister(name, DEFAULT_PASSWORD, DEFAULT_PASSWORD)
        val result = Validator.generateRegisterObject(name)
        assertThat(result).isEqualTo(expected)

    }

    @Test
    fun test_isNullOrTextNull_returns_true() {
        val text = "null"
        val result = text.isNullOrTextNull()
        assertThat(result).isTrue()
    }

    @Test
    fun test_test_list() {
        val result = Validator.checkPosition(MockData.prepareRcvItemList())
        assertThat(result).isFalse()
    }

}

