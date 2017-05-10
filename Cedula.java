/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cedula;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Cedula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner bry=new Scanner(System.in);
        int v1,v2,v3,v4,v5,v6,v7,v8,v9,v10;
        int n=0,m;
        double a;
        int total=0;
        int verifi;
        int tv1=0,tv3=0,tv5=0,tv7=0,tv9=0;
        System.out.println("ingrese los 10 digitos");
        v1=bry.nextInt();
        v2=bry.nextInt();
        v3=bry.nextInt();
        v4=bry.nextInt();
        v5=bry.nextInt();
        v6=bry.nextInt();
        v7=bry.nextInt();
        v8=bry.nextInt();
        v9=bry.nextInt();
        v10=bry.nextInt();
        tv1=((v1*2/10)+(v1*2%10));
        tv3=((v3*2/10)+(v3*2%10));
        tv5=((v5*2/10)+(v5*2%10));
        tv7=((v7*2/10)+(v7*2%10));
        tv9=((v9*2/10)+(v9*2%10));
        total=tv1+v2+tv3+v4+tv5+v6+tv7+v8+tv9;
        
        a=(Math.ceil(total/10))*10;
        m=(int)(a+10);
        
        do{
            verifi=total-m;
            System.out.println("es correcto");
             System.out.println("total"+" "+total);
        System.out.println("inmediato"+" "+m);
        System.out.println("resultado"+" "+v10+"="+" "+verifi);
        }while(verifi==v10);
}
}