//// Reads a whole string line. For example: "Hello, Kotlin"
//val line = scanner.nextLine()
//print(line)
//// Hello, Kotlin
//
//// Reads a string. For example: "Hello"
//val string = scanner.next()
//print(string)
//// Hello
//
//// Reads a number. For example: 123
//val num = scanner.nextInt()
//print(num)
//// 123



/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

fun main() {

    println("Hello, world!!!") //Funciona com print, mantendo na linha
    var idade: Int = 20 // Não é obrigatório definir o tipo

    // VAL -> Variável imutável
    val signo = "Aquário"
    print(signo)

    println(idade)
    println(idade::class) // descobrir tipo de dado
    val x: Int = 10
    val y: Double = x.toDouble()
    val z: Float = x.toFloat()
    val w = x + y+ z
    println(x + y + z)
    println(w::class)

    val nome = "Clara"
    val saudacao = "Bem-vindo, $nome" // para referenciar variavel, colocar $
//     val saudacao = "Bem-vindo, ${nome + x}" // para referenciar mais de um valor, usar {}
    println(saudacao)

    var text = """
    exemplo de texto
    com mais de uma
    linha
    """
    println(text)   // 3 aspas duplas geram texto escrito exatamente como no codigo

    val b1 = true
    val b2 = false

    val c1 = b1.and(b2)
    val c2 = b1.or(b2)
    val c3 = b1.not()
    println("$c1 $c2 $c3")

    if (x>w){
        print("x maior")
    }
    else if (x.toDouble() == w){
        println("iguais")
    }
    else{
        println("w maior")
    }

    if (x>w)
        print("x maior") // se for so um comando as chaves nao sao obrigatorias

    else
        println("w maior")


    val score = 90
    val grade = if (score >= 90) "A" else "B"
    println(grade)

    val dayOfWeek = 3
    when (dayOfWeek){
        1 -> println("Segunda-Feira")
        2 -> println("Terça-Feira")
        3 -> println("Quarta-Feira")
        4 -> println("Quinta-Feira")
        5 -> println("Sexta-Feira")
        6,7 -> println("Fim de semana")
        else -> println("Dia inválido")
    }
    val t = 80
    val isGreater = when{
        x > t -> true
        x < t -> false
        else -> x==t
    }
    println(isGreater)

    val age = 80
    val old = when(age){
        in 0..10 -> "criança"
        in 11..19 -> "adolescente"
        in 20..59 -> "adulto"
        else ->"idoso"
    }
    print(old)

    //array
    val numbers:Array<Int> = arrayOf(1, 2, 3, 4, 5)
    numbers[2] = 50
    val subNumbers = numbers.slice(2 until 5) //ate o indice antes
    println(subNumbers)

    for (element in numbers)
            println(element)

            println(numbers.joinToString(","))
            println(numbers.joinToString(",","->"))
            println(numbers.joinToString(",","[","]"))

    val list: List<String> = listOf("Alice","Bob","Charlie") // LISTOF = IMUTAVEL!!
    println(list)
    val list2 = listOf("Alice","Bob","Charlie", 0, 1.5)
    println(list2)
    println(list2::class)

    val listaMutavel = mutableListOf(1,2,3,4)
    val listaMutavelVazia = mutableListOf<Int>()
    listaMutavelVazia.add(10) // adiciona ao final
    listaMutavelVazia.add(20)
    println("lista após adicionar elementos ao final: $listaMutavelVazia")
    listaMutavelVazia.add(1, 15)
    println("lista após adicionar elemento em posicao especifica: $listaMutavelVazia")

    val elementos = listOf(10,20,30,40)
    listaMutavelVazia.addAll(0, elementos)

    println("lista após adicionar varios elementos em posicao especifica: $listaMutavelVazia")

    val lista = mutableListOf(1,2,3,4)
    val contem = lista.contains(2) // conferir se a lista possui o valor
    val tamanho = lista.size // obter tamanho da lista
    val evenNumbers = lista.filter {it % 2 == 0} // filtrar -> parametro tem q ser uma expressao booleana
    val squares = lista.map {it * it} // mapear valores existentes para novos
    println(contem)
    println(tamanho)
    println(evenNumbers)
    println(squares)
    lista.remove(1) // remove VALOR
    println(lista)
    lista.removeAt(0) //remove valçor NA POSICAO
    println(lista)
    lista.add(1)
    lista.removeAll(listOf(3,4))
    println(lista)
    lista.clear()
    println(lista)
    lista.add(1)
}