package com.example.frponsll40alumnes.runfish

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_invitation_received.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/*
    ----------------- FRAGMENT VS NOTIFICATION ----------------
    ¿Debería intentar implementarlo con una notificación en lugar de un fragment?
    https://developers.google.com/games/services/android/realtimeMultiplayer#from_the_invitation_inbox
 */

/*
    ----------------------- DESCRIPCIÓN --------------------------
    Fragmento que se muestra al recibir una invitación.
    Puede mostrar varias opciones:
        -> Si estás en juego, salir y guardar estado, unirte al lobby
        -> Si estas en el menu, te lleva directamente al menu multijugador y te une al lobby
 */

/*
    ------------------ CONSIDERACIONES DE DISEÑO -----------------
    Se visualizará cuando el servidor envíe la invitación al receptor, mediante un modelo Observador.
    Se deberá crear una clase observable que se comunique con el servidor y será observada por el fragmento activo
    en la vista del jugador. Mediante el método update típico de las interfaces Observable se notificará a los
    observadores que ha llegado la invitación y mostrarán éste fragmento.
 */
class InvitationReceived : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_invitation_received, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // ----------------------- Buttons listeners -----------------------
        invitationReceived_button_aceptar.setOnClickListener{
            // Si se acepta, navegar a la pantalla multijugador
            view.visibility = View.GONE
            // joinParty()
        }

        invitationReceived_button_rechazar.setOnClickListener {
            // Si se rechaza, ocultar la notificación (No seria mejor destruirla?)
            view.visibility = View.GONE
            // Return to last fragment
            fragmentManager?.popBackStack()
        }
    }


}
