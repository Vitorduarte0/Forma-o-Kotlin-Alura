package paradigmaFuncional

import com.sun.jdi.DoubleValue

fun main() {
    testaTipoFuncaoReferencia()
    testaTipoFuncaoClasse()
    //quando se trata de lambda e essa expressão tiver parametros é necessário que
    //o lado esquerdo seja igual ao lado direito
    //no caso de lambda a ultima linha expressa o retorno da lambda, segue o exemplo abaixo:
    val minhaFuncaoLambida: (Int, Int) -> Int = { a, b ->
        a + b
    }
    println(minhaFuncaoLambida(10, 25))
    //outra forma de declarar lambida com parametro sem querer usar todos os parametro é:
    val minhaSegundaFuncaoLambda: (Int, Int) -> Double = { _, b ->
        b + 15.5
    }
    //nesse caso ele não irá considerar o primeiro parametro da chamada da função
    println(minhaSegundaFuncaoLambda(4, 5))
    val minhaTerceiraFuncaoLambda = { a: Int, b: Int ->
        a * b + 10.5
    }
    println(minhaTerceiraFuncaoLambda(2, 3))
    // a ideia de usar função anonima é para deixar mais claro quais são os tipos do parametro
    // e o tipo de retorno da função.
    val minhaFuncaoAnonima = fun(a: Int, b: Int): Double {
        println("Executando minha primeira função anonima!")
        return a + b + 4.5
    }

    println(minhaFuncaoAnonima(1, 1))

    val calculaBonificacao: (salario: Double) -> Double = lamdaSalario@{salario ->
        if(salario > 1000){
            return@lamdaSalario salario + 100.0
        }
        salario + 150.0
    }
    println(calculaBonificacao(1000.0))

    val calculaBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double{
        if(salario < 500){
            return salario + 50.0
        }
        return salario + 25.0
    }
    println(calculaBonificacaoAnonima(450.0))


}

private fun testaTipoFuncaoClasse() {

    val implementacaoClasse = testaParadimaComClasseSoma()
    println("A soma com classe é: ${implementacaoClasse(10, 10)}")
}

private fun testaTipoFuncaoReferencia() {
    // :: -> segnifica apenas uma representação e não executa
    //avaliação preguiçosa
    val testParadimga: (Int, Int) -> Int = ::soma
    //não irá executar
    println(testParadimga)
    //agora sim irá executar, pois está incializando a variavel como se fosse uma função
    println("A soma do resultado é: ${testParadimga(3, 2)}")
}

fun soma(a: Int, b: Int): Int {
    return a + b
}

class testaParadimaComClasseSoma : (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int = a + b

}