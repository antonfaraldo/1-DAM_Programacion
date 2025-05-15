package com.liceolapaz.dam.afm;

import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        CuentaBancaria cuenta = null;
        do {
            escribirMenu();
            int opcion = leerEntero();
            switch (opcion) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    escribirSubMenu();
                    int opcion2 = leerEntero();
                    switch (opcion2) {
                        case 0:
                            break;
                        case 1:{
                            //Cuenta normal
                            pedirSaldoInicial();
                            double saldoInicial = leerDouble();
                            cuenta = new CuentaNormal(saldoInicial);
                            break;}
                        case 2:{
                            //Cuenta premium
                            pedirSaldoInicial();
                            double saldoInicial = leerDouble();
                            cuenta = new CuentaPremium(saldoInicial);
                            break;}
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                    break;
                case 2:
                    if (cuenta == null) {
                        System.out.println("No existe ninguna cuenta");
                    } else {
                        pedirCantidad();
                        double cantidad = leerDouble();
                        cuenta.ingresarDinero(cantidad);
                        System.out.println("El saldo de la cuenta es " + String.format("%.2f", cuenta.verSaldo()) + " €");
                    }
                    break;
                case 3:
                    if (cuenta == null) {
                        System.out.println("No existe ninguna cuenta");
                    } else {
                        pedirCantidad();
                        double cantidad = leerDouble();
                        cuenta.retirarDinero(cantidad);
                        System.out.println("El saldo de la cuenta es " + String.format("%.2f", cuenta.verSaldo()) + " €");
                    }
                    break;
                case 4:
                    if (cuenta == null) {
                        System.out.println("No existe ninguna cuenta");
                    } else {
                        System.out.println("El saldo de la cuenta es " + String.format("%.2f", cuenta.verSaldo()) + " €");
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (true);
    }

    private static void pedirCantidad() {
        System.out.println("Escriba la cantidad: ");
    }

    private static double leerDouble() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    private static void pedirSaldoInicial() {
        System.out.println("Escriba el saldo inicial: ");
    }

    private static void escribirSubMenu() {
        System.out.println("\nTipo de cuenta" + "\n1.Cuenta normal" + "\n2.Cuenta premiun" + "\n0. Cancelar" + "\nEscoja una opción: ");
    }

    private static int leerEntero() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static void escribirMenu() {
        System.out.println("\nBANCO" + "\n1. Crear cuenta" + "\n2. Ingresar dinero" + "\n3. Retirar dinero" + "\n4. Consultar saldo" + "\n0. Salir" + "\nEscoja una opción: ");
    }
}
