package repaso_basico;

import java.util.Scanner;

public class numerodel1al5ydecirsiesprimo {
    
    
//    Ejercicio 4: Que pida un número del 1 al 5 y diga si es primo o no.    

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        String primo = "es primo.";

        while (num < 1 || num > 5) {
            System.out.println("Ingrese un número del 1 al 5");
            num = teclado.nextInt();
        }

        switch (num) {
            case 2:
            case 3:
            case 5:
                break;
            default:
                primo = "no es primo.";
        }
        System.out.println("El número ingresado (" + num + ") " + primo);
    }
}
