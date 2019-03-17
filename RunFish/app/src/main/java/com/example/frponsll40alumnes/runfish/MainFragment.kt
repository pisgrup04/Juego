package com.example.frponsll40alumnes.runfish


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main.*


class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonEnter.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_mainFragment_to_enterFragment))
        buttonSignIn.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_mainFragment_to_signInFragment))
        button_enter.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_mainFragment_to_enterFragment))
        button_SignIn.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_mainFragment_to_signInFragment))
    }


}
