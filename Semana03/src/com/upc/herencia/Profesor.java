package com.upc.herencia;

public abstract class Profesor {
    private String codigo;
    private String nombre;
    private String dni;

    public Profesor(String codigo, String nombre, String dni) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.dni = dni;
    }

    public Profesor() {//este constructor es necesario cuando aplicaremos herencia
    }

    public abstract double calcularSueldo();//cuando una clase tiene por lo menos un método
    //abstracto entonces la clase debe swer abstracta, sino ERROR no compila el código
    //un método abstracto no se programa termina en punto y coma

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
