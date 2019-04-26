/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpu3nuevo;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //h = raizCuadrada(catA^2 + catB^2)
        int catA, catB;
        double hipotenusa;
        System.out.println("Ingrese los dos catetos (Separados por enter)");
        catA = scan.nextInt();
        catB = scan.nextInt();
        hipotenusa = Math.sqrt(Math.pow(catA,2) + Math.pow(catB, 2));
        System.out.println("La hipotenusa del triangulo es :" + hipotenusa);
    }
}
