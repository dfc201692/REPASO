package repaso_basico;

import java.util.Scanner;

public class SueldoTrabajador_9 {

//    Ejercicio 9: Que calcule el sueldo que le corresponde al trabajador de una
//    empresa que cobra 400000 pesos anuales, el programa debe realizar los cálculos 
//    en función de los siguientes criterios: a. Si lleva más de 10 años en la empresa 
//    se le aplica un aumento del 10%. b. Si lleva menos de 10 años pero más que 5 se 
//    le aplica un aumento del 7%. c. Si lleva menos de 5 años pero más que 3 se le 
//    aplica un aumento del 5%. d. Si lleva menos de 3 años se le aplica un aumento del 3%.
    
    
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int salarioAnual = 40000;
        int sueldo;
        byte aniosTrabajo;

        System.out.println("Ingrese antiguedad del trabajador");
        aniosTrabajo = teclado.nextByte();

        if (aniosTrabajo >= 10) {
            sueldo = (int) (salarioAnual * 1.1);
        } else {
            if (aniosTrabajo > 5) {
                sueldo = (int) (salarioAnual * 1.07);
            } else {
                if (aniosTrabajo > 3) {
                    sueldo = (int) (salarioAnual * 1.05);
                } else {
                    sueldo = (int) (salarioAnual * 1.03);
                }
            }
        }
        System.out.println("El salario anual será de $" + sueldo);
    }
}
