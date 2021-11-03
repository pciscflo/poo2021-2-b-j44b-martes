package com.upc.polimorfismo;

public class Televidente extends Participante{
    private String numeroTelefono;
    private int cantidadLllamadas;

    public Televidente(String dni, String nombre, String apellido, int edad, int cantidadMensajes, String numeroTelefono, int cantidadLllamadas) {
        super(dni, nombre, apellido, edad, cantidadMensajes);
        this.numeroTelefono = numeroTelefono;
        this.cantidadLllamadas = cantidadLllamadas;
    }

    public int calcularPuntaje() {
        return getCantidadMensajes()*4 + this.cantidadLllamadas*3;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public int getCantidadLllamadas() {
        return cantidadLllamadas;
    }

    public void setCantidadLllamadas(int cantidadLllamadas) {
        this.cantidadLllamadas = cantidadLllamadas;
    }

    @Override
    public String toString() {
        return "Televidente{" +
                "numeroTelefono='" + numeroTelefono + '\'' +
                ", cantidadLllamadas=" + cantidadLllamadas +
                "} " + super.toString();
    }
}
