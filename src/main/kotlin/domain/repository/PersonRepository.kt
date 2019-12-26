package domain.repository

import domain.model.Person
import java.time.LocalDate

interface PersonRepository: Repository<Person> {
    fun findByDob(dob: LocalDate): List<Person>
}