package com.example.hesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.hesapmakinesi.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var tasarim:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim=ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        var toplam = 0
        var aratoplam=0
        var sayac = 0

        tasarim.buttonSifir.setOnClickListener {

            if (sayac == 1){

                tasarim.editTextSayiGir.text.clear()
                sayac = 0
            }

            val sifir = tasarim.editTextSayiGir.text.toString() + 0
            tasarim.editTextSayiGir.setText(sifir)

        }
        tasarim.buttonBir.setOnClickListener {
            if (sayac==1){

                tasarim.editTextSayiGir.text.clear()
                sayac = 0
            }

            val bir = tasarim.editTextSayiGir.text.toString() + 1
            tasarim.editTextSayiGir.setText(bir)

        }
        tasarim.buttoniki.setOnClickListener {

            if (sayac==1){

                tasarim.editTextSayiGir.text.clear()
                sayac = 0
            }

            val iki = tasarim.editTextSayiGir.text.toString() + 2
            tasarim.editTextSayiGir.setText(iki)

        }
        tasarim.buttonUc.setOnClickListener {
            if (sayac==1){

                tasarim.editTextSayiGir.text.clear()
                sayac = 0
            }

            val uc = tasarim.editTextSayiGir.text.toString() + 3
            tasarim.editTextSayiGir.setText(uc)

        }
        tasarim.buttonDort.setOnClickListener {
            if (sayac==1){

                tasarim.editTextSayiGir.text.clear()
                sayac = 0
            }

            val dort = tasarim.editTextSayiGir.text.toString() + 4
            tasarim.editTextSayiGir.setText(dort)

        }
        tasarim.buttonBes.setOnClickListener {

            if (sayac==1){

                tasarim.editTextSayiGir.text.clear()
                sayac = 0
            }

            val bes = tasarim.editTextSayiGir.text.toString() + 5
            tasarim.editTextSayiGir.setText(bes)

        }
        tasarim.buttonAlti.setOnClickListener {
            if (sayac==1){

                tasarim.editTextSayiGir.text.clear()
                sayac = 0
            }

            val alti = tasarim.editTextSayiGir.text.toString() + 6
            tasarim.editTextSayiGir.setText(alti)

        }
        tasarim.buttonYedi.setOnClickListener {
            if (sayac==1){

                tasarim.editTextSayiGir.text.clear()
                sayac = 0
            }

            val yedi = tasarim.editTextSayiGir.text.toString() + 7
            tasarim.editTextSayiGir.setText(yedi)

        }
        tasarim.buttonSekiz.setOnClickListener {
            if (sayac==1){

                tasarim.editTextSayiGir.text.clear()
                sayac = 0
            }

            val sekiz = tasarim.editTextSayiGir.text.toString() + 8
            tasarim.editTextSayiGir.setText(sekiz)

        }
        tasarim.buttonDokuz.setOnClickListener {
            if (sayac==1){

                tasarim.editTextSayiGir.text.clear()
                sayac = 0
            }

            val dokuz = tasarim.editTextSayiGir.text.toString() + 9
            tasarim.editTextSayiGir.setText(dokuz)

        }

        tasarim.buttonTemizle.setOnClickListener {


            tasarim.editTextSayiGir.text.clear()
            aratoplam=0
            toplam=0


        }


        tasarim.buttonArti.setOnClickListener {

              aratoplam += tasarim.editTextSayiGir.text.toString().toInt()
            tasarim.editTextSayiGir.text.clear()
        }




        tasarim.buttonEsittir.setOnClickListener {


                if (tasarim.editTextSayiGir.text.toString() != ""){

            toplam = tasarim.editTextSayiGir.text.toString().toInt() + aratoplam
            tasarim.editTextSayiGir.setText(toplam.toString())
            aratoplam = 0
            sayac ++

        }else {

            Snackbar.make(it,"Bir sayı Giriniz",Snackbar.LENGTH_SHORT).show()

            }
        }

    }

}