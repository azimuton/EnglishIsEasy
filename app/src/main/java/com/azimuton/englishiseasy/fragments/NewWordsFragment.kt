package com.azimuton.englishiseasy.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import com.azimuton.englishiseasy.R
import com.azimuton.englishiseasy.databinding.FragmentNewWordsBinding
import com.azimuton.englishiseasy.fragments.newwords.*
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NewWordsFragment : Fragment() {
    private lateinit var binding : FragmentNewWordsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       binding = FragmentNewWordsBinding.inflate(inflater, container, false)
        return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val formuls = resources.getStringArray(R.array.names)
        val arrayAdapter = ArrayAdapter(requireActivity(), R.layout.item_adapter, formuls)
        binding.listViewNewWords.adapter = arrayAdapter

        binding.listViewNewWords.onItemClickListener = object : AdapterView.OnItemSelectedListener,
            AdapterView.OnItemClickListener {
            override fun onItemSelected(
                parent: AdapterView<*>?, view: View?,
                position: Int, id: Long
            ) {
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                when (position) {
                    0 -> {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.replace(R.id.flMain, WashRoomFragment())
                            ?.commit()
                        animate()
                    }
                    1 -> {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.replace(R.id.flMain, SeaFragment())
                            ?.commit()
                        animate()
                    }
                    2 ->{
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.replace(R.id.flMain, VerbsFragment())
                            ?.commit()
                        animate()
                    }
                    3 -> {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.replace(R.id.flMain, VerbsContinuedFragment())
                            ?.commit()
                        animate()
                    }
                    4 -> {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.replace(R.id.flMain, CityFragment())
                            ?.commit()
                        animate()
                    }
                    5 -> {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.replace(R.id.flMain, WildAnimalsFragment())
                            ?.commit()
                        animate()
                    }
                    6 -> {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.replace(R.id.flMain, HomeAnimalsFragment())
                            ?.commit()
                        animate()
                    }
                    7 -> {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.replace(R.id.flMain, BuildingFragment())
                            ?.commit()
                        animate()
                    }
                    8 -> {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.replace(R.id.flMain, ToolsFragment())
                            ?.commit()
                        animate()
                    }
                    9 -> {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.replace(R.id.flMain, KitchenFragment())
                            ?.commit()
                        animate()
                    }
                    10 -> {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.replace(R.id.flMain, VegetablesFragment())
                            ?.commit()
                        animate()
                    }
                    11 -> {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.replace(R.id.flMain, WeatherFragment())
                            ?.commit()
                        animate()
                    }
                    12-> {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.replace(R.id.flMain, NatureFragment())
                            ?.commit()
                        animate()
                    }
                    13 -> {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.replace(R.id.flMain, FamilyFragment())
                            ?.commit()
                        animate()
                    }
                    14 -> {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.replace(R.id.flMain, BedRoomFragment())
                            ?.commit()
                        animate()
                    }
                    15 -> {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.replace(R.id.flMain, TransportFragment())
                            ?.commit()
                        animate()
                    }
                    16 -> {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.replace(R.id.flMain, FruitsFragment())
                            ?.commit()
                        animate()
                    }
                    17 -> {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.replace(R.id.flMain,  PartsOfBodyFragment())
                            ?.commit()
                        animate()
                    }
                    18 -> {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.replace(R.id.flMain, BerryFragment())
                            ?.commit()
                        animate()
                    }
                }
            }
        }
        val  w : Window? = activity?.window
        w?.decorView?.systemUiVisibility = (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // скрываем нижнюю панель навигации
                or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) //появляется поверх активити и исчезает
    }
    fun animate(){
        activity?.overridePendingTransition(0, R.anim.open_activity)
        //activity?.finish()
    }
}