fun main() {
    var firstname = "Tokita"
    var lastname = "Oma"
    var school = "eMobilis"

    println(firstname)
    println(firstname + " " + lastname) // string concatenation
    println(firstname [0])
    println(firstname.uppercase())
    println(lastname.lowercase())

    // string interpolation
    println(school + " is a coding school")
    println("My fullname is $firstname $lastname ")

}