package br.com.alura.array.List

fun main() {
    val livro = Livro(
        titulo = "Algum livro",
        autor = "Vitinho",
        anoPublicado = 1989,
        editora = "Editora a"
    )
    val livro1 = Livro(
        titulo = "Outro Livro",
        autor = "Cleitinho",
        anoPublicado = 1999,
        editora = "Editora c"
    )
    val livro2 = Livro(
        titulo = "Sherlock Holmes",
        autor = "Eu",
        anoPublicado = 1859,
        editora = "Editora b"
    )
    val biblioteca = listOf<Livro>(livro, livro2, livro1)
    biblioteca.sortedBy { it.titulo }.imprimeComMarcadores()
}


fun List<Livro>.imprimeComMarcadores(){
    val textoFormatado = this.joinToString ( separator = "\n "){
        " - ${it.titulo} de ${it.autor}"
    }
    println(" ##### LISTA DE LIVROS ##### \n $textoFormatado")
}