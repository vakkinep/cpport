package com.example.calpolyapp.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.calpolyapp.Community
import com.example.calpolyapp.Homepage
import com.example.calpolyapp.Resources
import com.example.calpolyapp.Stories

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> {
                Homepage()
            }
            1 -> {
                Resources()
            }
            2 -> {
                Community()
            }
            3 -> {
                Stories()
            }
            else -> {
                Stories()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> "HOMEPAGE"
            1 -> "RESOURCES"
            2 -> "COMMUNITY"
            3 -> "STORIES"
            else -> null
        }
    }

    override fun getCount(): Int {
        // Show 4 total pages.
        return 4
    }
}