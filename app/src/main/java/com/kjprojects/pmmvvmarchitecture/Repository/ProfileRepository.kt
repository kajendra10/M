package com.kjprojects.pmmvvmarchitecture.Repository
import com.kjprojects.pmmvvmarchitecture.Domain.TeamDomain

class ProfileRepository {

    val myteamItems:MutableList<TeamDomain> = mutableListOf(
        TeamDomain("FoodApp", "In Progress"),
        TeamDomain("AI Python", "Completed"),
        TeamDomain("Weather App Backend", "In Progress"),
        TeamDomain("Kotlin Developers", "Completed")
    )

    val archivesItems:MutableList<String> = mutableListOf(
        "UI/UX Screenshots",
        "Kotlin Source Code",
        "Source Codes"
    )
}