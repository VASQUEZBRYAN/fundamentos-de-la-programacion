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
public class costo_dolares {
    public static void main(String[] args) {
        //declaramos la libreria escanner para lectura de datos
        Scanner bry=new Scanner(System.in);
        //declaracion de variables
        double dolares,dolar1,dolar2,dolar3,dolar4,dolar5;
        double yenes;
        double pesetas;
        double libras_esterlinas;
        double marcos;
        // valor a las variables 
        yenes=109.64;
        pesetas=113.175;
        libras_esterlinas=0.80;
        marcos=1.717;
        //ingresamos por teclado el valor en dolares 
        System.out.println("Ingese el valor en dolares");
        dolares = bry.nextDouble();
        //convercion del dolar
        dolar1=dolares*yenes;
        dolar2=dolares*pesetas;
        dolar3=dolares*libras_esterlinas;
        dolar4=dolares*marcos;
        //presentamos resultados.
        System.out.println("los"+" "+dolares+" transformado en yenes es de "+" "+yenes);
        System.out.println("los"+" "+dolares+" transformado en pesetas es de "+" "+pesetas);
        System.out.println("los"+" "+dolares+" transformado en libras_esterlinas es de "+" "+libras_esterlinas);
        System.out.println("los"+" "+dolares+" transformado en marcos es de "+" "+marcos);
        
}
    }
