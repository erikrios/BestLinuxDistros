package com.erikriosetiawan.bestlinuxdistros.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LinuxDistro(var distroName: String = "",
                       var photos: String = "",
                       var description: String = "") : Parcelable