package com.mcamilo.gymmanagerapp.domain.usecase.user

import com.mcamilo.gymmanagerapp.domain.model.UserModelDomain
import com.mcamilo.gymmanagerapp.domain.repository.UserRepositoryDomain
import javax.inject.Inject

/**
 * Update a user in the system
 * @param user The information of the user to be updated
 * @return true id updated successfully, false otherwise.
 */
class UpdateUserUseCase @Inject constructor(
    private val userRepository: UserRepositoryDomain
) {
    suspend operator fun invoke(user: UserModelDomain): Boolean {
        return userRepository.updateUser(user)
    }
}