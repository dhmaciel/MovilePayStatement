package com.example.remote.home

import com.example.remote.home.entities.ActionRemote
import com.example.remote.home.entities.BalanceRemote
import com.example.remote.home.entities.ButtonRemote
import com.example.remote.home.entities.ContentActionRemote
import com.example.remote.home.entities.ContentRemote
import com.example.remote.home.entities.WidgetRemote
import com.example.remote.home.entities.toDomain
import org.hamcrest.CoreMatchers.*
import org.junit.Assert.*
import org.junit.Test

class WidgetRemoteTest {

    @Test
    fun `when convert WidgetRemote to Widget domain should be same fields values`() {
        // GIVEN
        val widgetRemote = getDummyWidgetRemoteObject()
        // WHEN
        val domainWidget = widgetRemote.toDomain()
        // THEN
        assertThat(domainWidget.identifier, `is`(equalTo(domainWidget.identifier)))
        assertThat(domainWidget.content, `is`(notNullValue()))
        assertThat(domainWidget.content, `is`(notNullValue()))
    }

    private fun getDummyWidgetRemoteObject() =
        WidgetRemote(
            content = ContentRemote(
                balance = BalanceRemote("Saldo disponíevl", value = "R$ 50.000,00"),
                button = ButtonRemote(
                    ActionRemote(
                        ContentActionRemote("123"),
                        identifier = "STATEMENT_SCREEN"
                    ),
                    text = "Ver extrato"
                ),
                title = "Meu saldo"
            ), identifier = "HOME_STATEMENT_WIDGET"
        )
}