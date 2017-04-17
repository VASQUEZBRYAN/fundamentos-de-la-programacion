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
public class articulooycosto {
    //vaiables estaticas 
    static double costoutilidad=1.5;
    static double impuest=0.15;
    
    public static void main(String[] args) {
        //declaramos la libreria escanner para lectura de datos
        Scanner bry=new Scanner(System.in);
        //declaramos variables 
        String articulo; 
        double costo; 
        double subtotal;
        double total; 
        //operaciones 
        System.out.println("ingrese el nombre del articulo ");
        articulo=bry.next();
        System.out.println("ingrese el costo del articulo");
        costo=bry.nextDouble();
        //operaciones
        subtotal=((costo*costoutilidad)+costo);
        total=(subtotal*impuest)+costo;
        //presentamos por pantalla el resultado
        System.out.println("el costo del producto es de "+" "+total);
    }
}
