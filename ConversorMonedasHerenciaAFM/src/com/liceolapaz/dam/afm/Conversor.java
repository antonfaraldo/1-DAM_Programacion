 package com.liceolapaz.dam.afm;

 import java.util.Scanner;

 public class Conversor {
    public static void main(String[] args) {
        do {
            escrbirMenu();
            int opcion = leerEntero();
            switch (opcion) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                case 2:
                case 3:
                    Moneda moneda = null;
                    //Escribir submenu
                    escribirSubMenu();
                    // Introducir la cantidad de Dólares
                    double cantidad = leerCantidad();
                    if (opcion == 1) {
                        moneda= new Dolar(cantidad);
                    } else if (opcion == 2) {
                        moneda = new Libra(cantidad);
                    } else if (opcion == 3) {
                        moneda = new Yen(cantidad);
                    }
                    //Calcular resultado
                    double resultado = moneda.cantidadEuros();
                    escribirResultado(resultado);
                    break;
                //Opción equivocada
                default:
                    System.out.println("Opcion no valida");
            }
        } while (true);
    }

     private static void escribirResultado(double resultado) {
         System.out.println("La cantidad en euros es " + resultado);
     }

     private static double leerCantidad() {
         Scanner sc = new Scanner(System.in);
         return sc.nextDouble();
     }

     private static void escribirSubMenu() {
         System.out.println("Esciba la cantidad: ");
     }

     private static int leerEntero() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static void escrbirMenu() {
        System.out.println("\nCONVERSOR DE MONEDAS" + "\n1. Dólares" + "\n2. Libras" + "\n3. Yens" + "\n0. Salir" + "\nEscoja una opción: ");
    }
}
