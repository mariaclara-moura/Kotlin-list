// Importa Java Scanner
import java.util.Scanner

fun main(args: Array<String>) {
    // Inicializa o Scanner
    val scanner = Scanner(System.`in`)

//    A primeira linha de entrada contem um número L (0 ≤ L ≤ 11) indicando a linha que será considerada para operação.
//    A segunda linha de entrada contém um único caractere Maiúsculo T ('S' ou 'M'), indicando a operação (Soma ou Média)
//    que deverá ser realizada com os elementos da matriz. Seguem os 144 valores de ponto flutuante que compõem a matriz,
//    sendo que a mesma é preenchida linha por linha, da linha 0 até a linha 11, sempre da esquerda para a direita.

    var total: Float = 0f
    val linha = scanner.nextInt()
    val operacao = scanner.next()
    val matriz = Array(12) { FloatArray(12) }
    for (i in 0..11){
        for (j in 0..11){
            matriz[i][j] = scanner.nextFloat()
        }
    }
    if (operacao == "S") {
        for (s in matriz[linha]){
            total += s
        }
    }
    else if (operacao == "M"){
        for (s in matriz[linha]){
            total += s
        }
        total = total/12
    }
    println("%.1f".format(total))
}