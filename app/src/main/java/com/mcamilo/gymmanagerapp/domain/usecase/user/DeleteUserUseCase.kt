package com.mcamilo.gymmanagerapp.domain.usecase.user

import com.mcamilo.gymmanagerapp.domain.repository.UserRepositoryDomain
import javax.inject.Inject

/**
 * Delete a user in the system
 * @param idUser The id of the user to be deleted
 * @return true id deleted successfully, false otherwise.
 */
class DeleteUserUseCase @Inject constructor(
    private val userRepository: UserRepositoryDomain
) {
    suspend operator fun invoke(idUser: String) : Boolean {
        return userRepository.deleteUser(idUser)
    }
}