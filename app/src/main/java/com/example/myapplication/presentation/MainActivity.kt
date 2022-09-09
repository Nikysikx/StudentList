package com.example.myapplication.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: MyAdapter

    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupRecyclerView()
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        adapter.list = viewModel.list
    }

    private fun setupRecyclerView() {
        val rvStudentList = findViewById<RecyclerView>(R.id.rvStudentList)
        adapter = MyAdapter()
        rvStudentList.adapter = adapter


    }
}