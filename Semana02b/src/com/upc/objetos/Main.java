package com.upc.objetos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("2021345A","Pedro",88, 88);
        System.out.println("Nombre:" + alumno.getNombre());
        System.out.println("Resultado:" + alumno.obtenerResultado());
        List<Alumno> alumnos  = new ArrayList<>(); // Creando un arreglo de objetos vacio
        alumnos.add(alumno);//adicionando un objeto al arreglo
        Alumno alumno1 = new Alumno("2020134F", "Luis", 80, 80);
        alumnos.add(alumno1);//adicionando un objeto al arreglo
        Alumno alumno2 = new Alumno("2016789D", "Ana", 90, 90);
        alumnos.add(alumno2);//adicionando un objeto al arreglo
        System.out.println("**** Reporte *******");
        for(Alumno p:alumnos){
            System.out.println(p.getNombre()+ "  " + p.obtenerResultado());
        }




    }
}
