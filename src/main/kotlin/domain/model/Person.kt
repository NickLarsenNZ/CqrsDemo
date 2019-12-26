package domain.model

import domain.InvalidPersonException
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*

class Person(id: UUID, val fname: String, val lname: String, val dob: LocalDate) : DomainEntity(id) {
    val createdTimestamp: LocalDateTime
    val modifiedTimestamp: LocalDateTime

    init {
        if (dob > LocalDate.now()) {
            throw InvalidPersonException("People from the future cannot be added")
        }
        this.createdTimestamp = LocalDateTime.now()
        this.modifiedTimestamp = this.createdTimestamp
    }
}