/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ortega_martinez;

import java.util.Scanner;

/**
 *
 * @author jorte
 */
public class Ortega {
    
    public static int suma (int num1, int num2){
        
        return num1 + num2;
    }
    
    public static String mayor_menor (int num1, int num2){
        
        int mayor;
        
        if (num1>=num2)
            mayor=num1;
        else
            mayor=num2;
         
        return "El mayor es" + mayor;
    }
    
    public static void mayor_menor_2 (){
        
        int num1;
        int num2;
        int mayor;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca un número");
        num1=Integer.valueOf(entrada.nextLine());
        System.out.println("Introduzca otro número");
        num2=Integer.valueOf(entrada.nextLine());
        
        if (num1>=num2)
            mayor=num1;
        else
            mayor=num2;
         
        System.out.println("El mayor es" + mayor);
        
    }
   
}
