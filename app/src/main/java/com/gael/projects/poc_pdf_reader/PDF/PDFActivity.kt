package com.gael.projects.poc_pdf_reader.PDF

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.gael.projects.poc_pdf_reader.R
import kotlinx.android.synthetic.main.activity_pdf.*

class PDFActivity : AppCompatActivity() {

    companion object {
        fun newIntent(context : Context) : Intent {
            return Intent(context,PDFActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf)
    }
}
