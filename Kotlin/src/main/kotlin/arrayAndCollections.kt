fun main() {
    val idadeArray = mutableListOf(15, 22, 55, 49, 75)

    var maiorIdade = 0
    for (idades in idadeArray){
        if(idades > maiorIdade){
            maiorIdade = idades
        }
    }

    println("A maior idade foi: $maiorIdade")

    var menorIdade = Int.MAX_VALUE
    idadeArray.forEach{idades ->
        if(idades < menorIdade ){
            menorIdade = idades
        }
    }

    println("A menor idade foi: $menorIdade")
    val aumentoSalario = 1.1
    val salarios = doubleArrayOf(10.0, 100.0, 1000.0, 10000.0)
     for (indices in salarios.indices){
         salarios[indices] = salarios[indices] *  aumentoSalario
     }
    println("Aumentando o salário: " + salarios.contentToString())

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * aumentoSalario
    }

    println("reajuste do aumento: " + salarios.contentToString())

    //aprendendo o operador ranges
    val numeroPares = 0..100 step 2
    for(numPar in numeroPares){
        println("$numPar")
    }
    println()

    val numerosParesReversos = 100 downTo 0 step 2
    numerosParesReversos.forEach { println("$it") }

    val intervalo = 1500.0..5000.0
    val salario = 15500.0
    if(salario in intervalo){
        println("Você ainda não paga imposto de renda")
    }else{
        println("Você paga imposto de renda, pois seu salário é maior ou igual a '$5000.0' ")
    }

    val alfabeto = 'a'..'z'
    val letra = 'K'.lowercaseChar()
    println(letra in alfabeto)

}