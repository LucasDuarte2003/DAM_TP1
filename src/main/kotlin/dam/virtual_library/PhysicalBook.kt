package dam.virtual_library

// Subclasse de Book para livros físicos
class PhysicalBook(
    title: String,
    author: String,
    publicationYear: Int,
    availableCopies: Int,
    // Peso do livro em gramas
    val weight: Int,
    // Indica se o livro tem capa dura (true por defeito)
    val hasHardcover: Boolean = true
) : Book(title, author, publicationYear, availableCopies) {

    // Retorna informação sobre o armazenamento físico
    override fun getStorageInfo(): String {
        val hardcover = if (hasHardcover) "Yes" else "No"
        return "Physical book: ${weight}g, Hardcover: $hardcover"
    }

    // Representação em texto do livro físico
    override fun toString(): String {
        return "${super.toString()}\nStorage: ${getStorageInfo()}"
    }
}