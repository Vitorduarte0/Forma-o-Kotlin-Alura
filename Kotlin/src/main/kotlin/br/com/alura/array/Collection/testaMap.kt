package br.com.alura.array.Collection

fun testComportamentoMap() {
    // o mapa ele é uma abstração de uma chave e valor, por exemplo
    // um pedido está associado uma preço
    val pedidosMap = mutableMap()
    println("$pedidosMap")
    val pedidos = mutableMapOf(
        1 to 23.0,
        2 to 40.0,
        3 to 55.45,
        4 to 64.0,
        5 to 80.0,
        6 to 100.0,
        7 to 100.0
    )
    // getValue retorna uma exception caso não exista uma determinada chave no mapa.

    //println(pedidosNull.getValue(5))
    println("aq: " + pedidos.getOrDefault(0, -1.0))
    println(pedidos)


    for (numeroPedido in pedidos.keys) {
        println("pedido $numeroPedido")
    }

    for (valorPedido in pedidos.values) {
        println("Valor do pedido $valorPedido")
    }

    val pedidosParesEAcimaDeCem = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 60
    }
    println("Esse são os numeros dos pedidos e os valores: $pedidosParesEAcimaDeCem ")
    val filterPares = pedidos.filterKeys { numero ->
        numero % 2 == 0
    }
    println("Número pares do mapa: $filterPares")

    val filterAcima = pedidos.filterValues { valor ->
        valor > 60
    }
    println(filterAcima)
    //adiciona, mas não muda o mapa original, apenas leitura
    println(pedidos + Pair(8, 55.5))
    println(pedidos)
    println(pedidos - 7)
    println(pedidos - listOf(3, 5))

    //ações de escritas e de fato muda o mapa
    //plus
    pedidos.putAll(setOf(8 to 44.1, 9 to 47.5))
    println(pedidos)
    pedidos += listOf(10 to 69.5)
    println(pedidos)

    //minium
    //pode remover tanto pela a chave quanto pelo o valor, no entanto ao remover pelo o valor
    // e haver mais de um elemento com o mesmo valor, será removido o primeiro.
    pedidos.keys.remove(10)
    println(pedidos)
    pedidos.values.remove(100.0)
    println(pedidos)

    pedidos -= listOf(1, 2)
    println(pedidos)
}

fun mutableMap(): MutableMap<Int, Double> {
    val pedido = 1
    val preco = 30.0
    val pedidos = mapOf(Pair(pedido, preco))
    println(pedidos[pedido])
    // Dado uma chave(PEDIDO) retorna um valor daquela determinada chave.
    // Quando a chave for "pedido", o valor será o resultado da val preco.

    // no kotlin usa-se 'to' no lugar de 'pair'
    val prato = "Delacruz"
    val description = "Esse prato foi feito na inglaterra para homenagear o filoso delacruz na frase, bla, bla, bla"
    val cardapioParis =
        mapOf(
            prato to description, Pair("Leonardo", "Delicioso macarrão ao molho branco"),
            "Alejadinho" to "hamburguer de cheedar com bacon e cebola caramelizada"
        )


    println(cardapioParis[prato])

    for (pedidoCardapio in cardapioParis) {
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
    return pedidosMap
}