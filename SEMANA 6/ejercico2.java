/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package do_while;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercico2 {
    public static void main(String[] args) {
        Scanner bry=new Scanner(System.in);
        int n;
        int contador=0; 
        int x=0;
        int opcion=0;
        System.out.println("ingrese el numero");
        n=bry.nextInt();
        do{
            x=(int)(Math.random()*n);
            System.out.println("numero :"+" "+x);
             System.out.println("quiere  seguir si(0) y no(1)");
            opcion=bry.nextInt();
        
        }while(opcion!=0);
        System.out.println("numero seleccionado es "+" "+x);
       
    }
}
