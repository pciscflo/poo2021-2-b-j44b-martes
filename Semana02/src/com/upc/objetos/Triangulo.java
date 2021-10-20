package com.upc.objetos;

public class Triangulo { // se inicia en mayúscula, en Singular
    private int a;//atributo o propiedad o característica
    private int b;
    private int c;

    public Triangulo(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calcularSemiperimetro(){
        return (a + b + c) /2.0;
    }

    public double calcularAreA(){
        double p, area;
        p = calcularSemiperimetro();
        area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return  area;
    }
    public boolean validarDatos(){
        if(a>b && b>c) {
            return true;
        }
        else {
            return false;
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
