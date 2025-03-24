import java.util.Scanner
fun main() {
    var read = Scanner(System.`in`)
    println("Enter first number :")
    var firstnumber = read.nextInt()

    var tekno = Scanner(System.`in`)
    println("Enter secondnumber :")
    var secondnumber = read.nextInt()

    if (firstnumber < secondnumber)
        println("$firstnumber is greater")
    else{
        println("$secondnumber is lessthan")
    }
}