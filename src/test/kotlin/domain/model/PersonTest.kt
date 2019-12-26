package domain.model

import domain.InvalidPersonException
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.time.LocalDate
import java.util.*

class PersonTest {

    @Test
    fun `valid Person`() {
        Assertions.assertDoesNotThrow {
            Person(UUID.randomUUID(), "John", "Johnson", LocalDate.now())
            Person(UUID.randomUUID(), "Jack", "Jackson", LocalDate.now().minusYears(60))
        }
    }

    @Test
    fun `invalid Person`() {
        Assertions.assertThrows(InvalidPersonException::class.java) {
            Person(UUID.randomUUID(), "Bob", "Bobson", LocalDate.now().plusDays(1))
        }
    }
}