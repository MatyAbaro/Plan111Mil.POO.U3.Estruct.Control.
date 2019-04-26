/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpu3nuevo;

import java.util.Scanner;

public class Ejercicio08 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int opcion;
        float resultado = 0;
        int b, h, lado, radio;
        System.out.println("Elija opcion para calcular el area");
        System.out.println("1 - Rectangulo");
        System.out.println("2 - Cuadrado");
        System.out.println("3 - Circulo");
        System.out.println("4 - Triangulo");
        System.out.print("Esperando opcion: ");
        opcion = scan.nextInt();
        
        switch(opcion){
            case 1: 
                System.out.println("\nCalculando el area del rectangulo");
                System.out.println("Ingrese base");
                b = scan.nextInt();
                System.out.println("Ingrese altura");
                h = scan.nextInt();
                resultado = b*h;
                break;
            case 2:
                System.out.println("\nCalculando el area del cuadrado");
                System.out.println("Ingrese lado");
                lado = scan.nextInt();
                resultado = lado*lado;
                break;
            case 3:
                System.out.println("\nCalculando el area del circulo");
                System.out.println("Ingrese radio");
                radio = scan.nextInt();
                resultado = (float)Math.PI * (float)Math.pow(radio, 2);
                break;
            case 4:
                System.out.println("\nCalculando el area del triangulo");
                System.out.println("Ingrese base");
                b = scan.nextInt();
                System.out.println("Ingrese altura");
                h = scan.nextInt();
                resultado = (b*h)/2;
                break;
            default:
                System.out.println("Opcion incorrecta");
        }
        System.out.println("El area resultante es: " + resultado);
        
        
    }
    
}
