package com.mcamilo.gymmanagerapp.domain.model

data class ServiceModelDomain(
    val idService: String,
    val nameService: String,
    val descriptionService: String,
    val scheduleService: String,
    val type: ServiceType
)

enum class ServiceType {
    CLASS, TRAINING, OTHER
}
