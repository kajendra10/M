package com.kjprojects.pmmvvmarchitecture.Repository
import com.kjprojects.pmmvvmarchitecture.Domain.OngoingDomain

class MainRepository {
    val items = listOf(
        OngoingDomain("FoodApp", "April 29, 2024", 50, "ongoing 1"),
        OngoingDomain("AI Recording", "May 26, 2024", 60, "ongoing 2"),
        OngoingDomain("Weather App", "June 22, 2024", 50, "ongoing 3"),
        OngoingDomain("E-BookApp", "July 13, 2024", 80, "ongoing 4")
    )
}