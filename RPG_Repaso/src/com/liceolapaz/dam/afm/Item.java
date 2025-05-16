package com.liceolapaz.dam.afm;

public class Item {
    private String nombre;
    private int ataque;
    private int defensa;
    private int vida;
    private String descripcion;
    private String categoria;
    private boolean agrupable;
    private int cantidad;

    public Item(String nombre, int ataque, int defensa, int vida, String descripcion, String categoria, boolean agrupable) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.vida = vida;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.agrupable = agrupable;
        this.cantidad = 1;
    }
    public String getNombre() {
        return nombre;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void SumarCantidad(int unidades) {
        this.cantidad += unidades;
    }
    public void restarCantidad(int unidades) {
        this.cantidad -= unidades;
    }

    @Override
    public String toString() {
        return "Nombre " + nombre +
                "\nDescripcion " + descripcion +
                "\nAtaque " + ataque +
                "\nDefensa " + defensa +
                "\nVida " + vida +
                "\nCategoria " + categoria +
                "\nAgrupable " + agrupable +
                "\nCantidad: " + cantidad;
    }
}
