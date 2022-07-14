fun main(){
    println(headingName().toUpperCase())
    listOfThings()
}
fun headingName() = "Working with vararg,named arguments and Default parameters"

/**
 * We have worked with adding collections to our functions though the parameters types. However
 functions can provide more functionality to this allowing us to have more flexibility
 */
fun listOfThings(){
    val thingsLike = mutableListOf("Android","Kotlin","Programming","Junita","Sci-fi")
    
    //workWithVararg(itemOne = "Kotlin", itemTwo = thingsLike)
}
/*
fun workWithVararg(itemOne:String, itemTwo:List<String>):Unit{
    itemTwo.forEachIndexed{ index, itemListed ->
        println("$itemOne $index $itemListed")
    }
}
 */

