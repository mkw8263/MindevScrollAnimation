package com.mindev.scrollanimation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        with(scrollView){
            setUpListenerView(img_toys1)
            setUpListenerView(img_toys2)
            setUpListenerView(img_toys3)
            setUpListenerView(img_toys4)
            setUpListenerView(img_arrow1)
            setUpListenerView(img_arrow2)
            setUpListenerView(img_arrow3)
            setUpListenerView(img_arrow4)
            setUpListenerView(tv_animation)
            setUpListenerView(img_arrow4)
            setUpListenerView(btn_animation)
        }
    }
}
