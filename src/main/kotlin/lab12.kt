fun main()
{
    val list= listOf(1,5,9,8,7)
    println("The list has :$list")
    println("Enter the key value:")
    val key= readLine()?.toInt()
    if(key!=null)
    {
        println("The index of $key is ${indexOf(list,key)}")
    }
}

fun indexOf(list:List<Int>,value:Int):Int{
    for(i in 0 until list.size-1){
        if(list[i]==value)
        {
            return i
        }
    }
    return -1
}