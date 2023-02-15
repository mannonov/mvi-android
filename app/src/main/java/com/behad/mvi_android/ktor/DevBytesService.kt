package com.behad.mvi_android.ktor

import com.behad.mvi_android.global.ByteResponse
import io.ktor.client.*
import io.ktor.client.request.*

class DevBytesService(private val httpClient: HttpClient = ktorHttpClient) {

    suspend fun getBytes(): ByteResponse =
        httpClient.get("https://devbytes.udacity.com/devbytes.json")
}
