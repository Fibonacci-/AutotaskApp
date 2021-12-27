package com.helwigdev.whdat

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import com.helwigdev.whdat.models.ATTicket
import org.junit.Rule
import org.junit.Test

class TestTicketDisplay {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun testit(){
        val ticket: ATTicket = ATTicket(Number = "T20211203.4312",
            Title = "ticket title",
            Description = "description field of ticket"
        )
        composeTestRule.setContent { TicketMetadata(ticket = ticket) }

        composeTestRule.onNodeWithText("T20211203.4312").assertExists("Ticket number is not displayed")
    }

}