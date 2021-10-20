package com.upc.objetos;

public class Cliente {
    private String tipoCliente;
    private String codigo;

    public Cliente(String tipoCliente, String codigo) {
        this.tipoCliente = tipoCliente;
        this.codigo = codigo;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
