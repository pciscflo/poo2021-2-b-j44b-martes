package polimorfismo;

public abstract class Participante {
    private String dni;
    private String nombre;
    private String apellido;
    private int edad;
    private int cantidadMensajes;

    public Participante(String dni, String nombre, String apellido, int edad, int cantidadMensajes) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cantidadMensajes = cantidadMensajes;
    }

    public abstract int calcularPuntaje();//este metodo debe implementarse en forma obligatoria en su clase hija

    public boolean validarEdad(){
        if(this.edad>18){
            return true;
        }else {
            return false;
        }
    }

    public void validarEdadConExcepciones() throws Exception{//propágalo
        if (this.edad<18) throw new Exception("No es permitido menores de Edad");
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCantidadMensajes() {
        return cantidadMensajes;
    }

    public void setCantidadMensajes(int cantidadMensajes) {
        this.cantidadMensajes = cantidadMensajes;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", cantidadMensajes=" + cantidadMensajes +
                '}';
    }
}
