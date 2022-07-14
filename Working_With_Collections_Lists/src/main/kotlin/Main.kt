val namingMeth: String? = null
const val mainHeading = "This shows the use of lists in kotlin"
fun main(){
    println(mainHeading)
    when (namingMeth){
        null -> println("When Kotlin")
        else -> println(namingMeth)
    }

    listFunction()
}

/**
 *Just like arrays, 'the listOf' collections is declared as show. Using the variable, one can
 access the properties of the list class.
 */

fun listFunction(){
    val listOfLikes = listOf("Kotlin","Android","Development","Programming","Comic Books","Junita")
    println(listOfLikes.size)
    println(listOfLikes[4])
    println(listOfLikes.get(5))
    println("This show an iteration through a list:")

    /**
     * This shows iteration through the list of items using for
    */
    for (listOfLike in listOfLikes){
        println(listOfLike)
    }
    /**
     * This shows iteration using the for each.
     * It is important to note that for prints to screen the statement according to the
     number of items in the list
     */
    println("This shows iteration using the for:")
    listOfLikes.forEach{ thingsOfLike ->
       // println("This shows iteration using the for each:")
        println(thingsOfLike)
    }
    /**
     * Things of like using forEach without losing the index
     */
    listOfLikes.forEachIndexed { index, thingILike ->
        println("The position for $thingILike is $index")
    }
}