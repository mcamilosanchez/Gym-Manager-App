package com.mcamilo.gymmanagerapp.domain.usecase.membership

import com.mcamilo.gymmanagerapp.domain.repository.MembershipRepositoryDomain
import javax.inject.Inject

/**
 * Delete a membership using its unique ID.
 * @param id The ID of the membership.
 * @return true id deleted successfully, false otherwise.
 */
class DeleteMembershipUseCase @Inject constructor(
    private val membershipRepository: MembershipRepositoryDomain
) {
    suspend operator fun invoke(id: String) : Boolean {
        return membershipRepository.deleteMembership(id)
    }
}