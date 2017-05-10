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
public class temperatura {
    public static void main(String[] args) {
        //declaramos la libreria escanner para lectura de datos
        Scanner bry=new Scanner(System.in);
        //dclaramos las vaiables 
        double gradosCel;
        double gradosFar;
        //ingresar los valos por teclado
        System.out.println("Imgrese los grados en celsius ");
        gradosCel=bry.nextDouble();
        //transformacion a los grados fahrenheit
        gradosFar=(9*(gradosCel+32)/5);
        //presentamos el resultado en pantalla
        System.out.println("los gados en celsius es de "+" "+gradosCel);
        System.out.println("transformados a grados fahrenheit es de"+" "+gradosFar);
    }
}
