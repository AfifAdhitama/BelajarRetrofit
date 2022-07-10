package com.afif.recycleviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pembalapList = listOf<Pembalap>(
            Pembalap(
                R.drawable.giacgstinae,
                "Giacomo Agostini",
                "Giacomo Agostini merupakan pembalap paling handal dengan catatan minim kecelakaan baik di kelas 350cc maupun 500cc."
            ),
            Pembalap(
                R.drawable.cestoner,
                "Casey Stoner",
                "Casey Stoner berhasil mengembalikan kejayaan Honda ketika menjadi juara dunia pada 2011, yang merupakan gelar keduanya di MotoGP."
            ),
            Pembalap(
                R.drawable.valeros,
                "Valentino Rossi",
                "Pria asal Italia itu juga mempersiapkan talenta terbaik dari negara asalnya untuk bersaing hingga ke level tertinggi melalui VR46 Academy."
            ),
            Pembalap(
                R.drawable.edilaswon,
                "Eddie Lawson",
                "Bersama Marlboro Agostini Yamaha, Lawson memenangi tiga gelar, dan saat bersama Rothmans Kanemoto Honda."
            ),
            Pembalap(
                R.drawable.johnsurtzs,
                "John Surtees",
                "Surtees meninggal karena gagal napas pada 10 Maret 2017 di Rumah Sakit St George di London, pada usia 83 tahun."
            ),
            Pembalap(
                R.drawable.jorlorenjo,
                "Jorge Lorenzo",
                "Jorge Lorenzo merupakan salah satu pembalap tersukses dalam kejuaraan maupun pribadinya dalam urusan bisnis."
            ),
            Pembalap(
                R.drawable.kenyrober,
                "Kenny Roberts",
                "Kenny Roberts merupakan salah satu sosok paling berjasa dalam mendongkrak kejuaraan dunia selama 30 tahun berkarier di dunia balap roda dua."
            ),
            Pembalap(
                R.drawable.marmakues,
                "Marc Marquez",
                "The Baby Alien memang julukan yang pantas bagi Marc Marquez karena ia langsung membuat heboh MotoGP"
            ),
            Pembalap(
                R.drawable.mickhando,
                "Mick Doohan",
                "Seorang legenda yang hingga kini masih terlibat dalam semua urusan MotoGP, jadi salah satu pembalap paling berpengaruh di kejuaraan dunia balap."
            ),
            Pembalap(
                R.drawable.mikehowod,
                "Mike Hailwood",
                "Mike Hailwood meninggal dunia pada 1981 karena mengalami kecelakaan lalu lintas bersama putrinya."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_pembalap)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = PembalapAdapter(this, pembalapList){
            val intent = Intent (this, DetailPembalapActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}