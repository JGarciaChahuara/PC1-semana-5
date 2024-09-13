package ejecicio01;

import java.util.Scanner;

public class VentasSemestre {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos ingresados por el usuario
        Scanner sc = new Scanner(System.in);

        // Declaración de variables para almacenar las ventas y el total
        double venta1, venta2, venta3, venta4, venta5, venta6, totalVentas, promedioVentas;

        // Solicitar las ventas al usuario
        System.out.print("Ingrese la venta del mes 1: ");
        venta1 = sc.nextDouble();

        System.out.print("Ingrese la venta del mes 2: ");
        venta2 = sc.nextDouble();

        System.out.print("Ingrese la venta del mes 3: ");
        venta3 = sc.nextDouble();

        System.out.print("Ingrese la venta del mes 4: ");
        venta4 = sc.nextDouble();

        System.out.print("Ingrese la venta del mes 5: ");
        venta5 = sc.nextDouble();

        System.out.print("Ingrese la venta del mes 6: ");
        venta6 = sc.nextDouble();

        // Calcular el total de ventas
        totalVentas = venta1 + venta2 + venta3 + venta4 + venta5 + venta6;

        // Calcular el promedio de ventas
        promedioVentas = totalVentas / 6;

        // Mostrar los resultados
        System.out.println("Total de ventas del primer semestre: " + totalVentas);
        System.out.println("Promedio de ventas del primer semestre: " + promedioVentas);
    }
}
