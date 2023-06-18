package com.dojinyou.inflearn.tobyspringbootkotlin.annotationcontext.example

import com.dojinyou.inflearn.tobyspringbootkotlin.annotationcontext.example.kotlin.TestClass
import com.dojinyou.inflearn.tobyspringbootkotlin.annotationcontext.example.kotlin.TestClassImplFromJava

class SampleApplication

fun main() {
    val testClass = TestClass()
    val testClassImplFromJava = TestClassImplFromJava()
//    val testJavaClass = TestJavaClass()

    println(testClass.test("kotlin"))
    println(testClass.test(null))
//    testJavaClass.test("java")
    println(testClassImplFromJava.test("impl From Java"))
    println(testClassImplFromJava.test(null))
//    testJavaClass.test("java")
}
