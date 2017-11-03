package com.gael.projects.poc_pdf_reader

/**
 * Created by gael on 03.11.17.
 */

interface BaseView<T> {
    fun setPresenter(mPresenter : T)
}