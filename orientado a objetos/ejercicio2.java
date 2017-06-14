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
public class ejercicio2 {
static double iva=0.12;
    
    public static void main(String[] args) {
        // Variable para la entrada de datos
        Scanner datos = new Scanner(System.in);
        // Creacion de variables
        double tipo=0, descuento=0, subt=0, resultado=0;
        // Datos de entrada
        System.out.println("Ingrese el tipo de empresa:");
        System.out.println("1. Publica");
        System.out.println("2. Privada");
        System.out.println("3. Persona Natural");
        tipo=datos.nextInt();
        System.out.println("Ingrese el subtotal:");
        subt=datos.nextDouble();
        // Llamado a la funcion
        descuento=tipoempresa(tipo)*100;
        System.out.println("El descuento es: "+descuento+"%");
        resultado=calculoiva(subt,iva)-(calculoiva(subt,iva)*tipoempresa(tipo));
        System.out.println("El calculo con IVA y descuento es: "+resultado);  
    }
    public static double tipoempresa(double opcion){
        double priva=0.06, publi=0.02, normal=0.08;
        if (opcion==1){
            return priva;
        }
        if (opcion==2){
            return publi;
        }
        if (opcion==3){
            return normal;
        }
        return 0;
    }
    public static double calculoiva(double subtotal, double iva){
        double total=0;
        total=subtotal+(subtotal*iva);
        return total;
    }
}