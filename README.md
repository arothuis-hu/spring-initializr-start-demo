# Example created with Spring Initializr

# Warnings

## Java 8
This project is built for Java 8.
It is a advisable to use a newer version instead.
You can use Spring Initializr to do this as well.

## Coupling
In practice, you would rather *not* couple your data model to your request model
but use separate DTOs for your persistence entities and your request bodies and responses.

Decoupling them enables you to independently evolve your API and your data model.

## No domain
This is an example of a data-centric API.
It has an anemic domain model, or rather: no domain model at all.
