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
public class Do_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner bry=new Scanner(System.in);
        int n;
        int contador=0;
        System.out.println("ingrse el numero");
        n=bry.nextInt(); 
        do{
            System.out.println("variables"+" "+ contador);
            contador++;
        }while(contador<n);
    }
    
}
