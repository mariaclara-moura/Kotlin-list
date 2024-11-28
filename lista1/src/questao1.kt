// Importa Java Scanner
import java.util.Scanner

fun main(args: Array<String>) {
    // Inicializa o Scanner
    val scanner = Scanner(System.`in`)

    // primeiro recebe o nome do vendedor, o salario e o total de vendas
    // depois, 15% sobre as vendas efetuadas

    val nome = scanner.next()
    val salario = scanner.nextDouble()
    val vendas = scanner.nextDouble()
    val valorFinal = salario + (vendas * 0.15)
    println("TOTAL = R$ %.2f".format(valorFinal))

}