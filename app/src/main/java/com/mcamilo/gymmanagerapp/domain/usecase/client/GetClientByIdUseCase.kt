package com.mcamilo.gymmanagerapp.domain.usecase.client

import com.mcamilo.gymmanagerapp.domain.model.ClientModelDomain
import com.mcamilo.gymmanagerapp.domain.repository.ClientRepositoryDomain
import javax.inject.Inject

/**
 * Retrieve a client using its unique ID.
 * @param id The ID of the client.
 * @return The client if found, null otherwise.
 */
class GetClientByIdUseCase @Inject constructor (
    private val clientRepository: ClientRepositoryDomain
) {
    //The special keyword invoke allows you to handle objects as functions.
    suspend operator fun invoke(idClient: String): ClientModelDomain? {
        return clientRepository.getClientById(idClient)
    }
}