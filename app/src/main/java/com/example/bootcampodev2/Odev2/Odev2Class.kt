package com.example.bootcampodev2.Odev2

class Odev2Class {
    // 1. Soru: Parametre olarak girilen kilometreyi mile dönüştürdükten sonra geri döndüren bir metod yazınız. (Mile = Km * 0.621)

    fun soru1(km: Double): Double{
        return km * 0.621
    }

    // 2. Soru: Kenarları paramemtre olarak girilen ve dikdörtgenin alanını hesaplayan bir metod yazınız
    fun soru2(kisaKenar: Double, uzunKenar: Double){
        println("Kısa kenar: $kisaKenar\nUzun kenar:$uzunKenar\nDikdörtgenin alanı: ${kisaKenar * uzunKenar}")
    }

    // 3. Soru: Parametre olarak girilen sayının faktoriyel değerini hesaplayıp geri döndüren metodu yazınız.
    fun soru3(sayi: Int): Int{
        var sonuc  = 1
        for (i in sayi downTo 1){
            sonuc *= i
        }
        return sonuc
    }

    // 4. Soru: Parametre olarak girilen kelime içinde kaç adet e harfi olduğunu gösteren bir metod yazınız
    fun soru4(kelime: String){
        val harf  = 'e'
        var sayac = 0
        for(i in kelime){
            if(i == harf){
                sayac++
            }
        }
        println("Girilen kelime: $kelime. içerisinde $sayac adet e harfi vardır.")
    }

    // 5. Soru: Parametre olarak girilen kenar sayısına göre her bir iç açıyı hesaplayıp sonucu geri gönderen metod yazınız.
    fun soru5(kenarSayisi: Int) : Double{
        val sonuc : Double = (((kenarSayisi - 2) * 180) / kenarSayisi).toDouble()
        return sonuc
    }

    // 6. Soru: Parametre olarak girilen gün sayısına göre maaş hesabı yapan ve elde edilen değeri döndüren metod yazınız.
    // 1 Günde 8 saat çalışılabilir.
    // Çalışma saat ücreti: 40TL
    //Mesai saat ücreti: 80TL
    //150 saat üzeri mesai sayılır.
    fun soru6(calisilanGunSayisi: Int){
        val gunlukCalismaSaati = 8
        val saatlikUcret = 40
        val saatlikMesaiUcreti = 80
        val mesaiSiniri = 150

        var yapilanMesai = 0
        var maas = 0
        val toplamCalisilanSaat = calisilanGunSayisi * gunlukCalismaSaati

        if(toplamCalisilanSaat > mesaiSiniri){
            yapilanMesai = toplamCalisilanSaat - mesaiSiniri
            maas = (saatlikMesaiUcreti * yapilanMesai) + (saatlikUcret * mesaiSiniri)
        }else{
            maas = toplamCalisilanSaat * saatlikUcret
        }
        println("Çalışılan gün sayısı: $calisilanGunSayisi\nÇalışılan Toplam Saat Sayısı: $toplamCalisilanSaat\nYapılan mesai: $yapilanMesai\nÖdenecek Ücret: $maas TL")
    }

    // Soru 7: Parametre olarak girilen otopark süresine göre otopark ücreti hesaplayarak geri döndüren metodu yazınız.
    // (1 saat = 50TL, 1 saat aşımından sonraki her 1 saat = 10TL)
    fun soru7(otoparkSuresi: Double) : Int{
        val tabanUcret = 50
        val saatlikAsimUcreti = 10
        var toplamUcret = 0

        val kullanilanSaat : Double = otoparkSuresi / 60

        if(kullanilanSaat >= 2){
            toplamUcret = 50 + ((kullanilanSaat.toInt() - 1) * 10)
        }else if(kullanilanSaat >= 1){
            toplamUcret = tabanUcret
        }
        return toplamUcret
    }

}