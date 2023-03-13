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
	// para fazer um mapa é preciso de um pair no kotlin
	val pedidosMap = mutableMapOf(1 to 13.0, 2 to 50.0)
	println("Antes de adicionar um novo pedido $pedidosMap")
	pedidosMap[3] = 45.0
	println("Depois de adicionar $pedidosMap")

	//adicionando com o put
	pedidosMap.put(4, 50.0)
	println("Adicionando com o put $pedidosMap")
	//atualizando com o put
	pedidosMap.put(1, 12.0)
	println("Atualizando com o put $pedidosMap")
	pedidosMap.putIfAbsent(2, 23.2)
	//a linha 39 não irá executar, pois na chave 2 já existe um valor
	// e o 'putIfAbsent só adiciona um valor caso aquela determinada chava ainda não esteja preechida'
	println(pedidosMap)
	pedidosMap.putIfAbsent(5, 32.0)
	println("Adicionando um valor a uma determinada chave que ainda não se tem um valor $pedidosMap")
}

