import br.com.alura.List.listaDeLivros


fun main() {
    listaDeLivros
        .groupBy { it.editora ?: "Editora desconhecida"}
        .forEach { (editora, livros) ->
            println("$editora, ${livros.joinToString { "titulo do livro:  '${it.titulo}' De ${it.autor} ano ${it.anoPublicado}" }}")
        }

}