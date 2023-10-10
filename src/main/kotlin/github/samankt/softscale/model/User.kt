package github.samankt.softscale.model

import jakarta.persistence.*

@Entity
@Table(name = "appusers")
class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0
        get() = field
        set(value) {
            field = value
        }

    var name: String = ""
        get() = field
        set(value) {
            field = value
        }
    var email: String = ""
        get() = field
        set(value) {
            field = value
        }
    var age: Int = 0
        get() = field
        set(value) {
            field = value
        }
    var phoneNumber: String = ""
        get() = field
        set(value) {
            field = value
        }
}
