package repaso_basico;

import java.util.Scanner;

public class Impuesto_8 {

//    Ejercicio 8: Que lea un importe bruto y calcule su importe neto, si es mayor 
//    de 15.000 se le aplicará un 16% de impuestos,en caso contrario se le aplicará un 10%.
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        short limiteImporte = 15000;
        float bruto, neto;
        float impuestoMayor = (float) .16;
        float impuestoMenor = (float) .1;
        bruto = -1;

        while (bruto < 0) {
            System.out.println("Ingresar importe bruto (si hay centavos, ingresarlos con coma en vez de punto)");
            bruto = teclado.nextFloat();

            if (bruto < 0) {
                System.err.println("El monto ingresado debe ser igual o mayor a cero.");
            }
        }
        neto = bruto * (1 - impuestoMayor);
        if (bruto <= limiteImporte) {
            neto = bruto * (1 - impuestoMenor);
        }
        System.out.println("El monto bruto ingresado fue de $" + bruto + ". Luego de impuestos el neto será de $ " + neto);
    }
}
