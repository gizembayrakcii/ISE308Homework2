package com.example.gizembayrak_hw2

import kotlin.math.pow

class Square(override var name: String) : Shapes(name) //this my primary constructor
     {

        private var side1: Double? = 0.0


        constructor (name: String, s1:Double) : this(name) // this my secondary constructor
        {
            this.side1 = s1
        }

        init {
            println(this.name + " is created succesfully.") // my init function
        }

        override fun showInfo() {
            println("$name $side1")
        }

        fun area(): Double {
            return (this.side1!!.pow(2))
        }
         fun perimeter() : Double {
            return (this.side1!!*4)
        }

     }