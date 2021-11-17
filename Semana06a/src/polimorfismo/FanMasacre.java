package polimorfismo;

public class FanMasacre extends Participante{

    private String equipo;
    private int puntajeBarra;
    private int puntajeEquipo;

    public FanMasacre(String dni, String nombre, String apellido, int edad, int cantidadMensajes,
                      String equipo, int puntajeBarra, int puntajeEquipo) {
        super(dni, nombre, apellido, edad, cantidadMensajes);
        this.equipo  =  equipo;
        this.puntajeBarra  = puntajeBarra;
        this.puntajeEquipo  = puntajeEquipo;
    }


    public int calcularPuntaje() {
        return (getCantidadMensajes()*4  + this.puntajeBarra + this.puntajeEquipo*2);
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getPuntajeBarra() {
        return puntajeBarra;
    }

    public void setPuntajeBarra(int puntajeBarra) {
        this.puntajeBarra = puntajeBarra;
    }

    public int getPuntajeEquipo() {
        return puntajeEquipo;
    }

    public void setPuntajeEquipo(int puntajeEquipo) {
        this.puntajeEquipo = puntajeEquipo;
    }

    @Override
    public String toString() {
        return "FanMasacre{" +
                "equipo='" + equipo + '\'' +
                ", puntajeBarra=" + puntajeBarra +
                ", puntajeEquipo=" + puntajeEquipo +
                "} " + super.toString();
    }
}
