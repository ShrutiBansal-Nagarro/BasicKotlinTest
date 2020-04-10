package com.example.basickotlintest

class CompanionTest {
         val gjj=0
    companion object {
        fun callMe() = println("You are calling me :)")
    }
}

fun main() {
    val test=Test()
    test.unittest()
    println(CompanionTest.Companion)
    println(CompanionTest.Companion)
    println(CompanionTest.Companion)
    println(CompanionTest.Companion)
    CompanionTest.callMe()
}