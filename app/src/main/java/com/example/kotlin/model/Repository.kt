package com.example.kotlin.model

object Repository {

    private val notes: List<Note> = listOf(
        Note(
            "1", "2", 0xfff06292.toInt()
        ),
        Note("11", "22", 0xfff06292.toInt()
        ),
        Note("112", "222", 0xfff06292.toInt()
        )
    )

    fun getNotes(): List<Note> = notes
}
