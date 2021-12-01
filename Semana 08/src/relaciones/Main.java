package relaciones;

public class Main {
    public static void main(String[] args) {
        Vista vista = new Vista();
        Cuartel cuartel = new Cuartel("ARM100", "Husares");
        Controlador controlador = new Controlador(vista,cuartel);
        controlador.registrarAtacante("TA", "Ruso1", "Tubo34", "Explot1");
        controlador.registrarAtacante("TA", "Americano", "Flash1", "Balines");
        controlador.registrarAtacante("SO", "Pepe", "17");
        controlador.registrarAtacante("SO", "Juan", "19");
        controlador.registrarAtacante("SO", "Jorge", "5");
        controlador.quieroObtenerCapacidadAtaque();
        controlador.mostrarListadoAtacantes();
    }
}
