package com.mcamilo.gymmanagerapp.domain.usecase.user

import com.mcamilo.gymmanagerapp.domain.model.UserModelDomain
import com.mcamilo.gymmanagerapp.domain.repository.UserRepositoryDomain
import javax.inject.Inject

/**
 * Create a new user in the system
 * @param user The information of the user to be created
 * @return true id created successfully, false otherwise.
 */
class AddUserUseCase @Inject constructor(
    private val userRepository: UserRepositoryDomain
) {
    suspend operator fun invoke(user: UserModelDomain): Boolean {
        return userRepository.addUser(user)
    }
}