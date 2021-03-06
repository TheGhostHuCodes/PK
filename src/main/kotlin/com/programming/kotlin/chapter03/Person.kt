package com.programming.kotlin.chapter03

class Person constructor(val firstName: String, val lastName: String, val age: Int?) {
    init {
        require(firstName.trim().isNotEmpty()) {"Invalid firstName argument."}
        require(lastName.trim().isNotEmpty()) {"Invalid lastName argument."}
        if (age != null) {
            require(age in 0..149) {"Invalid age argument."}
        }
    }
    constructor(firstName: String, lastName: String) : this(firstName, lastName, null)
}