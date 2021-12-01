package upc.com.pc2;

import java.util.ArrayList;
import java.util.List;

public class Cine {

    private List<Sala> salas;

    public Cine() {
        this.salas = new ArrayList<>();
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void registrarSala(String codigo, Pelicula pelicula) {
        Sala sala = new Sala(codigo, pelicula);
        salas.add(sala);
    }

    public Sala buscarSala(String codigo) {
        for (Sala sala: salas) {
            if (sala.getCodigo().equals(codigo)) {
                return sala;
            }
        }
        return null;
    }

    public void asignarAsientoASala(String codigo, int fila, String letra, String categoria) throws Exception {
        Sala sala = buscarSala(codigo);
        if (sala == null) {
            throw new Exception("Sala no encontrada");
        }
        sala.registrarAsiento(fila, letra, categoria);
    }

    public Sala obtenerSalaMayorVentaAsiento4DX() {
        Sala maxSala = null;
        double maxVenta = 0;
        for (Sala sala: salas) {
            if (sala.cuentaConAsiento4DX() && sala.obtenerMontoVentaTotal() > maxVenta) {
                maxVenta = sala.obtenerMontoVentaTotal();
                maxSala = sala;
            }
        }
        return maxSala;
    }

}
