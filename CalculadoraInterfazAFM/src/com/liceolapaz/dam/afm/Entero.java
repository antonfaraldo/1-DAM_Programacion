package com.liceolapaz.dam.afm;

public class Entero implements Numero{
    private int valor;
    public Entero(int valor) {
        this.valor = valor;
    }

    @Override
    public Numero suma(Numero operando) {
        Numero resultado = null;
        if(operando instanceof Entero){
            Entero op = (Entero) operando;
            int nuevoValor = this.valor + op.valor;
            resultado = new Entero(nuevoValor);
        } else {
            System.out.println("Solamente se puede operar con números enteros");
        }
        return resultado;
    }

    @Override
    public Numero resta(Numero operando) {
        Numero resultado = null;
        if(operando instanceof Entero){
            Entero op = (Entero) operando;
            int nuevoValor = this.valor - op.valor;
            resultado = new Entero(nuevoValor);
        } else {
            System.out.println("Solamente se puede operar con números enteros");
        }
        return resultado;
    }

    @Override
    public Numero producto(Numero operando) {
        Numero resultado = null;
        if(operando instanceof Entero){
            Entero op = (Entero) operando;
            int nuevoValor = this.valor * op.valor;
            resultado = new Entero(nuevoValor);
        } else {
            System.out.println("Solamente se puede operar con números enteros");
        }
        return resultado;
    }

    @Override
    public Numero division(Numero operando) {
        Numero resultado = null;
        if(operando instanceof Entero){
            Entero op = (Entero) operando;
            if (op.valor == 0) {
                System.out.println("ERROR: División entre cero");
            } else {
                int nuevoValor = this.valor / op.valor;
                resultado = new Entero(nuevoValor);
            }
        } else {
            System.out.println("Solamente se puede operar con números enteros");
        }
        return resultado;
    }

    @Override
    public String mostrar() {
        return "" + this.valor;
    }

}
