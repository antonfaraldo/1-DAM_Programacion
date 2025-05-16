package com.liceolapaz.dam.afm;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        do {
            escribirMenu();
            int opcion = leerEntero();
            FiguraGeometrica figura = null;
            switch (opcion) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    pedirBaseTriangulo();
                    double baseTriangulo = leerDouble();
                    pedirLado2();
                    double lado2 = leerDouble();
                    pedirLado3();
                    double lado3 = leerDouble();
                    pedirAltura();
                    double alturaTriangulo = leerDouble();
                    figura = new Triangulo(baseTriangulo, lado2, lado3, alturaTriangulo);
                    break;
                case 2:
                    pedirBaseRectangulo();
                    double baseRectangulo = leerDouble();
                    pedirAltura();
                    double alturaRectangulo = leerDouble();
                    figura = new Rectangulo(baseRectangulo, alturaRectangulo);
                    break;
                case 3:
                    pedirLado();
                    double lado = leerDouble();
                    figura = new Cuadrado(lado);
                    break;
                case 4:
                    pedirLado();
                    double ladoPentagono = leerDouble();
                    pedirApotema();
                    double apotema = leerDouble();
                    figura = new Pentagono(ladoPentagono, apotema);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    continue;
            }
            double area = figura.calcularArea();
            double perimetro = figura.calcularPerimetro();
            escribirResultado(area, perimetro);
        } while (true);
    }

    private static void pedirApotema() {
        System.out.println("Escriba el valor del apotema: ");
    }

    private static void pedirLado() {
        System.out.println("Escriba el valor del lado: ");
    }

    private static void pedirBaseRectangulo() {
        System.out.println("Escriba el valor de la base del rectángulo: ");
    }

    private static void escribirResultado(double area, double perimetro) {
        System.out.println("El área es " + area + " y el perímetro es " + perimetro);
    }

    private static void pedirAltura() {
        System.out.println("Escriba el valor de la altura: ");
    }

    private static void pedirLado3() {
        System.out.println("Ingrese el tercer lado: ");
    }

    private static void pedirLado2() {
        System.out.println("Ingrese el segundo lado: ");
    }

    private static double leerDouble() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    private static void pedirBaseTriangulo() {
        System.out.println("Ingrese la base: ");
    }

    private static int leerEntero() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static void escribirMenu() {
        System.out.println("\nFIGURAS GEOMÉTRICAS" + "\n1. Triángulo" + "\n2. Rectángulo" + "\n3. Cuadrado" + "\n4. Pentágono" + "\n0. Salir" + "\nEscoja una opción: ");
    }
}
