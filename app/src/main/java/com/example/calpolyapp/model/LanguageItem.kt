package com.example.calpolyapp.model

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.calpolyapp.R

class LanguageItem {

    var icons:Int ? = 0
    var name:String ? = null

    constructor(icons: Int?, name: String?) {
        this.icons = icons
        this.name = name
    }
}