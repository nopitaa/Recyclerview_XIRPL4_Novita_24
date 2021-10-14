package com.recyclerview_novitasyahwath_24

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

            val imageList = listOf<novel>(
                novel(
                    R.drawable.novel1,
                    "Kita Semua Pernah Sedih",
                    "Jadilah yang tenang dalam menghadapi gaduhnya pikiranku. Jadilah peredam dalam riak liar ambisiku. Sungguh tiada bertahan kita, jika saling keras tanpa reda. Sungguh habislah kita jika sama-sama ingin menang sendiri selamanya. Jika aku yang sedang penat, jadilah tempat bersandar untukku rehat. Jika kamu yang sedang lelah, kusediakan segalanya untuk memulihkan yang lemah."
                ),
                novel(
                    R.drawable.novel2,
                    "Seperti Hujan Yang Jatuh Ke Bumi",
                    "Aku pernah belajar merelakanmu berkali-kali Melepasmu pergi dengan cinta yang lain Membiarkan kesempatan memilikimu hilang untukku Sebab, kamu berhak bahagia; meski sesungguhnya aku tidak bahagia dengan keputusan itu. Ketidak-beranianku mengikatmu memberi ruang bagi orang asing yang mendekatimu.Kupikir hidup akan baik-baik saja. Semua harus berjalan seperti sediakala. Kamu dengan seseorang yang memilihmu. Aku dengan hati baru yang mencoba tumbuh di hidupku. Kuberikan hatiku pada seseorang yang lain. Kubiarkan dia manggantikanmu.Namun, aku keliru. Melupakanmu ternyata tidak pernah semudah itu."
                ),
                novel(
                    R.drawable.novel3,
                    "Rindu Yang Baik Untuk Kisah Yang Pelik",
                    "Semua seolah baik-baik saja. Tawa yang lepas. Lampu panggung yang meriah. Kehidupan yang mungkin diinginkan banyak orang Aku memiliki beberapa hal yang orang lain tidak miliki. Semua tampak sempurna. Seolah tidak ada celah untuk luka Namun jauh di dalam diriku, kesepian selalu datang menghampiri. Kesedihan yang sering kusembunyikan Aku bahkan tidak berani membuka hati lebih luas lagi. Orang-orang yang pernah datang di masa lalu membekaskan rasa takut yang membeku. Aku takut tidak bisa menemukan orang yang tepat. Takut terulang lagi kecewa yang sama. Takut jatuh lagi pada rasa sayang yang akhirnya sia-sia"
                ),
                novel(
                    R.drawable.novel4,
                    "Malik & Elsa",
                    "Malik = kamu betah di kampus ini? Elsa = Belum tahu. Kan, baru sehari. Malik = Menurutku, sih, bakal betah. Elsa = Sok tahu kamu. Malik = Iya, pasti betah. Elsa = Kenapa emang?. Malik = Karena ada aku. Elsa  = ..."
                ),
                novel(
                    R.drawable.novel5,
                    "Catatan Pendek Untuk Cinta Yang Panjang",
                    "Pada akhirnya, kamu hanya perlu mensyukuri apa pun yang kamu miliki hari ini. Walaupun yang kamu tunggu tak pernah datang. Walaupun yang kamu perjuangkan tak pernah sadar dengan apa yang kamu lakukan. Nikmati saja Kelak, dia yang kamu cintai akan tahu, betapa kerasnya kamu memperjuangkannya."
                )
            )

            val recyclerView = findViewById<RecyclerView>(R.id.novel1)
            recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.setHasFixedSize(true)
            recyclerView.adapter = adapter(this, imageList){
                val intent = Intent(this,DetailNovel::class.java)
                intent.putExtra(INTENT_PARCELABLE, it)
                startActivity(intent)

            }
    }
}