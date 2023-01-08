package br.com.alura.array.List

data class Prateleira (
    val genero: String,
    val livros: List<Livro>
){
    fun organizarPorAutor(): List<Livro>{
        return livros.sortedBy { it.autor }
    }

    fun organizarPorAnoPublcado(): List<Livro>{
        return livros.sortedBy { it.anoPublicado }
    }
}

