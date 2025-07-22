package com.mcamilo.gymmanagerapp.domain.usecase.user

import com.mcamilo.gymmanagerapp.domain.model.UserModelDomain
import com.mcamilo.gymmanagerapp.domain.repository.UserRepositoryDomain
import javax.inject.Inject

/**
 * Retrieve a user using its unique EMAIL.
 * @param emailUser The email of the user.
 * @return The user if found, null otherwise.
 */
class GetUserByEmailUseCase @Inject constructor(
    private val userRepository: UserRepositoryDomain
) {
    suspend operator fun invoke(emailUser: String) : UserModelDomain? {
        return userRepository.getUserByEmail(emailUser)
    }
}