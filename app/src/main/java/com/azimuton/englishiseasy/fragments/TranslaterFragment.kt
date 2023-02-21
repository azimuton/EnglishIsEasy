package com.azimuton.englishiseasy.fragments

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.view.inputmethod.InputMethodManager
import android.view.translation.Translator
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import com.azimuton.domain.models.Word
import com.azimuton.englishiseasy.R
import com.azimuton.englishiseasy.databinding.FragmentTranslaterBinding
import com.azimuton.englishiseasy.viewmodels.LearnViewModel
import com.azimuton.englishiseasy.viewmodels.TranslaterViewModel
import com.google.mlkit.nl.translate.TranslateLanguage
import com.google.mlkit.nl.translate.Translation
import com.google.mlkit.nl.translate.TranslatorOptions
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TranslaterFragment : Fragment() {
    private lateinit var  russianEnglishTranslator : com.google.mlkit.nl.translate.Translator
    private lateinit var  englishRussianTranslator : com.google.mlkit.nl.translate.Translator
    var text : String = ""
    lateinit var binding : FragmentTranslaterBinding
    private val viewModel : TranslaterViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTranslaterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.ivChangeLanguages.setOnClickListener(firstButtonListener)
        binding.ivClearET.setOnClickListener {
            binding.etEnterWordForTranslate.text.clear()
            binding.tvTranslatjngWord.text = ""
            binding.tvAlarmMessage.text = ""
            binding.tvSaveTranslate.isEnabled = true
            binding.tvSaveTranslate.alpha = 1f
            val  w : Window? = activity?.window
            w?.decorView?.systemUiVisibility = (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // скрываем нижнюю панель навигации
                    or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) //появляется поверх активити и исчезает
        }
        binding.tvSaveTranslate.setOnClickListener {
            if (binding.etEnterWordForTranslate.text.isNotEmpty() && binding.tvTranslatjngWord.text.isNotEmpty()) {
                if(binding.tvEnglish.text == ENG && binding.tvRussian.text == RUS){
                    val englishWord: String = binding.etEnterWordForTranslate.text.toString()
                    val translateWord: String = binding.tvTranslatjngWord.text.toString()
                    val word = Word(englishWord = englishWord, translateWord = translateWord)
                    viewModel.insert(word)
                    binding.etEnterWordForTranslate.text.clear()
                    binding.tvTranslatjngWord.text = ""
                    binding.tvAlarmMessage.text = ""
                    binding.tvSaveTranslate.isEnabled = true
                    binding.tvSaveTranslate.alpha = 1f
                } else {
                    val englishWord: String = binding.etEnterWordForTranslate.text.toString()
                    val translateWord: String = binding.tvTranslatjngWord.text.toString()
                    val word = Word(englishWord = englishWord, translateWord = translateWord)
                    viewModel.insert(word)
                    binding.etEnterWordForTranslate.text.clear()
                    binding.tvTranslatjngWord.text = ""
                    binding.tvAlarmMessage.text = ""
                    binding.tvSaveTranslate.isEnabled = true
                    binding.tvSaveTranslate.alpha = 1f
                }
            } else {
                Toast.makeText(
                    requireActivity(), "Нет данных для сохранения!", Toast.LENGTH_SHORT).show()
            }
        }
        binding.tvDoTranslate.setOnClickListener {
            if (binding.etEnterWordForTranslate.text.isNotEmpty()){
                text = binding.etEnterWordForTranslate.text.toString()
                if(binding.tvEnglish.text == ENG && binding.tvRussian.text == RUS){
                    prepareLangTransMode2()
                }else{
                    prepareLangTransMode()
                }
            } else {
                Toast.makeText(requireActivity(), "Напишите слово для перевода!", Toast.LENGTH_SHORT).show()
            }
            val ims = activity?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            ims.hideSoftInputFromWindow(binding.etEnterWordForTranslate.windowToken, 0)
            val  w : Window? = activity?.window
            w?.decorView?.systemUiVisibility = (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // скрываем нижнюю панель навигации
                    or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) //появляется поверх активити и исчезает
        }
        val  w : Window? = activity?.window
        w?.decorView?.systemUiVisibility = (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // скрываем нижнюю панель навигации
                or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) //появляется поверх активити и исчезает

    }
    @SuppressLint("SetTextI18n")
    private fun prepareLangTransMode() {
        val options = TranslatorOptions.Builder()
            .setSourceLanguage(TranslateLanguage.RUSSIAN)
            .setTargetLanguage(TranslateLanguage.ENGLISH)
            .build()
        russianEnglishTranslator = Translation.getClient(options)
        russianEnglishTranslator.downloadModelIfNeeded()
            .addOnSuccessListener {
                translateWord()
            }
            .addOnFailureListener { exception ->
                binding.tvTranslatjngWord.text = "Error: ${exception.message}"
            }
    }
    @SuppressLint("SetTextI18n")
    private fun prepareLangTransMode2() {
        val options = TranslatorOptions.Builder()
            .setSourceLanguage(TranslateLanguage.ENGLISH)
            .setTargetLanguage(TranslateLanguage.RUSSIAN)
            .build()
        englishRussianTranslator = Translation.getClient(options)
        englishRussianTranslator.downloadModelIfNeeded()
            .addOnSuccessListener {
                translateWord2()
            }
            .addOnFailureListener {exception ->
                binding.tvTranslatjngWord.text = "Error: ${exception.message}"
            }
    }
    @SuppressLint("SetTextI18n")
    private fun translateWord() {
        russianEnglishTranslator.translate(text)
            .addOnSuccessListener { translatedText ->
                binding.tvTranslatjngWord.text = translatedText
                if(binding.tvTranslatjngWord.text == text){
                    binding.tvAlarmMessage.text = "В данном языке нет такого слова!"
                    binding.tvSaveTranslate.isEnabled = false
                    binding.tvSaveTranslate.alpha = 0.5f
                } else {
                    binding.tvAlarmMessage.text = ""
                    binding.tvSaveTranslate.isEnabled = true
                    binding.tvSaveTranslate.alpha = 1f
                }
            }
            .addOnFailureListener { exception ->
                binding.tvSaveTranslate.text = "Error: ${exception.message}"
            }
    }
    @SuppressLint("SetTextI18n")
    private fun translateWord2() {
        englishRussianTranslator.translate(text)
            .addOnSuccessListener { translatedText ->
                binding.tvTranslatjngWord.text = translatedText
                if(binding.tvTranslatjngWord.text == text){
                    binding.tvAlarmMessage.text = "There is no such word in this language!"
                    binding.tvSaveTranslate.isEnabled = false
                    binding.tvSaveTranslate.alpha = 0.5f
                } else {
                    binding.tvAlarmMessage.text = ""
                    binding.tvSaveTranslate.isEnabled = true
                    binding.tvSaveTranslate.alpha = 1f
                }
            }
            .addOnFailureListener { exception ->
                binding.tvTranslatjngWord.text = "Error: ${exception.message}"
            }
    }
    private val firstButtonListener: View.OnClickListener = View.OnClickListener {
        // меняем обработчик нажатия кнопки на второй
        binding.tvEnglish.text = RUS
        binding.tvRussian.text = ENG
        binding.ivChangeLanguages.setOnClickListener(secondButtonListener)
    }
    private val secondButtonListener: View.OnClickListener = View.OnClickListener {
        // возвращаем первый обработчик нажатия кнопки
        binding.tvEnglish.text = ENG
        binding.tvRussian.text = RUS
        binding.ivChangeLanguages.setOnClickListener(firstButtonListener)
    }

    companion object{
        const val ENG = "English"
        const val RUS = "Russian"
    }
}