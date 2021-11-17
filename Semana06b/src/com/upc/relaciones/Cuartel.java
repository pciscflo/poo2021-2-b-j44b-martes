package com.upc.relaciones;

import java.util.ArrayList;
import java.util.List;

public class Cuartel {
    private String codigo;
    private String nombre;
    private List<Atacante> arregloAtancantes;

    public Cuartel(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.arregloAtancantes = new ArrayList<>();
    }
    public void registrar(Atacante atacante){
        this.arregloAtancantes.add(atacante);
    }
    public  double obtenerCapacidadAtaque(){
        //obtener el promedio de edades de los soldados
        double suma = 0;
        int contadorSoldados=0;
        for(Atacante p: this.arregloAtancantes){
            if(p instanceof Soldado){
                suma+=((Soldado) p).getGrado();
                contadorSoldados++;
            }
        }
        return suma/contadorSoldados;
    }
}
