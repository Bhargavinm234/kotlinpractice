fun main()
{
    println("Enter the elements:")
    var avg=0.0
    for(i in 1..5)
    {
        var k= readLine()?.toInt()
        if(k!=null)
        {
           avg+=k/5.0
        }
    }
    println("The averag eof numbers is $avg")
}