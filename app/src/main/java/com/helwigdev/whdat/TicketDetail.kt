package com.helwigdev.whdat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import com.helwigdev.whdat.models.ATTicket

class TicketDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme() {
                TicketMetadata(ATTicket(
                    Number = "T20211211.1234",
                    Title = "Some ticket title"
                ))
            }

        }
    }

}