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
import com.azimuton.englishiseasy.databinding.FragmentVerbsBinding
import com.azimuton.englishiseasy.databinding.FragmentVerbsContinuedBinding
import com.azimuton.englishiseasy.fragments.NewWordsFragment
import com.azimuton.englishiseasy.viewmodels.NewWordsViewModel
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class VerbsContinuedFragment : Fragment() {
    private lateinit var binding : FragmentVerbsContinuedBinding
    private val viewModel: NewWordsViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentVerbsContinuedBinding.inflate(inflater, container, false)
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

        binding.ivLet.setOnClickListener {
            val english : String = binding.let.text.toString()
            val translate : String = binding.tvLet.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivLie.setOnClickListener {
            val english : String = binding.lie.text.toString()
            val translate : String = binding.tvLie.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivLight.setOnClickListener {
            val english : String = binding.light.text.toString()
            val translate : String = binding.tvLight.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivLose.setOnClickListener {
            val english : String = binding.lose.text.toString()
            val translate : String = binding.tvLose.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivMake.setOnClickListener {
            val english : String = binding.make.text.toString()
            val translate : String = binding.tvMake.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivMean.setOnClickListener {
            val english : String = binding.mean.text.toString()
            val translate : String = binding.tvMean.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivMeet.setOnClickListener {
            val english : String = binding.meet.text.toString()
            val translate : String = binding.tvMeet.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivPay.setOnClickListener {
            val english : String = binding.pay.text.toString()
            val translate : String = binding.tvPay.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivPut.setOnClickListener {
            val english : String = binding.put.text.toString()
            val translate : String = binding.tvPut.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivRead.setOnClickListener {
            val english : String = binding.read.text.toString()
            val translate : String = binding.tvRead.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivRide.setOnClickListener {
            val english : String = binding.ride.text.toString()
            val translate : String = binding.tvRide.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivRing.setOnClickListener {
            val english : String = binding.ring.text.toString()
            val translate : String = binding.tvRing.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivRise.setOnClickListener {
            val english : String = binding.rise.text.toString()
            val translate : String = binding.tvRise.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivRun.setOnClickListener {
            val english : String = binding.run.text.toString()
            val translate : String = binding.tvRun.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSay.setOnClickListener {
            val english : String = binding.say.text.toString()
            val translate : String = binding.tvSay.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSee.setOnClickListener {
            val english : String = binding.see.text.toString()
            val translate : String = binding.tvSee.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSeek.setOnClickListener {
            val english : String = binding.seek.text.toString()
            val translate : String = binding.tvSeek.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSell.setOnClickListener {
            val english : String = binding.sell.text.toString()
            val translate : String = binding.tvSell.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSend.setOnClickListener {
            val english : String = binding.send.text.toString()
            val translate : String = binding.tvSend.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSet.setOnClickListener {
            val english : String = binding.set.text.toString()
            val translate : String = binding.tvSet.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivShake.setOnClickListener {
            val english : String = binding.shake.text.toString()
            val translate : String = binding.tvShake.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivShine.setOnClickListener {
            val english : String = binding.shine.text.toString()
            val translate : String = binding.tvShine.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivShoot.setOnClickListener {
            val english : String = binding.shoot.text.toString()
            val translate : String = binding.tvShoot.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivShow.setOnClickListener {
            val english : String = binding.show.text.toString()
            val translate : String = binding.tvShow.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivShrink.setOnClickListener {
            val english : String = binding.shrink.text.toString()
            val translate : String = binding.tvShrink.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivShut.setOnClickListener {
            val english : String = binding.shut.text.toString()
            val translate : String = binding.tvShut.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSing.setOnClickListener {
            val english : String = binding.sing.text.toString()
            val translate : String = binding.tvSing.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSit.setOnClickListener {
            val english : String = binding.sit.text.toString()
            val translate : String = binding.tvSit.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSleep.setOnClickListener {
            val english : String = binding.sleep.text.toString()
            val translate : String = binding.tvSleep.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSlide.setOnClickListener {
            val english : String = binding.slide.text.toString()
            val translate : String = binding.tvSlide.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSmell.setOnClickListener {
            val english : String = binding.smell.text.toString()
            val translate : String = binding.tvSmell.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSpeak.setOnClickListener {
            val english : String = binding.speak.text.toString()
            val translate : String = binding.tvSpeak.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSpell.setOnClickListener {
            val english : String = binding.spell.text.toString()
            val translate : String = binding.tvSpell.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSpend.setOnClickListener {
            val english : String = binding.spend.text.toString()
            val translate : String = binding.tvSpend.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSpill.setOnClickListener {
            val english : String = binding.spill.text.toString()
            val translate : String = binding.tvSpill.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSpin.setOnClickListener {
            val english : String = binding.spin.text.toString()
            val translate : String = binding.tvSpin.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSplit.setOnClickListener {
            val english : String = binding.split.text.toString()
            val translate : String = binding.tvSplit.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSpoil.setOnClickListener {
            val english : String = binding.spoil.text.toString()
            val translate : String = binding.tvSpoil.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSpread.setOnClickListener {
            val english : String = binding.spread.text.toString()
            val translate : String = binding.tvSpread.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivStand.setOnClickListener {
            val english : String = binding.stand.text.toString()
            val translate : String = binding.tvStand.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSteal.setOnClickListener {
            val english : String = binding.steal.text.toString()
            val translate : String = binding.tvSteal.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSting.setOnClickListener {
            val english : String = binding.sting.text.toString()
            val translate : String = binding.tvSting.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivStink.setOnClickListener {
            val english : String = binding.stink.text.toString()
            val translate : String = binding.tvStink.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivStrike.setOnClickListener {
            val english : String = binding.strike.text.toString()
            val translate : String = binding.tvStrike.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSwear.setOnClickListener {
            val english : String = binding.swear.text.toString()
            val translate : String = binding.tvSwear.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSweep.setOnClickListener {
            val english : String = binding.sweep.text.toString()
            val translate : String = binding.tvSweep.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSwell.setOnClickListener {
            val english : String = binding.swell.text.toString()
            val translate : String = binding.tvSwell.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSwim.setOnClickListener {
            val english : String = binding.swim.text.toString()
            val translate : String = binding.tvSwim.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivTake.setOnClickListener {
            val english : String = binding.take.text.toString()
            val translate : String = binding.tvTake.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivTeach.setOnClickListener {
            val english : String = binding.teach.text.toString()
            val translate : String = binding.tvTeach.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivTear.setOnClickListener {
            val english : String = binding.tear.text.toString()
            val translate : String = binding.tvTear.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivTell.setOnClickListener {
            val english : String = binding.tell.text.toString()
            val translate : String = binding.tvTell.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivThink.setOnClickListener {
            val english : String = binding.think.text.toString()
            val translate : String = binding.tvThink.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivThrow.setOnClickListener {
            val english : String = binding.Throw.text.toString()
            val translate : String = binding.tvThrow.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivUnderstand.setOnClickListener {
            val english : String = binding.understand.text.toString()
            val translate : String = binding.tvUnderstand.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivWake.setOnClickListener {
            val english : String = binding.wake.text.toString()
            val translate : String = binding.tvWake.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivWear.setOnClickListener {
            val english : String = binding.wear.text.toString()
            val translate : String = binding.tvWear.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivWin.setOnClickListener {
            val english : String = binding.win.text.toString()
            val translate : String = binding.tvWin.text.toString()
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
        binding.ivWrite.setOnClickListener {
            val english : String = binding.write.text.toString()
            val translate : String = binding.tvWrite.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }

    }
}