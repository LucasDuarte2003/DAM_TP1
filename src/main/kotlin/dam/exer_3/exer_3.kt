package dam.exer_3

fun main() {
    println("=== Bounce Sequence ===")

    // Gera uma sequência infinita de alturas, cada uma é 60% da anterior
    val bounces = generateSequence(100.0) { height -> height * 0.6 }
        .drop(1)                // Remove a altura inicial (100m), conta apenas os bounces
        .takeWhile { it >= 1.0 } // Para a sequência quando a altura baixa de 1 metro
        .take(15)               // Pega nos primeiros 15 bounces válidos
        .toList()               // Converte a sequência para lista

    // Imprime cada bounce com o número e a altura arredondada a 2 casas decimais
    bounces.forEachIndexed { index, height ->
        println("Bounce ${index + 1}: ${"%.2f".format(height)}m")
    }
}