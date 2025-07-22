package com.mcamilo.gymmanagerapp.domain.repository

import com.mcamilo.gymmanagerapp.domain.model.ServiceModelDomain

interface ServiceRepositoryDomain {
    suspend fun getServiceById(idService: String): ServiceModelDomain?
    suspend fun getAllServices(): List<ServiceModelDomain>
    suspend fun addService(service: ServiceModelDomain): Boolean
    suspend fun updateService(service: ServiceModelDomain): Boolean
    suspend fun deleteService(idService: String): Boolean
}