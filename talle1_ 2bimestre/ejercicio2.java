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
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner bry= new Scanner(System.in);
        int n; 
        int menor;
        System.out.println("ingre el limite del arreglo");
        n=bry.nextInt();
        int [] lista = new int [n];
        for (int i = 0; i < lista.length; i++) {
            System.out.println("ingrese el valor de la posicion []"+i);
            lista[i]=bry.nextInt();
        }
        for (int i =lista.length-1; i>=0; i--) {
            System.out.println("lista"+lista[i]);
        }
        menor=lista[0];
        for (int j = 0; j <lista.length ; j++) {
            if(lista[j]<menor){
                menor=lista[j];
            }
            }
        System.out.println("el menor es"+menor);
        
    }

}
