package com.example.viewmodel

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModelProvider
import org.w3c.dom.Text

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var mButton: Button
    var number=0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mButton = findViewById(R.id.button)

        mButton.setOnClickListener(this)
        val viewModel= ViewModelProvider(this ).get(ViewHolder::class.java)
        var textView= findViewById<TextView>(R.id.textView)
        textView.text = viewModel.number.toString()
    }


    override fun onClick(p0: View?) {
        //number++
        val viewModel= ViewModelProvider(this ).get(ViewHolder::class.java)
        var textView= findViewById<TextView>(R.id.textView)
        //textView.setText(number.toString())
        viewModel.addNumber()
        textView.text = viewModel.number.toString()
    }
}

