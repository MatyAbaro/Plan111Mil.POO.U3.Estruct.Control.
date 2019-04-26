/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpu3nuevo;

import java.util.Scanner;

/**
 *
 * @author zapph
 */
public class Ejercicio12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int anio;
        System.out.println("Ingrese un año para saber si es bisiesto o no");
        anio = scan.nextInt();
        
        if(anio%400==0 || (anio%4==0 && anio%100!=0)){
            System.out.println("El año " + anio + " es bisiesto");
        } else{
            System.out.println("El año " + anio + " NO es bisiesto");
        }
    }
}
