package br.com.alura.array.Collection

fun testSet(){

    val assistiramCursoAndroid = listOf("Alex", "Vitor", "Vinicius")
    val assistiramCursoKotlin = listOf("Ellen", "Vitinho", "Vitor")

    val assistiramAmbos = mutableListOf<String>()
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.addAll(assistiramCursoAndroid)
    //println(assistiramAmbos.distinct())
    //distinct retorna uma lista com elementos que não são duplicados
    println("Junção das duas lista: $assistiramAmbos")
    val assistiramCursoAndroidSet = setOf("Vitor", "Vinicius", "Ellen")
    val assistiramCursoKotlinSet = setOf("Ellen", "Vitinho", "Vitor", "Alex")
    val assistiramAmbosSet = assistiramCursoAndroidSet + assistiramCursoKotlinSet
    println("Junção das duas listas, mas sem elementos duplicados: $assistiramAmbosSet")
    // outra forma de se fazer seria com addAll
    val novoAssistiramAmbos = mutableSetOf<String>()
    novoAssistiramAmbos.addAll(assistiramCursoAndroidSet)
    novoAssistiramAmbos.addAll(assistiramCursoKotlinSet)
    novoAssistiramAmbos.add("Vitor")
    //novoAssistiramAmbos.add("Cleitinho")
    //novoAssistiramAmbos.add("Cleitinho")
    println("Junção das duas listas, porem sem elementos duplicado: $novoAssistiramAmbos")
    println(assistiramCursoAndroidSet + assistiramCursoKotlin)
    println(assistiramCursoAndroidSet union assistiramCursoKotlinSet)
    println(assistiramCursoAndroidSet subtract  assistiramCursoKotlinSet) //Vinicius não assistiu o curso de android
    println(assistiramCursoKotlinSet subtract assistiramCursoAndroidSet) // Vitinho não assistiu o curso de lt
    // o set basicamente tem a mesma ideia de conjuntos da matemática, logo é possivel ter alguns
    // comportamentos, tais como: união, s

    println(assistiramCursoAndroidSet intersect assistiramCursoKotlinSet)
}