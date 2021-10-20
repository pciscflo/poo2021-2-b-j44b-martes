package com.upc.objetos;

public class Ejercicio2 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("ORO","0012");
        BoletaVenta boletaVenta = new BoletaVenta(1800,1221);
        double descuento = boletaVenta.calcularDescuento(cliente.getTipoCliente());
        System.out.println("Descuento:" + descuento);
    }
}
