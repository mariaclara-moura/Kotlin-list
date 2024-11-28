// Importa Java Scanner
import java.util.Scanner

fun main(args: Array<String>) {
    // Inicializa o Scanner
    val scanner = Scanner(System.`in`)

    // As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1.00, 0.50, 0.25, 0.10, 0.05 e 0.01.
    var valor = (scanner.nextDouble() * 100).toInt()
    val notas = intArrayOf(10000, 5000, 2000, 1000, 500, 200)
    val moedas = intArrayOf(100, 50, 25, 10, 5, 1)

    println("NOTAS:")
    for (i in notas) {
        val qtdNotas = valor / i
        valor %= i
        println("${qtdNotas} nota(s) de R$ ${i / 100}.00")
    }

    println("MOEDAS:")
    for (j in moedas) {
        val qtdMoedas = valor / j
        valor %= j
        println("${qtdMoedas} moeda(s) de R$ ${"%.2f".format(j / 100.0)}")
    }
}
