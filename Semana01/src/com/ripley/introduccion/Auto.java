package com.ripley.introduccion;

public class Auto {
    private String numeroPlaca;
    private String marca;
    private String modelo;
    private int añoFabricacion;
    private double precio;//incluye IGV

    public double calcularIGV(){
        return (precio/1.18)*0.18;
    }

    public double calcularPrecioFinal(){
        return (precio - calcularDescuento());
    }

    public double calcularDescuento(){
        double descuento=0;
        if (añoFabricacion<2021){
            descuento = 0.10;
        }
        return descuento*precio;
    }
    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
