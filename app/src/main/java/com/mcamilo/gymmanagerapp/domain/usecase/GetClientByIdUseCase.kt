package com.mcamilo.gymmanagerapp.domain.usecase

import com.mcamilo.gymmanagerapp.domain.model.ClientModelDomain
import com.mcamilo.gymmanagerapp.domain.repository.ClientRepositoryDomain

class GetClientByIdUseCase(
    private val clientRepository: ClientRepositoryDomain
) {
    //The special keyword invoke allows you to handle objects as functions.
    suspend operator fun invoke(idClient: String): ClientModelDomain? {
        return clientRepository.getClientById(idClient)
    }
}