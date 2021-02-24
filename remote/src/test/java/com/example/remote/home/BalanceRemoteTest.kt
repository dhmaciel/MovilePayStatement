package com.example.remote.home

import com.example.remote.home.entities.BalanceRemote
import com.example.remote.home.entities.toDomain
import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.*
import org.junit.Test

class BalanceRemoteTest {

    @Test
    fun `when convert BalanceRemote should be same fields values`() {
        // GIVEN
        val balanceRemote = getDummyBalanceRemoteObject()
        // WHEN
        val balance = balanceRemote.toDomain()
        /// THEN
        assertThat(balance.label, `is`("Saldo disponíevl"))
        assertThat(balance.value, `is`("R$ 50.000,00"))
    }

    private fun getDummyBalanceRemoteObject() =
        BalanceRemote("Saldo disponíevl", value = "R$ 50.000,00")
}