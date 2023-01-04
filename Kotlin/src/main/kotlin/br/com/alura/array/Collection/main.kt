package br.com.alura.array.Collection

fun main() {
	val banco = BancoDeNomes()
	banco.salvar("Cleiton")
	println(banco.nomes)
	println(BancoDeNomes().nomes)
}

class BancoDeNomes {

	val nomes: Collection<String> get() = dados

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