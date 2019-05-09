package repaso_basico;

import java.util.Scanner;

//Ejercicio 3: El IMSS requiere clasificar a las personas que se jubilaran en el año de 1997. 
//Existen tres tipos de jubilaciones: por edad, por antigüedad joven y por antigüedad adulta. 
//Las personas adscritas a la jubilación por edad deben tener 60 años o más y una antigüedad 
//en su empleo de menos de 25 años. Las personas adscritas a la jubilación por antigüedad joven 
//deben tener menos de 60 años y una antigüedad en su empleo de 25 años o más. Las personas adscritas 
//a la jubilación por antigüedad adulta deben tener 60 años o más y una antigüedad en su empleo de 25 años 
//o más. Determinar en qué tipo de jubilación, quedará adscrita una persona.

public class Clasificacion_Jubilaciones {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String jubilacion = null;
        String noCalifica = "";
        int edadPersona, aniosEmpleo;
        int limiteEdad = 60;
        int limiteEmpleo = 25;

        System.out.println("Ingresar edad");
        edadPersona = teclado.nextInt();

        System.out.println("Ingresar años de trabajo");
        aniosEmpleo = teclado.nextInt();

        if (edadPersona >= limiteEdad) {
            if (aniosEmpleo < limiteEmpleo) {
                jubilacion = " por edad";
            } else {
                jubilacion = " por antigüedad adulta";
            }
        } else {
            if (aniosEmpleo >= limiteEmpleo) {
                jubilacion = " por antigüedad joven";
            } else {
                noCalifica = " no ";
            }
        }

        System.out.println("Según los datos ingresados la persona" + noCalifica + "califica para una jubilación" + jubilacion);
}
}
