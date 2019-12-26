package domain.repository

import java.util.*

interface Repository<T> {
    fun findById(id: UUID): T
    fun save(domainEntity: T) // Todo: should this have a return type? If so, should it be a Boolean or T?
}