package com.upc.objetos;

public class Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("2021345A","Pedro",88, 88);
        System.out.println("Nombre:" + alumno.getNombre());
        System.out.println("Resultado:" + alumno.obtenerResultado());
    }
}
