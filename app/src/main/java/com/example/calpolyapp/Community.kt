package com.example.calpolyapp

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_community.*

class Community : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_community, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        followingButton3.setOnClickListener {
            Toast.makeText(view.context, "Now Following Community Protests", Toast.LENGTH_LONG).show()
            followingButton3.text = "FOLLOWING"
            followingButton3.setTextColor(Color.BLACK)
            followingButton3.setBackgroundResource(R.drawable.text_border)
            membersCount3.setText("1533 Following")
        }

        followingButton4.setOnClickListener {
            Toast.makeText(view.context, "Now Following Shades of Cal Poly", Toast.LENGTH_LONG).show()
            followingButton4.text = "FOLLOWING"
            followingButton4.setTextColor(Color.BLACK)
            followingButton4.setBackgroundResource(R.drawable.text_border)
            membersCount4.setText("135 Following")
        }

        followingButton6.setOnClickListener {
            Toast.makeText(view.context, "Now Following Protests", Toast.LENGTH_SHORT).show()
            followingButton6.text = "FOLLOWING"
            followingButton6.setTextColor(Color.BLACK)
            followingButton6.setBackgroundResource(R.drawable.text_border)
        }
    }

}

