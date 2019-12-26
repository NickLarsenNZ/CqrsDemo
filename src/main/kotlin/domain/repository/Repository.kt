package domain.repository

import java.util.*

interface Repository<T> {
    fun findById(id: UUID): T
    fun save(id: UUID, domainEntity: T)
}