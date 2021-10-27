package com.upc.herencia;

import java.util.ArrayList;
import java.util.List;

public class Administrador {
    private List<Profesor> arregloProfesores;

    public Administrador() {
        this.arregloProfesores = new ArrayList<>();
    }

    public void registrar(Profesor profesor){
        this.arregloProfesores.add(profesor);//va contener objetos de la clase ProfesorTP y ProfesorTC
    }

    public double calcularPromedioSueldos(){
        double suma=0;
        for(Profesor p:this.arregloProfesores){
            suma+=p.calcularSueldo();
        }
        return (suma/this.arregloProfesores.size());
    }

    public List<Profesor> getArregloProfesores() {
        return arregloProfesores;
    }

    public void setArregloProfesores(List<Profesor> arregloProfesores) {
        this.arregloProfesores = arregloProfesores;
    }
}
