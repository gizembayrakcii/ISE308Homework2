package com.example.gizembayrak_hw2

class Triangle(override var name:String) : Shapes(name) {
    private var side1: Double? = 0.0
    private var side2: Double? = 0.0
    private var side3: Double? = 0.0
    private var height: Double? = 0.0


    constructor (name: String, s1:Double, s2:Double, s3:Double, height: Double) : this(name) {
        this.side1 = s1
        this.side2 = s2
        this.side3 = s3
        this.height = height

    }

    init{
        println(this.name + " is created succesfully.")
    }
    override fun showInfo() { // override from shapes class
        println("$name $side1 $side2 $side3 ")
    }

    fun area(): Double {
        return (this.side1!! * this.height!!)/2
    }
     fun perimeter() : Double {
        return (this.side1!!+this.side2!!+this.side3!!)
    }
    fun getHeight() : Double{
        return this.height!!
    }
    fun setHeight(h: Double){
        this.height=h

        println("your triangle's height changes to $h")
    }

}