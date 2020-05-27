package com.jay.serverbuildtestdemo

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.jay.sharelibrary.ShareActivity
import com.jaydroid.login.user.activity.LoginActivity
import kotlinx.android.synthetic.main.fragment_first.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            //            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
//            startActivity(Intent(activity, ShareActivity::class.java))
            startActivity(Intent(activity, LoginActivity::class.java))

        }
        textview_first.append("\nAPPLICATION_ID:\n${BuildConfig.APPLICATION_ID}")
        textview_first.append("\nBUILD_TYPE:\n${BuildConfig.BUILD_TYPE}")
        textview_first.append("\nVERSION_NAME:\n${BuildConfig.VERSION_NAME}")
    }
}
