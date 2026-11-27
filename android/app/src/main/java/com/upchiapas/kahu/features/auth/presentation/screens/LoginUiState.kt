package com.upchiapas.kahu.features.auth.presentation.screens

import com.upchiapas.kahu.features.auth.domain.model.User

data class LoginUiState(
    val email: String = "",
    val password: String = "",
    val isLoading: Boolean = false,
    val error: String? = null,
    val user: User? = null
)
