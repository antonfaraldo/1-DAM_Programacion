package com.liceolapaz.dam.afm;

import java.util.Scanner;

public class Principal {
    private static final int SIN_CUENTA = 0;
    private static final int CUENTA_NORMAL = 1;
    private static final int CUENTA_PREMIUM = 2;
    private static int tipoCuenta;
    private static double saldoCuenta;


    public static void main(String[] args) {

        do {
            // Escribir menú
            escribirMenu();
            // Pedir opción
            pedirOpcion();
            // Leer opción y almacenarlo
            int opcion = leerNummero();
            // Si la opción es 0, salir
            if (opcion == 0) {
                System.exit(0);
            }
            // Si la opción es 1, abrir sub menú
            else if (opcion == 1) {
                // Escribir el submenú
                escribirSubMenu();
                // Leer segunda opción y almacenarlo
                int opcion2 = leerSubNummero();
                if (opcion2 == 0) {

                } else if (opcion2 == 1 || opcion2 == 2) {
                    System.out.println("Escriba el saldo inicial:");
                    double saldoInicial = leerSaldo();
                    // Si la segunda opción es 1, crear una cuenta Normal
                    if (opcion2 == 1) {
                        crearCuenta(CUENTA_NORMAL, saldoInicial);
                    }
                    // Si la segunda opción es 2, crear una cuenta premium
                    if (opcion2 == 2) {
                        crearCuenta(CUENTA_PREMIUM, saldoInicial);
                    }

                } else {
                    // Mostrar mensaje de error
                    System.out.println("La opción introducida no es válida");
                }
            }
            // Si la opción es 2 o 3
            if (opcion == 2 || opcion == 3) {
                if (opcion == 2) {
                    ingresarDinero();
                    mostarSaldo();
                }
                if (opcion == 3) {
                    retirarDinero();
                    mostarSaldo();
                }
                // Mostar saldo después del ingreso o retirada
                mostarSaldo();
            }
            // Si la opción es 4
            if (opcion == 4) {
                mostarSaldo();
            }
            if (opcion == 5) {
                System.exit(0);
            }
        } while(true);
    }

    private static void retirarDinero() {
        // Mostrar mensaje
        System.out.println("Escriba la cantidad:");
        double cantidad = leerCantidad();
        if (cantidad > 0) {
            // Si es cuenta normal y no hay suficiente dinero
            if (tipoCuenta == CUENTA_NORMAL && saldoCuenta < cantidad) {
                // Mostrar mensaje de error
                System.out.println("Las cuentas normales no permiten tener el saldo negativo");
            }
               else {
                    // Restar cantidad al saldo de la cuenta
                    saldoCuenta -= cantidad;
                }

        }
    }

    private static void ingresarDinero() {
        // Mostrar mensaje
        System.out.println("Escriba la cantidad:");
        // Leer cantidad y almacenarlo
        double cantidad = leerCantidad();
        // Comprobar que exista cuenta activa
        if (cantidad > 0) {
            saldoCuenta += cantidad;
        }
    }

    private static void mostarSaldo() {
        System.out.println("El saldo de la cuenta es: " + saldoCuenta);
    }

    private static double leerCantidad() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    private static void crearCuenta(int tipo, double saldoInicial) {
        saldoCuenta = saldoInicial;
        tipoCuenta=tipo;
    }

    private static double leerSaldo() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    private static int leerSubNummero() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static void escribirSubMenu() {
        System.out.println("\nTipo de cuenta" + "\n1. Cuenta normal" + "\n2. Cuenta Premiun" + "\n0. Cancelar");
    }

    private static int leerNummero() {
            Scanner escaner = new Scanner(System.in);
            return escaner.nextInt();
    }

    private static void pedirOpcion() {
        System.out.println("Ingrese un opcion: ");
    }

    private static void escribirMenu() {
        System.out.println("\nBANCO" + "\n1. Crear cuenta" + "\n2. Ingresar dinero" + "\n3. Retirar dinero" + "\n4. Consultar saldo" + "\n5. Salir");
    }
}
