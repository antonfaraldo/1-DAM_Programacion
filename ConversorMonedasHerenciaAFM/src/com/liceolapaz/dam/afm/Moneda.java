package com.liceolapaz.dam.afm;

public abstract class Moneda {
    protected double cantidad;
    private double tasaConversion;

    public Moneda(double cantidad, double tasaConversion) {
        this.cantidad = cantidad;
        this.tasaConversion = tasaConversion;
    }
    public double cantidadEuros() {
        return cantidad + tasaConversion;
    }
}
