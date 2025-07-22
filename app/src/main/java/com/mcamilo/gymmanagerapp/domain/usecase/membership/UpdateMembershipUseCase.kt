package com.mcamilo.gymmanagerapp.domain.usecase.membership

import com.mcamilo.gymmanagerapp.domain.model.MembershipModelDomain
import com.mcamilo.gymmanagerapp.domain.repository.MembershipRepositoryDomain
import javax.inject.Inject

/**
 * Update a new membership in the system
 * @param membershipModelDomain The information of the membership to be updated
 * @return true id updated successfully, false otherwise.
 */
class UpdateMembershipUseCase @Inject constructor(
    private val membershipRepository: MembershipRepositoryDomain
) {
    suspend operator fun invoke(membershipModelDomain: MembershipModelDomain) : Boolean {
        return membershipRepository.updateMembership(membershipModelDomain)
    }
}