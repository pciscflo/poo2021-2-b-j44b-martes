package relaciones;

import java.util.List;

public class Controlador {
    private Vista vista;
    private Cuartel cuartel;

    public Controlador(Vista vista, Cuartel cuartel) { //agregacion
        this.vista = vista;
        this.cuartel = cuartel;
    }


    public void quieroObtenerCapacidadAtaque() {
        double capacidad;
        capacidad = cuartel.obtenerCapacidadAtaque();
        vista.muestraCapacidad(capacidad);

    }

    public void mostrarListadoAtacantes() {
        List<Atacante> listado;
        listado = cuartel.getArregloAtancantes();
        vista.mostrarListado(listado);
    }


    public void registrarAtacante(String... argumentos) {
        Atacante atacante = Factoria.obtenerObjeto(argumentos);
        try {
            cuartel.registrar(atacante);
        }catch(Exception e){
           vista.muestraMensaje(e.getMessage());
        }
    }
    public Vista getVista() {
        return vista;
    }

    public void setVista(Vista vista) {
        this.vista = vista;
    }

    public Cuartel getCuartel() {
        return cuartel;
    }

    public void setCuartel(Cuartel cuartel) {
        this.cuartel = cuartel;
    }


}
