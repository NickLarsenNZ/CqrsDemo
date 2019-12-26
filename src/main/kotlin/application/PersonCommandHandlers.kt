package application

import domain.command.CreatePerson
import domain.model.Person
import infrastructure.FakePersonRepositoryImpl
import java.util.*

class PersonCommandHandlers(private val repository: FakePersonRepositoryImpl) {

    fun createPerson(command : CreatePerson): UUID {
        val id = UUID.randomUUID()
        val person = Person(id, command.fname, command.lname, command.dob)

        repository.save(person)

        return id
    }
}