package net.wr.geektalk.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import net.wr.geektalk.R
import net.wr.geektalk.views.DrawingView

class DrawingFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return DrawingView(context)
    }

    companion object {
        fun newInstance(): DrawingFragment {
            val fragment = DrawingFragment()
            return fragment
        }
    }
}
