package com.learn.lavsam.mymaterial.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import androidx.transition.Slide
import androidx.transition.TransitionManager
import com.learn.lavsam.mymaterial.R
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    private var textIsVisible = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btn.setOnClickListener {
            TransitionManager.beginDelayedTransition(container, Slide(Gravity.END))
            textIsVisible = !textIsVisible
            text.visibility = if (textIsVisible) View.VISIBLE else View.GONE
        }
    }
}