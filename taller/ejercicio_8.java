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
public class ejercicio_8 {
    public static void main(String[] args) {
    Scanner bry=new Scanner(System.in);
    int n; 
        System.out.println("ingrese un numero ");
        n=bry.nextInt();
        
            if(n<10 && n>0 ){
                System.out.println("el numero es "+n*n);
            }else{
                if(n>=10 && n<100){
                    System.out.println("el total es"+n*5);
                }else{
                    if(n>=100 && n<1000){
                        System.out.println("el total es"+(n-100));
                    }else{
                        if(n<0 || n>1000 || n==0){
                            System.out.println("numero invalido ");
                        }
                    }
                }
            }
        }
             
    
    
}
