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
public class ejej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Dada una cantidad de grados centígrados se debe mostrar su 
        equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("ingrese grados centigrados que desea calcular en grados fahrenheit ");
        int cen = sc.nextInt();
        
        double fa = 32 + (9 * cen / 5);
        System.out.println("los grados centigrados en grados fahrenheit son: " +fa);
        
    }
    
}
