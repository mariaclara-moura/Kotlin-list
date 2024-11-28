// Importa Java Scanner
import java.util.Scanner

fun main(args: Array<String>) {
    // Inicializa o Scanner
    val scanner = Scanner(System.`in`)

    // Cada caso de teste inicia com um inteiro N (3 ≤ N ≤ 50).
    var alunos = scanner.nextInt()

    while (alunos !=0) {
        val listaAlunos = mutableListOf<Int>()
        for (i in 1..alunos) {
            val culpado = scanner.nextInt()
            listaAlunos.add(culpado)
        }
        var alunoInicial = scanner.nextInt()
        // Se o aluno K se entregasse, a investigação terminaria. Caso contrário, ele diria o número de
        // outro aluno, e o processo se repetiria com o professor fazendo a pergunta para este novo aluno,
        // até que alguém se entregue.
        while (true) {
            val proximoAluno = listaAlunos[alunoInicial - 1]
            if (proximoAluno == alunoInicial) {
                println(proximoAluno)
                break
            }
            alunoInicial = proximoAluno
        }
        alunos = scanner.nextInt()
    }
}

