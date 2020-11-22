package com.example.test1.dataModel

data class Question (var text:String = "", var answer: String = "" ) {

    val id = questionCounter

    companion object {
        var questionCounter = 101
    }

    init {
        questionCounter++
    }

    override fun toString (): String {

        return "\n $id - $text " +
                "\n $answer"

    }

}
