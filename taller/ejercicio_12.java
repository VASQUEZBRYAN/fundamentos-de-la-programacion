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
public class ejercicio_12 {
     public static void main(String[] args) {
        // 12.Crear un programa que pida la edad de 10 personas
        // y muestre cuantos son menores de edad y la media
        Scanner datos=new Scanner(System.in);
        //declaracion de variables
        int e1,e2,e3,e4,e5,e6,e7,e8,e9,e10, i=1;
        int med, menor=0;
        System.out.print("ingrese la edad");
        e1=datos.nextInt();
        System.out.print("ingrese la edad");
        e2=datos.nextInt();
        System.out.print("ingrese la edad");
        e3=datos.nextInt();
        System.out.print("ingrese la edad");
        e4=datos.nextInt();
        System.out.print("ingrese la edad");
        e5=datos.nextInt();
        System.out.print("ingrese la edad");
        e6=datos.nextInt();
        System.out.print("ingrese la edad");
        e7=datos.nextInt();
        System.out.print("ingrese la edad");
        e8=datos.nextInt();
        System.out.print("ingrese la edad");
        e9=datos.nextInt();
        System.out.print("ingrese la edad");
        e10=datos.nextInt();
        //proceso
        if(e1<18){
            menor=menor+1;
        }if(e2<18){
            menor=menor+1;
        }if(e3<18){
            menor=menor+1;
        }if(e4<18){
            menor=menor+1;
        }if(e5<18){
            menor=menor+1;
        }if(e6<18){
            menor=menor+1;
        }if(e7<18){
            menor=menor+1;
        }if(e8<18){
            menor=menor+1;
        }if(e9<18){
            menor=menor+1;
        }if(e10<18){
            menor=menor+1;
        med=e1+e2+e3+e4+e5+e6+e7+e8+e9+e10;
        med=med/10;
            System.out.println("los menores de edad son:"+menor);
           
            System.out.println("la media de las edades es:"+med);
   
    }
   
   }
}
    

