package com.example.unittesting

import androidx.core.util.PatternsCompat
import com.google.common.truth.Truth.assertThat
import org.junit.Test
import java.util.regex.Pattern

/**
 * Created by EmreHamurcu on 3/11/2021.
 */
class ValidatorTest {
    @Test
    fun `empty username returns false`() {

        val result = Validator.signupValidator(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username correctly repeated password`() {

        val result = Validator.signupValidator(
            "emre",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username already exist`() {

        val result = Validator.signupValidator(
            "emre",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty passwords`() {

        val result = Validator.signupValidator(
            "emre",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `passwords repeated incorrect`() {

        val result = Validator.signupValidator(
            "emre",
            "123",
            "asdas"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `passwords contains less than 2 digit`() {

        val result = Validator.signupValidator(
            "emre",
            "1",
            "1"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `check username is valid`() {
        val pattern: Pattern = PatternsCompat.EMAIL_ADDRESS
        val ret = pattern.matcher("emre@emrecom").matches()
        assertThat(ret).isFalse()
    }

}

