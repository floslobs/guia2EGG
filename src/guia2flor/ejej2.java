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
public class ejej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
*/
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("ingresa tu nombre");
        String nom = sc.next();
        
        System.out.println(nom);
    }
    
}
