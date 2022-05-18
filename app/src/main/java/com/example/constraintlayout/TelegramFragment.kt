package com.example.constraintlayout

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.constraintlayout.databinding.FragmentTelegramBinding

class TelegramFragment : Fragment() {
    private var _binding: FragmentTelegramBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTelegramBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initActionBar()
        val window = activity?.window
        window?.navigationBarColor = ContextCompat.getColor(requireContext(), R.color.white)

        window?.statusBarColor =
            ContextCompat.getColor(requireContext(), R.color.background_telegram)


    }

    private fun initActionBar() {
        (requireActivity() as AppCompatActivity).setSupportActionBar(binding.toolbar)
        (requireActivity() as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)


    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_main, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item?.itemId == android.R.id.home) {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_conteiner, MainFragment.newInstance())
                ?.commitAllowingStateLoss()
        }
        return super.onOptionsItemSelected(item)

    }

    companion object {

        fun newInstance() = TelegramFragment()
    }
}