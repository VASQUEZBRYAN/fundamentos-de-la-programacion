/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadistica;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class Estadistica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bry= new Scanner(System.in);         
        // declaracion de variables
        double persona1;
        double persona2;
        double persona3;
        double persona4;
        double persona5;
        double estatura;
        double media;
        
        //estatura ingresada por teclado
        System.out.println("ingrese la estatura de la persona 1 ");
        persona1=bry.nextDouble();
        System.out.println("ingrese la estatura de la persona 2 ");
        persona2=bry.nextDouble();
        System.out.println("ingrese la estatura de la persona 3 ");
        persona3=bry.nextDouble();
        System.out.println("ingrese la estatura de la persona 4 ");
        persona4=bry.nextDouble();
        System.out.println("ingrese la estatura de la persona 5 ");
        persona5=bry.nextDouble();
        
        //operaciones para calcular la media y la estatuta
        estatura=persona1+persona2+persona3+persona4+persona5;
        media=estatura/5;
        
        //presentacion de los datos 
        System.out.println("la edad total de todas las persona es de "+""+estatura);
        System.out.println("la edad media es de"+""+media);
        
        
    }
    
}
