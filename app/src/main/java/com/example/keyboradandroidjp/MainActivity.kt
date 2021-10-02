package com.example.keyboradandroidjp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.inputmethod.InputMethodManager
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun dispatchKeyEvent(event: KeyEvent): Boolean {

        Log.i("event", event.keyCode.toString())

        //ボタンが押された時を指定
        if (event.action === KeyEvent.ACTION_DOWN) {
//            var imm: InputMethodManager =
//                getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
//
//
//            if (event.keyCode === KeyEvent.KEYCODE_A) { // 無変換
//                return true
//            }
//
//
//            if (event.keyCode === KeyEvent.KEYCODE_MUHENKAN) { // 無変換
//                return !imm.isActive
//            }
//            if (event.keyCode === KeyEvent.KEYCODE_HENKAN) { // 変換
//
//                return imm.isActive
//            }
        }

        return super.dispatchKeyEvent(event)
    }
}