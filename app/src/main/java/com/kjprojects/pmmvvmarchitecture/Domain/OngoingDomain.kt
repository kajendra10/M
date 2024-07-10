package com.kjprojects.pmmvvmarchitecture.Domain

data class OngoingDomain(
    var title:String,
    var data:String,
    var progressPercent:Int,
    var picPath: String
)
