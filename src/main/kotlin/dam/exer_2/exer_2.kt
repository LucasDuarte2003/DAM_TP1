package dam.exer_2

fun main() {
    println("=== Calculator ===")

    // Mantém a calculadora em execução até o utilizador escrever "exit"
    while (true) {
        println("\nEnter 'exit' to quit.")

        try {
            // Lê o primeiro número
            print("Enter first number: ")
            val input1 = readLine()

            // Permite sair do programa
            if (input1 == "exit") {
                println("Goodbye!")
                break
            }

            // Lê a operação pretendida
            print("Enter operation (+, -, *, /, &&, ||, !, shl, shr): ")
            val operation = readLine()

            // Lê o segundo número (não é necessário para o NOT)
            var input2: String? = null
            if (operation != "!") {
                print("Enter second number: ")
                input2 = readLine()
            }

            // Tenta converter os inputs para inteiro, lança exceção se inválido
            val num1 = input1?.toIntOrNull() ?: throw IllegalArgumentException("Invalid number: $input1")
            val num2 = if (operation != "!") {
                input2?.toIntOrNull() ?: throw IllegalArgumentException("Invalid number: $input2")
            } else 0

            // Calcula o resultado com base na operação escolhida
            val result: Any = when (operation) {
                "+" -> num1 + num2
                "-" -> num1 - num2
                "*" -> num1 * num2
                "/" -> {
                    // Verifica se o divisor é zero antes de dividir
                    if (num2 == 0) throw ArithmeticException("Division by zero!")
                    num1 / num2
                }
                "&&" -> num1 != 0 && num2 != 0
                "||" -> num1 != 0 || num2 != 0
                "!" -> num1 == 0  // Retorna true se o número for zero
                // shl desloca os bits para a esquerda (num2 define quantos bits desloca)
                "shl" -> num1 shl num2
                // shr desloca os bits para a direita (num2 define quantos bits desloca)
                "shr" -> num1 shr num2
                else -> throw IllegalArgumentException("Unknown operation: $operation")
            }

            // Mostra o resultado em decimal, hexadecimal e booleano
            println("\n=== Results ===")
            println("Decimal:     $result")
            println("Hexadecimal: ${if (result is Int) "0x%X".format(result) else "N/A"}")
            println("Boolean:     ${if (result is Boolean) result else result != 0}")

        } catch (e: ArithmeticException) {
            // Trata erros aritméticos, como divisão por zero
            println("Error: ${e.message}")
        } catch (e: IllegalArgumentException) {
            // Trata erros de input inválido
            println("Error: ${e.message}")
        }
    }
}