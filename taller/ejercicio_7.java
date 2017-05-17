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
public class ejercicio_7 {
    public static void main(String[] args) {
         Scanner bry=new Scanner(System.in);
         int n; 
         System.out.println("ingrese un numero");
         n=bry.nextInt();
         if(n>=100 && n<=1000){
             System.out.println("el numero contiene 3 cifras");
         }else {
             System.out.println("el numero tiene no contiene 3  cifras ");
         }
    }
}
