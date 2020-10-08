package com.sample.huawei.crash

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val defCrashHandler = Thread.getDefaultUncaughtExceptionHandler()
        Toast.makeText(applicationContext, defCrashHandler.javaClass.name, Toast.LENGTH_SHORT).show()

        crash_world_npe_btn.setOnClickListener { throw NullPointerException() }
        crash_world_arithme_btn.setOnClickListener { throw ArithmeticException() }
    }
}