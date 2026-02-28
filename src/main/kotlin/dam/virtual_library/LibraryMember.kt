package dam.virtual_library

// Data class que representa um membro da biblioteca
data class LibraryMember(
    val name: String,
    val membershipId: String,
    // Lista de títulos de livros emprestados pelo membro
    val borrowedBooks: MutableList<String> = mutableListOf()
)