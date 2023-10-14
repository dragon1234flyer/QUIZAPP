package com.example.myquizapp

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat

class quizquestion : AppCompatActivity(),View.OnClickListener {
    private var mcurrentposition : Int = 1
    private var mquestionlist : ArrayList<Question>? = null

    private var mselectedoptionposition : Int = 0




    private var progressbar:ProgressBar? = null
    private var progresstv:TextView? = null
    private  var questionop:TextView? = null
    private var vew1:ImageView? = null

    private var op1 :TextView? = null
    private var op2:TextView? = null
    private  var op3:TextView? = null
    private var op4:TextView? = null
 private var submit:Button? = null
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
        submit = findViewById(R.id.submit)

   op1?.setOnClickListener(this)
        op2?.setOnClickListener(this)
        op3?.setOnClickListener(this)
        op4?.setOnClickListener(this)

         mquestionlist = constants.getquestipn()

       setquestion()

       defaultoptionView()
      //n  selectedoptionview()
    }

    private fun setquestion() {


        var  mcurrentposition= 1
        val questions: Question = mquestionlist!![ mcurrentposition - 1]
        vew1?.setImageResource(questions.image)
        progressbar?.progress =  mcurrentposition
        progresstv?.text = "$mcurrentposition/${progressbar?.max}"
        questionop?.text = questions.question
        op1?.text = questions.opone
        op2?.text = questions.optwo
        op3?.text = questions.opthree
        op4?.text = questions.opfour

        if(mcurrentposition == mquestionlist!!.size){
            submit?.text = "FINISH"
        }else{
            submit?.text = "SUBMIT"
        }
    }


    private fun defaultoptionView(){

        val options = ArrayList<TextView>()

        op1?.let {
            options.add(0,it)
        }
        op2?.let {
            options.add(1,it)
        }
        op3?.let {
            options.add(2,it)
        }
        op4?.let {
            options.add(3,it)
        }

        for (option in options){
           option.setTextColor(Color.parseColor("#FF03DAC5"))

         //option.setTextColor(Color.parseColor("#FF000"))
           option.typeface  = Typeface.DEFAULT
           option.background = ContextCompat.getDrawable(
              this,
                R.drawable.default_option_border_bg
            )
        }


    }

    private fun selectedoptionview(tv:TextView ,selectedOptionNum:Int){
        defaultoptionView()
        mselectedoptionposition = selectedOptionNum
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface,Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this,
            R.drawable.default_option_border_bg
        )
    }
    override fun onClick(view: View?) {
     when(view?.id){
         R.id.op1->{
             op1?.let {
                 selectedoptionview(it,1)
             }
         }

         R.id.op2->{
             op2?.let {
                 selectedoptionview(it,2)
             }
         }

         R.id.op3->{
             op3?.let {
                 selectedoptionview(it,3)
             }
         }

         R.id.op4->{
             op4?.let {
                 selectedoptionview(it,4)
             }
         }
         R.id.submit->{

         }
     }
    }
}