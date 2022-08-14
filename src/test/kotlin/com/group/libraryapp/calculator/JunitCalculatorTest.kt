package com.group.libraryapp.calculator

import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class JunitCalculatorTest {

    lateinit var calculator: Calculator

    @BeforeEach
    fun setUp() {
        calculator = Calculator(5)
    }

    @Test
    fun addTest() {
        // when
        calculator.add(3)

        // then
        assertThat(calculator.number).isEqualTo(8)
    }

    @Test
    fun minusTest() {
        // when
        calculator.minus(3)

        // then
        assertThat(calculator.number).isEqualTo(2)
    }

    @Test
    fun multiplyTest() {
        // when
        calculator.multiply(3)

        // then
        assertThat(calculator.number).isEqualTo(15)
    }

    @Test
    fun divideTest() {
        // when
        calculator.divide(3)

        // then
        assertThat(calculator.number).isEqualTo(1)
    }

    @Test
    fun divideExceptionTest() {
        // when
//        val message = assertThrows<IllegalArgumentException> {
//            calculator.divide(0)
//        }.message

        // then
//        assertThat(message).isEqualTo("0으로 나눌 수 없습니다.")

        // 위 과정을 Scope function 사용해서 한번에 연이어 수행하기
        assertThrows<IllegalArgumentException> {
            calculator.divide(0)
        }.also {
            assertThat(it.message).isEqualTo("0으로 나눌 수 없습니다.")
        }
    }


}