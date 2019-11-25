package com.tjoeunit.a201911_kotlinfinaltest

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    var mContext = this

    abstract fun setupEvents()
    abstract fun setValues()

}