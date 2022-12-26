fun main()
{
    println("Enter the number:")
    var n= readln()?.toInt()
    println("Lets count from $n down to 0:")
    while(n!=null && n>=0)
    {
        println(n)
        n--
    }
}