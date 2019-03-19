package com.example.frponsll40alumnes.runfish


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_single_player.*


class SinglePlayerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_single_player, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //button_resume_singleplayer.setOnClickListener(Navigation.createNavigateOnClickListener(R.id))
        button_levels.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_singlePlayerFragment_to_levelsFragment))
        //button_fish_singleplayer.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_menuFragment_to_friendsFragment))
        //button_freemode_singleplayer.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_singlePlayerFragment_to_levelsFragment))
    }
}
