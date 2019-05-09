package repaso_basico;

import java.util.Scanner;


//Ejercicio 11: Escribir un programa que solicite la carga de un número entre 0 y 999, y nos muestre 
//un mensaje de cuantos digitos tiene el mismo. Finalizar el programa cuando se cargue el valor 0.


public class Digitos_11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        short num = 0, control;
        byte cont;

        do {
            control = 10;
            cont = 1;

            System.out.println("Ingrese un número del 1 al 999, o 0 para finalizar:");
            num = teclado.nextShort();

            if (num > 0 && num <= 999) {
                while (control <= num) {
                    cont++;
                    control = (short) (control * 10);
                }
                System.out.println("El número " + num + " tiene " + cont + " digitos.");
            } else if (num < 0 || num > 999) {
                System.err.println(num + " está fuera de rango.");
            }
        } while (num != 0);
    }
}
