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
public class velocidadluz {
    public static void main(String[] args) {
        //declaramos la libreria escanner para lectura de datos
        Scanner bry=new Scanner(System.in);
        
        //declaramos variables  
        double velocidadluz;
        double tiempo;
        double distancia; 
        //valor a las vaiables
        velocidadluz=300000;
        //ingresamos los datos por teclado
        System.out.println("Imgrese el tiempo");
        tiempo=bry.nextDouble();
        // procedimiento
        distancia=velocidadluz*tiempo;
        //presentamos los valores
        System.out.println("La distancia es de "+" "+distancia);
        
        
    }
}
