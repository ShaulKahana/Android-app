package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.helloworld.models.Repo
import com.example.helloworld.reposlist.ReposAdapter

class MainActivity : AppCompatActivity() {

    private val adapter = ReposAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.New_grup_button)
        button.setOnClickListener {
            Toast.makeText(this,"You made it Shimon good jab", Toast.LENGTH_SHORT).show()
        }

        val list: RecyclerView = findViewById(R.id.Grup_list)
        list.layoutManager = LinearLayoutManager(this)
        list.adapter = adapter

        val samplDate = listOf(
            Repo("repo 1"),
            Repo("repo 2"),
            Repo("repo 3"),
            Repo("repo 4"),
            Repo("repo 5"),
            Repo("repo 5"),
            Repo("repo 6"),
            Repo("repo 7"),
            Repo("repo 8"),
            Repo("repo 9"),
            Repo("repo 10"),
            Repo("repo 12"),
            Repo("repo 13"),
            Repo("repo 14")

        )
        adapter.submitList(samplDate)
    }
}