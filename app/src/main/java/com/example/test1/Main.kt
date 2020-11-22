package com.example.test1

import com.example.test1.dataBase.questionList
import com.example.test1.dataModel.Person

fun main() {
    askQuestions()

}


fun askQuestions(){

    println("******WELCOME TO TEST******")
    println("please enter your information :")
    println(" name :")
    val name = readLine()
    println("family :")
    val family = readLine()
    var newPerson:Person= Person(name,family)

    var trueAnswer = 0
    var falseAnswer = 0

    for (question in questionList) {

        println(question)
        println("please enter true answer number :")
        val answer = readLine()
        when (question.id ) {
            101 -> if (answer == "1") {
                println("true")
                trueAnswer++

            } else {
                println("false")
                falseAnswer++
            }

            102 -> if (answer == "4") {
                println("true")
                trueAnswer++

            } else {
                println("false")
                falseAnswer++
            }
            103 -> if (answer == "1") {
                println("true")
                trueAnswer++

            } else {
                println("false")
                falseAnswer++
            }
            104 -> if (answer == "2") {
                println("true")
                trueAnswer++

            } else {
                println("false")
                falseAnswer++
            }
            105 -> if (answer == "2") {
                println("true")
                trueAnswer++

            } else {
                println("false")
                falseAnswer++
            }

        }
    }
    val score = (trueAnswer*100)/5

    println(" $newPerson your true answer is $trueAnswer and your score is $score")
}

