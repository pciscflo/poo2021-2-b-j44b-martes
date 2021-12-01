package upc.com.pc2;

import java.util.ArrayList;
import java.util.List;

public class Sala {

    private String codigo;
    private List<Asiento> asientos;
    private Pelicula pelicula;

    public Sala(String codigo, Pelicula pelicula) {
        this.codigo = codigo;
        this.pelicula = pelicula;
        this.asientos = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public List<Asiento> getAsientos() {
        return asientos;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void registrarAsiento(int fila, String letra, String categoria) {
        Asiento asiento = new Asiento(fila, letra, categoria);
        asientos.add(asiento);
    }

    public double obtenerMontoVentaTotal() {
        double sumaTotal = 0;
        for (Asiento asiento: asientos) {
            sumaTotal = sumaTotal + asiento.obtenerPrecio();
        }
        return sumaTotal;
    }

    public boolean cuentaConAsiento4DX() {
        for (Asiento asiento: asientos) {
            if (asiento.getCategoria().equals("4DX")) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "asientos=" + asientos +
                ", pelicula=" + pelicula +
                ", obtenerMontoTotal= " + obtenerMontoVentaTotal() +
                '}';
    }
}
