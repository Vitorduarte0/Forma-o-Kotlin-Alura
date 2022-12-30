package br.com.alura.array

import java.math.BigDecimal

// Aqui iremos fazer varias extensions functions
fun Array<BigDecimal>.somatoria(): BigDecimal {
    /*
        reduce -> Irá iterar no array e irá reduzir com uma determinada ação.
        Nesse caso, irá retornar a soma de todos os elementos do array
    */
    return this.reduce { acumalador, valor ->
        acumalador + valor
    }
}

fun toBigDecimalArray(vararg valores: String): Array<BigDecimal> {
    return Array(valores.size) { indice ->
        valores[indice].toBigDecimal()
    }
}

fun Array<BigDecimal>.media(): BigDecimal{
    return if(this.isEmpty()){
        BigDecimal.ZERO
    }else{
        this.somatoria() / this.size.toBigDecimal()
    }
}