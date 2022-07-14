fun main(){
    println(headingFun())
    funWithParameter(itemOne = "Hi" ,itemTwo = "Kotlin")
    toPrintMain()
}
fun headingFun(): String =  "This is working with parameters and collections"

fun toPrintMain(){
    val valueThings = mutableListOf("Android" ,"Junita","Mimo","Programming","Kotlin")
    collectionsParameter(statementOne = "I like", statementTwo = valueThings)
}

/**
 * This is how we use collections with parameters, giving them a name just like the normal parameters
 and specifying the type to which it belongs, with this case, the used collection is List with type
 string
 * The below function usually pass data from from another source using the created parameters
 So inside the function you can write the task which you want the data to be performed on. Like below
 The function gets data from 'valueThings' above and the task is to iterate through the data and
 print it on the screen
 */
fun collectionsParameter(statementOne:String, statementTwo:List<String>){
    statementTwo.forEach{  itemList ->
        println("$statementOne $itemList")
    }
}

fun funWithParameter(itemOne:String, itemTwo:String){
    println("$itemOne $itemTwo")
}