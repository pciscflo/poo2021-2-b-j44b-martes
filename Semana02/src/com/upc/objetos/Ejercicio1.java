package com.upc.objetos;

public class Ejercicio1 {
    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo(3,4,5);
        System.out.println("Semiperimetro:" + triangulo1.calcularSemiperimetro());
        System.out.println("Area:" + triangulo1.calcularAreA());

    }
}
