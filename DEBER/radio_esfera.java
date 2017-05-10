/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class radio_esfera {
   //variable estatica 
    static double pi=3.14;
    public static void main(String[] args) {
        //declaramos la libreria escanner para lectura de datos
        Scanner bry=new Scanner(System.in);
        //declaracion de variables
        double area;
        double volumen;
        double radio; 
        //ingresar los valores por teclado
        System.out.println("Ingrese el radio de la esfera");
        radio= bry.nextDouble();
        //calculamos el area y el volumen
        area=pi*(radio*radio);
        volumen=(4*(area*radio)/3);
        //presentamos los valores 
        System.out.println("el area de la esfera es de  "+" "+area);
        System.out.println("el voluemen de la esfera es de  "+" "+volumen); 
        
    }
    
}
