/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package costoterreno;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class Costoterreno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner bry= new Scanner(System.in);   
        // declaracion de variables 
        double anchura;
        double longitud;
        double costo_mcuadrado;
        double total;
        //pedimos datos por teclado. 
        System.out.println("ingrese la anchura del terreno");
        anchura=bry.nextDouble();
        System.out.println("ingrese la longitud del terreno");
        longitud=bry.nextDouble();
        System.out.println("ingrese el costo de metro cuadrado");
        costo_mcuadrado=bry.nextDouble();
        //realisamos operraciones 
        total=(anchura*longitud)*costo_mcuadrado;
        //presentar valores 
        System.out.println("el costo del terreno es de "+total);
        
    }
    
}
