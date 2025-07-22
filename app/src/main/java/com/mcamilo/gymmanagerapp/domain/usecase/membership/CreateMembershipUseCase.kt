package com.mcamilo.gymmanagerapp.domain.usecase.membership

import com.mcamilo.gymmanagerapp.domain.model.MembershipModelDomain
import com.mcamilo.gymmanagerapp.domain.repository.MembershipRepositoryDomain
import javax.inject.Inject

/**
 * Create a new membership in the system
 * @param membershipModelDomain The information of the membership to be created
 * @return true id created successfully, false otherwise.
 */

class CreateMembershipUseCase @Inject constructor(
   private val membershipRepository: MembershipRepositoryDomain
) {
    suspend operator fun invoke(membershipModelDomain: MembershipModelDomain) : Boolean {
        return membershipRepository.addMembership(membershipModelDomain)
    }
}