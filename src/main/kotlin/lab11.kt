fun main()
{
  sum(5)
}
fun sum(n:Int)
{
    var sum=0
    for(i in 1..n)
    {
        sum+=i
    }
    println("The sum of numbers form 1 to $n is $sum")
}