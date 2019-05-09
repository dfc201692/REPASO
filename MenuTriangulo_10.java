package repaso_basico;

import java.util.Scanner;

public class MenuTriangulo_10 {
    
    
//    Ejercicio 10: Que muestre un menú donde las opciones sean 
//    "Equilátero", "Isósceles" y "Escaleno", pida una opción y calcule el perímetro del triángulo seleccionado.

    

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        byte eleccion;
        float lado, otroLado, perimetro = 0, base;

        do {
            System.out.println("Elija una opción (1-3) para calcular el perímetro de un triángulo según su tipo:\n1.Equilátero\n2.Isósceles\n3.Escaleno");
            eleccion = teclado.nextByte();

            switch (eleccion) {
                case 1:
                    System.out.println("Ingrese medida de uno de sus lados:");
                    lado = teclado.nextFloat();
                    perimetro = lado * 3;
                    break;
                case 2:
                    System.out.println("Ingrese la medida de la base:");
                    base = teclado.nextFloat();
                    System.out.println("Ingrese uno de los lados iguales:");
                    lado = teclado.nextFloat();
                    perimetro = base + lado * 2;
                    break;
                case 3:
                    System.out.println("Ingrese la medida de cada uno de sus lados:");
                    base = teclado.nextFloat();
                    lado = teclado.nextFloat();
                    otroLado = teclado.nextFloat();
                    perimetro = lado + base + otroLado;
                    break;
                default:
                    System.err.println("Opción no válida");
            }
        } while (eleccion < 1 || eleccion > 3);

        System.out.println("El perimetro del triángulo es " + perimetro);
    }
}
