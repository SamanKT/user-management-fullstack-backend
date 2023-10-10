package github.samankt.softscale.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import github.samankt.softscale.model.User

@Repository
interface UserRepository : JpaRepository<User, Int> {
}
