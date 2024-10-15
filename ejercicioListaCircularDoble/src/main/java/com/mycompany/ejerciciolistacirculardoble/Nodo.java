
package com.mycompany.ejerciciolistacirculardoble;


public class Nodo {
    private String name;
    private int age;
    private Nodo sgt;
    private Nodo anterior;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Nodo getSgt() {
        return sgt;
    }

    public void setSgt(Nodo sgt) {
        this.sgt = sgt;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
}
