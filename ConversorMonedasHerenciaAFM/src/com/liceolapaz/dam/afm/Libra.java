package com.liceolapaz.dam.afm;

public class Libra extends Moneda{
    private static final double DOLAR_A_LIBRA = 1.19;
    public Libra(double cantidad) {
        super(cantidad, DOLAR_A_LIBRA);
    }
}
