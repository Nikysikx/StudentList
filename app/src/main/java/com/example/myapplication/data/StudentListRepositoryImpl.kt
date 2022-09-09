package com.example.myapplication.data

import com.example.myapplication.domain.StudentItem
import com.example.myapplication.domain.StudentListRepository

object StudentListRepositoryImpl: StudentListRepository {
    lateinit var item: List<StudentItem>

    override fun studentList(): List<StudentItem> {
        for (i in 0 until 100) {
            item = listOf(StudentItem("Name $i", "girl"))
        }
        return item
    }
}