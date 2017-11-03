package com.gael.projects.poc_pdf_reader.list

import android.content.Context

/**
 * Created by gael on 03.11.17.
 */

class ListPresenter(mView : ListContract.View) : ListContract.Presenter {
    private lateinit var view : ListContract.View
    init {
        view = mView
        view.setPresenter(this)
    }

    override fun goPDF(context : Context) {
        view.goToPDFActivity()
    }

}