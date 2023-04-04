package paradigmaFuncional

import autentica

fun main() {
    val a = Pessoa2("vitin", "Duarte", 19).run {
        age++
    }
    println(a)
}




//Pessoa(name = "Vitor", lastName = "Duarte", 19L).run {
//    "$newName, $newLastName $newAge"
//}.let(::println)
class Pessoa(name: String, lastName: String, age: Long) {
    val newName = name
    val newLastName = lastName
    val newAge = age
}
data class Pessoa2 (var name: String, var lastName: String, var age: Long)

