package com.mcamilo.gymmanagerapp.domain.repository

import com.mcamilo.gymmanagerapp.domain.model.MembershipModelDomain

interface MembershipRepositoryDomain {
    suspend fun getMembershipById(idMembership: String): MembershipModelDomain?
    suspend fun getAllMemberships(): List<MembershipModelDomain>
    suspend fun addMembership(membership: MembershipModelDomain): Boolean
    suspend fun updateMembership(membership: MembershipModelDomain): Boolean
    suspend fun deleteMembership(idMembership: String): Boolean
}