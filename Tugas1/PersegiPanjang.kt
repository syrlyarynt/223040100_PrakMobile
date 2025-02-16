import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan panjang: ")
    val panjang = scanner.nextDouble()

    print("Masukkan lebar: ")
    val lebar = scanner.nextDouble()

    val persegi = PersegiPanjang(panjang, lebar)

    println("Panjang: $panjang")
    println("Lebar: $lebar")
    println("Luas: ${persegi.hitungLuas()}")
    println("Keliling: ${persegi.hitungKeliling()}")
}

class PersegiPanjang(private val panjang: Double, private val lebar: Double) {
    fun hitungLuas(): Double {
        return panjang * lebar
    }

    fun hitungKeliling(): Double {
        return 2 * (panjang + lebar)
    }
}