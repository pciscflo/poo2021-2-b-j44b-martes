package com.ripley.introduccion;
public class App1 {
    public static void main(String[] args) {
        System.out.println("Hola mundo!");
        Auto auto = new Auto();// Auto es la Clase y auto es el objeto específico que deb tener un estado!
        auto.setNumeroPlaca("APE321");
        auto.setMarca("TOYOTA");
        auto.setModelo("YARIS");
        auto.setPrecio(18000);
        auto.setAñoFabricacion(2020);
        System.out.println("IGV es:" + auto.calcularIGV());
        System.out.println("Precio Final:" + auto.calcularPrecioFinal());

        Auto auto1 = new Auto();
        auto1.setNumeroPlaca("FBV222");
        auto1.setMarca("HYUNDAI");
        auto1.setModelo("ACCENT");
        auto1.setPrecio(20000);
        auto1.setAñoFabricacion(2021);
        System.out.println("IGV es:" + auto1.calcularIGV());



    }
}
