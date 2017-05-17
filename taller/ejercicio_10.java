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
public class ejercicio_10 {
    public static void main(String[] args) {
          Scanner bry=new Scanner(System.in);
          int npartidos_ganados=0;
          int npartidos_perdidos=0;
          int npartidos_empatados=0;
          int total=0; 
          System.out.println("ingrese los partidos ganados");
          npartidos_ganados=bry.nextInt();
          System.out.println("ingrese los partidos empatados");
          npartidos_empatados=bry.nextInt();
          System.out.println("ingrese los partidos perdidos");
          npartidos_perdidos=bry.nextInt();
          
          total=((npartidos_ganados*3)+(npartidos_empatados*1)+(npartidos_perdidos*0));
          System.out.println("el puntaje es"+" "+total);
    }
}
