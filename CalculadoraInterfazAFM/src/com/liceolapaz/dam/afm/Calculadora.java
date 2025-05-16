package com.liceolapaz.dam.afm;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        do {
            escribirMenu();
            int opcion = leerEntero();
            switch (opcion) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                    escribirSubMenu();
                    int opcionSubMenu = leerEntero();
                    switch (opcionSubMenu) {
                        case 0:
                            break;
                        case 1:
                            System.out.println("Escriba el valor del primer operando: ");
                            int valor1 = leerEntero();
                            System.out.println("Escriba el valor del segundo operando: ");
                            int valor2 = leerEntero();
                            Numero operando1 = new Entero(valor1);
                            Numero operando2 = new Entero(valor2);
                            Numero resultado = null;
                            switch (opcion) {
                                case 1:
                                    resultado = operando1.suma(operando2);
                                    break;
                                case 2:
                                    resultado = operando1.resta(operando2);
                                    break;
                                case 3:
                                    resultado = operando1.producto(operando2);
                                    break;
                                case 4:
                                    resultado = operando1.division(operando2);
                                    break;
                            }
                            if(resultado != null) {
                                System.out.println("El resultado es: " + resultado.mostrar());
                            }
                            break;
                        case 2:
                            System.out.println("Escriba el numerador del primer operando: ");
                                int numerador1 = leerEntero();
                            System.out.println("Escriba el denominador del primer operando: ");
                                int denominador1 = leerEntero();
                            System.out.println("Escriba el numerador del segundo operando: ");
                                int numerador2 = leerEntero();
                            System.out.println("Escriba el denominador del segundo operando: ");
                                int denominador2 = leerEntero();
                                operando1 = new Racional(numerador1, denominador1);
                                operando2 = new Racional(numerador2, denominador2);
                                resultado = null;
                                switch (opcion) {
                                    case 1:
                                        resultado = operando1.suma(operando2);
                                        break;
                                    case 2:
                                        resultado = operando1.resta(operando2);
                                        break;
                                    case 3:
                                        resultado = operando1.producto(operando2);
                                        break;
                                    case 4:
                                        resultado = operando1.division(operando2);
                                        break;
                                }
                            if(resultado != null) {
                                System.out.println("El resultado es: " + resultado.mostrar());
                            }
                            break;
                        case 3:
                            System.out.println("Escriba la parte real del primer operando: ");
                                int real1 = leerEntero();
                            System.out.println("Escriba la parte imaginaria del primer operando: ");
                                int imaginaria1 = leerEntero();
                            System.out.println("Escriba la parte real del segundo operando: ");
                                int real2 = leerEntero();
                            System.out.println("Escriba la parte imaginaria del segundo operando: ");
                                int imaginaria2 = leerEntero();
                                operando1 = new Complejo(real1, imaginaria1);
                                operando2 = new Complejo(real2, imaginaria2);
                                resultado = null;
                                switch (opcion) {
                                    case 1:
                                        resultado = operando1.suma(operando2);
                                        break;
                                    case 2:
                                        resultado = operando1.resta(operando2);
                                        break;
                                    case 3:
                                        resultado = operando1.producto(operando2);
                                        break;
                                    case 4:
                                        resultado = operando1.division(operando2);
                                        break;
                                }
                                if(resultado != null) {
                                    System.out.println("El resultado es: " + resultado.mostrar());
                                }
                            break;
                        default:
                            System.out.println("Opcion no valida");
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while(true);
    }

    private static void escribirSubMenu() {
        System.out.println("\nTipo de números" + "\n1.Números enteros" + "\n2.Números racionales" + "\n3.Números complejos" + "\n0.Salir" + "Escoja una opción: ");
    }

    private static int leerEntero() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void escribirMenu() {
        System.out.println("\nCALCULADORA" + "\n1.Suma" + "\n2.Resta" + "\n3.Producto" + "\n4.Division" + "\n0.Salir" + "\nEscoja una opción: ");
    }
}
