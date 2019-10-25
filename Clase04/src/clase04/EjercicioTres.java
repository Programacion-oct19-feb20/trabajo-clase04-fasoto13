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
public class EjercicioTres {
    /*
    Generar un programa que permita pedir datos por teclado para:
    Ingreso de nombres completos de un estudiante
    Ingreso de nota 1 (debe ser entero)
    Ingreso de nota 2 (deber ser entero
    Ingreso del ciclo que cursa el alumno (deber ser cadena)
    
    Luego presentar en pantalla los datos de la siguiente forma:
    Informe del Alumno:
    Nombres completos:
    Ciclo:
    Nota 1:
    Nota 2:
    */
    
    public static void main(String[] args) { 
        
        Scanner entrada = new Scanner(System.in);
         
        String nombre_alumno;
        String ciclo;
        int nota_1;
        int nota_2;
        
        System.out.println("Ingrese el Nombre del Alumno:");
        nombre_alumno = entrada.nextLine();
        
        System.out.println("Ingrese Nota 1:");
        nota_1 = entrada.nextInt();
        
        System.out.println("Ingrese Nota 2:");
        nota_2 = entrada.nextInt();
        
        entrada.nextLine();
        
        System.out.println("Ingrese el ciclo:");
        ciclo = entrada.nextLine();
        
        System.out.printf("Informe del Alumno:\nNombre Completo del Alumno:%s\n"
                + "Nota 1:%d\nNota 2:%d\nCiclo:%s", nombre_alumno, nota_1, 
                nota_2, ciclo);
        
    }





}
