/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpu3nuevo;

import java.util.Scanner;

public class CalculoDias {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int mes, anio;
        System.out.println("Ingrese numero de mes");
        mes = scan.nextInt();
        System.out.println("Ingrese año");
        anio = scan.nextInt();
        
        switch(mes){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("El mes " + mes + " tiene 31 dias");
                break;
            case 2:
                if(anio%400==0 || (anio%4==0 && anio%100!=0)){
                    System.out.println("El mes " + mes + " tiene 29 dias");
                } else{
                    System.out.println("El mes " + mes + " tiene 28 dias");
                }
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("El mes " + mes + " tiene 30 dias");
                break;
            default:
                System.out.println("Mes inexistente");
                break;
        }
    }
}
