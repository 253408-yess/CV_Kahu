package com.upchiapas.kahu.features.auth.di

import com.upchiapas.kahu.features.auth.data.repository.FakeAuthRepository
import com.upchiapas.kahu.features.auth.domain.repository.AuthRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class AuthModule {

    @Binds
    abstract fun bindAuthRepository(
        repository: FakeAuthRepository
    ): AuthRepository
}
