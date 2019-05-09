package repaso_basico;

import java.util.Scanner;

public class Mes_7 {

//    Ejercicio 7: Que pida un número del 1 al 12 y diga el nombre del mes correspondiente.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numMes = 0;

        while (numMes < 1 || numMes > 12) {
            System.out.println("Ingrese el número del mes que desea saber (1-12)");
            numMes = teclado.nextInt();
            if (numMes < 1 || numMes > 12) {
                System.err.println("El número ingresado está fuera de rango.");
            }
        }
        System.out.print("El número ingresado corresponde al mes ");
        switch (numMes) {
            case 1:
                System.out.println("Enero.");
                break;
            case 2:
                System.out.println("Febrero.");
                break;
            case 3:
                System.out.println("Marzo.");
                break;
            case 4:
                System.out.println("Abril.");
                break;
            case 5:
                System.out.println("Mayo.");
                break;
            case 6:
                System.out.println("Junio.");
                break;
            case 7:
                System.out.println("Julio.");
                break;
            case 8:
                System.out.println("Agosto.");
                break;
            case 9:
                System.out.println("Septiembre.");
                break;
            case 10:
                System.out.println("Octubre.");
                break;
            case 11:
                System.out.println("Noviembre.");
                break;
            default:
                System.out.println("Diciembre.");
                break;
        }
    }
}
