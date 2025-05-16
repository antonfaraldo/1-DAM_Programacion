package com.liceolapaz.dam.afm;

public class Triangulo implements FiguraGeometrica {
    private double ladoBase;
    private double lado2;
    private double lado3;
    private double altura;
    public Triangulo(double ladoBase, double lado2, double lado3, double altura) {
        super();
        this.ladoBase = ladoBase;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (this.ladoBase * this.altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return (this.ladoBase + this.lado2 + this.lado3);
    }
}
