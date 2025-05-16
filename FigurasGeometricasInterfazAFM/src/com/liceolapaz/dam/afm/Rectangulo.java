package com.liceolapaz.dam.afm;

public class Rectangulo implements FiguraGeometrica {
    private double base;
    private double altura;
    public Rectangulo(double base, double altura) {
        super();
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea() {
        return (this.base * this.altura);
    }

    @Override
    public double calcularPerimetro() {
        return (this.base + this.altura + this.base + this.altura);
    }
}
