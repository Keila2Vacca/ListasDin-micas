package com.mycompany.listasimple;

import javax.swing.JOptionPane;

public class Listasimple {
    
    //ordenar la lista alfabéticamente, buscar por todo tipo y validar
    //miercoles 18 de 3 a 4
    
    
    Nodo inicio;

    Listasimple() {
        inicio = null;
    }
    //el nodo que se añade siempre queda de primero
    
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

            boolean indiceEncontrado = false;
            int posicion = 1;
            Nodo anterior = inicio;
            Nodo siguiente = null;

            if (indice <= 0) {
                JOptionPane.showMessageDialog(null, "El indice debe ser mayor a cero");
            } else {
                while (anterior != null) {
                    if (posicion == indice) {
                        siguiente = anterior.getEnlace();
                        break;
                    }
                    anterior = anterior.getEnlace();
                    posicion++;
                }
                if (indiceEncontrado) {
                    anterior.setEnlace(nuevo);
                    nuevo.setEnlace(siguiente);
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el indice");
                }
            }
        }
    }

    //el nodo que se añade elimina al que quedaba en la posición dada
    
    public void eliminarPorPosicion(String nombre, int edad, float promedio, int indice) {
        Nodo nuevo = new Nodo();
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);
        nuevo.setEnlace(null);

        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
            inicio = nuevo;
        } else {

            boolean indiceEncontrado = false;
            int posicion = 1;
            Nodo anterior = inicio;
            Nodo siguiente = null;

            if (indice == 1) {
                inicio = inicio.getEnlace();
                return;
            } else {
                while (anterior != null) {
                    if (posicion+1 == indice) {
                        siguiente = anterior.getEnlace().getEnlace();
                        indiceEncontrado = true;
                        break;
                    }
                    anterior = anterior.getEnlace();
                    posicion++;
                }
                if (indiceEncontrado) {
                    anterior.setEnlace(nuevo);
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el indice");
                }
            }
        }
    }
    //el nodo que se añade queda después de un dato dado
     
    public void insertarPorDato(String nombre, int edad, float promedio) {
        Nodo nuevo = new Nodo();
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);
        nuevo.setEnlace(null);

        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
            inicio = nuevo;
        } else {

            boolean indiceEncontrado = false;
            Nodo anterior = inicio;
            Nodo siguiente = null;

          
                while (anterior != null) {
                    if (posicion == indice) {
                        siguiente = anterior.getEnlace();
                        break;
                    }
                    anterior = anterior.getEnlace();
                    posicion++;
                }
                if (indiceEncontrado) {
                    anterior.setEnlace(nuevo);
                    nuevo.setEnlace(siguiente);
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el indice");
                }
        }
    }
     
     //el nodo que se añade elimina al quetiene el dato dado
     
    public void eliminarPorDato(String nombre, int edad, float promedio, int indice) {
        Nodo nuevo = new Nodo();
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);
        nuevo.setEnlace(null);

        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
            inicio = nuevo;
        } else {

            boolean indiceEncontrado = false;
            int posicion = 1;
            Nodo anterior = inicio;
            Nodo siguiente = null;

            if (indice <= 0) {
                JOptionPane.showMessageDialog(null, "El indice debe ser mayor a cero");
            } else {
                while (anterior != null) {
                    if (posicion == indice) {
                        siguiente = anterior.getEnlace();
                        break;
                    }
                    anterior = anterior.getEnlace();
                    posicion++;
                }
                if (indiceEncontrado) {
                    anterior.setEnlace(nuevo);
                    nuevo.setEnlace(siguiente);
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el indice");
                }
            }
        }
    }
     
    public void consultar() {
        Nodo temporal = inicio;
        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        } else {
            do {
                JOptionPane.showMessageDialog(null,
                        "Nombre: " + temporal.getNombre() + " La edad es: "
                        + temporal.getEdad() + " El promedio es: " + temporal.getPromedio());

                temporal = temporal.getEnlace();

            } while (temporal != null);

        }

    }

}
