package com.liceolapaz.dam.afm;

import java.util.Scanner;

public class Principal {
    private static final double YEN_A_EURO = 0.0075;
    private static final double LIBRA_A_EURO = 1.19;
    private static final double DOLAR_A_EURO = 0.86;

    public static void main(String[] args) {
        // Escribir menú
        escribirMneu();
        // Pedir opción
        pedirOpcion();
        // Leer opción y almacenarlo
        int opcion = leerNumero();
        // Si la opción es 0, salir
        if (opcion == 0) {
            // Salir
            System.exit(0);
    }
        // Si la opción es 1, 2 o 3
        else if (opcion == 1 || opcion == 2 || opcion == 3) {
            // Pedir moneda
            pedirMoneda();
            // Leer moneda y almacenarla
            double moneda = leerCantidad();
            double resultado = 0;
            // Escribir resultado
            switch (opcion) {

                case 1:
                    resultado = moneda * DOLAR_A_EURO;
                    break;
                case 2:
                    resultado = moneda * LIBRA_A_EURO;
                    break;
                case 3:
                    resultado = moneda * YEN_A_EURO;
                    break;


            }
            System.out.println("La cantidad de euros es " + resultado);
        }
        else {
            // Mostrar mensaje de error
            System.out.println("La opción introudcida no es válida");
        }
        while (true);
    }

    private static double leerCantidad() {
        Scanner escaner = new Scanner(System.in);
        return escaner.nextDouble();
    }

    private static void pedirMoneda() {
        System.out.println("Escriba la cantidad: ");
    }

    private static int leerNumero() {
        Scanner escaner = new Scanner(System.in);
        return escaner.nextInt();
    }

    private static void pedirOpcion() {
        System.out.println("Escriba una opcion: ");
    }

    private static void escribirMneu() {
        System.out.println("\nCONVERSOR DE MONEDAS" + "\n1. Dólares" + "\n2. Libras" + "\n3. Yens" + "\n0. Salir");
    }
}
