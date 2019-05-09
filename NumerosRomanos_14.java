package repaso_basico;

import java.util.Scanner;

//    Ejercicio 14: Convertir un numero a numero Romano

public class NumerosRomanos_14 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        short limite = 9999, control = 10, num;
        byte cont = 1, unidad = 0, decena = 0, centena = 0, millar = 0;
        char I = 'I', V = 'V', X = 'X', L = 'L', C = 'C', D = 'D', M = 'M', VV = 'v',
                II = 'i', XX = 'x';
        String romano, romParte;

        System.out.println("Ingrese un número entero positivo menor o igual a " + limite
                + " o ingrese 0 para finalizar");

        do {
            num = teclado.nextShort();

            if (num <= limite && num > 0) { // Dentro de rango.
                while (control <= num) {
// Cuento los dígitos del número ingresado
                    control = (short) (control * 10);
                    cont++;
                }
                for (int i = 1; i <= cont; i++) {
// Separo en uni, dec, cent, mil
                    switch (i) {
                        case 1:
                            unidad = (byte) num;
                            break;
                        case 2:
                            decena = (byte) (num / 10);
                            unidad = (byte) (unidad - decena * 10);
                            break;
                        case 3:
                            centena = (byte) (num / 100);
                            decena = (byte) (decena - centena * 10);
                            break;
                        case 4:
                            millar = (byte) (num / 1000);
                            centena = (byte) (centena - millar * 10);
                            break;
                    }
                }
                romParte = convertirRomano(centena, C, D, M) + convertirRomano(decena, X, L, C)
                        + convertirRomano(unidad, I, V, X);

                romano = convertirRomano(millar, M, VV, II) + romParte;
                if (num > 3999) {
                    /* Si el número ingresado excede al 3999 la representación de los millares
usa diferentes símbolos */
                    romano = convertirRomano(millar, II, VV, XX) + romParte + "\n(los símbolos en minúsculas representan múltiplos de 1000)";
                }

                System.out.println("La traducción a números romanos de " + num + " es: "
                        + romano);
            } else {
                if (num == 0) {
                    System.out.println("Fin del programa.");
                } else {
                    System.err.println("El número " + num + " está fuera de rango.");
                }
            }
        } while (num != 0);
    }

    private static String convertirRomano(byte digito, char a, char b,
            char c) {
        String rom = "";

        if (digito >= 4) {
            rom += b;
        }
        switch (digito) {
            case 4:
                rom = a + rom;
                break;
            case 9:
                rom = "" + a + c;
                break;
            default:
                if (digito >= 6 && digito <= 8) {
                    digito -= 5;
                }
                if (digito != 5 && digito != 0) {
                    for (int i = 1; i <= digito; i++) {
                        rom += a;
                    }
                }
                break;
        }
        return rom;
    }
}
