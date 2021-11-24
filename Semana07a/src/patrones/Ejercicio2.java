package patrones;

public class Ejercicio2 {
    public static void main(String[] args) {
        Figura cuadrado = Factoria.dameFigura("CU");
        System.out.println(cuadrado.pintar());
        Figura circulo = Factoria.dameFigura("CI");
        System.out.println(circulo.pintar());


    }
}
