package com.example.personalportfolio

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.content.Intent.ACTION_VIEW
import android.net.Uri
import android.widget.ImageView
import android.widget.Toast
import com.example.personalportfolio.databinding.FragmentBiographyBinding


class BiographyFragment : Fragment() {
    private var _binding: FragmentBiographyBinding? = null
    private val binding get() = _binding!! //double !! allows null values
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBiographyBinding.inflate(inflater, container, false)
        val view = binding.root
        val view2 = inflater.inflate(R.layout.fragment_biography, container, false)

        val linkedin = view2.findViewById<ImageView>(R.id.LinkedIn_button) as ImageView

        linkedin.setOnClickListener {
            val openURL = Intent(ACTION_VIEW)
            openURL.data = Uri.parse("https://www.linkedin.com/in/riley-fiske/")
            startActivity(openURL) //https://www.tutorialkart.com/kotlin-android/android-open-url-in-browser-activity/        }
        }

        binding.LinkedInButton.setOnClickListener {
            Toast.makeText(activity, "You clicked the LinkedIn Button!", Toast.LENGTH_LONG).show()
            //val openURL = Intent(ACTION_VIEW)
             //   openURL.data = Uri.parse("https://www.linkedin.com/in/riley-fiske/")
             //   startActivity(openURL) //https://www.tutorialkart.com/kotlin-android/android-open-url-in-browser-activity/
            }

        binding.GithubButton.setOnClickListener {
            val openURL = Intent(ACTION_VIEW)
            openURL.data = Uri.parse("https://github.com/rdfiske17")
            startActivity(openURL);
        }

        binding.EmailButton.setOnClickListener {
            val openURL = Intent(ACTION_VIEW)
            openURL.data = Uri.parse("mailto:rfiske1@cord.edu")
            startActivity(openURL)
        }

        return inflater.inflate(R.layout.fragment_biography, container, false)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
