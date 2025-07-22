package com.mcamilo.gymmanagerapp.domain.model

import java.time.LocalDate

data class UserModelDomain(
    val idUser: String,                   // Internal ID (UUID or Firestore ID)
    val typeDocumentUser: TypeDocument,
    val numberDocumentUser: String,
    val nameUser: String,
    val emailUser: String,
    val birthdateUser: LocalDate,
    val rolUser: RolUser
)

enum class RolUser {
    ADMIN, TRAINER, CLIENT
}

enum class TypeDocument {
    CEDULA_CIUDADANIA,
    TARJETA_IDENTIDAD,
    REGISTRO_CIVIL,
    PASAPORTE,
    OTRO,
    SIN_DOCUMENTO
}
