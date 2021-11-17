package com.upc.excepciones;

public class Control {
    public static void main(String[] args) {
        Intermedia intermedia = new Intermedia();
        try {
            intermedia.leerArchivo("d://Tempo/carta2.txt");
        } catch (Exception e) {
            System.out.println(e.getMessage());//enviar mensaje al cliente
        }
    }
}
