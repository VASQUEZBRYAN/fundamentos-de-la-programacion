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
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner bry= new Scanner(System.in);
        System.out.println("ingrese el limite de la lista");
        int limite=bry.nextInt();
        int lim=0;
        int fact=0;
        int sum=0;
        int j=0;
        int[] lista;
        lista =new int[limite];
        for (int i = 0; i < lista.length; i++) {
            System.out.println("ingrese el valor de la posicion []"+i);
            lista[i]=bry.nextInt();
        }
for (int i =0; i< lista.length; i++) {
           if(lista[i]%2!=0){
               System.out.println(lista[i]+" "+"es impar");
               if(lista[i]<=5){
                   j=lista[i];
                   while(j!=0){
                       fact=fact*j;
                       j--;
                   }
                   System.out.println(""+fact);
               }
               fact=1;
           }else{
               System.out.println(lista[i]+" "+"es par");
           }
           

}}}