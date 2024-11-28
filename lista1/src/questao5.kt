// Importa Java Scanner
import java.util.Scanner

fun main(args: Array<String>) {
    // Inicializa o Scanner
    val scanner = Scanner(System.`in`)

    //primeiro recebe a quantidade de palavras.
    // para cada letra da palavra, volta quantas posicoes o proximo input disser

    var palavras = scanner.nextInt()

    for (n in 1..palavras) {

        val palavra = scanner.next()
        val avancou = scanner.nextInt()

        val palavraPercorrivel = palavra.toCharArray()

        for (i in palavraPercorrivel.indices) {
            palavraPercorrivel[i] = if (palavraPercorrivel[i] in 'A'..'Z') {
                val novaPosicao = (palavraPercorrivel[i] - 'A' - avancou + 26) % 26 + 'A'.toInt()
                novaPosicao.toChar()
            } else {
                palavraPercorrivel[i]
            }
            }

        println(String(palavraPercorrivel))
        }
}
