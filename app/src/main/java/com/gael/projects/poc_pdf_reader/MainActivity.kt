package com.gael.projects.poc_pdf_reader

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View
import com.gael.projects.poc_pdf_reader.list.ListContract
import com.gael.projects.poc_pdf_reader.list.ListFragment
import com.gael.projects.poc_pdf_reader.list.ListPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var listPresenter : ListContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var fragment : ListFragment? = supportFragmentManager.findFragmentById(R.id.container) as? ListFragment
        if(fragment == null){
            fragment = ListFragment.newInstance()
        }
        supportFragmentManager.beginTransaction().add(R.id.container,fragment,"").commit()

        listPresenter = ListPresenter(fragment)
    }
}
