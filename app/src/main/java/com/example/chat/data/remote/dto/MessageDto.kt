package com.example.chat.data.remote.dto

import kotlinx.serialization.Serializable

@Serializable
data class MessageDto(
    val text: String,
    val timestamp: String,
    val username: String,
    val id: String
)