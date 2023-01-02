fun main()
{
    val list= mutableListOf<Int>(0,1)
    println("Enter the number n>1:")
    val n=readLine()?.toInt()
    if(n!=null)
    {
        for(i in 2.. n-1)
        {
            list.add(list[i-2]+list[i-1])
       }
   }
   println(list)
}