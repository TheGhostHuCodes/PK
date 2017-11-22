package com.programming.kotlin.chapter01

class Person constructor(val firstName: String, val lastName: String, val age: Int?) {
    init {
        require(firstName.trim().isNotEmpty()) {"Invalid firstName argument."}
        require(lastName.trim().isNotEmpty()) {"Invalid lastName argument."}
        if (age != null) {
            require(age in 0..149) {"Invalid age argument."}
        }
    }
}