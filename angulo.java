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
public class angulo {
    static double pi=3.14;
    public static void main(String[] args) {
        //declaramos la libreria escanner para lectura de datos
        Scanner bry=new Scanner(System.in);
        //declaracion de variables
        double angulo,radianes;
        double tangente,contangente;
        double consecante,secante;
        double seno,coseno;
        //ingresamos el angulo por teclado 
        System.out.println("ingrese el angulo ");
        angulo=bry.nextDouble();
        //tranformamos el angulo a radianes y en las demas funciones trigonometricas
        radianes=((angulo*pi)/180);
        contangente=(Math.cos(radianes)/Math.sin(radianes));
        tangente=(Math.sin(radianes)/Math.cos(radianes));
        secante=(1/Math.cos(radianes));
        consecante=(1/Math.sin(radianes));
        //prsentamos resultados por pantalla
        System.out.println("La tangente es "+" "+tangente);
        System.out.println("La contangente es"+" "+contangente);
        System.out.println("La secante es"+" "+secante);
        System.out.println("La cosecante es"+" "+consecante);

        
    }
    
}
