package com.mcamilo.gymmanagerapp.domain.model

import java.time.LocalDate

data class ClientModelDomain(
    val idClient: String,                 // Internal ID (UUID or Firestore ID)
    val userId: String?,                  // Can be null if you don't have an account yet
    val dateAdmissionClient: LocalDate,
    val activeClient: Boolean
)
