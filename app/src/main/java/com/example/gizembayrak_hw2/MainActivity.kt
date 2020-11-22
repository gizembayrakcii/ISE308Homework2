package com.example.gizembayrak_hw2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        myMain()
    }

}
 private fun myMain(){


     val myShapes = arrayOf("Triangle","Circle","Square")
     for (value in myShapes){ // I created the object from shapes class and put in for loop

        val myShape = Shapes(value)
         myShape.showInfo()
     }

     val myTriangle= Triangle("triangle",3.5,4.0,6.5,5.7)
     println(myTriangle.showInfo())
     println(myTriangle.area().toFloat())
     println(myTriangle.perimeter().toFloat())
     println(myTriangle.getHeight())
     myTriangle.setHeight(6.7)

     val myCircle = Circle("circle", 2.8 )
     println(myCircle.showInfo())
     println(myCircle.area().toFloat())
     println(myCircle.perimeter().toFloat())
     println(myCircle.getRadius())
     myCircle.setRadius(3.5)

     val mySquare= Square("square", 2.8 )
     println(mySquare.showInfo())
     println(mySquare.area().toFloat())
     println(mySquare.perimeter().toFloat())


}

