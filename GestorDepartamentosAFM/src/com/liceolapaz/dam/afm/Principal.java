package com.liceolapaz.dam.afm;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Principal {
    private static HashMap<Integer, Departamento> departamentos = new HashMap<>();
    public static void main(String[] args) {
        while (true) {
            escribirMenu();
            int opcion = leerEntero();
            switch (opcion) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    pedirRuta();
                    String ruta = leerRuta();
                    leerFichero(ruta);
                    break;
                case 2:
                    Departamento departamento = crearDepartamento();
                    int idDepartamento = departamento.getIdDepartamento();
                    if (departamentos.containsKey(idDepartamento)) {
                        System.out.println("Ya existe un departamento con ese id " + idDepartamento);
                    } else {
                        departamentos.put(idDepartamento, departamento);
                    }
                    break;
                case 3:
                    departamento = crearDepartamento();
                    idDepartamento = departamento.getIdDepartamento();
                    if (!departamentos.containsKey(idDepartamento)) {
                        System.out.println("No existe un departamento con ese id " + idDepartamento);
                    } else {
                        departamentos.replace(idDepartamento, departamento);
                    }
                    break;
                case 4:
                    pedirDato("número de departamento");
                    String numero = leerDato();
                    idDepartamento = 0;
                    try {
                        idDepartamento = Integer.parseInt(numero);
                    }catch(NumberFormatException e) {
                        System.out.println("El número de departamento tiene que ser un entero");
                        break;
                    }
                    if (!departamentos.containsKey(idDepartamento)) {
                        System.out.println("No existe un departamento con ese numero" + idDepartamento);
                    } else {
                        departamentos.remove(idDepartamento);
                    }
                    break;
                case 5:
                    pedirRuta();
                    ruta = leerRuta();
                    escribirFichero(ruta);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }

    private static void escribirFichero(String ruta) {
        try {
            FileWriter fw = new FileWriter(ruta);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            String linea = "id_depto;nombre;nombre_corto;planta;cif_director;correo";
            pw.println(linea);
            for (Departamento departamento : departamentos.values()) {
                linea = "";
                linea += departamento.getIdDepartamento() + ";";
                linea += departamento.getNombre() + ";";
                linea += departamento.getNombreCorto() + ";";
                linea += departamento.getPlanta() + ";";
                linea += departamento.getCifDirector() + ";";
                linea += departamento.getCorreoElectronico() + ";";
                pw.println(linea);
            }
            pw.close();
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("Error al escribir fichero");
        }
    }

    private static Departamento crearDepartamento() {
        Departamento departamento = null;
        pedirDato("número de departamento");
        String numero = leerDato();
        int idDepartamento = 0;
        try {
            idDepartamento = Integer.parseInt(numero);
        } catch (NumberFormatException e) {
            System.out.println("El número de departamento tienen que ser un número entero");
            return null;
        }
        pedirDato("nombre");
        String nombre = leerDato();
        pedirDato("nombre corto");
        String nombreCorto = leerDato();
        pedirDato("planta");
        String plantaTexto = leerDato();
        int planta = 0;
        try {
            planta = Integer.parseInt(plantaTexto);
        } catch (NumberFormatException e) {
            System.out.println("La planta tiene que ser un número entero");
            return null;
        }
        pedirDato("CIF Director");
        String cifDirector = leerDato();
        pedirDato("correo electronico");
        String correo = leerDato();
        departamento = new Departamento(idDepartamento, nombre, nombreCorto, planta, cifDirector, correo);
        return departamento;

    }

    private static String leerDato() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static void pedirDato(String dato) {
        System.out.println("Escriba " + dato + ": ");
    }

    private static void leerFichero(String ruta) {
        File fichero = new File(ruta);
        if (fichero.isFile()) {
            try {
                Scanner escaner = new Scanner(fichero);
                if (escaner.hasNextLine()) {
                    escaner.nextLine();
                }
                while (escaner.hasNextLine()) {
                    String linea = escaner.nextLine();
                    String[] partes = linea.split(";");
                    int idDepartamento = 0;
                    try {
                        idDepartamento = Integer.parseInt(partes[0]);
                    } catch (NumberFormatException e) {
                        System.out.println("El número del departamento tiene que ser un número entero");
                        return;
                    }
                    String nombre = partes[1];
                    String nombreCorto = partes[2];
                    int planta = 0;
                    try {
                        planta = Integer.parseInt(partes[3]);
                    } catch (NumberFormatException e) {
                        System.out.println("La planta tiene que ser un número entero");
                        return;
                    }
                    String cifDirector = partes[4];
                    String correo = partes[5];
                    Departamento departamento = new Departamento(idDepartamento, nombre, nombreCorto, planta, cifDirector, correo);
                    departamentos.put(idDepartamento, departamento);
                }
            } catch (FileNotFoundException e) {
                System.out.println("La ruta " + ruta + " no existe.");
            }
        } else {
            System.out.println("La ruta " + ruta + " no es un fichero");
        }
    }

    private static String leerRuta() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static void pedirRuta() {
        System.out.println("Escriba la ruta del fichero: ");
    }

    private static int leerEntero() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void escribirMenu() {
        System.out.println(" GESTOR DEPARTAMENTOS \n" +
                "1. Importar departamentos\n" +
                " 2. Añadir departamento\n" +
                " 3. Modificar departamento\n" +
                " 4. Eliminar departamento\n" +
                " 5. Exportar departamentos\n" +
                " 0. Salir\n" +
                " Escoja una opción:");
    }
}
