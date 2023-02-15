package com.behad.mvi_android

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.behad.mvi_android.ktor.DevBytesService
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {

    private val devBytesService = DevBytesService()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        runBlocking {
            try {
                Log.d("response", "onCreate: ${devBytesService.getBytes()}")
            } catch (e: Exception) {
                Log.d("exc", "onCreate: $e")
            }
        }
    }
}
