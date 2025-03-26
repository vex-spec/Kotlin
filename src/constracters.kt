class Dog(var name:String,var breed:String,var color:String){

}

fun main() {
    var dog1 = Dog("Kenji","chihuahua","white")
    println(dog1.name)
    var dog2 = Dog("sato","Bulldog","brown")
    println(dog2.breed)
    var dog3 = Dog("Lahito","German Shepherd","brown")
    println(dog3.color)
}