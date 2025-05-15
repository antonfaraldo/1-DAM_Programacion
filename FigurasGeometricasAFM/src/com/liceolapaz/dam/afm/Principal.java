package com.liceolapaz.dam.afm;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        do {
            // Mostar menú
            escribirMenu();
            // Pedir opción
            pedirOpcion();
            // Leer opción y almacenarlo
            int opcion = leerNumero();
            switch (opcion) {
                // Si la opción es 0, salir
                case 0:
                System.exit(0);
                break;
                // Si la opción es 1, cuadradro
                case 1:
                    // Pedir el lado
                    pedirLadoCuadrado();
                    // Leer lado y almacenarlo
                    double ladoCuadrado = leerDouble();
                    // Calcular área Cuadrado
                    double areaCuadrado = ladoCuadrado * ladoCuadrado;
                    // Calcular perímetro
                    double perimetroCuadrado = areaCuadrado * 4;
                    // Mostrar resultado
                    escribirResultado(areaCuadrado, perimetroCuadrado);
                    break;
                // Si la opción es 2, rectángulo
                case 2:
                    // Pedir la base
                    pedirBaseRectángulo();
                    // Leer la base y almacenarla
                    double BaseRectangulo = leerDouble();
                    // Pedir la altura
                    pedirAlturaRectangulo();
                    // Leer la altura y almacenarla
                    double alturaRectangulo = leerDouble();
                    // Calculaar área Rectángulo
                    double areaRectangulo = BaseRectangulo * alturaRectangulo;
                    // Calcular perímetro Rectángulo
                    double perimetroRectangulo = BaseRectangulo + alturaRectangulo + BaseRectangulo + alturaRectangulo;
                    // Mostrar resultado
                    escribirResultado(areaRectangulo, perimetroRectangulo);
                    break;
                // Si la opción es 3, triángulo
                case 3:
                    // Pedir la base
                    pedirBaseTriangulo();
                    // Leer y almacenar base
                    double BaseTriangulo = leerDouble();
                    // Pedir altura
                    pedirAlturaTriangulo();
                    // Leer y almacenar altura
                    double alturaTriangulo = leerDouble();
                    // Pedir lado
                    pedirLadoTriangulo();
                    // Leer y almacenar lado
                    double ladoTriangulo = leerDouble();
                    // Calcular área Triángulo
                    double areaTriangulo = (BaseTriangulo * alturaTriangulo) / 2;
                    // Calcular perímetro Triángulo
                    double perimetroTriangulo = ladoTriangulo + ladoTriangulo + ladoTriangulo;
                    // Mostrar resultado
                    escribirResultado(areaTriangulo, perimetroTriangulo);
                    break;
                // Si la opción es 4, pentágono
                    case 4:
                        // Pedir lado
                        pedirLadoPentágono();
                        // Almacenar ladoç
                        double LadoPentagono = leerDouble();
                        // Pedir apotema
                        pedirApotemaPentsgono();
                        // Almacenar apotema
                        double apotemaPentagono = leerDouble();
                        // Calcular área
                        double areaPentagono = (LadoPentagono * apotemaPentagono) / 2;
                        // Calcular perímmetro
                        double perimetroPentagono = LadoPentagono * 5;
                        // Mostrar resultado
                        escribirResultado(areaPentagono, perimetroPentagono);
                        break;
                // Si es otra opción, error
                        default:
                            System.out.println("Opcion no valida");
                            break;
            }
        } while (true);
    }

    private static void pedirApotemaPentsgono() {
        System.out.println("Escriba el valor del apotema ");
    }

    private static void pedirLadoPentágono() {
        System.out.println("Escriba el valor del lado del pentágono");
    }

    private static void pedirLadoTriangulo() {
        System.out.println("Escriba el valor del lado del triangulo");
    }

    private static void pedirAlturaTriangulo() {
        System.out.println("Escriba el valor de la altura del triángulo");
    }

    private static void pedirBaseTriangulo() {
        System.out.println("Escriba el valor de la base del triángulo");
    }

    private static void pedirAlturaRectangulo() {
        System.out.println("Escriba el valor de la altura del rectángulo");
    }

    private static void pedirBaseRectángulo() {
        System.out.println("Escriba el valor de la base del rectángulo");
    }

    private static void escribirResultado(double area, double perimetro) {
        System.out.println("El area es: " + area + "y el perímetro es: " + perimetro);
    }

    private static double leerDouble() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    private static void pedirLadoCuadrado() {
        System.out.println("Escriba el valor del primer lado del cuadrado: ");
    }

    private static int leerNumero() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static void pedirOpcion() {
        System.out.println("Escoja una opcion: ");
    }

    private static void escribirMenu() {
        System.out.println("\nFIGURAS GEOMÉTRICAS" + "\n1. Triángulo" + "\n2. Rectángulo" + "\n3. Cuadrado" + "\n4. Pentágono" + "\n0. Salir");
    }
}
