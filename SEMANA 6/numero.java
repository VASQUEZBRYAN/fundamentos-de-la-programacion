/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package do_while;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class numero {
    public static void main(String[] args) {
        Scanner bry=new Scanner(System.in);
        int n,m;
        double a;
        
        System.out.println("ingrese el numero ");
        n=bry.nextInt();
        a=(Math.ceil(n/10))*10;
        m=(int)(a+10);
        do{
            System.out.println(m);
            m-=10;
    }while(m>=10);
        System.out.println(m);
    
}
}