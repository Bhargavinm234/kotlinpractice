fun main() {
    println("Enter you age:")
    val age= readLine()?.toInt()
    if(age!=null)
    {
        if(age>=0 && age<=18) {
            println("You are not an adult yet")
        }
        else if(age>18 && age<65) {
            println("You are adult!!")
        }
        else{
            println("You are really really old")
        }
    }
}