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
public class ejej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                /*Escribir un programa que pida dos números enteros por teclado y
        calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma
*/
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("ingrese dos enteros");
        int num1 = sc.nextInt();
        int num2 =sc.nextInt();
        
        int sum = num1 + num2; 
        
        System.out.println("la suma de los numeros es: "+sum);
    }
    
}
