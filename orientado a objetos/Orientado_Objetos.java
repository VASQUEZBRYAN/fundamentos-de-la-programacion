/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientado_objetos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Orientado_Objetos {

    public static double iva=0.14;
    public static void main(String[] args) {
        // TODO code application logic here
        double resultado,descuento;
        mensaje();
        resultado=costototal(354,iva);
        System.out.println("el costo total es"+resultado);
       
    }
public static void mensaje(){
    System.out.println("mensaje de la funcion mensaje");
}  
public static double costototal(double subtotal, double iva){
    double total=0,subtotal2=0;
    subtotal2=subtotal*iva;
    total=subtotal2+subtotal;
    return total;

}


}
