package com.liceolapaz.dam.afm;

public class Yen extends Moneda{
    private static final double DOLAR_A_YEN = 0.0075;
    public Yen(double cantidad) {
        super(cantidad, DOLAR_A_YEN);
    }
}
