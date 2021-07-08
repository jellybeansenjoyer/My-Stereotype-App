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
import com.google.android.material.bottomnavigation.BottomNavigationView

class BlankFragment3 : Fragment() {


  lateinit private var binding: FragmentBlank3Binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
    binding = DataBindingUtil.inflate<FragmentBlank3Binding>(inflater,R.layout.fragment_blank3,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

            activity?.findViewById<BottomNavigationView>(R.id.bottom_nav_view)?.visibility = View.INVISIBLE
            activity?.findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)?.setNavigationIcon(R.drawable.ic_menu)

        binding.button.setOnClickListener {

            parentFragmentManager.commit{
                replace<BlankFragment>(R.id.container)
                activity?.findViewById<BottomNavigationView>(R.id.bottom_nav_view)?.visibility = View.VISIBLE
                activity?.findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)?.setNavigationIcon(R.drawable.ic_back)
                addToBackStack(null)
                setReorderingAllowed(true)
            }

        }
    }

}