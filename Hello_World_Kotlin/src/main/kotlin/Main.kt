//This below how represent a null value
var greetingsNew: String? = null

//You can also assign the null value with actual value
var greetings: String? = "Hi, How're you"
const val messageNewText: String = "This represents a null value"

fun main(){
    println("Hello world")
    //val is used when the value assigned is not being reassigned
    val name: String = "My name is Joseph"

    //var means that the value can be reassigned
    var myOtherName: String = "Joe"
    myOtherName = "My other name is Ngigi"

    println(name)
    println(myOtherName)
    println(greetings)
    println("")

    //This means that even though it was assigned a value,you can change to null
    greetings = null
    println(messageNewText)
    println(greetings)
    println(greetingsNew)
}