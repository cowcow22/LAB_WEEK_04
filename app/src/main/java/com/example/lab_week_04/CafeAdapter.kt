package com.example.lab_week_04

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

val TABS_FIXED = listOf(
    R.string.starbucks_title,
    R.string.janjijiwa_title,
    R.string.kopikenangan_title,
)

// Add descriptions for each cafe
val CAFE_DESCRIPTIONS = listOf(
    R.string.starbucks_description,
    R.string.janjijiwa_description,
    R.string.kopikenangan_description
)

class CafeAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return TABS_FIXED.size
    }

    override fun createFragment(position: Int): Fragment {
        // Create a new CafeDetailFragment and pass the title and description
        return CafeDetailFragment.newInstance(TABS_FIXED[position], CAFE_DESCRIPTIONS[position])
    }
}
