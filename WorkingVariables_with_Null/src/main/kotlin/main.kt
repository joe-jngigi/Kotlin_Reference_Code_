var showNullVal: String? = null
var langName: String = "Kotlin Lang"
var testNull:String? = null

fun main(){
    /*
    Even though kt can have a null value assigned to the inference type, it is important
    to have the data type specified for the null value
     */
    println(langName)
    println(showNullVal)
    showNullVal = "\"Kotlin Null Value\""
    println(showNullVal)
    println("")

    //Printing the value if it is not null
    /*
    First method is using the if statements. If the greeting is not it will run the value
    of 'testNull'. Else if the greeting is null, then execute the given task
     */
    if (testNull != null){
        println(testNull)
    }else{
        println("This Wells")
    }
    /*
    Method two is using the when statement
     */
    when(testNull){
        null -> println("This tests for null")
        else -> println(testNull)
    }
    /*
    Kotlin supports type inferences on variables and properties. It means that even though kotlin is
     statically typed, we can omit the type declaration of a variable.
     */
    val typeInfer: String = "This show the type inferences"
    val typeInferDemo = "Demo for type inferences"
    println("")
    println(typeInfer)
    println(typeInferDemo)


}
