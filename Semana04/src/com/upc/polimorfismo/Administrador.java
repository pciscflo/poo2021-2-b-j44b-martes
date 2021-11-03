package com.upc.polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Administrador {
    private List<Participante> arregloParticipantes;

    public Administrador() {
        this.arregloParticipantes = new ArrayList<>();
    }
    public void registrar(Participante participante){
        if(participante.validarEdad()){
            arregloParticipantes.add(participante);

        }
        else {
            System.out.println("No es permitido menor de edad");
        }
    }

    public Participante obtenerGanador(){
        int maximo  = 0;
        Participante objetoMayor  = null;
        for (Participante p:this.arregloParticipantes){
            if(p.calcularPuntaje()>maximo){
                maximo  = p.calcularPuntaje();
                objetoMayor  = p;
            }
        }
        return objetoMayor;
    }

    public Participante buscarParticipante(String dni){
        for (Participante p:this.arregloParticipantes){
           if(p.getDni() == dni ){
               return p;
           }
        }
        return null;
    }

    public List<Participante> getArregloParticipantes() {
        return arregloParticipantes;
    }

    public void setArregloParticipantes(List<Participante> arregloParticipantes) {
        this.arregloParticipantes = arregloParticipantes;
    }
}
