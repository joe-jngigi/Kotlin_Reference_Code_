fun main(){
    printingHeadState()
    /*
    This is how we parse the our data types
     */
    workingWithParameters(dataToParse = " this shows the how to parse with parameters",
        dataToParseOtherString ="the other way of parsing the parameters")


}
fun printingHeadState(){
    val headingState: String = "Working with parameters"
    println(headingState)
}
/*
When working with parameters, we first give it a name and then the data type of what data we would want
it to hold or parse.
 */
fun workingWithParameters(dataToParse: String, dataToParseOtherString: String){
    //Here we have omitted the concatenation '+' sign, another way of passing the parameters
    val otherMessage = "This is $dataToParseOtherString"
    val givenMessage = "Hello user," + dataToParse
    println(givenMessage)
    println(otherMessage)
}
/*
As it can be noticed, the functions are not enclosed in any class. In Kotlin, these functions are
called top level functions. Like variables in kotlin, functions can be define outside the enclosing
class or independent of any associated class.
 */