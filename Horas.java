/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horas;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class Horas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner bry= new Scanner(System.in);   
        
        //declaracion de variables 
        int hora;
        int minutos;
        int segundos ;
        int dias; 
        
        //pedimos la hora por teclado 
        System.out.println("ingrese las horas ");
        hora=bry.nextInt();
        // operaciones de transformacion
        dias=hora/24;
        minutos=hora*60;
        segundos=hora*3600;
        //presentamos 
        System.out.println("en dias "+dias);
        System.out.println("en minutos"+minutos);
        System.out.println("en segundos"+segundos);
        
    }
    
}
