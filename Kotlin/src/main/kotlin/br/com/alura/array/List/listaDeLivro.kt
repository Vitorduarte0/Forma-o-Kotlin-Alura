package br.com.alura.array.List

import br.com.alura.List.listaDeLivros

fun main() {
    
    listaDeLivros
    .sortedBy { it.titulo }
    .imprimeComMarcadores()

    val listAutor = listaDeLivros
        .filter { it.autor.startsWith("J") }
        .sortedBy { it.anoPublicado }
        .map { it.autor }
    println(listAutor)
}


