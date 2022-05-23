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
public class Martinez {
    
    public static int resta (int num1, int num2){
        
        return num1 - num2;
    }
    
    public static void juntaletras (String a, String b){
        
        System.out.println(a + b);
    }
            
    public static void juntaletras_2 (){
        
        String a;
        String b;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca una letra");
        a=entrada.nextLine();
        System.out.println("Introduzca otra letra");
        b=entrada.nextLine();
        
        System.out.println (a + b);
        
     public static int multiplicacion (int num1, int num2){
        
        return num1 * num2;
    }
    
    public static float division (int num1, int num2){
        
        return num1/num2;
    }
    
}
