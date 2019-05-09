package repaso_basico;

import java.util.Scanner;

public class Compra_Empresa {
//    Ejercicio 2: Una empresa quiere hacer una compra de varias piezas de la misma clase a una
//    fábrica de refacciones. La empresa, dependiendo del monto total de la compra, decidirá qué hacer 
//    para pagar al fabricante. Si el monto total de la compra excede de $500 000 la empresa tendrá la 
//    capacidad de invertir de su propio dinero un 55% del monto de la compra, pedir prestado al banco 
//    un 30% y el resto lo pagara solicitando un crédito al fabricante. Si el monto total de la compra no         
//     excede de $500 000 la empresa tendrá capacidad de invertir de su propio dinero un 70% y el        
//     restante 30% lo pagara solicitando crédito al fabricante. El fabricante cobra por concepto de       
//     intereses un 20% sobre la cantidad que se le pague a crédito. 

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int maxCompra = 500000;
        float compraTotal, financiacionBnco, pagoEmpresa, credFabri, interesFabri;

        compraTotal = 0;
        financiacionBnco = 0;
        pagoEmpresa = 0;
        credFabri = 0;
        interesFabri = 0;

        System.out.println("Ingrese el monto total de la compra");
        compraTotal = teclado.nextInt();

        pagoEmpresa = (float) (compraTotal * 0.7);
        credFabri = (float) (compraTotal * 0.3);

        if (compraTotal > maxCompra) {
            pagoEmpresa = (float) (compraTotal * 0.55);
            financiacionBnco = credFabri;
            credFabri = (float) (compraTotal * 0.15);
        }
        interesFabri = (float) (credFabri * 0.2);

        System.out.println("La compra se abonará con:\nEmpresa: $" + pagoEmpresa
                + "\nPrestamo Banco: $" + financiacionBnco + "\nCrédito del proveedor: $" + credFabri
                + "\nInterés del proveedor: $" + interesFabri + "\n Monto total: $"
                + (compraTotal + interesFabri));
    }
}
