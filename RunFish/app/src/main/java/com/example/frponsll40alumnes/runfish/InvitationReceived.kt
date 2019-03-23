package com.example.frponsll40alumnes.runfish


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/*
    Fragmento que se muestra al recibir una invitación.
    Puede mostrar varias opciones:
        -> Si estás en juego, salir y guardar estado, unirte al lobby
        -> Si estas en el menu, te lleva directamente al menu multijugador y te une al lobby
 */
class InvitationRecieved : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_invitation_received, container, false)
    }


}
