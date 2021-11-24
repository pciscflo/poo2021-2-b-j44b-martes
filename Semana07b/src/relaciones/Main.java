package relaciones;

public class Main {
    public static void main(String[] args) {
        Atacante tanque1 = Factoria.obtenerObjeto("TA", "Ruso1", "Tubo34", "Explot1");
        Atacante tanque2 = Factoria.obtenerObjeto("TA", "Americano", "Flash1", "Balines");
        Atacante soldado1 = Factoria.obtenerObjeto("SO", "Pepe", "17");
        Atacante soldado2 = Factoria.obtenerObjeto("SO", "Juan", "19");
        Atacante soldado3 = Factoria.obtenerObjeto("SO", "Jorge", "5");
        Cuartel cuartel = new Cuartel("ARM100", "Husares");
        try {
            cuartel.registrar(tanque1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            cuartel.registrar(soldado1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            cuartel.registrar(tanque2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            cuartel.registrar(soldado2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            cuartel.registrar(soldado3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Capacidad de Ataque:" + cuartel.obtenerCapacidadAtaque());
        System.out.println("--------------****----------------");
        for (Atacante p : cuartel.getArregloAtancantes()) {
            System.out.println(p.toString() + "Atacando:" + p.atacar());
        }
    }
}
