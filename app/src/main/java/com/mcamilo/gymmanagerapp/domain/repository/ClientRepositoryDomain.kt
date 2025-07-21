package com.mcamilo.gymmanagerapp.domain.repository

import com.mcamilo.gymmanagerapp.domain.model.ClientModelDomain

interface ClientRepositoryDomain {
    suspend fun getClientById(idClient: String): ClientModelDomain?
    suspend fun getAllClients(): List<ClientModelDomain>
    suspend fun addClient(client: ClientModelDomain): Boolean
    suspend fun updateClient(client: ClientModelDomain): Boolean
    suspend fun deleteClient(idClient: String): Boolean
}