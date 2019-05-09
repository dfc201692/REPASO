package repaso_basico;

import java.util.Scanner;

public class NotasAlumnos_12 {
    
//    Ejercicio 12: Escribir un programa que solicite ingresar n notas de alumnos y nos informe 
//    cuántos tienen notas mayores o iguales a 7 y cuántos menores. El programa termina cuando se 
//    ingrese un valor de 0.

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int nota, contAprob = 0, contNotas = 0, notaAprobacion = 3;

        do {
            System.out.println("Ingrese la nota del alumno (o 0 para finalizar):");
            nota = teclado.nextInt();
            if (nota > 0 && nota <= 5) {
                contNotas++;
                if (nota >= notaAprobacion) {
                    contAprob++;
                }
            } else if (nota < 0 || nota > 5) {
                System.err.println(nota + " está fuera de rango.");
            }
        } while (nota != 0);

        System.out.println("La cantidad de notas validas ingresadas es igual a "
                + contNotas + ". Los alumnos que tienen una nota igual o mayor a 5 son: " + contAprob
                + ". Los alumnos por debajo de 5 son: " + (contNotas - contAprob));
    }
}
