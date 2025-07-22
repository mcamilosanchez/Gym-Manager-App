package com.mcamilo.gymmanagerapp.domain.repository

import com.mcamilo.gymmanagerapp.domain.model.UserModelDomain

interface UserRepositoryDomain {
    suspend fun getUserById(idUser: String): UserModelDomain?
    suspend fun getUserByEmail(emailUser: String): UserModelDomain?
    suspend fun addUser(user: UserModelDomain): Boolean
    suspend fun updateUser(user: UserModelDomain): Boolean
    suspend fun deleteUser(idUser: String): Boolean
}