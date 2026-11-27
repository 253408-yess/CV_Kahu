package com.upchiapas.kahu.features.auth.domain.model

enum class UserRole { CLIENT, ADMIN }

data class User(
    val name: String,
    val email: String,
    val role: UserRole
)
