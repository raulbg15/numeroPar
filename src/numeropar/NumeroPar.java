/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeropar;

/**
 *
 * @author raulb
 */
import java.util.Scanner;
public class NumeroPar {
    
    
    
    
    public static boolean esPar(int numero) {
        
        if(numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int numero;
  
        System.out.print("Introduzca un numero: ");
        numero = sc.nextInt();
  
        if(esPar(numero)) {
            System.out.println("El numero " + numero + " es par.");
        } else {
            System.out.println("El numero " + numero + " es impar.");
        }
    }

}