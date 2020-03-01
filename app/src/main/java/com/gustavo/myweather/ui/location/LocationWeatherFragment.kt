package com.gustavo.myweather.ui.location

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.gustavo.myweather.R

class LocationWeatherFragment : Fragment() {

    companion object {
        fun newInstance() = LocationWeatherFragment()
    }

    private lateinit var viewModel: LocationWeatherViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.future_weather_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(LocationWeatherViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
