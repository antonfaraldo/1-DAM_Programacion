package com.liceolapaz.dam.afm;

import java.util.Random;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        do {
            // Escribir menú
            escribirMenu();
            // Pedir opción
            pedirOpcion();
            // Leer opción y almacenarla
            int opcion = leerNumero();
            int min;
            int max;
            int maxIntentos;
            switch (opcion) {
                // Si la opción es 0, salir
                case 0:
                    System.exit(0);
                    break;
                // Si la opción es 1
                case 1:
                    min = 1;
                    max = 10;
                    maxIntentos = 3;
                    jugar(min, max, maxIntentos);
                    break;
                // Si la opción es 2
                case 2:
                    min = 1;
                    max = 50;
                    maxIntentos = 5;
                    jugar(min, max, maxIntentos);
                    break;
                // Si no es ninguna de esas opciones
                default:
                    // Mostrar mensaje de error
                    System.out.println("Opcion no valida");
            }
        } while (true);
    }

    private static void jugar(int min, int max, int maxIntentos) {
        // Generar un número y almacenarlo
        int numeroGenerado = generarNumeroAleatorio(min, max);
                System.out.println(numeroGenerado);
        // Variable para número de intentos actuales
        int intentos = 0;
        int numeroUsuario = 0;
        while (intentos < maxIntentos) {
            // Pedir número al usuario
            pedirNumero();
            // leer número y almacenarlo
            numeroUsuario = leerNumero();
            // Incrementar el número de intentos
            intentos++;
            // Comprobar números
            comprobarNumeros(numeroUsuario, numeroGenerado, intentos, maxIntentos);
            // Si acertó el número, salir del bucle
            if (numeroUsuario == numeroGenerado) {
                break;
            }
        }

        // Si agotamos intentos, escribir número a adivinar
        if (intentos >= maxIntentos && numeroUsuario != numeroGenerado) {
            System.out.println("No ha acertado en el número máximo de intentos. El número era " + numeroGenerado);
        }
    }

    private static void comprobarNumeros(int numeroUsuario, int numeroGenerado, int intentos, int maxIntentos) {
        if (numeroUsuario == numeroGenerado) {
            System.out.println("Has acertado el número en " + intentos + " intento(s)." );
        } else if (numeroUsuario > numeroGenerado) {
            if (intentos < maxIntentos) {
                System.out.println("El número a adivinar debe ser menor");
            }
        } else {
            if (intentos < maxIntentos) {
                System.out.println("El número a adivinar es mayor");
            }
        }

    }

    private static void pedirNumero() {
        System.out.println("Escriba el número: ");
    }

    private static int generarNumeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    private static int leerNumero() {
        Scanner escaner = new Scanner(System.in);
        return escaner.nextInt();
    }

    private static void pedirOpcion() {
        System.out.println("Escoja una opcion: ");
    }

    private static void escribirMenu() {
        System.out.println("\nADIVINA EL NÚMERO" + "\n1. Del 1 al 10 (3 intentos)" + "\n2. Del 1 al 50 (5 intentos)" + "\n0. Salir");
    }

}

