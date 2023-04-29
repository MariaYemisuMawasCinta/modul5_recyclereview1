package com.maria.modul5_recyclereview1

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class inis_Var(
    val fotomhs : Int = 0,
    val Nimmhs : String,
    val Telpmhs : String,
    val namamhs :String
) : Parcelable
