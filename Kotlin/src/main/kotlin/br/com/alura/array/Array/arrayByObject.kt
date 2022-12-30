package br.com.alura.array
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

    val mediaTresMaioresSalarios = novoSalario
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .media()
        println("A media dos 3 maiores salário é: $mediaTresMaioresSalarios")

    val tresMenoresSalarios = novoSalario.sorted().take(3).toTypedArray().media()
    println("A media dos 3 menores salários é: $tresMenoresSalarios")

    val notas = intArrayOf(7, 5, 8, 9)
    val average = notas.sorted().take(3).average().toBigDecimal()
    println(average.setScale(2, RoundingMode.UP))
}

private fun calculaAumentoRelatiovo(salario: BigDecimal, aumento: BigDecimal): BigDecimal{
    return if (salario < "5000.00".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }
}



fun gastoInicial(salarios: Array<BigDecimal>): BigDecimal{
    return salarios.somatoria().setScale(2, RoundingMode.UP)
}
