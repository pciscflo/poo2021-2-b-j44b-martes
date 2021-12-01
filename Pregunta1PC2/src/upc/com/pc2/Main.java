package upc.com.pc2;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // A)
        // B)

        Cine cine = new Cine();

        Pelicula peliculaA = new Pelicula("Rocky");
        Pelicula peliculaB = new Pelicula("Toy Story");
        Pelicula peliculaC = new Pelicula("Avengers");

        cine.registrarSala("COD01", peliculaA);
        cine.registrarSala("COD02", peliculaB);
        cine.registrarSala("COD03", peliculaC);

        try {
            cine.asignarAsientoASala("COD01", 1, "A", "Regular");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            cine.asignarAsientoASala("COD01", 1, "B", "Regular");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            cine.asignarAsientoASala("COD01", 1, "E", "Regular");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            cine.asignarAsientoASala("COD02", 2, "A", "Regular");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            cine.asignarAsientoASala("COD02", 2, "G", "4DX");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            cine.asignarAsientoASala("COD03", 2, "F", "Regular");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            cine.asignarAsientoASala("COD03", 2, "H", "4DX");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        List<Sala> salasRegistradas = cine.getSalas();
        for (Sala sala: salasRegistradas) {
            System.out.println(sala);
        }

        // C)
        Sala salaMayorVenta = cine.obtenerSalaMayorVentaAsiento4DX();
        System.out.println("La sala con mayor venta y al menos un asiento 4DX es : " + salaMayorVenta);

        // D)
        try {
            cine.asignarAsientoASala("12312", 1, "A", "Regular");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
