const val mainStringFun = "This Shows Basic Functions"
fun main(){
    println(mainStringFun)
    println(functionDemo())
    voidFunction()
}

/*
Functions are define using the 'fun' key value. Its then followed by the name of your function
and then parenthesis. Like variables, one can specify the type that the function returns. You can
call this in the main function or any other function.
 */
fun functionDemo(): String {
    return "This is the first function"
}
/*
This is how one defines a function that has no return value. One uses a Kotlin value 'Unit'
With this you don't have to return anything; it's void function. Function is called similar to
one with a return type
 */
fun voidFunction(): Unit{
    println("This is the second function and it returns nothing")
    recapUseVariables()
    println(kotlinTypeRefFun())
}
/*
This below shows how to define a void function. One can use the Unit or leave the function as
shown below
 */
fun recapUseVariables(){
    var thisStatement: String? = null
    val printWhenState = when(thisStatement) {
        null -> "This is the third function"
        else -> thisStatement
    }
    //val printIfState = thisStatement ?: "This o"
    val printIfState = if (thisStatement != null) thisStatement else "This an alternative"
    println(printWhenState)
    println(printIfState)
}
/*
It is also important to note that kotlin functions also supports type inference, because it has
the datatype
 */
//fun kotlinTypeRefFun(): String = "This is also a function"
fun kotlinTypeRefFun() = "This is also a function"
