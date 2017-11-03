package com.gael.projects.poc_pdf_reader.PDF

import com.gael.projects.poc_pdf_reader.BasePresenter
import com.gael.projects.poc_pdf_reader.BaseView

/**
 * Created by gael on 03.11.17.
 */

interface PDFContract {

    interface View : BaseView<Presenter> {}
    interface Presenter : BasePresenter {}
}