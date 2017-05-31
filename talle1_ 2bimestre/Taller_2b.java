/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_2b;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Taller_2b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner bry= new Scanner(System.in);
        System.out.println("ingrese el limite de la lista");
        int limite=bry.nextInt();
        int suma=0;
        int mayor;
        double promedio=0;
        int[] lista;
        lista =new int[limite];
        for (int i = 0; i < lista.length; i++) {
            System.out.println("ingrese el valor de la posicion []"+i);
            lista[i]=bry.nextInt();
            
        }
        for (int i =lista.length-1; i>=0; i--) {
            suma=suma+lista[i];
            promedio=suma/limite;
            System.out.println("lista"+lista[i]);
            
        }
        mayor=lista[0];
        for (int j = 0; j <lista.length ; j++) {
            if(lista[j]>mayor){
                mayor=lista[j];
            }
            }
        System.out.println("la suma es"+suma);
        System.out.println("el promedio es"+promedio);
        System.out.println("el mayor es"+mayor);
    }
    
}
    