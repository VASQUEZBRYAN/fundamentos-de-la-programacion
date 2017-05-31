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
public class ejercicio3 {
       public static void main(String[] args) {
        // Variable para entrada por teclado
        Scanner bry = new Scanner(System.in);
        // Declaracion de variables
        int  limite=0;
        int repeticion=0;
        int[] lista;
        lista = new int[1000];
        // Entrada de datos
        System.out.println("Ingrese el limite del arreglo");
        limite=bry.nextInt();
        // Proceso
        for(int i=1;i<=limite;i++){
            System.out.println("Ingrese el elemento "+i);
            lista[i]=bry.nextInt();            
        }
        
        for(int i=1;i<=limite;i++){
            for(int j=1;j<=limite;j++){
                if(lista[j]==lista[i]){
                    repeticion=repeticion+1;
                }
            }
            System.out.println("El numero "+lista[i]+" "+repeticion+" veces se repite");
            repeticion=0;
        }
        
        
    }
    
}