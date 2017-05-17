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
public class ejercicio_4 {
    public static void main(String[] args) {
        Scanner bry=new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("ingrese el primer numero");
        n1=bry.nextInt();
        System.out.println("ingrese el segundo numero");
        n2=bry.nextInt();
        System.out.println("ingrese el tercer numero");
        n3=bry.nextInt();
        if(n1>n2&&n1>n3){
            System.out.println("el mayor es"+n1);
        }else{
            if(n2>n1&&n2>n3){
                System.out.println("el mayor es "+n2);
            }else{
                System.out.println("el mayor es"+n3);
            }
            if(n1<n2&&n1<n3){
            System.out.println("el menor es"+n1);
        }else{
            if(n2<n1&&n2<n3){
                System.out.println("el menor es "+n2);
            }else{
                System.out.println("el menor  es"+n3);
            }
         
        }
        
    }
}
}
