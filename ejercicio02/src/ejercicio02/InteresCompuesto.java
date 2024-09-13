package ejercicio02;

import java.util.Scanner;

public class InteresCompuesto {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        double va, i, n, vf, interes;

                System.out.print("Ingrese el capital inicial (va): ");
        va = sc.nextDouble();

        System.out.print("Ingrese la tasa de interés en porcentaje (i): ");
        i = sc.nextDouble() / 100; 

        System.out.print("Ingrese el periodo en meses (n): ");
        n = sc.nextDouble();

        vf = va * Math.pow((1 + i), n);

    
        interes = vf - va;

        // Mostrar los resultados
        System.out.printf("Valor Futuro (vf): %.2f\n", vf);
        System.out.printf("Interés generado (I): %.2f\n", interes);
    }
}
