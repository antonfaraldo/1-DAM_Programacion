package com.liceolapaz.dam.afm;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Pedir los números al usuario
        pedirNumeros();
        // Crear variable para guardar números
        int[] numeros = new int[10];
        // Crear variable para contar números
        int contador = 0;
        // Mientras que el contador no sea 10
        do {
            //Leer número y guardarlo
            numeros[contador] = leerNumero();
            // Incrementar contador
            contador++;
        } while(contador < 10);
        //Sumar números y guardar resultado
        int resultado = sumarNumeros(numeros);
        // Mostrar el resultado
        mostrarResultado(resultado);

    }

    private static void mostrarResultado(int resultado) {
        System.out.println("La suma de los números introudcidos es: " + resultado);
    }

    private static int sumarNumeros(int[] numeros) {
        int resultado = 0;
        for (int i = 0; i < numeros.length; i++) {
         resultado += numeros[i];
        }
        return resultado;
    }

    private static int leerNumero() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirNumeros() {
        System.out.println("Introduzca 10 números enteros: ");
    }
}
