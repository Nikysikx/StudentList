package com.example.myapplication.presentation

import androidx.lifecycle.ViewModel
import com.example.myapplication.data.StudentListRepositoryImpl
import com.example.myapplication.domain.GetStudentListUseCase

class MainViewModel: ViewModel() {

    private val getStudentListUseCase = GetStudentListUseCase(StudentListRepositoryImpl)

    val list = getStudentListUseCase.studentList()
}