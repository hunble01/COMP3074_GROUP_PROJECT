package com.example.personalrestaurantguide

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button // Correct import for Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // Find the button by ID and set an onClickListener to navigate to the AboutFragment
        val aboutButton = view.findViewById<Button>(R.id.aboutButton)
        aboutButton.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_aboutFragment)
        }

        return view
    }
}
