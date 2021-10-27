package com.upc.herencia;

import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        ProfesorTC profesorTC = new ProfesorTC("8888888", "Pepe","12345678",
                1000,0.12);
        ProfesorTP profesorTP = new ProfesorTP("74123547","Carmen",
                "9999999",40,20);
        Administrador administrador = new Administrador();
        administrador.registrar(profesorTC);
        administrador.registrar(profesorTP);

        System.out.println("------------------LISTADO------------------------");
        List<Profesor> lista =  administrador.getArregloProfesores();
        for(Profesor p:lista){
            System.out.println(p.getNombre() + "   " + p.calcularSueldo());
        }
        System.out.println("--------------------------------------------------");
        System.out.println("Promedio de Sueldos:" + administrador.calcularPromedioSueldos());
        System.out.println("Buscar profesor...");
        Profesor profe = administrador.buscarProfesor("12345678");
        if(profe!=null){
            System.out.println(profe.getNombre() + "  " + profe.calcularSueldo());
        }else{
            System.out.println("No está registrado");
        }

    }
}
