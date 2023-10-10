package github.samankt.softscale.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.http.ResponseEntity
import org.springframework.http.HttpStatus
import org.springframework.beans.factory.annotation.Autowired
import github.samankt.softscale.model.User
import github.samankt.softscale.service.UserServiceImpl



@RestController
@RequestMapping("/users")
@CrossOrigin(origins = ["*"])
class AppController {

    @Autowired
    lateinit var userService: UserServiceImpl

  

    @GetMapping
    fun handleRequestAllUsers(): List<User> {
       return userService.getAllUsers(); 
    }

    
    @PostMapping
    fun handleAddingUser(@RequestBody user: User) : ResponseEntity<User> {
  
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(userService.createUser(user))
    }

    @GetMapping("/{id}")
    fun handleRequestUserById(@PathVariable id: Int): User {
       return userService.getUserById(id); 
    }

    @PutMapping("/{id}")
    fun handleUpdateUserById(@PathVariable id: Int, @RequestBody user:User): ResponseEntity<User> {

       return ResponseEntity.status(HttpStatus.OK).body(userService.updateUser(user,id)) ; 
    }

    @DeleteMapping("/{id}")
    fun handleDeleteUserById(@PathVariable id: Int): ResponseEntity<String> {
        userService.deleteUser(id);
       return ResponseEntity.status(HttpStatus.OK).body("User deleted successfully") ; 
    }

}