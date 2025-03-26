fun main() {
    //While loop
    var number = 20
    while (number <=25){
        println("number : $number")
        number ++
    }
    var Ashura = 5
    while (Ashura >=1) {
        println("Ashura : $Ashura")
        Ashura--
    }


    //Do..While loop
    var x = 30
    do {
        println("Number is $x")
        x ++
    }
        while (x <=35)

        //For loop
        for (a in 100..105){
            println("Number is $a")
        }
    for (letter in 'a'..'d'){
        println("my letter is $letter")
    }
    //Break
    for (b in 70..75){
        if (b == 73){
            break
        }
        println("Number is b$b")
    }

    //continue
    for (character in 'd'..'h'){
        if (character=='f'){
            continue
        }
        println("Character is $character")
    }
}

