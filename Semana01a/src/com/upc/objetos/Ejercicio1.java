package com.upc.objetos;

public class Ejercicio1 {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("u20213456","Luis Perez",19, 18);
        Alumno alumno2 = new Alumno("u202034345","Ana Loo",20, 17);
        System.out.println("El promedio de:" + alumno1.getNombre() + " es:" + alumno1.calcularPromedio());


    }
}
