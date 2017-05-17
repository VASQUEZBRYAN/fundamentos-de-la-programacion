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
public class ejercicio_2 {
    public static void main(String[] args) {
         Scanner bry=new Scanner(System.in);
         int n,i=0; 
        int total=0; 
        System.out.println("ingrese el limite de la serie ");
        n=bry.nextInt();
        i=n;
        while(i>=1){
            if(n%i==0){
                System.out.println("es divisible para "+" "+i);
            }
            i--;
        }
       
            }
            
    }
    

