package com.example.fadli.findmyage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnFindAge(view: View){
        val tahunKelahiran:Int = etInput.text.toString().toInt()
        val umurku = Calendar.getInstance().get(Calendar.YEAR) - tahunKelahiran
        tvHasil.text = "Umur Anda Adalah $umurku Tahun"
    }
}
