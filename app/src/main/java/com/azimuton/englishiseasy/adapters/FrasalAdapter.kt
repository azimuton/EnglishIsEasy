package com.azimuton.englishiseasy.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.azimuton.englishiseasy.fragments.*
import com.azimuton.englishiseasy.fragments.frasalverbs.FrasalVerbsFourFragment
import com.azimuton.englishiseasy.fragments.frasalverbs.FrasalVerbsFragment
import com.azimuton.englishiseasy.fragments.frasalverbs.FrasalVerbsThreeFragment
import com.azimuton.englishiseasy.fragments.frasalverbs.FrasalVerbsTwoFragment
import com.azimuton.englishiseasy.fragments.popularexpressions.PopularExpressionsFourFragment
import com.azimuton.englishiseasy.fragments.popularexpressions.PopularExpressionsFragment
import com.azimuton.englishiseasy.fragments.popularexpressions.PopularExpressionsThreeFragment
import com.azimuton.englishiseasy.fragments.popularexpressions.PopularExpressionsTwoFragment

class FrasalAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 8
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FrasalVerbsFragment()
            1 -> FrasalVerbsTwoFragment()
            2 -> FrasalVerbsThreeFragment()
            3 -> FrasalVerbsFourFragment()
            4 -> PopularExpressionsFragment()
            5 -> PopularExpressionsTwoFragment()
            6 -> PopularExpressionsThreeFragment()
            else -> PopularExpressionsFourFragment()
        }
    }
}