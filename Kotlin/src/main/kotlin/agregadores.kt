fun main() {
    //agragadores
    val idades = intArrayOf(11, 15, 8, 9, 22)

    // maior elemento do array
    val maiorIdade = idades.max()
    println("Maior idade $maiorIdade")

    // menor elemento do array
    val menorIdade = idades.min()
    println("Menor idade $menorIdade")

    //media do array
    val media = idades.average()
    println("media $media")

    // oper all -> verifcar se todos os elementos satifaz a condição
    // -> se pelo menos um não satisfazer, o resultado será false
    val todosMaiores = idades.all {  it >= 18 }
    if(!todosMaiores) {
        println("Não é possível que todos os alunos entrem na boate!")
    }

    //Usando o agregador any
    // Ele retorna true caso pelo menos um elemento do array satisfaça a condição

    val existeMaior = idades.any{it >= 18}
    if(existeMaior){
        println("Existe pelo menos um elemento da lista que é maior que 18")
    }else{
        println("Não existe nenhum elemento da lista maior que 18")
    }

    val somenteMaiores = idades.filter { it >= 18 }
    if(somenteMaiores.isEmpty()){
        println("Não existe nenhum aluno maior ou igual a 18!")
    }else{
        println(somenteMaiores)
    }


}