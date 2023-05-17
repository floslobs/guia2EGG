/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2flor;

import java.util.Scanner;

/**
 *
 * @author ARG
 */
public class ejej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Escribir un programa que lea un número entero por teclado y muestre por
        pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
*/
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("ingrese numero ");
        int num = sc.nextInt();
        System.out.println("el doble del numero es: " +num*2);
        System.out.println("el triple del numero es: " +num*3);
        System.out.println("la raiz cuadrada del numero es: " +Math.sqrt(num));
    }
    
}
