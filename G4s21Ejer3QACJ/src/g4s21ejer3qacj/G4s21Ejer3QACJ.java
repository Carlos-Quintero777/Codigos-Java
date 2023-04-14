/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g4s21ejer3qacj;

/**
 *
 * @author Nobody - Carlos Quintero
 * Prooooooooooooooooooooooofeeeeeeee yo utilicé la función scanner porque de otra forma, me abria dos pestañas 
 * y no se miraba muy bien, así que buscando ví que de esa forma quedaba bien maquetado, igual le puse X en vez de * porque
 * me daba un error raro, o no se si le moví algo al IDE pero no me dejaba correrlo
 */

import java.util.Scanner;
public class G4s21Ejer3QACJ {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce El Primer Numero: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce El Operador (+ , - , x , /): ");
        String operador = sc.next();
        System.out.println("Introduce El Segundo Numero: ");
        int num2 = sc.nextInt();
        int resultado;
        switch(operador){
            case "+":
                resultado = num1 + num2;
                System.out.println("La Suma de " + num1 + " y " + num2 + " es igual a: " + resultado);
                break;               
            case "-":
                resultado = num1 - num2;
                System.out.println("La Resta de " + num1 + " y " + num2 + " es igual a: " + resultado);
                break;               
            case "x":
                resultado = num1 * num2;
                System.out.println("La Multiplicacion de " + num1 + " y " + num2 + " es igual a: " + resultado);
                break;
            case "/":
                if (num2 == 0){
                    System.out.println("El divisor no puede ser 0");
                }else{
                    resultado = num1 / num2;
                    System.out.println("La Division de " + num1 + " y " + num2 + " es igual a: " + resultado);
                }
                break;
            default:
                System.out.println("El Operador " + operador + " NO es VALIDO");   
        }
    }
    
}
