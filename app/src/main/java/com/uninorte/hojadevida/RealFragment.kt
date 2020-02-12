package com.uninorte.hojadevida


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.uninorte.hojadevida.databinding.FragmentMainBinding
import com.uninorte.hojadevida.model.UserPersonalModel

/**
 * A simple [Fragment] subclass.
 */
class RealFragment : Fragment()  , View.OnClickListener {
    lateinit var navController: NavController
    lateinit var userPersonalModel: UserPersonalModel
    lateinit var userPersonalModel1: UserPersonalModel
    lateinit var userPersonalModel2: UserPersonalModel
    lateinit var  mBinding : FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_real, container, false)
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.persona1).setOnClickListener(this)
        view.findViewById<Button>(R.id.persona2).setOnClickListener(this)
        view.findViewById<Button>(R.id.persona3).setOnClickListener(this)
        userPersonalModel = UserPersonalModel("Juanito metralleta",16,"Paintball",2)
        userPersonalModel1 = UserPersonalModel("Wilson Bazooka",36,"Apuestas Legales",2)
        userPersonalModel2 = UserPersonalModel("Francisco MP5",55,"Ir a Clases con mucha felicidad",2)

    }

    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.persona1 ->{
                val bundle = bundleOf("data" to userPersonalModel, "nombre" to userPersonalModel.name,"numeroHermanos" to userPersonalModel)
                navController!!.navigate(R.id.action_realFragment_to_mainFragment,bundle)

            }
            R.id.persona2 ->{
                val bundle = bundleOf("data" to userPersonalModel1, "nombre" to userPersonalModel1.name,"numeroHermanos" to userPersonalModel1)
                navController!!.navigate(R.id.action_realFragment_to_mainFragment,bundle)

            }
            R.id.persona3 ->{
                val bundle = bundleOf("data" to userPersonalModel2, "nombre" to userPersonalModel2.name,"numeroHermanos" to userPersonalModel2)
                navController!!.navigate(R.id.action_realFragment_to_mainFragment,bundle)

            }

        }
    }

}
