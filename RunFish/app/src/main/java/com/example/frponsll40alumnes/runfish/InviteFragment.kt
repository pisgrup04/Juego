package com.example.frponsll40alumnes.runfish


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_invite.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class InviteFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_invite, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /*
        * TODO: Preguntar per la visiblitat del fragment un cop visistat per primera vegada.
         */
        button_friend.setOnClickListener{
            view.visibility=View.GONE
        }
        button_friend1.setOnClickListener{
            view.visibility=View.GONE
        }
        button_friend2.setOnClickListener{
            view.visibility=View.GONE
        }
        button_friend3.setOnClickListener{
            view.visibility=View.GONE
        }

        button_cross.setOnClickListener{
            view.visibility=View.GONE
        }

    }
}
