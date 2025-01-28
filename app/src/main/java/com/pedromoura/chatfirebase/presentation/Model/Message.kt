package com.pedromoura.chatfirebase.presentation.Model

data class Message(
    val id: String? = null,
    val text: String? = null,
    val senderId: String? = null,
    val timestamp: Long? = null
) {
    constructor() : this(null, null, null)
}
