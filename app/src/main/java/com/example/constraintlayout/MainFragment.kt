package com.example.constraintlayout

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.constraintlayout.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initNavigation()

    }

    private fun initNavigation() {
        getFacebookFragment()
        getTelegramFragment()
        getCalculatorFragment()
        getMusicFragment()
        getMusicLinerFragment()
        getTeFacebookLinerFragment()
        getCalculatorLinerFragment()
        getTelegramLinerFragment()
        getFacebookCompose()
    }

    private fun getFacebookCompose() {
        binding.buttonFacebookCompose.setOnClickListener {
            val intent = Intent(requireActivity(), FacebookComposeActivity::class.java)
            startActivity(intent)
        }
    }

    private fun getTelegramFragment() {
        binding.buttonTelegram.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_conteiner, TelegramFragment.newInstance())
                ?.commitAllowingStateLoss()
        }

    }

    private fun getCalculatorFragment() {
        binding.buttonCalculation.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_conteiner, CalculatorFragment.newInstance())
                ?.commitAllowingStateLoss()
        }
    }

    private fun getFacebookFragment() {
        binding.buttonFacebook.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_conteiner, FacebookFragment.newInstance())
                ?.commitAllowingStateLoss()

        }


    }

    private fun getMusicFragment() {
        binding.buttonMusic.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_conteiner, MusicFragment.newInstance())
                ?.commitAllowingStateLoss()

        }
    }

    private fun getTeFacebookLinerFragment() {
        binding.buttonFacebookLinearLayout.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_conteiner, FacebookLinerFragment.newInstance())
                ?.commitAllowingStateLoss()

        }
    }

    private fun getCalculatorLinerFragment() {
        binding.buttonCalculationLinearLayout.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_conteiner, CalculatorLinerFragment.newInstance())
                ?.commitAllowingStateLoss()

        }
    }

    private fun getTelegramLinerFragment() {
        binding.buttonTelegramLinearLayout.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_conteiner, TelegramLinerFragment.newInstance())
                ?.commitAllowingStateLoss()

        }
    }

    private fun getMusicLinerFragment() {
        binding.buttonMusicLinearLayout.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_conteiner, MusicLinerFragment.newInstance())
                ?.commitAllowingStateLoss()

        }
    }

    companion object {

        fun newInstance(): MainFragment {
            return MainFragment()
        }
    }
}