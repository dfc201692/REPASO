package repaso_basico;

import java.util.Scanner;

public class DiaSemana_6 {
    
    
//    Ejercicio 6: Que pida un número del 1 al 7 y diga el día de la semana correspondiente.


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numDia = 0;

        while (numDia < 1 || numDia > 7) {
            System.out.println("Ingrese el número del día de la semana que desea saber(1-7)");
            numDia = teclado.nextInt();

            if (numDia < 1 || numDia > 7) {
                System.err.println("El número ingresado está fuera de rango.");
            }
        }
        System.out.print("El número ingresado corresponde al día ");
        switch (numDia) {
            case 1:
                System.out.println("Domingo.");
                break;
            case 2:
                System.out.println("Lunes.");
                break;
            case 3:
                System.out.println("Martes.");
                break;
            case 4:
                System.out.println("Miércoles.");
                break;
            case 5:
                System.out.println("Jueves.");
                break;
            case 6:
                System.out.println("Viernes.");
                break;
            default:
                System.out.println("Sábados.");
                break;
        }
    }
}
