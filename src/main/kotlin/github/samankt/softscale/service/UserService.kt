package github.samankt.softscale.service

import github.samankt.softscale.model.User


public interface UserService {
    fun getUserById(id: Int): User
    fun getAllUsers(): List<User>
    fun createUser(user: User): User
    fun updateUser(user: User, id: Int): User
    fun deleteUser(id: Int)
}
