package com.example.core

import com.example.core.services.network.retrofit.buildRetrofitWith
import org.junit.Assert.*
import org.junit.Test

class RetrofitProviderTest {

    @Test
    fun `when has a host name should be create a Retrofit instance`() {
        // GIVEN
        val host = "http://gmail.com.br/"
        // WHEN
        val retrofit = buildRetrofitWith(host = host)
        // THEN
        assertNotNull(retrofit)
        assertEquals(host, retrofit.baseUrl().toString())
    }

    @Test(expected = IllegalArgumentException::class)
    fun `when has not name should not create a Retrofit instance`() {
        // GIVEN
        val host = ""
        // WHEN
        buildRetrofitWith(host = host)
        // THEN
    }
}