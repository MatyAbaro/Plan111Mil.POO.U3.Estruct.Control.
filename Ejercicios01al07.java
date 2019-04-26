/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpu3nuevo;

import java.util.Scanner;

public class Ejercicios01al07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJERCICIOS DEL 1 AL 7
        Scanner scan = new Scanner(System.in);
        
        System.out.println("1. Calcular si un numero es par o no");
        int i=224;
        if(i%2 == 0){
            System.out.println("Es par");
        }
        
        System.out.println("2. Imprimir los primeros 200 numeros que sean pares. Usar while");
        //2. Imprimir los primeros 200 numeros que sean pares usar while
        i = 0;
        while(i<200){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
        
        System.out.println("\n3. Imprimir los numeros entre a y b que sean multiplos de x");
        System.out.println("Ingrese valor inicial");
        int a = scan.nextInt();
        System.out.println("Ingrese valor final");
        int b = scan.nextInt();
        System.out.println("Ingrese valor del multiplo");
        int x = scan.nextInt();
        
        for(i = a; i <= b; i++){
            if(i%x == 0){
                System.out.println(i);
            }
        }
        
        System.out.println("\n4.Imprimir la secuencia de numeros impares entre a y b. Usar for");
        System.out.println("Ingrese valor inicial");
        a = scan.nextInt();
        System.out.println("Ingrese valor final");
        b = scan.nextInt();
        for(i = a; i <= b; i++){
            if(i%2 == 1){
                System.out.println(i);
            }
        }
        
        System.out.println("\n5. Imprimir la secuencia de fibonacci desde 1 hasta n");
        System.out.println("Ingrese valor limite para secuencia de fibonacci");
        int n = scan.nextInt();
        int ante = 1;
        System.out.print(ante);
        i = 1;
        while(i <= n){
            System.out.print(", ");
            System.out.print(i);
            int temp = i;
            i += ante;
            ante = temp;
        }
        
        System.out.println("\n6. Obtener un nro por teclado, calcular y mostrar cuadrado y cubo");
        System.out.println("Ingrese un nro");
        int nro = scan.nextInt();
        int cuadrado = (int)Math.pow((double)nro, 2);
        int cubo = cuadrado * nro;
        System.out.println("El cuadrado del nro: " + nro + " es: " + cuadrado + " y el cubo es: " + cubo);
        
        System.out.println("\n7. Leer la cantidad de grados centigrados y pasarlos a fahrenheit");
        System.out.println("Ingrese la cantidad de grados centigrados");
        float grados = scan.nextFloat();
        
        float fahrenheit = 32 + (9 * grados / 5);
        
        System.out.println("Grados pasados a Farenheit: " + fahrenheit);
        
        
        
        
        
    }
    
}
