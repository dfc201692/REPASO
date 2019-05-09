package repaso_basico;

import java.util.Scanner;

public class ParImpar_5 {

    public static void main(String[] args) {
        
        
//    Ejercicio 5: Que pida un número y diga si es par o impar

        
        Scanner teclado = new Scanner(System.in);

        int num;
        String tipo;

        System.out.println("Ingrese un número");
        num = teclado.nextInt();

        if (num % 2 == 0) {
            tipo = "par.";
        } else {
            tipo = "impar.";
        }
        System.out.println("El número ingresado es " + tipo);
    }
}
