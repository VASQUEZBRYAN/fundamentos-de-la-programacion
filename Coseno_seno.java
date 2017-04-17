/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Coseno_seno {
    //la igreso a la variable pi como statica
    static double pi=3.14;
    public static void main(String[] args) {
         //declaramos la libreria escanner para lectura de datos
        Scanner bry=new Scanner(System.in);
        //declaracion de variables
        double angulo;
        double seno,coseno;
        double seno1,coseno1;
        double radianes;
        //ingresamos el angulo por teclado
        System.out.println("Ingrese el angulo ");
        angulo=bry.nextDouble();
        // Converciones de los angulos
        radianes=((angulo*pi)/180);
        seno=Math.sin(radianes);
        coseno=Math.cos(radianes);
        seno1=Math.sin(angulo);
        coseno1=Math.cos(angulo);
        
        //presentamoos los resultados por pantalla.
        System.out.println("El seno del angulo es "+" "+seno+" "+"y en radianes es de"+" "+seno1);
        System.out.println("El coseno del angulo es "+" "+coseno+" "+"y en radianes es de"+" "+coseno1);
    }
}
