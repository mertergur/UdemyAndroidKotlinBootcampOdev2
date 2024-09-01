package com.example.bootcampodev2.Odev2

fun main() {
    val sorular = Odev2Class()
    println("----------Soru 1----------")
    val km = 10.5
    println("$km KM = ${sorular.soru1(10.5)} Mile")

    println("\n----------Soru 2----------")
    sorular.soru2(5.0,10.0)

    println("\n----------Soru 3----------")
    val sayi = 4
    println("$sayi! = ${sorular.soru3(sayi)}")

    println("\n----------Soru 4----------")
    val girilenKelime = "merebe"
    sorular.soru4(girilenKelime)

    println("\n----------Soru 5----------")
    val kenarSayisi = 5
    println("Girilen kenar sayısı: $kenarSayisi\nİç açılar toplamı: ${sorular.soru5(kenarSayisi)}")

    println("\n----------Soru 5----------")
    val calisilanGunSayisi = 50
    sorular.soru6(calisilanGunSayisi)

    println("\n----------Soru 6----------")
    val kullanilanDakika = 180.50
    println("Otoparkta bulunulan dakika: $kullanilanDakika\nÖdeyeceğiniz tutar: ${sorular.soru7(kullanilanDakika)} TL")
}