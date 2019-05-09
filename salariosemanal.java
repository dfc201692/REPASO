package repaso_basico;

import java.util.Scanner;

public class salariosemanal {

    public static void main(String[] args) {

        //Ejercicio 1: Un obrero necesita calcular su salario semanal, 
        //el cual se obtiene de la siguiente manera: Si trabaja 40 horas 
        // o menos se le paga un salario de $16 por hora, 
        //si trabaja más de 40 horas se le paga un salario de $16 por cada una de 
        //las primeras 40 horas y un salario de $20 por cada hora extra.
        
        Scanner teclado = new Scanner(System.in);

        int maxHs = 40;
        int pagoxHora = 16;
        int pagoxHExtra = 20;
        int hsTrabajadas = 0;
        int sueldo = 0;

        System.out.println("Ingrese las horas trabajadas durante la semana:");
        hsTrabajadas = teclado.nextInt();

        if (hsTrabajadas <= maxHs) {
            sueldo = hsTrabajadas * pagoxHora;
        } else {
            sueldo = (hsTrabajadas - maxHs) * pagoxHExtra + maxHs * pagoxHora;
        }
        System.out.println("El salario total será de $" + sueldo);
    }
}
