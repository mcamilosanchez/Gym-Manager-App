package com.mcamilo.gymmanagerapp.domain.usecase.user

import com.mcamilo.gymmanagerapp.domain.model.UserModelDomain
import com.mcamilo.gymmanagerapp.domain.repository.UserRepositoryDomain
import javax.inject.Inject

/**
 * Retrieve a user using its unique ID.
 * @param idUser The ID of the user.
 * @return The user if found, null otherwise.
 */
class GetUserByIdUseCase @Inject constructor(
    private val userRepository: UserRepositoryDomain
) {
    suspend operator fun invoke(idUser: String): UserModelDomain? {
        return userRepository.getUserById(idUser)
    }
}