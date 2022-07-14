var useNullVal: String? = null
const val langName = "Kotlin"

fun main() {
    val printString = if(useNullVal != null) useNullVal else "This is use of if_value"

    val otherPrintString = when(useNullVal){
        null -> println("this is the use of when")
        else -> useNullVal

    }
    println(printString)
    println(langName)
}