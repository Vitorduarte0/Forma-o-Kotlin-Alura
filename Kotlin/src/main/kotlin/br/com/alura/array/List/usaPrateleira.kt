package br.com.alura.array.List

import br.com.alura.List.listaDeLivros

fun main() {
    val patreleira = Prateleira(genero = "Literatura", livros = listaDeLivros)
    val organizarPorAutor = patreleira.organizarPorAutor()
    val organizarPorAnoPublcado = patreleira.organizarPorAnoPublcado()

    organizarPorAutor.imprimeComMarcadores()
    organizarPorAnoPublcado.imprimeComMarcadores()
}