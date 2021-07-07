package com.example.stereotype.UI

import android.graphics.Insets.add
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.example.stereotype.R
import com.example.stereotype.databinding.FragmentBlank3Binding

class BlankFragment3 : Fragment() {


  lateinit private var binding: FragmentBlank3Binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
    binding = DataBindingUtil.inflate<FragmentBlank3Binding>(inflater,R.layout.fragment_blank3,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener {
            parentFragmentManager.commit{
                replace<BlankFragment>(R.id.container)
                setReorderingAllowed(true)
            }
        }
    }

}