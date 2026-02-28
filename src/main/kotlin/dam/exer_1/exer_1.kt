package dam.exer_1

fun main() {
    // a) Using IntArray constructor
    // Cria um array de 50 inteiros inicializado a zeros
    val squaresA = IntArray(50)
    // Percorre de 1 a 50 e guarda o quadrado de cada número
    for (i in 1..50) {
        squaresA[i - 1] = i * i  // Subtrai 1 ao índice porque os arrays começam em 0
    }
    println("a) IntArray constructor:")
    println(squaresA.toList())

    // b) Using a range and map()
    // Cria um range de 1 a 50 e transforma cada valor no seu quadrado
    val squaresB = (1..50).map { it * it }.toIntArray()
    println("\nb) Range and map():")
    println(squaresB.toList())

    // c) Using Array with constructor
    // Soma 1 ao índice porque os índices começam em 0
    val squaresC = Array(50) { i -> (i + 1) * (i + 1) }
    println("\nc) Array with constructor:")
    println(squaresC.toList())
}