package br.com.alura.array.Collection

fun main() {
	// o mapa ele é uma abstração de uma chave e valor, por exemplo
	// um pedido está associado uma preço
	val pedido = 1
	val preco = 30.0
	val pedidos =mapOf(Pair(pedido, preco))
	println(pedidos[pedido])
	// Dado uma chave(PEDIDO) retorna um valor daquela determinada chave.
	// Quando a chave for "pedido", o valor será o resultado da val preco.

	// no kotlin usa-se 'to' no lugar de 'pair'
	val prato = "Delacruz"
	val description = "Esse prato foi feito na inglaterra para homenagear o filoso delacruz na frase, bla, bla, bla"
	val cardapioParis =
		mapOf(prato to description, Pair("Leonardo", "Delicioso macarrão ao molho branco"),
			  "Alejadinho" to "hamburguer de cheedar com bacon e cebola caramelizada"
			)


	println(cardapioParis[prato])

	for(pedidoCardapio in cardapioParis){
		println("Para o prato '${pedidoCardapio.key}' temos a seguinte descrição: ${pedidoCardapio.value}")
	}
}

