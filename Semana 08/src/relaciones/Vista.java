package relaciones;

import java.util.List;

public class Vista {
    public void muestraCapacidad(double capacidad) {
        System.out.println("La capacidad de Ataque es:" + capacidad);
    }

    public void mostrarListado(List<Atacante> listado) {
        System.out.println("--------------****----------------");
        for (Atacante p : listado) {
            System.out.println(p.toString() + "Atacando:" + p.atacar());
        }
    }

    public void muestraMensaje(String message) {
        System.out.println(message);
    }
}
