package com.mycompany.listacircular;

public class NodosSimples {

    private String documento;
    private String nombre;
    private String genero;
    private int nboletas;

    private NodosCirculares siguiente;

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNboletas() {
        return nboletas;
    }

    public void setNboletas(int nboletas) {
        this.nboletas = nboletas;
    }

    public NodosCirculares getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodosCirculares siguiente) {
        this.siguiente = siguiente;
    }
    
}
