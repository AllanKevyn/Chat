package com.example.chat.data.remote

import com.example.chat.data.remote.dto.MessageDto
import com.example.chat.domain.model.Message
import io.ktor.client.HttpClient
import io.ktor.client.request.get

class MessageServiceImpl(
    private val client: HttpClient
): MessageService {

    // in case of problem implement version 1.6.3 Ktor
    override suspend fun getAllMessages(): List<Message> {
        return try {
            val response = client.get(MessageService.Endpoints.GetAllMessages.url)
            val result = response as List<MessageDto>
            result.map { it.toMessage() }
        } catch (e: Exception) {
            emptyList()
        }
    }
}