package com.liceolapaz.dam.afm;

public class Racional implements Numero{
    private int numerador;
    private int denominador;
    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }


    @Override
    public Numero suma(Numero operando) {
        Numero resultado = null;
        if (operando instanceof Racional) {
            Racional op = (Racional) operando;
            int nuevoNumerador = this.numerador * op.denominador + this.denominador * op.numerador;
            int nuevoDenominador = this.denominador * op.denominador;
            resultado = new Racional(nuevoNumerador, nuevoDenominador);
        } else {
            System.out.println("Solamente se puede operar con números racionales");
        }
        return resultado;
    }

    @Override
    public Numero resta(Numero operando) {
        Numero resultado = null;
        if (operando instanceof Racional) {
            Racional op = (Racional) operando;
            int nuevoNumerador = this.numerador * op.denominador - this.denominador * op.numerador;
            int nuevoDenominador = this.denominador * op.denominador;
            resultado = new Racional(nuevoNumerador, nuevoDenominador);
        } else {
            System.out.println("Solamente se puede operar con números racionales");
        }
        return resultado;
    }

    @Override
    public Numero producto(Numero operando) {
        Numero resultado = null;
        if (operando instanceof Racional) {
            Racional op = (Racional) operando;
            int nuevoNumerador = this.numerador * op.numerador;
            int nuevoDenominador = this.denominador * op.denominador;
            resultado = new Racional(nuevoNumerador, nuevoDenominador);
        } else {
            System.out.println("Solamente se puede operar con números racionales");
        }
        return resultado;
    }

    @Override
    public Numero division(Numero operando) {
        Numero resultado = null;
        if (operando instanceof Racional) {
            Racional op = (Racional) operando;
            int nuevoNumerador = this.numerador * op.denominador;
            int nuevoDenominador = this.denominador * op.numerador;
            resultado = new Racional(nuevoNumerador, nuevoDenominador);
        } else {
            System.out.println("Solamente se puede operar con números racionales");
        }
        return resultado;
    }

    @Override
    public String mostrar() {
        return this.numerador + "/" + this.denominador;
    }
}
