package upc.com.pc2;

public class Asiento {

    private int fila;
    private String letra;
    private String categoria;

    public Asiento(int fila, String letra, String categoria) {
        this.fila = fila;
        this.letra = letra;
        this.categoria = categoria;
    }

    public int getFila() {
        return fila;
    }

    public String getLetra() {
        return letra;
    }

    public String getCategoria() {
        return categoria;
    }

    public double obtenerPrecio() {
        if (categoria.equals("Regular")) {
            return 20;
        } else if (categoria.equals("4DX")) {
            return 45;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Asiento{" +
                "fila='" + fila + '\'' +
                ", letra='" + letra + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
