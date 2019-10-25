/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase04;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class EjercicioDos {
    /*
    Generar programa que permita pedir datos por teclado para:
    Ingreso de Nombre
    Ingreso de Ciudad de Nacimiento
    Ingreso de Edad
    Ingreso de Costo de Matricula
    
    Luego presentar en pantalla los datos de la siguiente forma:
    Datos Personales:
    Nombre:
    Ciudad de Nacimiento:
    Edad:
    Matrícula:
    */
    
    public static void main(String[] args) { 
        
        Scanner entrada = new Scanner(System.in);
        
        String nombre;
        String ciudad_nacimiento;
        int edad;
        double costo_matricula;
        
        System.out.println("Ingreses su nombre completo:");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese su ciudad de nacimiento");
        ciudad_nacimiento = entrada.nextLine();
        
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt(); //ingreso de enteros
        
        System.out.println("Ingrese el costo de su matricula:");
        costo_matricula = entrada.nextDouble(); //ingreso de decimales
        
        System.out.printf("Datos Personales:\nNombre:%s\n"
                + "Ciudad de Nacimiento:%s\nEdad:%d\nCosto de Maticula:%.2f", 
                nombre, ciudad_nacimiento, edad, costo_matricula);
        
        
        /*
        Revisar siempre la cadena
        %s----> Reemplaza cadenas
        %d----> Reemplaza enteros
        %.(n)----> Reemplaza decimales
        Scanner entrada = new Scanner(System.in)
        */
    }
}
        
     
        
    
