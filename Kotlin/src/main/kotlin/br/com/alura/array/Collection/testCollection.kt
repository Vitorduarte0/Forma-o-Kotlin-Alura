package br.com.alura.array.Collection

fun testaCollection() {
    val banco = BancoDeNomes()
    val nomesSalvos: Collection<String> = banco.nomes
    banco.salvar("tes")
    banco.salvar("vitinho")
    println(nomesSalvos)
    println(BancoDeNomes().nomes)
}

class BancoDeNomes {

    val nomes: Collection<String> get() = dados.toList()

    fun salvar(nome: String) {
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}

private fun testaColecao() {
    val nomes: Collection<String> = mutableListOf("Vitor, Vinicius, Cleiton, José")

    for (nome in nomes) {
        println(nome)
    }
}