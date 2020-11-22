package com.example.test1.dataBase

import com.example.test1.dataModel.Person
import com.example.test1.dataModel.Question

var questionList = mutableListOf<Question>(
    Question(
        "تعداد حلقه های المپیک ؟",
        """
            1- 5
            2- 6
            3- 7
            4- 8
        """.trimIndent()
    ),
    Question(
        "تعداد اعضای شورای نگهبان ؟",
        """
        1- 6
        2- 8
        3- 13
        4- 12       
    """.trimIndent()
    ),
    Question(
        "ارتفاعات سهند در کدام استان قرار دارد ؟",
        """
        1- آذربایجان شرقی 
         2- آذربایجان غربی
         3- زتجان          
         4- همدان          
    """.trimIndent()
    ),
    Question(
        "تابلوی لبخند ژکوند اثر کیست ؟",
        """
           1- ونگوک
         2- داوینچی
          3- پیکاسو
        4- رامبراند
    """.trimIndent()
    ),
    Question(
        "کدام درخت نماد صلح است ؟",
        """
           1-سرو
        2- زیتون
          3- سیب
        4- نارنج
    """.trimIndent()
    )
)
var personList = mutableListOf<Person>()