package br.com.alura.array.List

fun List<Livro?>.imprimeComMarcadores() {
    val textoFormatado = this
        .filterNotNull()
        .joinToString(separator = "\n ") {
            " - ${it.titulo} de ${it.autor}"
        }
    println(" ##### LISTA DE LIVROS ##### \n $textoFormatado")
}