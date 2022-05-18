package com.example.constraintlayout

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.core.content.ContextCompat
import com.example.constraintlayout.databinding.FragmentMusicBinding

class MusicFragment : Fragment() {
    private var _binding: FragmentMusicBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMusicBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val window = activity?.window
        window?.statusBarColor = ContextCompat.getColor(requireContext(), R.color.background_music)
        window?.navigationBarColor =
            ContextCompat.getColor(requireContext(), R.color.background_music)
    }

    companion object {

        fun newInstance() = MusicFragment()
    }
}