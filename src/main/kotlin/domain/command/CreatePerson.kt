package domain.command

import java.time.LocalDate

// Command
data class CreatePerson(val fname: String, val lname: String, val dob: LocalDate)