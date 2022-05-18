package com.example.constraintlayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.example.constraintlayout.databinding.FragmentCalculatorLinerBinding


class CalculatorLinerFragment : Fragment() {
    private var _binding: FragmentCalculatorLinerBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val window = activity?.window
        window?.navigationBarColor =
            ContextCompat.getColor(requireContext(), R.color.background_calculator)

        window?.statusBarColor =
            ContextCompat.getColor(requireContext(), R.color.background_calculator)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentCalculatorLinerBinding.inflate(inflater, container, false)
        return binding.root
    }


    companion object {

        fun newInstance() = CalculatorLinerFragment()
    }
}