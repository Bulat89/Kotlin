package com.example.kotlin.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kotlin.model.Repository
import com.example.kotlin.ui.MainViewState

class MainViewModel:ViewModel(){

    private val viewStateLiveData: MutableLiveData<MainViewState> = MutableLiveData()

    init {
        viewStateLiveData.value = MainViewState(Repository.getNotes())

    }
    fun viewState(): LiveData<MainViewState> = viewStateLiveData

}