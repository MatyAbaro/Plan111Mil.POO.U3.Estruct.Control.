/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpu3nuevo;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int cantPiezasAptas = 0;
        int cantidad;
        float medida;
        System.out.println("Ingrese cantidad de piezas a evaluar");
        cantidad = scan.nextInt();
        
        for(int i = 0; i < cantidad; i++){
            System.out.println("Ingrese medida de la pieza: " + (i+1));
            medida = scan.nextFloat();
            if(medida<=1.3 && medida>=1.2){
                cantPiezasAptas++;
            }
        }
        System.out.println("La cantidad de piezas aptas son: " + cantPiezasAptas + " sobre un total de " + cantidad + " piezas evaluadas");
    }
}
