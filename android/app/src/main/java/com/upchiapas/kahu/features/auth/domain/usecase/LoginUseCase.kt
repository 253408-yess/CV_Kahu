package com.upchiapas.kahu.features.auth.domain.usecase

import com.upchiapas.kahu.features.auth.domain.model.User
import com.upchiapas.kahu.features.auth.domain.repository.AuthRepository
import javax.inject.Inject
import kotlin.coroutines.cancellation.CancellationException

class LoginUseCase @Inject constructor(
    private val repository: AuthRepository
) {
    suspend operator fun invoke(email: String, password: String): Result<User> {
        val cleanEmail = email.trim()

        if (cleanEmail.isEmpty() || password.isEmpty()) {
            return Result.failure(Exception("Escribe tu correo y contraseña"))
        }
        if (!cleanEmail.contains("@")) {
            return Result.failure(Exception("El correo no es válido"))
        }

        return try {
            Result.success(repository.login(cleanEmail, password))
        } catch (e: CancellationException) {
            throw e
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
