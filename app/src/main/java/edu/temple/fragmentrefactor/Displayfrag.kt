package edu.temple.fragmentrefactor

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class Displayfrag : Fragment() {

    private var displayTextView: TextView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_display, container, false)
        displayTextView = view.findViewById(R.id.displayTextView)
        return view
    }

    fun updateText(name: String) {
        // Update the text of the TextView
        displayTextView?.text = if (name.isNotBlank()) {
            "Hello, $name!"
        } else {
            "Please enter your name"
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = Displayfrag()
    }
}
