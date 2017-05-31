/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author Usuario
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] lista;
        lista=new int[6];
        // damos valores al arreglo
        lista[0]=2;
        lista[1]=3;
        lista[2]=21;
        lista[3]=7;
        lista[4]=82;
        lista[5]=82;
       // vamos a imprimir el arreglo 
        for (int i = 0; i <lista.length; i++) {
       System.out.println("lista"+" "+lista[i]);
    }
    }
}