package com.anteiku.androidmaster
import android.app.AlertDialog
import kotlin.math.PI

fun main(){
    ejercicio12()

}

fun ejercicio1(){
    // Declara dos variables numéricas (con el valor que desees),
// muestra por consola la suma, resta, multiplicación, división y módulo (resto de la división).

    val num1= 5
    val num2 = 10

    println("Los números son $num1 y $num2")
    val suma = num1+num2
    println("La suma es de $suma")
    val resta = num1-num2
    println("La resta es de $resta")
    val multiplo= num1*num2
    println("La resta es de $multiplo")
    val division = num1/num2.toFloat()
    println("La división es de $division")
    val resto = num1%num2
    println("El resto o residuo es de $resto")

    //Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
// Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.

}
fun ejercicio2(){
   // Declara 2 variables numéricas (con el valor que desees),he indica cual es mayor de los dos.
// Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.
    val num1:Int = 8
    val num2:Int = 8

    if(num1>num2){
        val mayor = num1
        println("El mayor es $mayor")
    }else if(num1<num2){
       val mayor = num2
        println("El mayor es $mayor")
    }else println("Los numeros son iguales")
}
fun ejercicio3(){
    //Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola.
// Por ejemplo: si introduzco «Fernando», me aparezca «Bienvenido Fernando».

    val name:String = "Kristopher"
    println("Bienvenido $name")
}
fun ejercicio4(){
    //Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir (recuerda usar JOptionPane).

    val name = readln().toString()
    println("Bienvenido $name")
}
fun ejercicio5(){
   // Haz una aplicación que calcule el área de un círculo(pi*R2).
// El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble).
// Usa la constante PI y el método pow de Math.
    println("Introduce el radio del circulo: ")
    val r = readln().toDouble()
    val area = Math.PI*Math.pow(r, 2.0)
    println("El area del ciruclo es $area")
}
fun ejercicio6(){
    //Lee un número por teclado e indica si es divisible entre 2 (resto = 0).
// Si no lo es, también debemos indicarlo.
    println("Introduzca un número, para ver si es divisible entre 2: ")
    val num = readln().toInt()
    val resto = num%2
    if(resto == 0){
        println("El numero $num es divisible entre 2")
    }else println("No es divisible entre 2")
}
fun ejercicio9(){
    //Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA.
// El IVA sera una constante que sera del 21%.
    println("Introduzca el precio del producto ")
    val price = readln().toFloat()
    val iva = price*.21
    val netPrice = price+iva
    println("El precio final con el iva agregado es de: $netPrice")

}
fun ejercicio10(){
    // Muestra los números del 1 al 100 (ambos incluidos).
// Usa un bucle while.

    var num = 0
    while(num<=100){
        println("El numero es $num")
        num++
    }
}
fun ejercicio11(){
    var num = 0
    for(i in 0 until 101){
        println("El número es: $num")
        num = num+1
    }
}
fun ejercicio12(){
    // Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3.
    // Utiliza el bucle que desees.
    for(i in 1 until 100){
        if(i%2==0 || i%3 == 0)
            println(i)
    }
}
