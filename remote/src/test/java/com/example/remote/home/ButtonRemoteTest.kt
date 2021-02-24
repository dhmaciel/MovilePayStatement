package com.example.remote.home

import com.example.remote.home.entities.ActionRemote
import com.example.remote.home.entities.ButtonRemote
import com.example.remote.home.entities.ContentActionRemote
import com.example.remote.home.entities.toDomain
import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.*
import org.junit.Test

class ButtonRemoteTest {

    @Test
    fun `when convert ButtonRemote object should be same fields values`() {
        // GIVEN
        val buttonRemote = getDummyButtonRemoteObject()
        // WHEN
        val button = buttonRemote.toDomain()
        // THEN
        assertNotNull(button.action)
        assertThat(button.text, `is`("Ver extrato"))
    }

    private fun getDummyButtonRemoteObject() =
        ButtonRemote(
            ActionRemote(
                ContentActionRemote("123"),
                identifier = "STATEMENT_SCREEN"
            ),
            text = "Ver extrato"
        )
}