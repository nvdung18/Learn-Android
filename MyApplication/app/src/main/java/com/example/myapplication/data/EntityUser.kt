package com.example.myapplication.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "User")
class EntityUser {

    @PrimaryKey(autoGenerate = true)
    private lateinit var idUser:String

    @ColumnInfo("user_name")
    lateinit var name:String
    @ColumnInfo("address")
    lateinit var address:String
}