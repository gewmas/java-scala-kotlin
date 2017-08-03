package com.example.hydra.dto

class KotlinPerson(val firstName: String, val lastName: String, var age: Int) {

    override fun toString(): String {
        return "KotlinPerson(firstName='$firstName', lastName='$lastName', age=$age)"
    }
}