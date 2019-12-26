package repository

import domain.model.Person
import infrastructure.FakePersonRepositoryImpl
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import java.time.LocalDate
import java.util.*

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FakePersonRepositoryImplTest {

    private val personRepo = FakePersonRepositoryImpl()
    val id = UUID.randomUUID()
    val dob = LocalDate.now().minusYears(10)
    val person = Person(id, "Bill", "Billson", dob)

    @BeforeAll
    fun populate() {
        personRepo.save(person)
    }

    @Test
    fun `find person by ID`() {
        val person = personRepo.findById(id)
        Assertions.assertEquals(this.person, person)
    }

    @Test
    fun `find people by date of birth`() {
        val people = personRepo.findByDob(dob)
        Assertions.assertEquals(1, people.size)
        Assertions.assertEquals(this.person, people.first())
    }
}