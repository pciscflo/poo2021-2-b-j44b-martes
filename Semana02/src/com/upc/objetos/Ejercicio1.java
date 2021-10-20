package com.upc.objetos;

public class Ejercicio1 {
    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo(3,4,5);
        if (triangulo1.validarDatos()) {
            System.out.println("Semiperimetro:" + triangulo1.calcularSemiperimetro());
            System.out.println("Area:" + triangulo1.calcularAreA());
        }else{
            System.out.println("Datos no permitidos");
        }

    }
}
