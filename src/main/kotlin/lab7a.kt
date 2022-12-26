 fun main()
 {
     println("Enter the number 1:")
     var a= readLine()?.toInt()
     println("Enter the number 2:")
     var b= readLine()?.toInt()
     var result=1
     var i=0
     while(a!=null && b!=null && i<b)
     {
         result*=a
         i++
     }
     println("$a to the power of $b is $result ")
 }