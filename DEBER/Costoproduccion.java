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
public class Costoproduccion {
    //declaramos el costo fijo como valor estaico
    static double costoffijo=10700;
    static double costomateriales=3.5;
    public static void main(String[] args) {
        // declaramos la libreria escanner para lectura de datos  
        Scanner bry = new Scanner(System.in);
        //declaramos variables 
        String descripcionP;
        int unidades;
        double costo_prooducto; 
        double total;
        //ingresamos por teclado la descripcio y las unidades producidas 
        System.out.println("Ingrese la descripcion del producto");
        descripcionP=bry.next();
        System.out.println("Ingrese el numero de unidades producidas");
        unidades=bry.nextInt();
        //calculamos le costo de produccion
        costo_prooducto=(unidades*costomateriales)+costoffijo;
        // presentamos por tantalla el costo de produccion
        System.out.println("el costo de produccion es de "+" "+costo_prooducto);
        
        
    }
    
}