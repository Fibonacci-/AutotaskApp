package com.helwigdev.whdat

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.helwigdev.whdat.models.ATTicket

@Composable
fun TicketMetadata(ticket: ATTicket){
    Column {
        Card(
            elevation = 5.dp,
            modifier = Utilities.Padding.fillMaxWidth()
        ){
            Column {
                TicketNumber(number = ticket.Number)
                TicketTitle(title = ticket.Title)
            }
        }
        if(ticket.Description != "") {
            TicketDescription(desc = ticket.Description)
        }
    }
}

@Composable
fun TicketTitle(title: String){
    Text(text = title,
        modifier = Utilities.Padding,
        fontSize = 15.sp
    )
}

@Composable
fun TicketNumber(number: String){
    Text(text = number,
        modifier = Utilities.Padding,
        fontSize = 30.sp
    )
}

@Composable
fun TicketDescription(desc: String){
    Card(elevation = 2.dp,
            modifier = Utilities.Padding.fillMaxWidth()
        ) {
        Text(text = desc,
            modifier = Utilities.Padding
            )
    }
}

@Preview
@Composable
fun TicketPreview(){
    val ticket: ATTicket = ATTicket(Number = "T20211203.4312",
        Title = "Some long ticket title that will run off the side of the screen so we" +
                " can make sure the words wrap properly",
        Description = "i need help with my goddamn label printers again" +
                "\r\nnewline\r\ncan i share this label printer" +
                " with my good buddies down the street"
        )
    TicketMetadata(ticket)
}
