package com.programming.kotlin.chapter03

class BasicGraph(private val name: String) {
    class Line(private val x1: Int, private val y1: Int, private val x2: Int, private val y2: Int) {
        fun draw() {
            println("Drawing Line from ($x1, $y1) to ($x2, $y2)") }
    }
    fun draw() {
        println("Drawing the graph $name")
    }
}