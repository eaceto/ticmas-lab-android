package com.example.textmatchapp.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.textmatchapp.databinding.ActivityMainBinding
import com.example.textmatchapp.viewmodel.CompararTextViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: CompararTextViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.editText1.setText("")
        binding.editText2.setText("")

        binding.compareButton.setOnClickListener {
            val texto1 = binding.editText1.text.toString()
            val texto2 = binding.editText2.text.toString()

            viewModel.compareText(texto1, texto2)
        }

        viewModel.result.observe(this) { result ->
            binding.resultTextView.text = result
        }
    }
}
