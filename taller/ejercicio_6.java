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
public class ejercicio_6 {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);  
        //declaracion de variables 
        double compra, total, descuento=0;
        System.out.println("ingrese el valor de la compra");
        compra=datos.nextDouble();
        //proceso 
        if(compra>=1125){
            descuento=0.25*compra;
            total=compra-descuento;
        }else{
                   total=compra;
                    }
        System.out.print("el valor a pagar es:"+total);
        }
        
    }
    
    
    

