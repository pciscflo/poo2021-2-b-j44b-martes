package com.upc.herencia;

public class ProfesorTC extends Profesor{
    private double sueldoBase;
    private double porcAFP;
    public double calcularSueldo(){ //es necesario implemementar el método abstracto heredado
        return (this.sueldoBase - this.porcAFP*sueldoBase);
    }

    public ProfesorTC(String codigo, String nombre, String dni, double sueldoBase, double porcAFP) {
        super(codigo, nombre, dni);
        this.sueldoBase = sueldoBase;
        this.porcAFP = porcAFP;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getPorcAFP() {
        return porcAFP;
    }

    public void setPorcAFP(double porcAFP) {
        this.porcAFP = porcAFP;
    }
}
