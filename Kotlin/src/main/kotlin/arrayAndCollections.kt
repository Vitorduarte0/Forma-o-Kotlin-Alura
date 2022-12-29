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
}