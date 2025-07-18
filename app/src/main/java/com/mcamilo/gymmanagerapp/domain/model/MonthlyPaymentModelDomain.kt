package com.mcamilo.gymmanagerapp.domain.model

import java.time.LocalDate

data class MonthlyPaymentModelDomain(
    val idMonthlyPayment: String,
    val clientId: String,
    val startDate: LocalDate,
    val endDate: LocalDate,
    val state: Boolean,
    val amount: Double
)
