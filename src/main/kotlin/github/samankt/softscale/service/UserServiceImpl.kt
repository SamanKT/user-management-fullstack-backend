package github.samankt.softscale.service

import github.samankt.softscale.repository.UserRepository
import github.samankt.softscale.model.User
import org.springframework.stereotype.Service

@Service
public class UserServiceImpl(private val userRepository: UserRepository) : UserService {
    override fun createUser(user: User): User {
        return userRepository.save(user)
    }

    override fun getUserById(id: Int): User {
        return userRepository.findById(id).orElseThrow { Exception("User with id $id not found") }
    }

    override fun updateUser(user: User, id:Int): User {
        var updatedUser: User = userRepository.findById(id).orElseThrow { Exception("User with id ${id} not found") }
        updatedUser.name = user.name
        updatedUser.email = user.email
        updatedUser.age = user.age
        updatedUser.phoneNumber = user.phoneNumber

        return userRepository.save(updatedUser)
    }

    override fun deleteUser(id: Int) {
        userRepository.deleteById(id)
    }

    override fun getAllUsers(): List<User> {
        return userRepository.findAll()
    }
}
