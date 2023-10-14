package com.example.myquizapp

object constants {
    fun getquestipn():ArrayList<que>{
        val questionlist = ArrayList<que>()

        val que1 =  que(
            1,"what is name of country",
            R.drawable.ic_flag_of_argentina,
            "Argentina","austrelia","armenia","austria",1

        )
        questionlist.add(que1)
        return questionlist

    }

}