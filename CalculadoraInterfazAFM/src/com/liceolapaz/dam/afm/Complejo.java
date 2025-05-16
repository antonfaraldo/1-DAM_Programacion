package com.liceolapaz.dam.afm;

public class Complejo implements Numero{
    private int real;
    private int imaginaria;
    public Complejo(int real, int imaginaria) {
        this.real = real;
        this.imaginaria = imaginaria;
    }

    @Override
    public Numero suma(Numero operando) {
        Numero resultado = null;
        if (operando instanceof Complejo) {
            Complejo op = (Complejo) operando;
            int parteReal = this.real + op.real;
            int parteImaginaria = this.imaginaria + op.imaginaria;
            resultado = new Complejo(parteReal, parteImaginaria);
        } else {
            System.out.println("Solamente se puede operar con números complejos");
        }
        return resultado;
    }

    @Override
    public Numero resta(Numero operando) {
        Numero resultado = null;
        if (operando instanceof Complejo) {
            Complejo op = (Complejo) operando;
            int parteReal = this.real - op.real;
            int parteImaginaria = this.imaginaria - op.imaginaria;
            resultado = new Complejo(parteReal, parteImaginaria);
        } else {
            System.out.println("Solamente se puede operar con números complejos");
        }
        return resultado;
    }

    @Override
    public Numero producto(Numero operando) {
        Numero resultado = null;
        if (operando instanceof Complejo) {
            Complejo op = (Complejo) operando;
            int parteReal = this.real * op.real - this.imaginaria * op.imaginaria;
            int parteImaginaria = this.real * op.imaginaria + this.imaginaria * op.real;
            resultado = new Complejo(parteReal, parteImaginaria);
        } else {
            System.out.println("Solamente se puede operar con números complejos");
        }
        return resultado;
    }

    @Override
    public Numero division(Numero operando) {
        Numero resultado = null;
        if (operando instanceof Complejo) {
            Complejo op = (Complejo) operando;
            int parteReal = (this.real * op.real + this.imaginaria * op.imaginaria) / ((int)Math.pow(op.real, 2) + (int)Math.pow(op.imaginaria, 2));
            int parteImaginaria = (this.imaginaria * op.real - this.real * op.imaginaria) / ((int)Math.pow(op.real, 2) + (int)Math.pow(op.imaginaria, 2));
            resultado = new Complejo(parteReal, parteImaginaria);
        } else {
            System.out.println("Solamente se puede operar con números complejos");
        }
        return resultado;
    }

    @Override
    public String mostrar() {
        if (this.imaginaria > 0) {
            return this.real + "+" + this.imaginaria + "i";
        } else if (this.imaginaria < 0) {
            return this.real + "" + this.imaginaria + "i";
        } else {
            return this.real + "";
        }
    }

}
