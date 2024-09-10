package com.mycompany.listasimple;

import javax.swing.JOptionPane;

public class Listasimple {

    //el nodo que se añade siempre queda de primero
     Nodo inicio;

    Listasimple() {
        inicio = null;
    }

    public void insertarInicio(String nombre, int edad, float promedio) {
        Nodo nuevo = new Nodo();
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);
        nuevo.setEnlace(null);
        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
            inicio = nuevo;
        } else {
            nuevo.setEnlace(inicio);
            inicio = nuevo;
        }
    }
    
    //el nodo que se añade siempre queda al final

    public void insertarFinal(String nombre, int edad, float promedio) {
        Nodo nuevo = new Nodo();
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);
        nuevo.setEnlace(null);
        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
            inicio = nuevo;
        } else {
            Nodo temporal = inicio;
            while (temporal.getEnlace() != null) {
                temporal = temporal.getEnlace();

            }
            temporal.setEnlace(nuevo);
        }
    }

    
    
    //el nodo que se añade queda en la posición dada
    
    public void insertarPorPosicion(String nombre, int edad, float promedio, int indice) {
        Nodo nuevo = new Nodo();
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);
        nuevo.setEnlace(null);
        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
            inicio = nuevo;
        } else {
           int posicion = 1;
           Nodo temporal = inicio;
           Nodo siguiente = null;
           
           while(temporal.getEnlace() != null){
               if (posicion == indice) {
                   siguiente = temporal.getEnlace();
                   break;
               }else{
                   temporal = temporal.getEnlace();
                   posicion++;
               }
               temporal.setEnlace(nuevo);
               nuevo.setEnlace(siguiente);
           }
        }
    }
    
    //el nodo que se añade queda después de una edad dada
    
    public void consultar() {
        Nodo temporal = inicio;
        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        } else {
            do {
                JOptionPane.showMessageDialog(null,
                        "Nombre:  " + temporal.getNombre() + " LA EDAD ES :"
                        + temporal.getEdad() + " EL PORMEDIO ES " + temporal.getPromedio());

                temporal = temporal.getEnlace();

            } while (temporal != null);

        }

    }

}
