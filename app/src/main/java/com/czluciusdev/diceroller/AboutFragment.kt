package com.czluciusdev.diceroller

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_about.*



class AboutFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about, container, false)
        openSourceLink.setOnClickListener{ launchWebPage() }
    }

    private fun launchWebPage() {
        val url = getString(R.string.opensource_link)
        val webpageIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        try{
            startActivity(webpageIntent)
        } catch (e: ActivityNotFoundException){
            view?.let { Snackbar.make(it, getString(R.string.no_browser), Snackbar.LENGTH_LONG).show() }
            //TODO extract string resource
        }
    }


}
