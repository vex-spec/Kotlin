fun main() {
    //standard library functions/predefined functions
    var output = Math.sqrt(144.00)
    println("The squaroot of 144 is $output")

    var number = Math.round(45.89)
    println(number)
    school()
    add()
    student("John","Male",34)
    student("Mary","Female",13)
    employees("Mark",false, 1500)
}

//User defined Functions
fun school(){
    println("eMobilis")
}

fun add(){
    var x =3
    var y =5
    println(x+y)
}


//parameters/variables and arguments/values
fun student(name:String,gender:String,age:Int){
    println("$name is a $gender .$name is $age years old")}


fun employees(name:String,disabled:Boolean,salary:Int,){
    println("is it the employee,$name $disabled and resieves a $salary of") }


