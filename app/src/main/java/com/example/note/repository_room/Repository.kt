package com.example.note.repository_room

import com.example.note.repository_room.room.Note
import com.example.note.repository_room.room.NotesDatabase
import kotlinx.coroutines.flow.Flow

class Repository(
    private val db:NotesDatabase
) {

    private val dao get() = db.notesDao

    fun getAll():Flow<List<Note>> = dao.getAll()
    suspend fun save(note: Note) =  dao.insert(note)
    suspend fun delete(note: Note) = dao.delete(note)
}