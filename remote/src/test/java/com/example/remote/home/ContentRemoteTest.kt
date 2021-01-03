package com.example.remote.home

import org.hamcrest.CoreMatchers.*
import org.junit.Assert.*
import org.junit.Test

class ContentRemoteTest {

    @Test
    fun `when convert ContentRemote should be same fields values`() {
        // GIVEN
        val contentRemote = getDummyContentRemoteObject()
        // WHEN
        val content = contentRemote.toDomain()
        // THEN
        assertThat(content.title, `is`(equalTo("Meu saldo")))
        assertThat(content.balance, `is`(notNullValue()))
        assertThat(content.button, `is`(notNullValue()))
        assertThat(content.cardNumber, `is`(nullValue()))
    }

    private fun getDummyContentRemoteObject() = ContentRemote(
        balance = BalanceRemote("Saldo disponíevl", value = "R$ 50.000,00"),
        button = ButtonRemote(
            ActionRemote(
                ContentActionRemote("123"),
                identifier = "STATEMENT_SCREEN"
            ),
            text = "Ver extrato"
        ),
        title = "Meu saldo"
    )
}