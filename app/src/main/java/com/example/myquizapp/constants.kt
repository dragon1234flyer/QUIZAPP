package com.example.myquizapp

object constants {
    fun getquestipn():ArrayList<Question>{
        val questionlist = ArrayList<Question>()

        val question1 =  Question(
            1,"what is name of country",
            R.drawable.ic_flag_of_argentina,
            "Argentina","austrelia","armenia","austria",1

        )
     questionlist.add(question1)
        return questionlist

    }

}