import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val salarios = toBigDecimalArray("1500.55", "2000.00", "5500.00", "20000.00")
    println("Salarios antes do aumento ${salarios.contentToString()}")
    val aumento = "1.1".toBigDecimal()
    val novoSalario = salarios.map { salario -> calculaAumentoRelatiovo(salario, aumento)}.toTypedArray()
    println("Salários após o aumento ${novoSalario.contentToString()}")

    println("O Gasto Incial foi: ${gastoInicial(novoSalario)}")

    val meses = 6.toBigDecimal()
    val gastoTotal = novoSalario.fold(gastoInicial(novoSalario)){acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println("O Gasto total foi: $gastoTotal")

}

private fun calculaAumentoRelatiovo(salario: BigDecimal, aumento: BigDecimal): BigDecimal{
    return if (salario < "5000.00".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }
}

fun toBigDecimalArray(vararg valores: String): Array<BigDecimal> {
    return Array(valores.size) { indice ->
        valores[indice].toBigDecimal()
    }
}

// Aqui iremos fazer uma extensions functions
fun Array<BigDecimal>.somatoria(): BigDecimal {
    /*
        reduce -> Irá iterar no array e irá reduzir com uma determinada ação.
        Nesse caso, irá retornar a soma de todos os elementos do array
    */
    return this.reduce { acumalador, valor ->
            acumalador + valor
    }
}

fun gastoInicial(salarios: Array<BigDecimal>): BigDecimal{
    return salarios.somatoria().setScale(2, RoundingMode.UP)
}
