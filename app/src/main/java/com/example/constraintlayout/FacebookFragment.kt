package com.example.constraintlayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.example.constraintlayout.databinding.FragmentFacebookBinding

class FacebookFragment : Fragment() {
    private var _binding: FragmentFacebookBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val window = activity?.window
        window?.navigationBarColor = ContextCompat.getColor(requireContext(), R.color.white)

        window?.statusBarColor = ContextCompat.getColor(requireContext(), R.color.white)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFacebookBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {

        fun newInstance() = FacebookFragment()
    }
}