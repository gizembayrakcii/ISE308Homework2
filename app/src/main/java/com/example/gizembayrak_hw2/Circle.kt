package com.example.gizembayrak_hw2

const val pi=3.14

class Circle (override var name: String) : Shapes(name) {
    private var radius: Double? = 0.0

    constructor(name: String, radius: Double) : this(name){
        this.radius = radius
    }

    init{
        println(this.name + " is created succesfully.")
    }
    override fun showInfo() {
        println("$name $radius")
    }

     fun area(): Double {
        return (this.radius!! * this.radius!!)* pi
    }
     fun perimeter() : Double {
        return (2*pi*this.radius!!)
    }
    fun getRadius() : Double{  // this my getter method
        return this.radius!!
    }
    fun setRadius(r: Double){ // this my setter method
        this.radius=r

        println("your circle's radius changes to $r")
    }
}