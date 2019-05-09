package repaso_basico;

import java.util.Scanner;

//Ejercicio 15: Pasar de grados centígrados a grados Kelvin. El proceso de leer grados Centígrados 
//se debe repetir mientras que se responda "S" a la pregunta: Repetir Proceso? (s/n)

public class GradosKelvin_15 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float temp, enKelvin = (float) 273.15;
        String resp;
        boolean parametro, repetir = true;

        do {
            System.out.println("Ingrese la temperatura en grados Celsius que desee convertir a grados Kelvin");
            temp = teclado.nextFloat();

            System.out.println(temp + "° Celsius es equivalente a " + (temp + enKelvin)
                    + "° Kelvin");
            do {
                System.out.println("¿Repetir proceso? (s/n)");
                resp = teclado.next();
                switch (resp) {
                    case "s":
                    case "S":
                        parametro = false;
                        break;
                    case "n":
                    case "N":
                        repetir = false;
                        parametro = repetir;
                        break;
                    default:
                        parametro = true;
                        System.err.println("Por favor ingrese un valor válido.");
                        break;
                }
            } while (parametro);
        } while (repetir);
    }
}
