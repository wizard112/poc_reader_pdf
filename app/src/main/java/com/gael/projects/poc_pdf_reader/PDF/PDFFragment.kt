package com.gael.projects.poc_pdf_reader.PDF

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gael.projects.poc_pdf_reader.R
import kotlinx.android.synthetic.main.activity_pdf.*

/**
 * Created by gael on 03.11.17.
 */
class PDFFragment : Fragment(), PDFContract.View {
    lateinit var pdfPresenter : PDFContract.Presenter

    companion object {
        fun newInstance() : PDFFragment { return PDFFragment()
        }
    }
    override fun setPresenter(mPresenter: PDFContract.Presenter) {
        pdfPresenter = mPresenter
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_pdf,container,false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}