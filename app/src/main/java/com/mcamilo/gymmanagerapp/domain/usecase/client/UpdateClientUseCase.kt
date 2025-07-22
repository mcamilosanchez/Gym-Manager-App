package com.mcamilo.gymmanagerapp.domain.usecase.client

import com.mcamilo.gymmanagerapp.domain.model.ClientModelDomain
import com.mcamilo.gymmanagerapp.domain.repository.ClientRepositoryDomain
import javax.inject.Inject

/**
 * Update a client in the system
 * @param client The information of the client to be updated
 * @return true id updated successfully, false otherwise.
 */
class UpdateClientUseCase @Inject constructor(
    private val clientRepository: ClientRepositoryDomain
) {
    suspend operator fun invoke(client: ClientModelDomain): Boolean {
        return clientRepository.updateClient(client)
    }
}