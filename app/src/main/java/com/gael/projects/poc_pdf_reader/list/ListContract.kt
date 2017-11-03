package com.gael.projects.poc_pdf_reader.list

import android.content.Context
import com.gael.projects.poc_pdf_reader.BasePresenter
import com.gael.projects.poc_pdf_reader.BaseView

/**
 * Created by gael on 03.11.17.
 */

interface ListContract {
    interface View : BaseView<Presenter> {
        fun goPDF()
        fun goToPDFActivity()
    }
    interface Presenter : BasePresenter{
        fun goPDF(context : Context)
    }
}