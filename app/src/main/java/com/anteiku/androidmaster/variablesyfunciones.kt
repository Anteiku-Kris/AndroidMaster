package com.anteiku.androidmaster


fun main(){
    ejercicio4()

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