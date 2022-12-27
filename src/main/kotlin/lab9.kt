fun main()
{
    val list= mutableListOf<Int>()
    for(i in 1..5)
    {
        var a= readLine()?.toInt()
        if(a!=null)
        {
            list.add(a)
        }
    }
    println("The 5 numbers in reverse order:")
    for(i in list.size-1 downTo 0)
    {
        println(list[i])
    }
}

