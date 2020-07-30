package com.example.calpolyapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.calpolyapp.adapters.LanguageAdapters
import com.example.calpolyapp.model.LanguageItem
import kotlinx.android.synthetic.main.fragment_stories.*

class Stories : Fragment(), AdapterView.OnItemClickListener {
    var arrayList:ArrayList<LanguageItem> ? = null
    var gridView:GridView ? = null
    var languageAdapters:LanguageAdapters ? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_stories, container, false);
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        gridView = my_grid_view_list
        arrayList = ArrayList()
        arrayList = setDataList()
        languageAdapters = context?.applicationContext?.let { LanguageAdapters(it, arrayList!!) }
        gridView?.adapter = languageAdapters
        gridView?.onItemClickListener = this
    }

    private fun setDataList(): ArrayList<LanguageItem>{

        var arrayList:ArrayList<LanguageItem> = ArrayList()

        arrayList.add(LanguageItem(R.drawable.person1, "Depression"))
        arrayList.add(LanguageItem(R.drawable.person2, "Take it easy"))
        arrayList.add(LanguageItem(R.drawable.person3, "No acceptance"))
        arrayList.add(LanguageItem(R.drawable.person1, "I feel lost"))
        arrayList.add(LanguageItem(R.drawable.person2, "Expectations"))
        arrayList.add(LanguageItem(R.drawable.person3, "Rise"))
        arrayList.add(LanguageItem(R.drawable.person1, "Inspirational"))
        arrayList.add(LanguageItem(R.drawable.person2, "Outdoor Helps"))
        arrayList.add(LanguageItem(R.drawable.person3, "Reach Out"))
        arrayList.add(LanguageItem(R.drawable.person1, "Conversations"))

        return arrayList
    }

    override fun onItemClick(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
        var items:LanguageItem = arrayList!!.get(position)
        Toast.makeText(context?.applicationContext, items.name, Toast.LENGTH_SHORT).show()
    }
}