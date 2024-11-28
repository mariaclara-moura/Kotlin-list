// Importa Java Scanner
import java.util.Scanner

fun main(args: Array<String>) {
    // Inicializa o Scanner
    val scanner = Scanner(System.`in`)

    // primeiro recebe o numero de questoes (enquanto nao for 0)
    // depois, para cada questao, recebe o tom de cinza de cada alternativa

    var questoes = scanner.nextInt()
    while (questoes != 0 ) {

        for (i in 1..questoes) {
            val A = scanner.nextInt()
            val B = scanner.nextInt()
            val C = scanner.nextInt()
            val D = scanner.nextInt()
            val E = scanner.nextInt()

            val alternativas = mapOf(
                'A' to A,
                'B' to B,
                'C' to C,
                'D' to D,
                'E' to E
            )

            val resposta = alternativas.values.filter {it <= 127}
            if (resposta.size == 1) {
                for (i in alternativas) {
                    if (i.value == resposta[0]) {
                        println(i.key)
                    }
                }            }
            else {
            println("*")
        }

        }
        questoes = scanner.nextInt()
    }
}