package com.gael.projects.poc_pdf_reader.list

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gael.projects.poc_pdf_reader.PDF.PDFActivity
import com.gael.projects.poc_pdf_reader.R
import kotlinx.android.synthetic.main.fragment_list.*

/**
 * Created on 03.11.17.
 */

class ListFragment : Fragment(), ListContract.View {
    lateinit var presenterList : ListContract.Presenter

    companion object {
        fun newInstance () : ListFragment {return ListFragment()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_list,container,false);
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_pdf.setOnClickListener(View.OnClickListener { v ->
            goPDF()
        })
    }

    override fun setPresenter(mPresenter: ListContract.Presenter) {
        presenterList = mPresenter
    }

    override fun goPDF() {
        presenterList.goPDF(activity)
    }

    override fun goToPDFActivity() {
        activity.startActivity(PDFActivity.newIntent(activity))
    }


}