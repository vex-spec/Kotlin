import java.util.Scanner
fun main() {
    var read = Scanner(System.`in`)
    println("Enter first number :")
    var firstnumber = read.nextInt()

   
    var secondnumber = read.nextInt()
    println("Enter secondnumber :")
    if (firstnumber < secondnumber)
        println("$firstnumber is greater")
    else{
        println("$secondnumber is lessthn")
    }
}