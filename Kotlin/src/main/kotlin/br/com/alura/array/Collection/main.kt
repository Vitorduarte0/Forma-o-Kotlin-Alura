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
    println(pedidosComFrete[Pedido(numero = 1, valor = 15.0)])

    //no mapa existe um metodo chamado groupBy, que para cada chave
    // ele retorna uma collection ou lista de valores

    //trecho comentado, pois é a forma errada de "agrupar", pois o associate pega somente uma chave falsa e uma true
//	val pedidosComFreteReal = pedidos.associateBy { pedido: Pedido ->
//		pedido.valor > 50
//	}
//	println(pedidosComFreteReal)

    val pedidosComFreteGratis = pedidos.groupBy { pedido: Pedido ->
        pedido.valor > 50
    }
    println(pedidosComFreteGratis)
    println("Pegando apenas os pedidos com frete grátis ${pedidosComFreteGratis[true]}")

    val nomes = listOf(
        "Vitor",
        "Ellen",
        "Cristina",
        "Simone",
        "Vinicius",
        "Ph",
        "Alex",
        "Bruno"
    )
    val agenda = nomes
        .sorted()
        .groupBy { nome ->
        nome.first()
    }
    println(agenda)
}

data class Pedido(val numero: Int, val valor: Double)



