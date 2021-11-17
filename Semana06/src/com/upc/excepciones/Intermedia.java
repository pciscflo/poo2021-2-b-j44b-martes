package com.upc.excepciones;

public class Intermedia {
    public void leerArchivo(String path) throws Exception {
        DataFile.leerFile(path);//caso especial de llamar a u método estático, no necesito crear el objeto Datafile
    }
}
