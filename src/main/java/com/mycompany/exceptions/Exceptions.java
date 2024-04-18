

package com.mycompany.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number = readInteger("Escriba un numero");
        System.out.println("El valor obtenido es: "+number);
//        boolean continua = true;
//        do{
//        try{ 
//        System.out.println("Ingrese un valor entero");
//        int number = read.nextInt();
//        int square = number * number;
//        System.out.println("El cuadrado de "+number + " es " +square);
//        continua = false;
//        }
//        catch(InputMismatchException ex){
//            System.out.println("Debe ingresar valores numéricos");
//            read.next();
//        }
//        }while (continua);
            
        
       
    }
    public static int readInteger(String data){
        boolean repeat;
        int value = 0;
        Scanner read = new Scanner(System.in);
        do{
            repeat = false;
            try{
                
                System.out.println(data);
                value = read.nextInt();
            } catch(InputMismatchException ex){
                System.out.println("Tipo de dato no válido");
                repeat = true;
            } finally{
                System.out.println("Mensaje a mostrar siempre");
                read.nextLine();
            }
        }while (repeat);
        
        return value;
    }
}
