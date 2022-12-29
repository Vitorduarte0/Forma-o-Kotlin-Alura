import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val salarios = toBigDecimalArray("1500.55", "2000.00", "5500.00", "20000.00")
    println("Salarios antes do aumento ${salarios.contentToString()}")
    val aumento = "1.1".toBigDecimal()
    val novoSalario = salarios.map { salario ->
        if (salario < "5000.00".toBigDecimal()) {
            salario + "500".toBigDecimal()
        } else {
            (salario * aumento).setScale(2, RoundingMode.UP)
        }
    }.toTypedArray()
    println("Salários após o aumento ${novoSalario.contentToString()}")
}

fun toBigDecimalArray(vararg valores: String): Array<BigDecimal> {
    return Array(valores.size) { indice ->
        valores[indice].toBigDecimal()
    }
}
