package com.mcamilo.gymmanagerapp.domain.usecase.client

import com.mcamilo.gymmanagerapp.domain.model.ClientModelDomain
import com.mcamilo.gymmanagerapp.domain.repository.ClientRepositoryDomain
import javax.inject.Inject

/**
 * List clients.
 * @return The list of clients.
 */
class GetAllClientsUseCase @Inject constructor(
    private val clientRepository: ClientRepositoryDomain
) {
    suspend operator fun invoke() : List<ClientModelDomain> {
        return clientRepository.getAllClients()
    }
}