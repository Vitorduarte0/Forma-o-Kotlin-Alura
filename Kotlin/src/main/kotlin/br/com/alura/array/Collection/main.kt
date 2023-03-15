package br.com.alura.array.Collection

fun main() {
	val pedidos = listOf(
		Pedido(1, 15.0),
		Pedido(2, 25.0),
		Pedido(3, 35.0),
		Pedido(4, 45.0),
		Pedido(5, 55.0),
		Pedido(6, 65.0),
	)
	println(pedidos)
	val pedidosAssociados = pedidos.associateBy { pedido -> pedido.numero }
	println(pedidosAssociados[1])

	val pedidosComFrete = pedidos.associateWith { pedido ->
		pedido.valor >= 45.0
	}
	println(pedidosComFrete)
	println(pedidosComFrete[Pedido(numero=1, valor=15.0)])

}

data class Pedido(val numero: Int, val valor: Double)



