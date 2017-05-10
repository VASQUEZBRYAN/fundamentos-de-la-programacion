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
public class horas {
    public static void main(String[] args) {
        //// declaramos la libreria escanner para lectura de datos 
        Scanner bry=new Scanner (System.in);
        //declaramos variables 
        int horas; 
        int dias;
        int minutos;
        int segundos; 
        //Inggras los valores por teclado 
        System.out.println("Ingrese las horas a calcular ");
        horas=bry.nextInt();
        //resolvemos los calculos 
        dias=horas/24; 
        minutos=horas*60;
        segundos=horas*3600;
        //presentamso en pantallas los resultados
        System.out.println("las"+" "+horas+" "+"transformadas en");
        System.out.println("dias es de "+" "+dias);
        System.out.println("Minutos es de "+" "+minutos);
        System.out.println("segundos es de "+" "+segundos);
    }
    
}
