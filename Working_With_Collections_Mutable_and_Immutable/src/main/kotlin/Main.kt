val mainHeading: String? = null
fun main(){
    headingFun()
    workImmutable()
}
fun headingFun(){
    when (mainHeading){
        null -> println("Mutable and Immutable in Kotlin")

        else -> mainHeading
    }
}

/**
 * kotlin handles collections similar to the that it handles nullable and non-null types
 It also differentiates between immutable and mutable collections. By default, a collection
 is immutable
 * It is important to note that most using the class 'mutableListOf' we can be able to
 access functions like add. The same goes for maps
 */
fun workImmutable(){
    val listLike = mutableListOf("Android","Kotlin","Junita","Programming")
    listLike.add("Mimo")
    listLike.forEach{ thingsValue ->
        println(thingsValue)
    }

    val maps = mutableMapOf(1 to "Junita", 2 to "Brigid", 3 to "Purity")
    maps[4] = "Mimo"
    maps[5] = "Jacinta"
    maps.forEach{ (key, value) ->
        println("$key -> $value")

    }

}

