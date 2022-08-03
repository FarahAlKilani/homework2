package com.example.dialogFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import com.example.hw2.*

class CustomDialogFragment: DialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView: View = inflater.inflate(R.layout.fragment_dialog_custom, container,false)
        val setOnClickListener = rootView.cancelB.setOnClickListener {
            dismiss()
        }
        rootView.acceptB.setOnClickListener{
            var radiogroup = null
            val selectedId= radiogroup.chechedRadioButtonId
            val radio =rootView.findViewById<RadioButton>(selectedId)
            var textView2 = radio.text.toString()
            Toast.makeText(context, "done", Toast.LENGTH_SHORT).show()
            dismiss()
        }
        return rootView
    }

    fun show(supportFragmentManager: FragmentManager, tag: Any, s: String) {
        TODO("Not yet implemented")
    }
}