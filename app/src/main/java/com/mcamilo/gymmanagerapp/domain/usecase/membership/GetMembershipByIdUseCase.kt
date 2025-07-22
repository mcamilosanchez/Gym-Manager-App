package com.mcamilo.gymmanagerapp.domain.usecase.membership

import com.mcamilo.gymmanagerapp.domain.model.MembershipModelDomain
import com.mcamilo.gymmanagerapp.domain.repository.MembershipRepositoryDomain
import javax.inject.Inject

/**
 * Retrieve a membership using its unique ID.
 * @param id The ID of the membership.
 * @return The membership if found, null otherwise.
 */
class GetMembershipByIdUseCase @Inject constructor(
    private val membershipRepository: MembershipRepositoryDomain
) {
    suspend operator fun invoke(id: String): MembershipModelDomain? {
        return membershipRepository.getMembershipById(id)
    }
}