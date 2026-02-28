package dam.virtual_library

// Classe base abstrata para todos os tipos de livros
abstract class Book(
    val title: String,
    val author: String,
    private val _publicationYear: Int,
    availableCopies: Int
) {
    // Propriedade com setter personalizado que impede valores negativos
    var availableCopies: Int = availableCopies
        set(value) {
            if (value < 0) {
                // Ignora valores negativos
                return
            }
            if (value == 0) {
                // Avisa quando o livro fica sem cópias
                println("Warning: Book is now out of stock!")
            }
            field = value
        }

    // Getter personalizado que classifica o livro pela época de publicação
    val publicationYear: String
        get() = when {
            _publicationYear < 1980 -> "Classic"
            _publicationYear <= 2010 -> "Modern"
            else -> "Contemporary"
        }

    // Bloco init que é executado quando um objeto Book é criado
    init {
        println("Book '$title' by $author has been added to the library.")
    }

    // Método abstrato que cada subclasse deve implementar
    abstract fun getStorageInfo(): String

    // Representação em texto do livro
    override fun toString(): String {
        return "Title: $title, Author: $author, Era: $publicationYear, Available: $availableCopies copies"
    }
}