package com.mcamilo.gymmanagerapp.domain.model

import java.time.LocalDate

data class NotificationModelDomain(
    val idNotification: String,
    val clientId: String,
    val message: String,
    val shippingDate: LocalDate,
    val isRead: Boolean
)
