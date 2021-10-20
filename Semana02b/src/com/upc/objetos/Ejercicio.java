package com.upc.objetos;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio {
    public static void main(String[] args) {
        Auto auto1 = new Auto("100",20000);
        Auto auto2 = new Auto("300", 23000);

        List<Auto> autos = new ArrayList<>();
        autos.add(auto1);
        autos.add(auto2);
        double suma = 0;
        for (Auto auto: autos){
            System.out.println(auto.getCodigo() + "  " + auto.getPrecio());
           suma = suma + auto.getPrecio();
        }
        System.out.println("--------------------");
        System.out.println("Suma de precios:" + suma);


    }
}
