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
public class ejej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
*/
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("ingrese frase ");
        String fra = sc.next();
        
        System.out.println("su frase en mayusculas: "+fra.toUpperCase());
        System.out.println("su frase en minusculas: "+fra.toLowerCase());
          
               
    }
    
}
