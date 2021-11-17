package com.upc.relaciones;

public class Main {
    public static void main(String[] args) {
        Tanque tanque1 = new Tanque("Ruso1","Tubo34","Explot1");
        Tanque tanque2 = new Tanque("Americano","Flash1","Balines");
        Soldado soldado1 = new Soldado("Pepe", 7);
        Soldado soldado2 = new Soldado("Juan", 9);
        Soldado soldado3 = new Soldado("Jorge", 5);
        Cuartel cuartel = new Cuartel("ARM100","Husares");
        cuartel.registrar(tanque1);
        cuartel.registrar(soldado1);
        cuartel.registrar(tanque2);
        cuartel.registrar(soldado2);
        cuartel.registrar(soldado3);
        System.out.println("Capacidad de Ataque:"+cuartel.obtenerCapacidadAtaque());
        System.out.println("--------------****----------------");
        for(Atacante p: cuartel.getArregloAtancantes()){
            System.out.println(p.toString()+ "Atacando:" +  p.atacar());
        }
    }
}
