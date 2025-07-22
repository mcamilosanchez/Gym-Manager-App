package com.mcamilo.gymmanagerapp.domain.usecase.client

import com.mcamilo.gymmanagerapp.domain.model.ClientModelDomain
import com.mcamilo.gymmanagerapp.domain.repository.ClientRepositoryDomain
import javax.inject.Inject

/**
 * Create a new client in the system
 * @param client The information of the client to be created
 * @return true id created successfully, false otherwise.
 */
class AddClientUseCase @Inject constructor(
    private val clientRepository: ClientRepositoryDomain
) {
    suspend operator fun invoke(client: ClientModelDomain): Boolean {
        return clientRepository.addClient(client)
    }
}