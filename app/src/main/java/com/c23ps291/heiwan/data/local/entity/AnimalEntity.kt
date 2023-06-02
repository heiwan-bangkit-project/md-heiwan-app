package com.c23ps291.heiwan.data.local.entity

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "animal")
data class AnimalEntity(

    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: String,

    @ColumnInfo("name")
    val name: String?,

    @ColumnInfo("description")
    val description: String?,

//    @ColumnInfo("photo")
//    val photo: String?,
//
    @ColumnInfo("price")
    val price: String?

) : Parcelable
