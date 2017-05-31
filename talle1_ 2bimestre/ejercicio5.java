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
public class ejercicio5 {
     public static void main(String[] args) {
        // TODO code application logic here
               Scanner bry = new Scanner(System.in);
               int limite=0;
               
               int[]array;
               int[]array1;
               int[]suma;
               int[]resta;
               int[]multi;
               array= new int [1000];
               array1= new int [1000];
               suma= new int [1000];
               resta= new int [1000];
               multi= new int [1000];
               
               System.out.println("ingrese el limite del arreglo");
               limite=bry.nextInt();
               System.out.println("array 1");
               for (int i = 1; i <=limite; i++) {
               System.out.println("infrese el primer numero");
               array[i]=bry.nextInt();
         }
               System.out.println("array 2");
               for (int i = 1; i <=limite; i++) {
               System.out.println("infrese el primer numero");
               array1[i]=bry.nextInt();
               }
               for (int i = 0; i <=limite; i++) {
                   suma[i]=array[i]+array1[i];
                   resta[i]=array[i]-array1[i];
                   multi[i]=array[i]*array1[i];
             }
               System.out.println("Aray 1: ");
        for(int i=1;i<=limite;i++){
            System.out.println(" "+array[i]);
        }
        System.out.println();
        System.out.println("Aray 2 : ");
        for(int i=1;i<=limite;i++){
            System.out.println(" "+array1[i]);
        }
        System.out.println();
        System.out.println("La suma es: ");
        for(int i=1;i<=limite;i++){
            System.out.println(" "+suma[i]);
        }
        System.out.println();
        System.out.println("La resta es: ");
        for(int i=1;i<=limite;i++){
            System.out.println(" "+resta[i]);
        }
        System.out.println();
        System.out.println("La multiplicacion es: ");
        for(int i=1;i<=limite;i++){
            System.out.println(" "+multi[i]);
        }
        System.out.println();
    }
    
}


