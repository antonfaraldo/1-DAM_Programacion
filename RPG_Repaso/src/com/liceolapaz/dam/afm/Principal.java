package com.liceolapaz.dam.afm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    private static Item[] inventario = new Item[20];
    public static void main(String[] args) {
        do {
            escribirMenu();
            int opcion;
            try{
                opcion = leerEntero();
            } catch (InputMismatchException e){
                System.out.println("La opción tiene que ser del 0 al 5");
                continue;
            }
            switch(opcion){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    agregarItem();
                    break;
                case 2:
                    eliminarItem();
                    break;
                case 3:
                    moverItem();
                    break;
                case 4:
                    mostrarItem();
                    break;
                case 5:
                    mostrarInventario();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (true);
    }

    private static void mostrarItem() {
        System.out.println("Escriba el número del item (1-20): ");
        int numero;
        try {
            numero = leerEntero();
        } catch (InputMismatchException e) {
            System.out.println("El número de item tiene que ser entero");
            return;
        }
        if (numero < 1 || numero > 20) {
            System.out.println("El número de item tiene que ser entre 1 y 20");
            return;
        }
        if (inventario[numero - 1] == null) {
            System.out.println("Vacío");
        } else {
            System.out.println(inventario[numero - 1]);
        }
    }

    private static void moverItem() {
        System.out.println("Escriba el número del item (1-20): ");
        int numero;
        try {
            numero = leerEntero();
        } catch (InputMismatchException e) {
            System.out.println("El número de item tiene que ser entero");
            return;
        }
        if (numero < 1 || numero > 20) {
            System.out.println("El número de item tiene que ser entre 1 y 20");
            return;
        }
        System.out.println("Escriba la posicion del item (1-20): ");
        int posicion;
        try {
            posicion = leerEntero();
        } catch (InputMismatchException e) {
            System.out.println("La posicion de item tiene que ser entero");
            return;
        }
        if (posicion < 1 || posicion > 20) {
            System.out.println("La posicion de item tiene que ser entre 1 y 20");
            return;
        }
        Item item = inventario[posicion - 1];
        inventario[posicion - 1] = inventario[numero - 1];
        inventario[numero - 1] = item;
    }

    private static void eliminarItem() {
        System.out.println("Escriba el número del item (1-20): ");
        int numero;
        try {
            numero = leerEntero();
        } catch (InputMismatchException e) {
            System.out.println("El número de item tiene que ser entero");
            return;
        }
        if (numero < 1 || numero > 20) {
            System.out.println("El número de item tiene que ser entre 1 y 20");
            return;
        }
        int cantidad = inventario[numero - 1].getCantidad();
        if (cantidad > 1) {
            System.out.println("¿Cuántas unidades quiere eliminar? ( 1 - " + cantidad + "): ");
            int numeroEliminar;
            try {
                numeroEliminar = leerEntero();
                if (numeroEliminar < 1 || numeroEliminar > cantidad) {
                    System.out.println("El número a eliminar debe ser entre 1 y " + cantidad);
                    return;
                }
            } catch (InputMismatchException e) {
                System.out.println("El número a eliminar tiene que ser entero ");
                return;
            }
            inventario[numeroEliminar - 1].restarCantidad(numeroEliminar);
            if (inventario[numero - 1].getCantidad() == 0) {
                inventario[numero - 1] = null;
            }
        } else {
            inventario[numero - 1] = null;
        }
    }

    private static void mostrarInventario() {
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] == null) {
                System.out.println((i + 1) + ". Vacio ");
            } else {
                System.out.println((i + 1) + ". " + inventario[i].getNombre());
            }
        }
    }

    private static void agregarItem() {
        System.out.println("Escriba el nombre del Item: ");
        String nombre = leerTexto();
        if (nombre.isEmpty()) {
            System.out.println("El nombre del item es obligatorio: ");
            return;
        }
        System.out.println("Escriba el valor de ataque del item: ");
        String ataqueTexto = leerTexto();
        if (ataqueTexto.isEmpty()) {
            System.out.println("El ataque del item es obligatorio: ");
            return;
        }
        int ataque;
        try {
            ataque = Integer.parseInt(ataqueTexto);
            if (ataque <0) {
                System.out.println("El ataque no puede ser negativo: ");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("El ataque del item tiene que ser entero");
            return;
        }
        System.out.println("Escriba el valor de denfensa del item: ");
        String defensaTexto = leerTexto();
        if (defensaTexto.isEmpty()) {
            System.out.println("La defensa del item es obligatorio: ");
            return;
        }
        int defensa;
        try {
            defensa = Integer.parseInt(defensaTexto);
            if (defensa <0) {
                System.out.println("La defensa no puede ser negativo: ");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("La defensa del item tiene que ser entero");
            return;
        }
        System.out.println("Escriba el valor de vida del item: ");
        String vidaTexto = leerTexto();
        if (vidaTexto.isEmpty()) {
            System.out.println("La vida del item es obligatorio: ");
            return;
        }
        int vida;
        try {
            vida = Integer.parseInt(vidaTexto);
            if (vida <0) {
                System.out.println("La vida no puede ser negativo: ");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("La vida del item tiene que ser entero");
            return;
        }
        System.out.println("Escriba la descripción del item");
        String descripcion = leerTexto();
        if (descripcion.isEmpty()) {
            System.out.println("La descripcion del item es obligatorio: ");
            return;
        }
        System.out.println("Escriba la categoría del item");
        String categoria = leerTexto();
        if (categoria.isEmpty()) {
            System.out.println("La categoria del item es obligatorio: ");
            return;
        }
        System.out.println("El item es agrupable ? (S/N): ");
        String respuesta = leerTexto();
        boolean agrupable;
        if (respuesta.equalsIgnoreCase("S")) {
            agrupable = true;
        } else {
            agrupable = false;
        }
        Item item = new Item(nombre, ataque, defensa, vida, descripcion, categoria, agrupable);
        for (int i = 0; i < inventario.length; i++){
            if (inventario[i] != null && inventario[i].getNombre().equals(nombre)) {
                inventario[i].SumarCantidad(1);
                return;
            }
        }
        for (int i = 0; i < inventario.length; i++){
            if(inventario[i] == null){
                inventario[i] = item;
                return;
            }
        }
        System.out.println("El inventario esta lleno y no se puede agregar el Item");
    }

    private static String leerTexto() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static int leerEntero() {
        Scanner leer = new Scanner(System.in);
        return leer.nextInt();
    }

    private static void escribirMenu() {
        System.out.println("""
                1. Agregar item
                2. Eliminar item
                3. Mover item
                4. Mostrar item
                5. Mostrar inventario
                0. Salir """);
    }
}
