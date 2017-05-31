/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_2b;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercicio4 {
   public static void main(String[] args) {
        // Variable para entrada por teclado
        Scanner datos = new Scanner(System.in);
        // Declaracion de variables
        int i=0, n=0, j=1;
        int unidad=0;
        int decena=0; 
        int suma=0;
        int a=0;
        int total=0;
        int resta=0;
        int igualdad=0;
        int[] lista, res;
        lista = new int[11];
        res = new int [11];
        
        // Proceso
        System.out.println("Ingrese el numero "+i);
        for(i=1;i<=10;i++){
        lista[i]=datos.nextInt();
            
        }
        for(i=1;i<=10;i++){
            if(i%2!=0){
                res[j]=lista[i]*2;
                j++;
            }else{
                res[j]=lista[i];
                j++;
            }
            if(i==10){
                igualdad=lista[10];
            }
        }
        for(i=1;i<=9;i++){
            if(res[i]>=10){
                unidad=res[i]%10;
                decena=res[i]/10;
                res[i]=decena+unidad;
            }               
        }
        for(i=1;i<=9;i++){
            suma=suma+res[i];             
        }
        System.out.println("La suma es "+" "+suma);        
        a=suma%10;
        total=suma+10-a;        
        System.out.println("Inmediato superior: "+total); 
        resta=total-suma;
        System.out.println("Digito a comparar: "+resta);
        
        if(resta==igualdad){
            System.out.println("Su cedula es correcta");
        } else {
            System.out.println("Su cedula es incorrecta");
        }
        
    }
    
}
