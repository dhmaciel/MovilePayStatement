package com.example.remote.home

import com.example.remote.home.entities.ActionRemote
import com.example.remote.home.entities.ContentActionRemote
import com.example.remote.home.entities.toDomain
import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.*
import org.junit.Test

class ActionRemoteTest {

    @Test
    fun `when convert Action Remote object should be same fields values`() {
        // GIVEN
        val actionRemote = getDummyActionRemoteObject()
        // WHEN
        val action = actionRemote.toDomain()
        //THEN
        assertNotNull(action.content)
        assertThat(action.identifier, `is`("STATEMENT_SCREEN"))
    }

    private fun getDummyActionRemoteObject() =
        ActionRemote(
            ContentActionRemote("123"),
            identifier = "STATEMENT_SCREEN"
        )
}