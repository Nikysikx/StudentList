package com.example.myapplication.domain

import androidx.lifecycle.LiveData

interface StudentListRepository {
    fun studentList(): List<StudentItem>
}