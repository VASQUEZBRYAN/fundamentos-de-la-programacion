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
public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        int n1, n2, n3;
        // entrada de datos por el usuario 
        System.out.println("Ingrese el primer numero:");
        n1=datos.nextInt();
        System.out.println("Ingrese el segundo numero:");
        n2=datos.nextInt();
        System.out.println("Ingrese el tercer numero:");
        n3=datos.nextInt();
        // Proceso
        if(((n1>n2)&&(n1<n3))||((n1<n2)&&(n1>n3))){
            System.out.println("El numero intermedio es: "+n1);
        }
        if(((n2>n1)&&(n2<n3))||((n2<n1)&&(n2>n3))){
            System.out.println("El numero intermedio es: "+n2);
        }
        if(((n3>n1)&&(n3<n2))||((n3<n1)&&(n3>n2))){
            System.out.println("El numero intermedio es: "+n3);
        }
    }
}