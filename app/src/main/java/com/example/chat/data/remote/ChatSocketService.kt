package com.example.chat.data.remote

import com.example.chat.domain.model.Message
import com.example.chat.util.Resource
import kotlinx.coroutines.flow.Flow

interface ChatSocketService {

    suspend fun initSession(
        username: String
    ): Resource<Unit>

    suspend fun sendMessage(message: String)


    fun observeMessages(): Flow<Message>

    suspend fun closeSession()

}