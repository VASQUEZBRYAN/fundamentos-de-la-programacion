/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner bry= new Scanner(System.in);
        System.out.println("ingrese el limite de la lista");
        int limite=bry.nextInt();
        int[] lista;
        lista =new int[limite];
        for (int i = 0; i < lista.length; i++) {
            System.out.println("ingrese el valor de la posicion []"+i);
            lista[i]=bry.nextInt();
            
        }
        for (int i =lista.length-1; i>=0; i--) {
            System.out.println("lista"+lista[i]);
        }
    }
    
}
