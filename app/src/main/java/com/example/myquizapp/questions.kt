package com.example.myquizapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract.Constants
import android.util.Log
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class questions : AppCompatActivity() {
    private var progressbar:ProgressBar? = null;
    private var progresstv:TextView? = null;
    private  var questionop:TextView? = null;
    private var vew1:ImageView? = null;

    private var op1 :TextView? = null;
    private var op2:TextView? = null;
    private  var op3:TextView? = null;
    private var op4:TextView? = null;
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        progressbar = findViewById(R.id.progressbar)
        progresstv = findViewById(R.id.progresstv)
        questionop = findViewById(R.id.questionop)
        vew1 = findViewById(R.id.vew1)
        op1 = findViewById(R.id.op1)
        op2 = findViewById(R.id.op2)
        op3 = findViewById(R.id.op3)
        op4 = findViewById(R.id.op4)





        val questionlist = constants.getquestipn()
        Log.i("question si","${questionlist.size}")


        for(i in  questionlist){
            Log.e("Question",i.question)
        }
        var currpos = 1
        val questions : que = questionlist[currpos- 1]
        vew1?.setImageResource(questions.image)
        progressbar?.progress = currpos
        progresstv?.text = "$currpos/${progressbar?.max}"
        questionop?.text = questions.question
        op1?.text = questions.opone
        op2?.text = questions.optwo
        op3?.text = questions.opthree
        op4?.text = questions.opfour
    }
}