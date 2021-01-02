package com.example.remote.home

import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test

class HomeRemoteTest {

    @Test
    fun when_hasHomeRemoteObject_should_equalityItems() {
        //Given
        val homeRemote = getHomeRemoteDummy()
        //When
        val homeDomain = homeRemote.toDomain()
        // Then
        assertNotNull(homeRemote)
        assertEquals(homeRemote.widgets.size, homeDomain.widgets.size)
    }

    private fun getHomeRemoteDummy() =
        HomeRemote(
            listOf(
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
                ),
                WidgetRemote(
                    content = ContentRemote(
                        button = ButtonRemote(
                            ActionRemote(
                                ContentActionRemote("123"),
                                identifier = "CARD_SCREEN"
                            ),
                            text = "Ver detalhes"
                        ), cardNumber = "•••• •••• •••• 8765", title = "Meu cartão"
                    ),
                    identifier = "HOME_CARD_WIDGET"
                ),
                WidgetRemote(
                    content = ContentRemote(
                        title = "Olá Fulano!"
                    ), identifier = "HOME_HEADER_WIDGET"
                )
            )
        )
}
