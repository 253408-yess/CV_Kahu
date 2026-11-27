package com.upchiapas.kahu.features.auth.data.repository

import com.upchiapas.kahu.features.auth.domain.model.User
import com.upchiapas.kahu.features.auth.domain.model.UserRole
import com.upchiapas.kahu.features.auth.domain.repository.AuthRepository
import javax.inject.Inject
import kotlinx.coroutines.delay

// DATOS DE PRUEBA: se reemplazará por el repositorio que consume la API.
class FakeAuthRepository @Inject constructor() : AuthRepository {

    override suspend fun login(email: String, password: String): User {
        delay(1000) // Simula la espera de la red

        return when {
            email == "tutor@kahu.com" && password == "123456" ->
                User(name = "Carlos", email = email, role = UserRole.CLIENT)

            email == "admin@kahu.com" && password == "123456" ->
                User(name = "Doctora", email = email, role = UserRole.ADMIN)

            else -> throw Exception("Correo o contraseña incorrectos")
        }
    }
}
