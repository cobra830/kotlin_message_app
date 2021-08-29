package com.example.cameraapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Userdata(val uid:String, val username: String, val email : String): Parcelable {
    constructor():this("","","")
}