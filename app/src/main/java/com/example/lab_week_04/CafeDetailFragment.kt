package com.example.lab_week_04

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.widget.TextView

class CafeDetailFragment : Fragment() {

    companion object {
        private const val ARG_TITLE = "title"
        private const val ARG_DESCRIPTION = "description"

        // Create a new instance of CafeDetailFragment and pass the arguments
        fun newInstance(titleResId: Int, descriptionResId: Int): CafeDetailFragment {
            val fragment = CafeDetailFragment()
            val args = Bundle()
            args.putInt(ARG_TITLE, titleResId)
            args.putInt(ARG_DESCRIPTION, descriptionResId)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_cafe_detail, container, false)

        val titleTextView: TextView = view.findViewById(R.id.cafe_title)
        val descriptionTextView: TextView = view.findViewById(R.id.cafe_description)

        // Retrieve arguments passed to the fragment
        val titleResId = arguments?.getInt(ARG_TITLE)
        val descriptionResId = arguments?.getInt(ARG_DESCRIPTION)

        // Set the title and description
        if (titleResId != null) {
            titleTextView.setText(titleResId)
        }
        if (descriptionResId != null) {
            descriptionTextView.setText(descriptionResId)
        }

        return view
    }
}
