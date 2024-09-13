package ejercicio03;

import java.util.Scanner;

public class SueldosEmpleados {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        double sueldo1, sueldo2, sueldo3, sueldo4, sueldo5;
        double totalSueldos, promedioSueldos, sueldoMenor;

        System.out.print("Ingrese el sueldo del empleado 1: ");
        sueldo1 = sc.nextDouble();

        System.out.print("Ingrese el sueldo del empleado 2: ");
        sueldo2 = sc.nextDouble();

        System.out.print("Ingrese el sueldo del empleado 3: ");
        sueldo3 = sc.nextDouble();

        System.out.print("Ingrese el sueldo del empleado 4: ");
        sueldo4 = sc.nextDouble();

        System.out.print("Ingrese el sueldo del empleado 5: ");
        sueldo5 = sc.nextDouble();

        totalSueldos = sueldo1 + sueldo2 + sueldo3 + sueldo4 + sueldo5;

        promedioSueldos = totalSueldos / 5;

        sueldoMenor = sueldo1;
        if (sueldo2 < sueldoMenor) {
            sueldoMenor = sueldo2;
        }
        if (sueldo3 < sueldoMenor) {
            sueldoMenor = sueldo3;
        }
        if (sueldo4 < sueldoMenor) {
            sueldoMenor = sueldo4;
        }
        if (sueldo5 < sueldoMenor) {
            sueldoMenor = sueldo5;
        }

        // Mostrar los resultados
        System.out.println("Total de sueldos: " + totalSueldos);
        System.out.println("Promedio de sueldos: " + promedioSueldos);
        System.out.println("El sueldo menor es: " + sueldoMenor);
    }
}
