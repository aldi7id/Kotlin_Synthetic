package com.ajgroup.kotlinsynthetic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_click_me.text = "Klik Saya"
        btn_click_me.setOnClickListener {
            Snackbar.make(btn_click_me, "Tombol Ditekan", Snackbar.LENGTH_LONG).setAction("OK BosQ", View.OnClickListener {

            }).show() }
        }
    }
