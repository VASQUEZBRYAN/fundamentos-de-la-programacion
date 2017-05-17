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
public class ejercicio_11 {
    public static void main(String[] args) {
          Scanner bry=new Scanner(System.in);
          double gb;
          int total=0;
          System.out.println("ingrese la cantidad en gb");
          gb=bry.nextInt();
          if((gb*1000)%700==0){
          System.out.println("el total de cd es "+total);
    }else{
              System.out.println("el total de cd es de "+total+1);
          }
    
}
}
