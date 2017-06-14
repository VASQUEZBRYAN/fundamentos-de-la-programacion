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
public class practica {
    static double iva=0.12;
    public static void main(String[] args) {
      Scanner datos = new Scanner(System.in);
      double opcion=0,resultado=0,total=0,descuento=0;
      int mater_tron,mate_libr;
      int beca;
      System.out.println("INGRESE EL CICLO QUE QUIERE ESTUDIAR");
        System.out.println("1.CICLO 1 ");
        System.out.println("2.CICLO 3 ");
        System.out.println("3.CICLO 5 ");
        System.out.println("4.CICLO 7 ");
        System.out.println("5.CICLO 9 ");
        opcion=datos.nextInt();
        System.out.println("INGRESE EL NUMERO DE MATERIAS TRONCALES");
        mater_tron=datos.nextInt();
        System.out.println("INGRESE EK NUMERO DE MATERIAS DE LIBRE");
        mate_libr=datos.nextInt();
        resultado=ciclo(opcion)+materias(mater_tron, mate_libr);
        total=costoiva(resultado, iva);
        System.out.println("INGRESE EL TIPO DE BECA");
        System.out.println("1. MERITOS");
        System.out.println("2. FAMILIAR");
        beca=datos.nextInt();
        descuento=total-(total*becas(beca));
        System.out.println("EL TOTAL  "+resultado);
        System.out.println("EL TOTAL MAS IVA  "+total);
        System.out.println("EL TOTAL CON EL DESCUENTO  "+descuento);
        
    }
    public static double ciclo(double opcion){
        double cl1=700,cl3=720,cl5=740,cl7=760,cl9=780;
        if (opcion==1){
            return cl1;
        }
        if (opcion==2){
            return cl3;
        }
        if (opcion==3){
            return cl5;
        }
        if(opcion==4){
            return cl7;
        }
        if(opcion==5){
            return cl9;
        }
        return 0;
    }
    public static double materias(double mt,double ml){
        double total=0;
        total=(mt*4*35)+(ml*3*35);
        return total;
    }
    public static double becas(double op){
        double bm=0.15,bf=0.08;
        if(op==1){
            return bm;
        }
        if(op==2){
            return bf;
        }
        return 0;
    }
    public static double costoiva(double stotal,double iva){
        double total=0;
        total=stotal+(stotal*iva);
        return total;
    }
    
}
