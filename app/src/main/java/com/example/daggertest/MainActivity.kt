package com.example.daggertest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.daggertest.di.AppUtilsModule
import com.example.daggertest.di.DaggerDateUtilsSuperComponent
import com.example.daggertest.utils.DateUtils
import java.util.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit  var dateUtils : DateUtils

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("TAGGG", dateUtils.dateToString(Date()))
    }
}
