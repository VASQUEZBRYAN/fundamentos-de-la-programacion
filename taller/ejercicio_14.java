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
public class ejercicio_14 {
    public static void main(String[] args) {
        // Variable para lectura por teclado
        Scanner datos = new Scanner(System.in);
        // Creacion de variables
        int i, lim=10, vocales=0, conson=0;
        String letra; 
        // Proceso
        for(i=1;i<=lim;i++){
            System.out.println("Ingrese la letra "+i);
            letra=datos.next();
            if("a".equals(letra)||"e".equals(letra)||"i".equals(letra)||"o".equals(letra)|"u".equals(letra)){
                vocales=vocales+1;
                
            }else{
                conson=conson+1;
            }
        }
        System.out.println("El total de consonantes es: "+conson);
        System.out.println("El total de vocales es: "+vocales);
    }
}

