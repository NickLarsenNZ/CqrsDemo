package domain

import java.lang.Exception

open class BusinessRuleException(message: String?) : Exception(message)
class InvalidPersonException(message: String) : BusinessRuleException(message)