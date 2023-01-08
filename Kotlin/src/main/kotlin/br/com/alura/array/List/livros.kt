package br.com.alura.List

import br.com.alura.array.List.Livro

val listaDeLivros: MutableList<Livro> = mutableListOf(
    Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicado = 1956
    ),
    Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicado = 1942,
        editora = "Editora A"
    ),
    Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicado = 1881
    ),
    Livro(
        titulo = "Sagarana",
        autor = "João Guimarães Rosa",
        anoPublicado = 1946
    ),
    Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicado = 1865,
        editora = "Editora B"
    ),
    Livro(
        titulo = "Vidas Secas",
        autor = "Graciliano Ramos",
        anoPublicado = 1938,
        editora = "Editora A"
    ),
    Livro(
        titulo = "Mayombe",
        autor = "Pepetela",
        anoPublicado = 1979,
        editora = "Editora B"
    ),
    Livro(
        titulo = "O Cortiço",
        autor = "Aluísio Azevedo",
        anoPublicado = 1890,
        editora = "Editora B"
    )
)

val listaLivrosComNulos: MutableList<Livro?> = mutableListOf(
    null,
    Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicado = 1956
    ),
    null,
    Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicado = 1942,
        editora = "Editora A"
    ),
    Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicado = 1881
    ),
    null,
    Livro(
        titulo = "Sagarana",
        autor = "João Guimarães Rosa",
        anoPublicado = 1946
    ),
    Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicado = 1865,
        editora = "Editora B"
    ),
    Livro(
        titulo = "Vidas Secas",
        autor = "Graciliano Ramos",
        anoPublicado = 1938,
        editora = "Editora A"
    ),
    Livro(
        titulo = "Mayombe",
        autor = "Pepetela",
        anoPublicado = 1979,
        editora = "Editora B"
    ),
    Livro(
        titulo = "O Cortiço",
        autor = "Aluísio Azevedo",
        anoPublicado = 1890,
        editora = "Editora B"
    )
)