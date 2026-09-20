
package com.pe.code;


import java.util.Scanner;


public class RegistroEsttudiantes {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("=== REGISTRO DE ESTUDIANTE ===");

        System.out.print("Ingrese nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("Ingrese edad: ");
        int edad = teclado.nextInt();
        
        double nota;
        
        do{
            System.out.println("Ingrese nota (0 - 20):");
            nota = teclado.nextDouble();
            
            if(nota < 0 || nota > 20){
                System.out.println("Nota invalida. Intente nuevamente");
            }
            
        }while(nota < 0 || nota > 20);



        System.out.println("\n=== DATOS REGISTRADOS ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nota: " + nota);
    }

    
}
