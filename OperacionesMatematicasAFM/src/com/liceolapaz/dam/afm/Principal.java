package com.liceolapaz.dam.afm;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        do {
            // Mostrar menú
            escribirMenu();
            // Pedir opción
           pedirOpcion();
            // Almacenar opción
            int opcion = leerNumero();
            switch (opcion) {
                // Si la opción es 3, salir
                case 3:
                    System.exit(0);
                    break;
                // Si la opción es 1, Potencia
                case 1:
                    pedirBase();
                    double valorBase = leerDouble();
                    pedirExponente();
                    double valorExponente = leerDouble();
                    double resultadoPotencia = Math.pow(valorBase, valorExponente);
                    escribirResultado(resultadoPotencia);
                    break;
                // Si la opción es 2, Raíz Cuadrada
                case 2:
                    pedirOperando();
                    double valorOperando = leerDouble();
                    double resultadoRaizCuadrada = Math.sqrt(valorOperando);
                    escribirResultado(resultadoRaizCuadrada);
                    break;
                // Si es otra opción, error
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (true);
    }

    private static void pedirOperando() {
        System.out.println("Introduzca un operando:");
    }

    private static void escribirResultado(double resultado) {
        System.out.println("El resultado de la operación es " + resultado);
    }

    private static void pedirExponente() {
        System.out.println("Introduzca el valor del exponente:");
    }

    private static double leerDouble() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private static void pedirBase() {
        System.out.println("Introduzca el valor de la base:");
    }

    private static void pedirOpcion() {
        System.out.println("Escoja una opcion: ");
    }

    private static int leerNumero() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static void escribirMenu() {
        System.out.println("\nPOTENCIAS Y RAICES CUADRADAS" + "\n1. Potencia" + "\n2. Raiz cuadrada" + "\n3. Salir");
    }
}
