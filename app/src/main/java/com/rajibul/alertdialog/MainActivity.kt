package com.rajibul.alertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    var etNumber : EditText ?=null
    var btnAlert : Button ?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etNumber =findViewById(R.id.etNumber)
        btnAlert =findViewById(R.id.btnAlert)


        btnAlert?.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("For the change")
                .setMessage("Press yes to Increase 1\nPress no to Decrease 1\nPress 0 to set 0")
                .setCancelable(false)
                .setPositiveButton("yes", {_,_->
                    var number = etNumber?.text.toString().toInt()
                    number=number+1
                    etNumber?.setText(number.toString())
                })
                .setNegativeButton("no", {_,_->
                    var number = etNumber?.text.toString().toInt()
                    number=number-1
                    etNumber?.setText(number.toString())
                })
                .setNeutralButton("0",{_,_->
                    etNumber?.setText("0")
                }).show()
        }

    }
}