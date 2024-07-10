package com.kjprojects.pmmvvmarchitecture.ViewModel
import androidx.lifecycle.ViewModel
import com.kjprojects.pmmvvmarchitecture.Repository.MainRepository

class MainViewModel(val repository: MainRepository): ViewModel() {
    constructor():this(MainRepository())
    fun loadData()=repository.items
}