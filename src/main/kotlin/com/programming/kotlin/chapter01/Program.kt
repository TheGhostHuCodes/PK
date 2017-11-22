package com.programming.kotlin.chapter01

import com.programming.kotlin.chapter03.BasicGraph
import com.programming.kotlin.chapter03.Person

fun main(args: Array<String>) {
    println("Hello World!")
    val student = Student("Alexandra Miller")
    println("Student name:${student.name}")
    val carManufacturer = CarManufacturer("Mercedes")
    println("Car manufacturer:${carManufacturer.name}")

    val person1 = Person("Alex", "Smith", 29)
    val person2 = Person("Jane", "Smith")
    println("${person1.firstName}, ${person1.lastName} is ${person1.age} years old")
    println("${person2.firstName}, ${person2.lastName} is ${person2.age?.toString() ?: "?"} years old")

    val line = BasicGraph.Line(1, 0, -2, 0)
    line.draw()
}