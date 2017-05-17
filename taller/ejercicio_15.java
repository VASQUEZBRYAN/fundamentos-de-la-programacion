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
public class ejercicio_15 {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int i=0; 
          int n; 
          int c=1; 
          int b=0;
           int a=0;
           int total=0;
          System.out.println("ingrese n");
          n=datos.nextInt();
           while(i<=n){
              if(c<=3){
               System.out.println("("+(n+b)+"*"+c+")");
               b=b+n;
               total=total+(b*c);
                  
              c++;
           }else{
           if(c>3){
               c=1;
           }
           System.out.println("total"+total);
    }
    i++;
}
}}