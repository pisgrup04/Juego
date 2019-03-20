package com.example.frponsll40alumnes.runfish


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_fish.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class FishFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fish, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_common_fish.setOnClickListener {
            text_selected_fish.text =  "COMMON FISH"
            life_bar_selected_fish.progress = 30
            capactity_bar_selected_fish.progress = 20
            speed_bar_selected_fish.progress = 30
        }

        button_clownfish.setOnClickListener {
            text_selected_fish.text =  "CLOWNFISH"
            life_bar_selected_fish.progress = 40
            capactity_bar_selected_fish.progress = 30
            speed_bar_selected_fish.progress = 30
        }

        button_blowfish.setOnClickListener {
            text_selected_fish.text =  "BLOWFISH"
            life_bar_selected_fish.progress = 45
            capactity_bar_selected_fish.progress = 50
            speed_bar_selected_fish.progress = 20
        }

        button_shark.setOnClickListener {
            text_selected_fish.text =  "TIRANOSAURIUSHARK"
            life_bar_selected_fish.progress = 100
            capactity_bar_selected_fish.progress = 75
            speed_bar_selected_fish.progress = 80
        }

        button_ability_selected_fish.setOnTouchListener { v, event ->
            //TODO : PREGUNTAR COM FER QUE ES VEGI UN FRAGMENT ÚNICAMENT QUAN ESTIGUI APRETANT EL BOTÓ (PER MOSTRAR L'HABILITAT DEL PEIX)
            true
            }
    }
}
