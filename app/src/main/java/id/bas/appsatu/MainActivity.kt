package id.bas.appsatu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      //immutabel
        val iniImmutable = "Basri Umar"

        //mutable
        var namaSaya = " Basri Umar"
        namaSaya = "umar Basri"
        var nama : String = "Nama Saaya"
        var namaKamu : String
        var iniInteger : Int = 20
        var iniIntegerAja = 1
        namaKamu = "Basri Basri "

        Log.i("Tag" ,"iniImmutable $iniImmutable")
        Log.e("TAG","ini nama saya $namaSaya $namaKamu")

        //properti
        val objekMobil = Mobil()
        objekMobil.ban = 3
        objekMobil.kursi = " 4 kursi"
        objekMobil.pintu = "4 Pintu"

        Log.e("TAG","log objek mobil ${objekMobil.kursi} ${objekMobil.pintu}")




    }



    private fun whenKondisi() {
        var nilaiSaya = 75
        when(nilaiSaya)
        {
            50 -> {
                Log.e("TAG","Nilainya dapat 50")
            }

            75 -> {
                Log.e("TAG","Nilainya dapat 75")
            }

            70 -> {
                Log.e("TAG","Nilainya dapat 70")
            }

            else -> {
                Log.e("TAG","Nilainya tidak ada")
            }
        }

    }

    private fun kondisiIfElseIfElse() {
        var nilaiMMT = 100

        if (nilaiMMT.equals(100)){

            Log.e("TAG","Nilainya dapat A")
        } else if (nilaiMMT.equals(80)){

            Log.e("TAG","Nilainya dapat B")
        } else if (nilaiMMT.equals(60)){

            Log.e("TAG","Nilainya dapat C")
        } else{
            Log.e("TAG","Nilainya dapat E")
        }

    }

    private fun kondisiIfElse() {
        var nilaiA = 80
        var nilaiB = 100

        if (nilaiA.equals(nilaiB)){
            Log.e("TAG","Maka saya makan")
        } else{
            Log.e("TAG","maka saya tidur ")
        }
    }

    private fun kondisiIf() {
        var nilaiA = 80
        var nilaiB = 100

        if (nilaiA > nilaiB){
            Log.e("TAG","Pernyataan benar ")
        }

    }
}
