package com.example.frponsll40alumnes.runfish


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_options.*

class options : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_options, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button_comeback_options.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_options_to_menuFragment))
        button_logOut.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_options_to_mainFragment))
        /*
        * TODO: ListenerButton de Switch, button idioma i seekbar.
         */
    }
}
