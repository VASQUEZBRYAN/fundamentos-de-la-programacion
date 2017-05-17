/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercicio_9 {
    public static void main(String[] args) {
        // 9.Se desea calcular la distancia recorrida (m) 
        // por un auto que tiene velocidad constante (m/s) durante un 
        // tiempoconsiderando que es movimiento rectilíneo uniforme.
        Scanner datos= new Scanner(System.in);
        // declaracion de variables
        double d,v,t;
        System.out.print("ingrese la velocidad del vehiculo");
        v = datos.nextDouble();
        System.out.print("ingrese el tiempo en segundos");
        t= datos.nextDouble();
        //proceso
        d=v*t;
        System.out.print("la distancia recorrida es:"+d);
    }
    
}
    

