package com.kjprojects.pmmvvmarchitecture.ViewModel
import androidx.lifecycle.ViewModel
import com.kjprojects.pmmvvmarchitecture.Repository.ProfileRepository

class ProfileViewModel(val repository: ProfileRepository): ViewModel() {
    constructor(): this(ProfileRepository())

    fun loadMyTeam() = repository.myteamItems
    fun loadArchives() = repository.archivesItems
}