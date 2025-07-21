package com.mcamilo.gymmanagerapp.domain.model

import java.time.LocalDate

data class MembershipModelDomain(
    val idMembership: String,
    val clientId: String,
    val startDate: LocalDate,
    val endDate: LocalDate,
    val state: Boolean,
    val amount: Double
)
