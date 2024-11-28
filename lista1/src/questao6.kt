// Importa Java Scanner
import java.util.Scanner

fun main(args: Array<String>) {
    // Inicializa o Scanner
    val scanner = Scanner(System.`in`)

    // Primeiro recebe a quantidade de casos de teste.
    val qtdTestes = scanner.nextInt()
    for (n in 1..qtdTestes) {
        var total = 0
        // Quantidade de linhas do teste
        val teste = scanner.nextInt()

        for (t in 0..teste-1) {
            val palavraVez = scanner.next()
            val palavraPercorrivel = palavraVez.toCharArray()
            // Valor = (Posição no alfabeto) + (Elemento de entrada) + (Posição do elemento)
            for (i in palavraPercorrivel.indices) {
                if (palavraPercorrivel[i] in 'A'..'Z') {
                    val posicao = palavraPercorrivel[i] - 'A'
                    total += posicao + t + i
                }
            }
        }
        println(total)
    }
}
