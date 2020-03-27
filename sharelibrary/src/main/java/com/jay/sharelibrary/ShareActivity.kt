package com.jay.sharelibrary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jay.baselibrary.BaseActivity
import kotlinx.android.synthetic.main.activity_share.*

class ShareActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_share)
        tv_share.setOnClickListener {
            startActivity(Intent(this, BaseActivity::class.java))
        }
    }
}
