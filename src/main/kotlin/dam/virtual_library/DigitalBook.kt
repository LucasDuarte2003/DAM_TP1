package dam.virtual_library

// Subclasse de Book para livros digitais
class DigitalBook(
    title: String,
    author: String,
    publicationYear: Int,
    availableCopies: Int,
    // Tamanho do ficheiro em MB
    val fileSize: Double,
    // Formato do ficheiro (PDF, EPUB, MOBI, etc.)
    val format: String
) : Book(title, author, publicationYear, availableCopies) {

    // Retorna informação sobre o armazenamento digital
    override fun getStorageInfo(): String {
        return "Stored digitally: $fileSize MB, Format: $format"
    }

    // Representação em texto do livro digital
    override fun toString(): String {
        return "${super.toString()}\nStorage: ${getStorageInfo()}"
    }
}