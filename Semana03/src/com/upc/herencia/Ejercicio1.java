package com.upc.herencia;

public class Ejercicio1 {
    public static void main(String[] args) {
        ProfesorTC profesorTC1 = new ProfesorTC("21253E","Juan","07877125",
                1500, 0.12);
        ProfesorTP profesorTP1 = new ProfesorTP("785133W","Jorge",
                "12365478",40,20);

        System.out.println("Nombre:" + profesorTC1.getNombre() + "  " + profesorTC1.calcularSueldo());
    }
}
