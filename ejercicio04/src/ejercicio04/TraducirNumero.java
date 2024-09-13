package ejercicio04;

import java.util.Scanner;

public class TraducirNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, idioma;
        String traducido = "";

        System.out.print("Ingrese un número (1-6): ");
        numero = sc.nextInt();

        System.out.print("Seleccione el idioma (1=español, 2=inglés, 3=portugués, 4=francés): ");
        idioma = sc.nextInt();

        if (numero < 1 || numero > 6) {
            System.out.println("Número fuera del rango permitido.");
        } else {
                switch (idioma) {
                case 1: // Español
                    switch (numero) {
                        case 1: traducido = "uno"; break;
                        case 2: traducido = "dos"; break;
                        case 3: traducido = "tres"; break;
                        case 4: traducido = "cuatro"; break;
                        case 5: traducido = "cinco"; break;
                        case 6: traducido = "seis"; break;
                    }
                    break;
                case 2: // Inglés
                    switch (numero) {
                        case 1: traducido = "one"; break;
                        case 2: traducido = "two"; break;
                        case 3: traducido = "three"; break;
                        case 4: traducido = "four"; break;
                        case 5: traducido = "five"; break;
                        case 6: traducido = "six"; break;
                    }
                    break;
                case 3: // Portugués
                    switch (numero) {
                        case 1: traducido = "um"; break;
                        case 2: traducido = "dois"; break;
                        case 3: traducido = "três"; break;
                        case 4: traducido = "quatro"; break;
                        case 5: traducido = "cinco"; break;
                        case 6: traducido = "seis"; break;
                    }
                    break;
                case 4: // Francés
                    switch (numero) {
                        case 1: traducido = "un"; break;
                        case 2: traducido = "deux"; break;
                        case 3: traducido = "trois"; break;
                        case 4: traducido = "quatre"; break;
                        case 5: traducido = "cinq"; break;
                        case 6: traducido = "six"; break;
                    }
                    break;
                default:
                    System.out.println("Idioma no válido.");
                    return;
            }

            // Mostrar el número traducido
            System.out.println("El número " + numero + " traducido es: " + traducido);
        }
    }
}
