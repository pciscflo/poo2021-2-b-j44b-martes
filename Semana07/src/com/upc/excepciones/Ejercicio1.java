package com.upc.excepciones;

public class Ejercicio1 {
    public static void main(String[] args) {
        int notas[] = {19, 12, 20,15,16,12};
        try {
            int suma = 0;
            suma = suma + notas[8];//Runtime Exception: Excepción en tiempo de ejecución
            System.out.println("suma:" + suma);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
