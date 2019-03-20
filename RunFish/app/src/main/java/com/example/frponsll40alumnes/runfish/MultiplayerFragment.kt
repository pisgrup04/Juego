package com.example.frponsll40alumnes.runfish


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_friends.*
import kotlinx.android.synthetic.main.fragment_multiplayer.*


class MultiplayerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_multiplayer, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //button_fish_multiplayer.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_multiplayerFragment_to_levelsFragment))
        button_levels.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_multiplayerFragment_to_levelsFragment))
        button_comeback.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_multiplayerFragment_to_menuFragment))
        button_invite.setOnClickListener{
            fragment_invite_layout.bringToFront()
            fragment_invite_layout.visibility=View.VISIBLE
        }

    }
}
