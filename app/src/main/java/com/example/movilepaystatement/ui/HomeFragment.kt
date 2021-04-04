package com.example.movilepaystatement.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.movilepaystatement.R
import com.example.movilepaystatement.common.ViewBindingHolder
import com.example.movilepaystatement.common.ViewBindingHolderImpl
import com.example.movilepaystatement.databinding.FragmentHomeBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : Fragment(), ViewBindingHolder<FragmentHomeBinding> by ViewBindingHolderImpl() {

    private val viewModel by viewModel<HomeViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = initBinding(FragmentHomeBinding.inflate(layoutInflater), this) {
        observerMethods()

        viewModel.fetchHomeWidgets()
    }

    private fun observerMethods() {
        with(viewModel) {
            dataLoading().observe(viewLifecycleOwner, {

            })

            error().observe(viewLifecycleOwner, {

            })

            home().observe(viewLifecycleOwner, {

            })
        }
    }
}