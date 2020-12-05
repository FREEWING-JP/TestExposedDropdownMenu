package com.example.test.app.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.test.app.R

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        val view = inflater.inflate(R.layout.main_fragment, container, false)

        // Exposed Dropdown Menus
        // https://material.io/develop/android/components/menu
        val COUNTRIES = arrayOf("Item 1", "Item 2", "Item 3", "Item 4")

        val adapter: ArrayAdapter<String> = ArrayAdapter(
                context!!, R.layout.dropdown_menu_popup_item, COUNTRIES)
        val editTextFilledExposedDropdown: AutoCompleteTextView = view.findViewById(R.id.filled_exposed_dropdown)
        editTextFilledExposedDropdown.setAdapter(adapter)

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
