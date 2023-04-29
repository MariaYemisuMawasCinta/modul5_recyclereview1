package com.maria.modul5_recyclereview1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    val Datamahasiswa = listOf<inis_Var>(
        inis_Var(
            R.drawable.cinta,
            namamhs = "Cinta",
            Nimmhs = "20102016",
            Telpmhs = "08953385"
        ),
        inis_Var(
            R.drawable.jos,
            namamhs = "Joss",
            Nimmhs = "20102132",
            Telpmhs = "08515653"
        ),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById<RecyclerView>(R.id.Rv_Mahasiswa)
        recyclerView.setHasFixedSize(true)

        ShowListMahasiswa()
        ShowGridMahasiswa()
        ShowCardMahasiswa()

    }

    private fun ShowGridMahasiswa() {
        val adapter = Grid_MahasiswaAdapter(grid_mhs = Datamahasiswa) {
        }
        val recyclerView = findViewById<RecyclerView>(R.id.Rv_Mahasiswa)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = Grid_MahasiswaAdapter(Datamahasiswa) {
        }
    }

    private fun ShowListMahasiswa() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = list_MahasiswaAdapter(this, Datamahasiswa) {
        }
    }

    private fun ShowCardMahasiswa() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = card_MahasiswaAdapt(this, Datamahasiswa) {}
        recyclerView.adapter = adapter
    }
}
