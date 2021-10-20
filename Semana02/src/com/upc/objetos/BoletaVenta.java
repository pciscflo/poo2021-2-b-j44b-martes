package com.upc.objetos;

public class BoletaVenta {
    private double montoVenta;
    private int numeroBoleta;

    public BoletaVenta(double montoVenta, int numeroBoleta) {
        this.montoVenta = montoVenta;
        this.numeroBoleta = numeroBoleta;
    }

    public double calcularDescuento(String tipoCliente){
        double descuento;
        if (tipoCliente.equals("ORO") && montoVenta>1000){
            descuento = 0.2 * montoVenta;
        }else if(tipoCliente.equals("PLATA") && montoVenta>1200){
            descuento = 0.10*montoVenta;
        }else{
            descuento = 0;
        }
        return descuento;
    }

    public double getMontoVenta() {
        return montoVenta;
    }

    public void setMontoVenta(double montoVenta) {
        this.montoVenta = montoVenta;
    }

    public int getNumeroBoleta() {
        return numeroBoleta;
    }

    public void setNumeroBoleta(int numeroBoleta) {
        this.numeroBoleta = numeroBoleta;
    }
}
