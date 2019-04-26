/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpu3nuevo;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double valorMilla = 0.6214;
        int kms;
        double millas;
        System.out.println("Ingrese kms");
        kms = scan.nextInt();
        millas = valorMilla * (double)kms;
        System.out.println(kms + " Kms son: " + millas + " millas");
        
    }
}
