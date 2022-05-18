package com.example.constraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.constraintlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getMainFragment()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


    }

    private fun getMainFragment() {

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_conteiner, MainFragment.newInstance()).commitAllowingStateLoss()
    }


}