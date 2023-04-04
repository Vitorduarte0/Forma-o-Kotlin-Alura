fun autentica(nome: String, pass: String, bla: () -> Unit): Boolean {
    // a forma com o listen funcionando é simular a higher order function
    if (nome.contentEquals("Vito")) {
        println("Nao pode")
        bla()
    } else {
        println("Nao entrou no bloco ")
    }
    return true
}

