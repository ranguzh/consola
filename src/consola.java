package src;

import java.util.Scanner;

public class consola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos del visitante
        System.out.print("Nombre del visitante: ");
        String nombre = scanner.nextLine();

        System.out.print("Edad del visitante: ");
        int edad = scanner.nextInt();

        System.out.print("¿Cuántas visitas realizó durante la semana? ");
        int visitas = scanner.nextInt();

        // Variables para calcular el total de visitas y tiempo
        double totalTiempo = 0;

        // Registrar tiempo de estadía para cada visita
        for (int i = 1; i <= visitas; i++) {
            System.out.print("Tiempo de estadía en la visita " + i + " (en horas): ");
            totalTiempo += scanner.nextDouble();
        }

        // Calcular el tiempo promedio
        double promedio = visitas > 0 ? totalTiempo / visitas : 0;
        String edadStatus = (edad >= 18) ? "Mayor de edad" : "Menor de edad";

        // Imprimir resultados
        System.out.println("\nResumen de visitas de " + nombre + ":");
        System.out.println("Total visitas: " + visitas);
        System.out.println("Promedio tiempo de estadía: " + promedio + " horas");
        System.out.println("Estado: " + edadStatus);

        scanner.close();
    }
}
