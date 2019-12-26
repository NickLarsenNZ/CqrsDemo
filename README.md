# CQRS Demo

_To help me understand how to structure a project, and the flow of control in the application._

## Domain: People

### Commands

- Create a person (fname, lname, dob)
- Rename a person
- Remove a person

### Queries

- Get person
- Get list of people
- Get list of people with current age

## Packages

- `application` _The application, eg: rest service, or CLI_
- `domain` _core_
  - `model` _Domain Model and behavior_
  - `command` _domain commands (imperitive nomenclature)_
  - `event` _internal events (past-tense nomenclature)_
- `view` _view models (query side)_
- `infrastructure` _external services, repositories_