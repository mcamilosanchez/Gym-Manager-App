package com.mcamilo.gymmanagerapp.domain.usecase.membership

import com.mcamilo.gymmanagerapp.domain.model.MembershipModelDomain
import com.mcamilo.gymmanagerapp.domain.repository.MembershipRepositoryDomain
import javax.inject.Inject

/**
 * List memberships.
 * @return The list of memberships.
 */
class GetAllMembershipsUseCase @Inject constructor(
    private val membershipRepository: MembershipRepositoryDomain
) {
    suspend operator fun invoke(): List<MembershipModelDomain> {
        return membershipRepository.getAllMemberships()
    }
}