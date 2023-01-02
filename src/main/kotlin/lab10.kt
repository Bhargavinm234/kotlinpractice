fun main()
{
    println("Where are you from")
    var a= readLine()
    when(a)
    {
        "India" -> println("namaste")
        "USA" -> println("Hello")
        "Germany" -> println("Hallo")
        "Russia" -> println("privet")
        else -> println("I dont know that")
    }
}