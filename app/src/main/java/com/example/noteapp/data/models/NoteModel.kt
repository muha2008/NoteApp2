package com.example.noteapp.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "noteModel")
data class NoteModel(
    val title: String,
    val description: String,
    val color: String,
    val data: String,
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0)