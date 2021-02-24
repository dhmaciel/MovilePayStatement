package com.example.remote.home

import com.example.remote.home.entities.ContentActionRemote
import com.example.remote.home.entities.toDomain
import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.*
import org.junit.Test

class ContentActionRemoteTest {

    @Test
    fun `when convert Content Action Remote object should be same fields values`() {
        // GIVEN
        val contentActionRemote = getDummyContentActionRemoteObject()
        // WHEN
        val content = contentActionRemote.toDomain()
        // THEN
        assertThat(content.accountId, `is`("123"))
        assertNull(content.cardId)
    }

    private fun getDummyContentActionRemoteObject() =
        ContentActionRemote("123")
}