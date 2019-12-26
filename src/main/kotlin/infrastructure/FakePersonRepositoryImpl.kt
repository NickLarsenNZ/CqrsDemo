package infrastructure

import domain.model.DomainEntity
import domain.model.Person
import domain.repository.PersonRepository
import java.time.LocalDate
import java.util.*

class FakePersonRepositoryImpl: PersonRepository {

    private var people = mutableListOf<Person>()

    override fun findById(id: UUID) = people.filter { it.id == id }.first()

    override fun findByDob(dob: LocalDate) = people.filter { it.dob == dob }

    override fun save(domainEntity: Person) {
        people.add(domainEntity)
    }
}