package relaciones;

public class Factoria {
    public static Atacante obtenerObjeto(String... argumentos){
        switch (argumentos[0]){
            case "TA":
                return new Tanque(argumentos[1], argumentos[2], argumentos[3]);
            case "SO":
                return new Soldado(argumentos[1], Integer.parseInt(argumentos[2]));
            default: return null;
        }
    }
}
