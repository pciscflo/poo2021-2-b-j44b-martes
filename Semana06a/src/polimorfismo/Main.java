package polimorfismo;

public class Main {
    public static void main(String[] args) {
        FanMasacre p1  = new FanMasacre("88888888","Luis"," Perez",29,100,
                "nuclear",200,120);
        Televidente p2  = new Televidente("99999999","Carlos","Torres",18,125,
                " 728939049",230);
        FanMasacre p3  = new FanMasacre("77777777","Jorge","Solis",25,274,
                "nuclear",100,80);

        Administrador administrador  = new Administrador();
        try {
            administrador.registrar(p1);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try {
            administrador.registrar(p2);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            administrador.registrar(p3);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("---------------------------");
        for(Participante p:administrador.getArregloParticipantes()){
            System.out.println(p.toString() + " Puntaje:" + p.calcularPuntaje());
        }
        System.out.println("Ganador:" + administrador.obtenerGanador().getNombre());
        Participante participante  = administrador.buscarParticipante("88888888");
        if(participante!=null) {
            System.out.println("Encontrado:" + participante.getNombre());
            System.out.println("Puntaje:" + participante.calcularPuntaje());
        }else {
            System.out.println("No encontrado");
        }

    }
}
