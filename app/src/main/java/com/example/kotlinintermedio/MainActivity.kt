package com.example.kotlinintermedio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Enum Classes
        //this.enumClasses()

        //Clase Anidada
        //this.nestedAndInnerClasses()

        //Herencia de clases
        this.classInheritance()
    }

    enum class Direction(val dir: Int) {
        NOTH(1), SOUTH(-1), EAST(1), WEST(-1);

        fun descripcion(): String{
            /*if (this == NOTH){
                return "La direccion es NORTE"
            }*/
            return when(this){
                NOTH -> "La direccion es NORTE"
                SOUTH -> "La direccion es SUR"
                EAST -> "La direccion es ESTE"
                WEST -> "La direccion es OESTE"
                else -> "La direccion desconocida"
            }
        }
    }

    private fun enumClasses(){
        //Asignacion de valores
        var userDirection: Direction? = null
        println("Direccion: ${userDirection}")

        userDirection = Direction.EAST
        println("Direccion: ${userDirection}")

        userDirection = Direction.WEST
        println("Direccion: ${userDirection}")

        /* PROPIEDADES POR DEFECTO*/
        //Valor de la variabkle
        println("Propiedad name: ${userDirection.name}")
        //Posicion de mi enumerado
        println("Propiedad ordinal: ${userDirection. ordinal}")


        //funciones
        println(userDirection.descripcion())

        //Inicializacion
        println(userDirection.dir)
    }

    private fun nestedAndInnerClasses(){
        //Clase anidada (nested)
        val myNestedClass = MyNestedAndInnerClass.MyNestedClass()
        val sum = myNestedClass.suma(1, 2)
        println("El resultado de la suma es $sum")

        //Clase Interna (inner)
        val myInnerClass = MyNestedAndInnerClass().MyInnerClass()
        val sumTwo =  myInnerClass.sumTwo(10)
        println("El resultado de sumar dos es $sumTwo")
    }

    private  fun classInheritance(){

        val programmer =  Programmer("Brian", 33, "Kotlin")
        programmer.work()
        programmer.sayLanguage()

        val designer =  Designer("Juan", 30)
        designer.work()

    }
}