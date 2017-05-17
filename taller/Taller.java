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
public class Taller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner bry=new Scanner(System.in);
        int n; 
        int total=0; 
        System.out.println("ingrese el limite de la serie ");
        n=bry.nextInt();
        for (int i = 1; i <= n; i++) {
            if(i%2!=0){
                total=total+i;
                
            }
           
        }
         System.out.println("TOTAL"+" "+total);
          
            
        }
    }
    

