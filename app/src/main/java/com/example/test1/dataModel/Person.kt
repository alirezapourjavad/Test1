package com.example.test1.dataModel

class Person(var name: String ?= "", var family: String ?= "") {

    override fun toString(): String {
        return "\n $name  $family"
    }
}