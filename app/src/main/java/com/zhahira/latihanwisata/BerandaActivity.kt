package com.zhahira.latihanwisata

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.zhahira.latihanwisata.Adapter.AdapterGambar


class BerandaActivity : AppCompatActivity() {

    private val imageList = arrayOf(
        R.drawable.jpnn1,
        R.drawable.jpnn2,
        R.drawable.jpnn3,
        R.drawable.jpnn4
    )

    private val title = arrayOf("Sensō-ji", "Kiyomizudera", "Shitenno-ji", "Gunung Fuji")
    private val location = arrayOf("Lokasi : Taitō, Jepan", "Lokasi : Kyoto, Jepang", "Lokasi : Osaka, Jepang", "Lokasi : Honshu, Jepang")
    private val tgl = arrayOf(
        "Tgl : 23 - Mei - 2024",
        "Tgl : 4 - Juni - 2024",
        "Tgl : 1 -  September - 2024",
        "Tgl : 11 - Agustus - 2024"
    )

    private val des = arrayOf(
        "Sensoji adalah kuil Buddha tertua dan salah satu tempat wisata paling terkenal di Tokyo, Jepang. Terletak di daerah Asakusa, kuil ini memiliki sejarah yang panjang sejak didirikan pada tahun 645 M. Kuil ini dihormati sebagai pusat spiritualitas, dan banyak orang datang untuk berdoa serta mencari keberuntungan.\n" + "\n" + "Gerbang utama kuil, Kaminarimon (Gerbang Guntur), menjadi ikon yang terkenal dengan lentera merah besar yang menggantung di tengahnya. Dari Kaminarimon, ada jalan menuju kuil utama yang disebut Nakamise-dori. Jalan ini dipenuhi dengan berbagai toko yang menjual makanan tradisional Jepang, suvenir, dan barang-barang lokal.",
        "Kiyomizudera adalah kuil Buddha yang sangat terkenal di Kyoto, Jepang, dan merupakan salah satu situs Warisan Dunia UNESCO. Kuil ini didirikan pada tahun 780 M di perbukitan timur Kyoto dan terkenal dengan pemandangan indah kota Kyoto dari balkon kayu besarnya, yang menjorok keluar dari sisi bukit. Nama \"Kiyomizudera\" berarti \"Kuil Air Murni,\" yang mengacu pada air terjun Otowa yang mengalir di dekat kuil dan dianggap suci.\n" + "\n" + "Bangunan utama kuil ini, yang disebut Hondo, terbuat dari kayu tanpa menggunakan paku, dan balkon kayu raksasanya didukung oleh balok kayu yang menjulang tinggi. Dari sini, pengunjung bisa menikmati pemandangan alam sekitar, terutama indah saat musim semi dengan bunga sakura atau saat musim gugur dengan dedaunan merah dan kuning.",
        "Shitennō-ji adalah kuil Buddha tertua di Jepang yang terletak di Osaka, didirikan pada tahun 593 M oleh Pangeran Shōtoku. Kuil ini dibangun untuk menghormati Empat Raja Langit (Shitennō), dewa pelindung Buddha, dan menjadi salah satu kuil paling bersejarah di negara tersebut. Meskipun bangunan asli telah terbakar beberapa kali, kuil ini selalu dibangun kembali sesuai dengan desain aslinya.\n" + "\n" + "Kompleks kuil ini terdiri dari beberapa bangunan penting, termasuk Pagoda lima tingkat, Kondo (Aula Emas), dan Kodo (Aula Pembelajaran). Pagoda ini menjadi simbol arsitektur tradisional Jepang dan menarik banyak pengunjung karena keindahan dan nilai historisnya.",
        "Gunung Fuji (Fujisan) adalah gunung tertinggi di Jepang, dengan ketinggian sekitar 3.776 meter, dan merupakan salah satu ikon alam paling terkenal di dunia. Terletak di Pulau Honshu, di perbatasan antara Prefektur Yamanashi dan Shizuoka, Gunung Fuji adalah gunung berapi aktif, meskipun letusan terakhirnya terjadi pada tahun 1707. Bentuknya yang simetris dan puncaknya yang tertutup salju selama musim dingin menjadikannya subjek yang sering dilukiskan dalam seni dan sastra Jepang.\n" + "\n" + "Gunung Fuji dianggap sebagai tempat suci dan telah menjadi objek ibadah sejak zaman kuno. Banyak orang Jepang menganggap pendakian ke puncak sebagai perjalanan spiritual. Selama musim panas (Juli hingga awal September), jalur pendakian dibuka untuk umum, dan ribuan pendaki dari seluruh dunia datang untuk mendaki dan melihat matahari terbit dari puncak, yang disebut \"Goraiko.\""
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_beranda)

        val gridView = findViewById<GridView>(R.id.gridView)
        val adapter = AdapterGambar(this, imageList, title, location)
        gridView.adapter = adapter

        gridView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("data", imageList[position])
            intent.putExtra("data1", title[position])
            intent.putExtra("data2", location[position])
            intent.putExtra("data3", tgl[position])
            intent.putExtra("data4", des[position])
            startActivity(intent)
        }
    }
}