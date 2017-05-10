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
public class dolares_pesos {
    public static void main(String[] args) {
        //declaramos la libreria escanner para lectura de datos
        Scanner bry=new Scanner(System.in);
        //declaracion de variables
     double dolares; 
     double pesos;
     double convercion;
     //ingresar los valores por teclado 
        System.out.println("Ingrese la cantidad en dolares ");
        dolares= bry.nextDouble();
        System.out.println("Ingrese la cantidad en pesos deacuerdo al pais ");
        pesos= bry.nextDouble();
        //convercion del dolar a pesos 
        convercion=dolares*pesos;
        //presentamos resultado por pantalla
        System.out.println("los"+" "+dolares+" "+"en"+" "+"pesos"+" "+convercion);
    }
    
}
