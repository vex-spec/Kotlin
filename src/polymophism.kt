open class shape{


    open fun draw(){
        println("Drawing a shape")
    }
}

class circle:shape() {
    override fun draw(){
        println("Drawing a circle")
    }
}

class rectangle:shape(){
    override fun draw (){
        println("Drawing a rectangle")
    }
}

fun main() {

    var sh = shape()
    sh.draw()
    var cr = circle()
    cr.draw()
    var re = rectangle()
    re.draw()

}
