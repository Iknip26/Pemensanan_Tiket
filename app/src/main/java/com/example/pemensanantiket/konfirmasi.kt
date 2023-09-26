package com.example.pemensanantiket

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.pemensanantiket.databinding.ActivityKonfirmasiBinding

class konfirmasi : AppCompatActivity() {
    private lateinit var binding: ActivityKonfirmasiBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityKonfirmasiBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var asal = intent.getStringExtra(fillform.asal)
        var tujuan = intent.getStringExtra(fillform.tujuan)
        var tanggal = intent.getStringExtra(fillform.tanggal)
        var jam = intent.getStringExtra(fillform.jam)
        var jenis = intent.getStringExtra(fillform.jenis)

        with(binding){
            asalText.setText(asal)
            tujuanText.setText(tujuan)
            tanggalText.setText(tanggal)
            jamText.setText(jam)
            jenisText.setText(jenis)

            confirmButton.setOnClickListener{
                Toast.makeText(this@konfirmasi, "Berhasil membeli tiket", Toast.LENGTH_SHORT).show()
            }

            cancelButton.setOnClickListener{
                var intentBack = Intent(this@konfirmasi, fillform::class.java)
                startActivity(intentBack)
            }
        }
    }
}