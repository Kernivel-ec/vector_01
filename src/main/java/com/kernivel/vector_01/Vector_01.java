/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.kernivel.vector_01;

import java.util.Scanner;

/**
 *
 * @author Roberto Calero
 */
        /*
        Realice un programa que llene un vector con 10 valores aleatorios y cuente las
        apariciones de un valor dado por teclado en el vector.
        */

public class Vector_01 {

    public static void main(String[] args) {
        
        //Declaramos el scanner para el ingreso de datos
        Scanner temp = new Scanner(System.in);
        //Creamos el vector "valores" de tipo int(entero)
        int [] valores = new int [10];
        //El 10 determina la cantidad de valores(longitud) que tendra el vector
        
        //Creamos el ciclo repetitivo for para recorrer las posiciones del vector
        for(int x = 0 ; x < 10 ; x++){
            //Llenamos la posicion x del vector con un numero aleatorio
            //Math.random es una funcionalidad de java que da numeros aleatorios ente 0.0 y 1
            //El 10 determina el valor maximo del numero random y 1 determina la cantidad minima del raondom
            // (int) esto comvierte los valores random en enteros, recordemos que los valores random obtenidos son double
            valores [x] = (int)(Math.random() * 10) + 1;
        }
        //Mensaje de solicitud de datos
        System.out.println("Ingrese un numero");
        //Guardamos el valor ingresado por teclado en una variable de timpo int(entero)
        int num = temp.nextInt();

        //Declaramos el contador y lo inicializamos en cero
        int cont = 0;
        //Colocamos un titulo que separe lo visible por consola
        System.out.println("Valores(vector)");
        //Creamos otro ciclo que recorra el vector para realizar el conteo
        for(int x = 0 ; x < 10 ; x++){
            //Realizamos una condicion if que cumpla con las indicaciones del problema
            //Comparamos el valor de vector valores en la posicion x con el valor por teclado num
            if(valores[x] == num){
                //Aumentamos el contador de uno en uno
                cont++;
            }
            //Imprimimos los valores del vector
            System.out.println(valores[x]);
        }
        //Salida de resultados
        System.out.println("Resultados");
        System.out.println("El numero ingresado: " + num + " se repite: " + cont);
    }
}
