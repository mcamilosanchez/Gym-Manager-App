package com.mcamilo.gymmanagerapp.domain.usecase.client

import com.mcamilo.gymmanagerapp.domain.repository.ClientRepositoryDomain
import javax.inject.Inject

/**
 * Delete a client in the system
 * @param idClient The id of the client to be deleted
 * @return true id deleted successfully, false otherwise.
 */
class DeleteClientUseCase @Inject constructor(
    private val clientRepository: ClientRepositoryDomain
) {
    suspend operator fun invoke(idClient: String) : Boolean {
        return clientRepository.deleteClient(idClient)
    }
}