package com.example.remote.home

import com.example.remote.home.entities.ActionRemote
import com.example.remote.home.entities.BalanceRemote
import com.example.remote.home.entities.ButtonRemote
import com.example.remote.home.entities.ContentActionRemote
import com.example.remote.home.entities.ContentRemote
import com.example.remote.home.entities.toDomain
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