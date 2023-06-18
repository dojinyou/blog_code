package com.dojinyou.inflearn.tobyspringbootkotlin.annotationcontext.example.kotlin

open class TestSuperClass {
    @JvmName(name = "test2")
    fun test(name:String?): String = name ?: "null"
}
