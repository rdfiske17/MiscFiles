package com.example.personalportfolio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.findNavController
import com.example.personalportfolio.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    //private var _binding: FragmentHomeBinding? = null
    //private val binding get() = _binding!! //double !! allows null values
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        //_binding = FragmentHomeBinding.inflate(inflater, container, false)
        //val view1 = binding.root
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val bioButton = view.findViewById<Button>(R.id.bio_button)

        Toast.makeText(activity, "Made it here!", Toast.LENGTH_LONG).show()
        bioButton.setOnClickListener {
            Toast.makeText(activity, "You clicked the Bio Button!", Toast.LENGTH_LONG).show()
            //view1.findNavController()
            //    .navigate(R.id.action_homeFragment_to_biographyFragment)
        }

        /*binding.projectButton.setOnClickListener {
            view1.findNavController()
                .navigate(R.id.action_homeFragment_to_projectListFragment)
        }*/


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    /*override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }*/
}