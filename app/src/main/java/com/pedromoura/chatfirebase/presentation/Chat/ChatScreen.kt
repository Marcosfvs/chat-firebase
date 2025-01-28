package com.pedromoura.chatfirebase.presentation.Chat

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.pedromoura.chatfirebase.presentation.Model.Message
import com.pedromoura.chatfirebase.ui.theme.Purple40

@Composable
fun ChatScreen() {

    val messages: String
    Column {

        LazyColumn(
            modifier = Modifier
                .weight(1f),
            reverseLayout = false,
            contentPadding = PaddingValues(8.dp)
        ) {
            /*items(messages) { message ->

            }*/
        }

    }
}

@Composable
fun ChatItem(message: Message) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        if (message.senderId == "1") {
            Spacer(
                modifier = Modifier
                    .weight(1f)
            )

        }

        Box(
            modifier = Modifier
                .align(Alignment.CenterVertically)
                .padding(4.dp)
                .background(
                    if (message.senderId == "1") {
                        Purple40
                    } else {
                        Color.Green
                    }
                )
                .padding(8.dp)
        ) {
            message.text?.let {
                Text(
                    text = it,
                    color = Color.White
                )
            }

        }
        if (message.senderId == "1") {
            Spacer(
                modifier = Modifier
                    .weight(1f)
            )

        }
    }
}

@Preview
@Composable
fun PreviewChat(){
    ChatScreen()

}
