package com.example.chat.data.remote

import com.example.chat.domain.model.Message
import com.example.chat.util.Resource
import io.ktor.client.HttpClient
import kotlinx.coroutines.flow.Flow

class ChatSocketServiceImpl(
    private val client: HttpClient
): ChatSocketService {
    override suspend fun initSession(username: String): Resource<Unit> {
        TODO("Not yet implemented")
    }

    override suspend fun sendMessage(message: String) {
        TODO("Not yet implemented")
    }

    override fun observeMessages(): Flow<Message> {
        TODO("Not yet implemented")
    }

    override suspend fun closeSession() {
        TODO("Not yet implemented")
    }
}