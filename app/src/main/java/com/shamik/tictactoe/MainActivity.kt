package com.shamik.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var count = 0
    var flag = 0

    fun Draw(view: View) {

        var bnt_current = view as Button

        if(bnt_current.text == "")
        {
            if(flag == 0){
                bnt_current.text = "X"
                flag = 1
                count++
            }
            else{
                bnt_current.text = "O"
                flag = 0
                count++
            }

            val btn1 = btn_1.text
            val btn2 = btn_2.text
            val btn3 = btn_3.text
            val btn4 = btn_4.text
            val btn5 = btn_5.text
            val btn6 = btn_6.text
            val btn7= btn_7.text
            val btn8 = btn_8.text
            val btn9 = btn_9.text

            if(btn1 == btn2 && btn2 == btn3 && btn3 != ""){
                result.text = "$btn1 WON"
                Restart()
            }

            else if(btn4 == btn5 && btn5 == btn6 && btn6 != ""){
                result.text = "$btn4 WON"
                Restart()
            }

            else if(btn7 == btn8 && btn8 == btn9 && btn9 != ""){
                result.text = "$btn7 WON"
                Restart()
            }

            else if(btn1 == btn4 && btn4 == btn7 && btn7 != ""){
                result.text = "$btn1 WON"
                Restart()
            }

            else if(btn2 == btn5 && btn5 == btn8 && btn8 != ""){
                result.text = "$btn2 WON"
                Restart()
            }

            else if(btn3 == btn6 && btn6 == btn9 && btn9 != ""){
                result.text = "$btn3 WON"
                Restart()
            }

            else if(btn1 == btn5 && btn5 == btn9 && btn9 != ""){
                result.text = "$btn1 WON"
                Restart()
            }

            else if(btn3 == btn5 && btn5 == btn7 && btn7 != ""){
                result.text = "$btn3 WON"
                Restart()
            }

            else if(count == 9){
                result.text = "MATCH DRAWN"
                Restart()
            }

        }

    }

    fun Restart(){

        Handler().postDelayed({

            count = 0
            flag = 0
            result.text = "RESULT"
            btn_1.text = ""
            btn_2.text = ""
            btn_3.text = ""
            btn_4.text = ""
            btn_5.text = ""
            btn_6.text = ""
            btn_7.text = ""
            btn_8.text = ""
            btn_9.text = ""

        },2500)

    }

}