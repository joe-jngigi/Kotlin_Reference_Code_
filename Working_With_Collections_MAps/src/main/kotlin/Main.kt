const val mainHeading = "Working with maps collections in Kotlin"
fun main(){
    println(mainHeading)
    workingMaps()

}
fun workingMaps(){
    /**
     * The 'mapOf' functions essentially takes in pairs.Pair is a simple wrapper class
     containing two values. Since maps is also part of the collections, you can perform
     all the basic functions to each
     * Below the number represents the key while while the letter is the value matched to
     the key
     */
    val maps = mapOf(1 to "a", 2 to "b", 3 to "b")
    println(maps.size)
     for (map in maps){
         println(map)
     }
    println("This is using for Each")
    maps.forEach { (key, value) ->
        println("$key -> $value")
    }

}