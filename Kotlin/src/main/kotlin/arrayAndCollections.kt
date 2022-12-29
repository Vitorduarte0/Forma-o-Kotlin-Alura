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
}