import jdk.incubator.vector.VectorOperators.Operator
import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)
    println("Enter first number :")
    var firstnumber = read.nextInt( )

    var tekno = Scanner(System.`in`)
    println("Enter secondnumber :")
    var secondnumber = tekno.nextInt()

    var Tokita = Scanner(System.`in`)
    println("Enter Operator (+, -, /, %):")
    var Operator = readln()


    var result = when(Operator){
        "+"-> firstnumber +secondnumber
        "-"-> firstnumber +secondnumber
        "/"-> firstnumber +secondnumber
        "%"-> firstnumber +secondnumber

         else -> "Invalid operator"
    }
    println(result)


}