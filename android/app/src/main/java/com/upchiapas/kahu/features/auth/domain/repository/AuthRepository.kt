package com.upchiapas.kahu.features.auth.domain.repository

import com.upchiapas.kahu.features.auth.domain.model.User

interface AuthRepository {
    suspend fun login(email: String, password: String): User
}
