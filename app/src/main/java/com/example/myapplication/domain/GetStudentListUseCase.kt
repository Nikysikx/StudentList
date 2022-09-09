package com.example.myapplication.domain

import androidx.lifecycle.LiveData

class GetStudentListUseCase(private val studentListRepository: StudentListRepository) {

    fun studentList(): List<StudentItem> {
        return studentListRepository.studentList()
    }
}