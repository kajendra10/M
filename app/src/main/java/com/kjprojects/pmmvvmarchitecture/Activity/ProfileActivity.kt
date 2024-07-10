package com.kjprojects.pmmvvmarchitecture.Activity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.kjprojects.pmmvvmarchitecture.ViewModel.ProfileViewModel
import com.kjprojects.pmmvvmarchitecture.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    lateinit var binding: ActivityProfileBinding
    val profileViewModel: ProfileViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            val myteamadapter by lazy { MyTeamAdapter(profileViewModel.loadMyTeam()) }
        }
    }
}