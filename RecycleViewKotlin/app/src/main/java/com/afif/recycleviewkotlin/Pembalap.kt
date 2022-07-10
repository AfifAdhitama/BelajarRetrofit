package com.afif.recycleviewkotlin

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Pembalap(
    val imgPembalap: Int,
    val namePembalap: String,
    val descPembalap: String
) : Parcelable
