package repaso_basico;

import java.util.Scanner;

public class PromedioEdades_13 {
    
//    Ejercicio 13: Se ingresan un conjunto de n edades de personas por teclado. 
//    El programa finalizará cuando el promedio de las edades sea superior a 25.

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        byte edad, cont = 0;
        short sumaEdad = 0;
        float promedio;

        do {
            System.out.println("Ingresar edad:");
            edad = teclado.nextByte();
            cont++;
            sumaEdad += edad;
            promedio = sumaEdad / cont;
        } while (promedio < 25);

        System.out.println("Luego de " + cont + " ingresos el promedio de edad fue de: "+ promedio + " años (igual o mayor a 25 años)");
    }
}
