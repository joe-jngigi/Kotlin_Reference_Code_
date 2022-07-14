const val kotlinName = "Working with collections; Arrays with iterations"
fun main(){
   println(kotlinName)
   println(kotlinName.length)
   arrayListing()

}

/*
Kotlin has support for collections data types. These are things like arrays,lists and maps. They
can be used to group values together and then operate on on them(The Values) at later time.
 */
fun parameterFun(itemOne: String, itemTwo: String) = println("$itemOne, $itemTwo")
/*
This function shows how to work with arrays in kotlin. Similar to java
 */
fun arrayListing(){
   val interestingThings = arrayOf("Kotlin","Android","Development","Programming","Comic Books","Junita")
   println("Arrays")
   println(interestingThings.size)
   println(interestingThings[4])
   println(interestingThings.get(5))
   println("Printing all the arrays")

   /**
   *We can use for loop to iterate through a list of given arrays

         for(interestingThing in interestingThings){
      println(interestingThing)

    */
   //We can use a functional approach to collection iteration.
  /**
   *This below is used to invoke a for each function in the standard library. It takes in another function
    and returns unit(empty function return)
   *Function that we pass in essentially defines what to do on each iteration on the given collection
   * it is the default name for each element in the array that is passed in to the lambda function
   * We can rename the value passed in to the lambda
   */
  /*
   interestingThings.forEach { it: String
   println(it)
   }
   */

   interestingThings.forEach { interestingThing ->
      println(interestingThing)
   }
   /**
    * Why not use an opening and closing parenthesis when calling for each?
    * It's called lambda syntax in Kotlin. If you have a function and its only parameter is another
    function, you can omit the parenthesis and you can pass that function by specifying opening and
    close braces. For each takes a single function as a parameter, hence we can omit the parenthesis
    values and pass that function into the for each function using the open close curly braces.
    */

   /**
    * In the above method we have lost the index data for whatever index the 'interestingThing' is in
    the containing array.Using the 'forEachIndexed', It's going to pass the current index as well as the
    current string.
    */
   interestingThings.forEachIndexed {  positionNum, interestThing ->
     //'positionNum' is used to represent the index of each array
      val positionAns: Int = 1 + positionNum
      println("$interestThing is at position $positionAns")
   }

}
/*
Kotlin has top level functions and higher order functions. Due to this we can write more functional
programming code. To collection iteration(Substitute for 'for loop')
 */
