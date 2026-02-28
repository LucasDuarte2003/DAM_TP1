package dam.virtual_library

// Classe que gere a coleção de livros da biblioteca
class Library(val name: String) {

    // Lista mutável que armazena os livros da biblioteca
    private val books = mutableListOf<Book>()

    // Companion object que rastreia o total de livros criados em todas as instâncias
    companion object {
        private var totalBooksCreated = 0

        // Retorna o total de livros criados
        fun getTotalBooksCreated(): Int {
            return totalBooksCreated
        }
    }

    // Adiciona um livro à biblioteca
    fun addBook(book: Book) {
        books.add(book)
        totalBooksCreated++
    }

    // Empresta um livro pelo título
    fun borrowBook(title: String) {
        // Procura o livro pelo título
        val book = books.find { it.title == title }
        if (book == null) {
            println("Sorry, '$title' was not found in the library.")
            return
        }
        if (book.availableCopies == 0) {
            println("Sorry, '$title' is out of stock.")
            return
        }
        // Diminui o número de cópias disponíveis
        book.availableCopies--
        println("Successfully borrowed '$title'. Copies remaining: ${book.availableCopies}")
    }

    // Devolve um livro pelo título
    fun returnBook(title: String) {
        // Procura o livro pelo título
        val book = books.find { it.title == title }
        if (book == null) {
            println("Sorry, '$title' was not found in the library.")
            return
        }
        // Aumenta o número de cópias disponíveis
        book.availableCopies++
        println("Book '$title' returned successfully. Copies available: ${book.availableCopies}")
    }

    // Mostra todos os livros da biblioteca
    fun showBooks() {
        println("\n--- $name Catalog ---")
        books.forEach { println(it) }
    }

    // Pesquisa livros por autor
    fun searchByAuthor(author: String) {
        println("\nBooks by $author:")
        val result = books.filter { it.author == author }
        if (result.isEmpty()) {
            println("No books found by $author.")
            return
        }
        // Mostra cada livro encontrado
        result.forEach { println("- ${it.title} (${it.publicationYear}, ${it.availableCopies} copy available)") }
    }
}