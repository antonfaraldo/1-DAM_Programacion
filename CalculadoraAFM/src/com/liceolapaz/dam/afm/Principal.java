package com.liceolapaz.dam.afm;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    do {
            // Escribir menú
            escribirMenu();
            // Pedir opción
            pedirOpcion();
            // Leer opción y almacenarlo
            int opcion = leerNumero();

                // Si la opción es 0, salir
                if (opcion == 0) {
                    // Salir
                    System.exit(0);
                }
                 // Si la opción es 1, 2, 3 o 4
                else if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4) {
                    // Pedir operador1
                    pedirOperador1();
                    // Leer operador1 y almacenarlo
                    double operador1 = leerPrimerOperador();
                    // Pedir operador2
                    pedirOperador2();
                    // Leer operador2 y almacenarlo
                    double operador2 = leerSegundoOperador();
                    // Escribir resultado
                    double resultado = 0;
                    switch (opcion) {
                        case 1:
                            resultado = operador1 + operador2;
                            break;
                            case 2:
                                resultado = operador1 - operador2;
                                break;
                                case 3:
                                    resultado = operador1 * operador2;
                                    break;
                                    case 4:
                                        resultado = operador1 / operador2;
                                        break;

                    }
                    System.out.println("El resultado de la operación es " + resultado);
                }
                else {
                    // Mostrar mensaje de error
                    System.out.println("La opción introducida no es válida");
                }
        } while (true);
    }

    private static double leerSegundoOperador() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private static void pedirOperador2() {
        System.out.println("Escriba el valor del segundo operando:");
    }

    private static double leerPrimerOperador() {
        Scanner escaner = new Scanner(System.in);
       return escaner.nextDouble();
    }

    private static void pedirOperador1() {
        System.out.println("Escriba el valor del primer operando:");
    }

    private static int leerNumero() {
        Scanner escaner = new Scanner(System.in);
        return escaner.nextInt();
    }

    private static void pedirOpcion() {
        System.out.println("Ingresa una opcion:");
    }

    private static void escribirMenu() {
        System.out.println("\nCALCULADORA" + "\n1. SUMA" + "\n2. RESTA" + "\n3. PRODUCTO" + "\n4. DIVISIÓN" + "\n0. SALIDA");
    }
}
