package com.liceolapaz.dam.afm;

import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        do {
            //Escribir Menú
            escribirMenu();
            //Pedir opción
            pedirOpcion();
            //Almacenar opción
            int opcion = leerOpcion();
            switch (opcion) {
                case 0:
                    System.out.println("Gracias por jugar");
                    System.exit(0);
                    break;
                case 1:
                    jugar();
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        } while (true);
    }

    private static void jugar() {
        do {
            //Programa genera una eleccion
            Random rand = new Random();
            int programa = rand.nextInt(5) + 1;
            String[] opciones = {"", "Piedra", "Papel", "Tijeras", "Lagarto", "Spock"};
            //Escoge jugador
            escogeJugador();
            //Almacenar jugada
            int jugada = leerOpcion();
            if (jugada <1 || jugada > 5) {
                System.out.println("Jugada no permitida. El ordenador había jugado " + opciones[programa]);
                continue;
            }
            if (jugada == programa) {
                System.out.println("\nEs un empate. El ordenador había jugado " + opciones[programa] );
            } else if ((jugada == 1 && (programa == 4 || programa == 3)) ||
                        (jugada == 2 && (programa == 1 || programa == 5)) ||
                        (jugada == 3 && (programa == 2 || programa == 4)) ||
                         (jugada == 4 && (programa == 5 || programa == 2)) ||
                         (jugada == 5 && (programa == 1 || programa == 3))) {
                System.out.println("\nVictoria. El ordenador había jugado " + opciones[programa] );
            } else {
                System.out.println("\nDerrota. El ordenador había jugado " + opciones[programa] );
            }
            //Preguntar si desea volver a jugar
            volverMenu();
            //Almacenar eleccion
            int eleccion = leerOpcion();
            switch (eleccion) {
                case 0:
                    System.out.println("Gracias por jugar");
                    System.exit(0);
                    break;
                    case 1:
                        jugar();
                        break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        } while (true);
    }

    private static void volverMenu() {
        System.out.println("\nDeseas volver a jugar ? " + "\n1.Si" + "\n0.No" ) ;
    }

    private static void escogeJugador() {
        System.out.println("\nEscriba su jugada:" + "\n1.Piedra" + "\n2.Papel" + "\n3.Tijeraas" + "\n4.Lagarto" + "\n5.Spock");
    }

    private static int leerOpcion() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static void pedirOpcion() {
        System.out.println("Ingrese un opcion: ");
    }

    private static void escribirMenu() {
        System.out.println("\nPIEDRA PAPEL TIJERAS LAGARTO SPOCK" + "\n1. Jugar" + "\n0.Salir");
    }
}
