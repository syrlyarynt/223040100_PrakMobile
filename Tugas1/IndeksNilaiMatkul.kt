import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val indeksNilai = IndeksNilaiMatkul()

    print("Masukkan nilai: ")
    val input = scanner.nextLine()

    val hasilIndeks = indeksNilai.hitungIndeks(input)
    println("Indeks Nilai: $hasilIndeks")
}

class IndeksNilaiMatkul {
    fun hitungIndeks(nilai: String): String {
        if (nilai.isBlank()) {
            return "Nilai harus diisi"
        }

        val nilaiAkhir = try {
            nilai.toDouble()
        } catch (e: NumberFormatException) {
            return "Inputan tidak valid"
        }

        return when {
            nilaiAkhir in 80.0..100.0 -> "A"
            nilaiAkhir in 70.0..79.0 -> "AB"
            nilaiAkhir in 60.0..69.0 -> "B"
            nilaiAkhir in 50.0..59.0 -> "BC"
            nilaiAkhir in 40.0..49.0 -> "C"
            nilaiAkhir in 30.0..39.0 -> "D"
            nilaiAkhir in 0.0..29.0 -> "E"
            else -> "Nilai di luar jangkauan"
        }
    }
}