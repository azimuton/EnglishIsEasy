package com.azimuton.englishiseasy.fragments.newwords

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import com.azimuton.domain.models.Word
import com.azimuton.englishiseasy.R
import com.azimuton.englishiseasy.databinding.FragmentSeaBinding
import com.azimuton.englishiseasy.databinding.FragmentWeatherBinding
import com.azimuton.englishiseasy.fragments.NewWordsFragment
import com.azimuton.englishiseasy.viewmodels.NewWordsViewModel
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WeatherFragment : Fragment() {
    private lateinit var binding : FragmentWeatherBinding
    private val viewModel: NewWordsViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWeatherBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Glide.with(this)
            .asGif()
            .load(R.drawable.backnote)
            .into(binding.ivBackToNewWordsList)
        binding.ivBackToNewWordsList.setOnClickListener {
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.flMain, NewWordsFragment())
                ?.commit()
        }

        binding.ivWeather.setOnClickListener {
            val english : String = binding.weather.text.toString()
            val translate : String = binding.tvWeather.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivWinter.setOnClickListener {
            val english : String = binding.winter.text.toString()
            val translate : String = binding.tvWinter.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivAutumn.setOnClickListener {
            val english : String = binding.autumn.text.toString()
            val translate : String = binding.tvAutumn.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSummer.setOnClickListener {
            val english : String = binding.summer.text.toString()
            val translate : String = binding.tvSummer.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSpring.setOnClickListener {
            val english : String = binding.spring.text.toString()
            val translate : String = binding.tvSpring.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivWind.setOnClickListener {
            val english : String = binding.wind.text.toString()
            val translate : String = binding.tvWind.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivHurricane.setOnClickListener {
            val english : String = binding.hurricane.text.toString()
            val translate : String = binding.tvHurricane.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivStorms.setOnClickListener {
            val english : String = binding.storms.text.toString()
            val translate : String = binding.tvStorms.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSnowstorm.setOnClickListener {
            val english : String = binding.snowstorm.text.toString()
            val translate : String = binding.tvSnowstorm.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBlizzard.setOnClickListener {
            val english : String = binding.blizzard.text.toString()
            val translate : String = binding.tvBlizzard.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSnow.setOnClickListener {
            val english : String = binding.snow.text.toString()
            val translate : String = binding.tvSnow.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivIces.setOnClickListener {
            val english : String = binding.ices.text.toString()
            val translate : String = binding.tvIces.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivRain.setOnClickListener {
            val english : String = binding.rain.text.toString()
            val translate : String = binding.tvRain.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivFog.setOnClickListener {
            val english : String = binding.fog.text.toString()
            val translate : String = binding.tvFog.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivPrecipitation.setOnClickListener {
            val english : String = binding.precipitation.text.toString()
            val translate : String = binding.tvPrecipitation.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivDrizzle.setOnClickListener {
            val english : String = binding.drizzle.text.toString()
            val translate : String = binding.tvDrizzle.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivFreezing.setOnClickListener {
            val english : String = binding.freezing.text.toString()
            val translate : String = binding.tvFreezing.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSun.setOnClickListener {
            val english : String = binding.sun.text.toString()
            val translate : String = binding.tvSun.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSky.setOnClickListener {
            val english : String = binding.sky.text.toString()
            val translate : String = binding.tvSky.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivClouds.setOnClickListener {
            val english : String = binding.clouds.text.toString()
            val translate : String = binding.tvClouds.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivCloud.setOnClickListener {
            val english : String = binding.cloud.text.toString()
            val translate : String = binding.tvCloud.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivStorms.setOnClickListener {
            val english : String = binding.storms.text.toString()
            val translate : String = binding.tvStorms.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivClear.setOnClickListener {
            val english : String = binding.clear.text.toString()
            val translate : String = binding.tvClear.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivMainlycloudy.setOnClickListener {
            val english : String = binding.mainlycloudy.text.toString()
            val translate : String = binding.tvMainlycloudy.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivFrost.setOnClickListener {
            val english : String = binding.frost.text.toString()
            val translate : String = binding.tvFrost.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivIce.setOnClickListener {
            val english : String = binding.ice.text.toString()
            val translate : String = binding.tvIce.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivWarm.setOnClickListener {
            val english : String = binding.warm.text.toString()
            val translate : String = binding.tvWarm.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivCold.setOnClickListener {
            val english : String = binding.cold.text.toString()
            val translate : String = binding.tvCold.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivTemperature.setOnClickListener {
            val english : String = binding.temperature.text.toString()
            val translate : String = binding.tvTemperature.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivWeatherforecast.setOnClickListener {
            val english : String = binding.weatherforecast.text.toString()
            val translate : String = binding.tvWeatherforecast.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivDegree.setOnClickListener {
            val english : String = binding.degree.text.toString()
            val translate : String = binding.tvDegree.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivDry.setOnClickListener {
            val english : String = binding.dry.text.toString()
            val translate : String = binding.tvDry.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivFreshness.setOnClickListener {
            val english : String = binding.freshness.text.toString()
            val translate : String = binding.tvFreshness.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivHeat.setOnClickListener {
            val english : String = binding.heat.text.toString()
            val translate : String = binding.tvHeat.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivHumidity.setOnClickListener {
            val english : String = binding.humidity.text.toString()
            val translate : String = binding.tvHumidity.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivGustwind.setOnClickListener {
            val english : String = binding.gustwind.text.toString()
            val translate : String = binding.tvGustwind.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSquall.setOnClickListener {
            val english : String = binding.squall.text.toString()
            val translate : String = binding.tvSquall.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivTornado.setOnClickListener {
            val english : String = binding.tornado.text.toString()
            val translate : String = binding.tvTornado.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivVisibility.setOnClickListener {
            val english : String = binding.visibility.text.toString()
            val translate : String = binding.tvVisibility.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivLightning.setOnClickListener {
            val english : String = binding.lightning.text.toString()
            val translate : String =binding.tvLightning.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivThunder.setOnClickListener {
            val english : String = binding.thunder.text.toString()
            val translate : String = binding.tvThunder.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivThunderstorm.setOnClickListener {
            val english : String = binding.thunderstorm.text.toString()
            val translate : String = binding.tvThunderstorm.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivDew.setOnClickListener {
            val english : String = binding.dew.text.toString()
            val translate : String = binding.tvDew.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivHail.setOnClickListener {
            val english : String = binding.hail.text.toString()
            val translate : String = binding.tvHail.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivDampness.setOnClickListener {
            val english : String = binding.dampness.text.toString()
            val translate : String = binding.tvDampness.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivHaze.setOnClickListener {
            val english : String = binding.haze.text.toString()
            val translate : String = binding.tvHaze.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivShower.setOnClickListener {
            val english : String = binding.shower.text.toString()
            val translate : String = binding.tvShower.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSnowdrift.setOnClickListener {
            val english : String = binding.snowdrift.text.toString()
            val translate : String = binding.tvSnowdrift.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
           viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSnowflake.setOnClickListener {
            val english : String = binding.snowflake.text.toString()
            val translate : String = binding.tvSnowflake.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivDirt.setOnClickListener {
            val english : String = binding.dirt.text.toString()
            val translate : String = binding.tvDirt.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivRainbow.setOnClickListener {
            val english : String = binding.rainbow.text.toString()
            val translate : String = binding.tvRainbow.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivFlood.setOnClickListener {
            val english : String = binding.flood.text.toString()
            val translate : String = binding.tvFlood.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivTsunami.setOnClickListener {
            val english : String = binding.tsunami.text.toString()
            val translate : String = binding.tvTsunami.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivDrought.setOnClickListener {
            val english : String = binding.drought.text.toString()
            val translate : String = binding.tvDrought.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivIcicle.setOnClickListener {
            val english : String = binding.icicle.text.toString()
            val translate : String = binding.tvIcicle.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivPaddle.setOnClickListener {
            val english : String = binding.paddle.text.toString()
            val translate : String = binding.tvPaddle.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivDark.setOnClickListener {
            val english : String = binding.dark.text.toString()
            val translate : String = binding.tvDark.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSunrise.setOnClickListener {
            val english : String = binding.sunrise.text.toString()
            val translate : String = binding.tvSunrise.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSunset.setOnClickListener {
            val english : String = binding.sunset.text.toString()
            val translate : String = binding.tvSunset.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivThaw.setOnClickListener {
            val english : String = binding.thaw.text.toString()
            val translate : String = binding.tvThaw.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
    }
}