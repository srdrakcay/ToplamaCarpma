package com.serdar.topcarpma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = "0"// Uygulama ilk açıldığında çalışan kod burada textview 0 yazılsın dedik

        top.setOnClickListener {
           val gelenSayi1= editText1.text.toString() // Kullanıcı tarafından girilen veriyi alır
           val gelenSayi2 = editText2.text.toString()// Kullanıcı tarafından girilen veriyi alır

           val sayi1 = gelenSayi1.toInt()// Alınan kullanıcı verisini int çevirir
           val sayi2 = gelenSayi2.toInt()// Alınan kullanıcı verisini int çevirir

           val toplama = sayi1 + sayi2

           textView.text = toplama.toString() // Alınan verilerin sonucu textview yazdırılır.
        }
        carp.setOnClickListener {
            val gelenSayi1= editText1.text.toString()
            val gelenSayi2 = editText2.text.toString()

            val sayi1 = gelenSayi1.toInt()
            val sayi2 = gelenSayi2.toInt()

            val carpma = sayi1 * sayi2

            textView.text = carpma.toString()
        }
    }

}