package com.mycompany.listasimple;

import java.util.Random;
import javax.swing.JOptionPane;

public class Listasimple {

    /*
    botón de busqueda por datos
    crear un codigo que genere n nombres de forma aleatoria
    código uni virtual "proyecto para optimizar lista simple"
     */
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
            if (indice == 1) {
                inicio = nuevo;
            } else {
                JOptionPane.showMessageDialog(null, "La lista esta vacia");
            }
        } else {
            int posicion = 1;
            Nodo anterior = inicio;
            Nodo siguiente = null;

            if (indice == 1) {
                nuevo.setEnlace(inicio);
                inicio = nuevo;
            } else {
                while (anterior != null) {
                    if (posicion == indice - 1) {
                        siguiente = anterior.getEnlace();
                        anterior.setEnlace(nuevo);
                        nuevo.setEnlace(siguiente);
                        break;
                    }
                    anterior = anterior.getEnlace();
                    posicion++;
                }
                if (posicion < indice) {
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
                    if (posicion + 1 == indice) {
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

    //el nodo que se añade queda después de un nombre, edad y promedio dado
    public void insertarPorNombre(String nombre, int edad, float promedio, String referencia) {
        Nodo nuevo = new Nodo();
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);
        nuevo.setEnlace(null);

        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
            inicio = nuevo;
        } else {

            boolean nombreEncontrado = false;
            Nodo anterior = inicio;
            Nodo siguiente = null;
            while (anterior != null) {
                if (anterior.getNombre().equals(referencia)) {
                    siguiente = anterior.getEnlace();
                    nombreEncontrado = true;
                    break;
                }
                anterior = anterior.getEnlace();
            }

            if (nombreEncontrado) {
                anterior.setEnlace(nuevo);
                nuevo.setEnlace(siguiente);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el nombre ingresado.");
            }
        }
    }

    public void insertarPorPromedio(String nombre, int edad, float promedio, float referencia) {
        Nodo nuevo = new Nodo();
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);
        nuevo.setEnlace(null);

        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
            inicio = nuevo;
        } else {

            boolean promedioEncontrado = false;
            Nodo anterior = inicio;
            Nodo siguiente = null;
            while (anterior != null) {
                if (anterior.getPromedio() == referencia) {
                    siguiente = anterior.getEnlace();
                    promedioEncontrado = true;
                    break;
                }
                anterior = anterior.getEnlace();
            }

            if (promedioEncontrado) {
                anterior.setEnlace(nuevo);
                nuevo.setEnlace(siguiente);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el promedio ingresado.");
            }
        }
    }

    public void insertarPorEdad(String nombre, int edad, float promedio, int referencia) {
        Nodo nuevo = new Nodo();
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);
        nuevo.setEnlace(null);

        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
            inicio = nuevo;
        } else {

            boolean edadEncontrada = false;
            Nodo anterior = inicio;
            Nodo siguiente = null;
            while (anterior != null) {
                if (anterior.getEdad() == referencia) {
                    siguiente = anterior.getEnlace();
                    edadEncontrada = true;
                    break;
                }
                anterior = anterior.getEnlace();
            }

            if (edadEncontrada) {
                anterior.setEnlace(nuevo);
                nuevo.setEnlace(siguiente);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la edad ingresada.");
            }

        }
    }

    //el nodo que se añade elimina al quetiene el nombre, edad y promedio  dado
    public void eliminarPorNombre(String nombre, int edad, float promedio, String referencia) {
        Nodo nuevo = new Nodo();
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);
        nuevo.setEnlace(null);

        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
            inicio = nuevo;
        } else {

            Nodo anterior = null;
            Nodo actual = inicio;

            if (actual.getNombre().equals(nombre)) {
                inicio = actual.getEnlace();
                JOptionPane.showMessageDialog(null, "Nodo con nombre " + nombre + " eliminado.");
                return;
            }

            while (actual != null) {
                if (actual.getNombre().equals(nombre)) {
                    if (anterior != null) {
                        anterior.setEnlace(actual.getEnlace());
                    }
                    JOptionPane.showMessageDialog(null, "Nodo con nombre " + nombre + " eliminado.");
                    return;
                }
                anterior = actual;
                actual = actual.getEnlace();
            }

            JOptionPane.showMessageDialog(null, "No se encontró un nodo con el nombre especificado.");

        }
    }

    public void eliminarPorEdad(String nombre, int edad, float promedio, int referencia) {
        Nodo nuevo = new Nodo();
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);
        nuevo.setEnlace(null);

        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
            inicio = nuevo;
        } else {

            Nodo anterior = null;
            Nodo actual = inicio;

            if (actual.getEdad() == edad) {
                inicio = actual.getEnlace();
                JOptionPane.showMessageDialog(null, "Nodo con edad " + edad + " eliminado.");
                return;
            }

            while (actual != null) {
                if (actual.getEdad() == edad) {
                    if (anterior != null) {
                        anterior.setEnlace(actual.getEnlace());
                    }
                    JOptionPane.showMessageDialog(null, "Nodo con edad " + edad + " eliminado.");
                    return;
                }
                anterior = actual;
                actual = actual.getEnlace();
            }

            JOptionPane.showMessageDialog(null, "No se encontró un nodo con la edad especificada.");
        }

    }

    public void eliminarPorPromedio(String nombre, int edad, float promedio, float referencia) {
        Nodo nuevo = new Nodo();
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);
        nuevo.setEnlace(null);

        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
            inicio = nuevo;
        } else {

            Nodo anterior = null;
            Nodo actual = inicio;

            if (actual.getPromedio() == promedio) {
                inicio = actual.getEnlace();
                JOptionPane.showMessageDialog(null, "Nodo con promedio " + promedio + " eliminado.");
                return;
            }

            while (actual != null) {
                if (actual.getPromedio() == promedio) {
                    if (anterior != null) {
                        anterior.setEnlace(actual.getEnlace());
                    }
                    JOptionPane.showMessageDialog(null, "Nodo con promedio " + promedio + " eliminado.");
                    return;
                }
                anterior = actual;
                actual = actual.getEnlace();
            }

            JOptionPane.showMessageDialog(null, "No se encontró un nodo con el promedio especificado.");

        }
    }

    //ordena la lista alfabéticamente
    
    /*
    
    public void ordenarPorNombre() {

        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
            return;
        }
        boolean huboIntercambio;

        do {
            Nodo actual = inicio;
            Nodo siguiente = inicio.getEnlace();
            Nodo anterior = null;
            huboIntercambio = false;

            while (siguiente != null) {
                if (actual.getNombre().compareToIgnoreCase(siguiente.getNombre()) > 0) {
                    huboIntercambio = true;

                    if (anterior == null) {
                        inicio = siguiente;
                    } else {
                        anterior.setEnlace(siguiente);
                    }
                    actual.setEnlace(siguiente.getEnlace());
                    siguiente.setEnlace(actual);

                    anterior = siguiente;
                    siguiente = actual.getEnlace();
                } else {
                    anterior = actual;
                    actual = siguiente;
                    siguiente = siguiente.getEnlace();
                }
            }
        } while (huboIntercambio);

        JOptionPane.showMessageDialog(null, "La lista ha sido ordenada alfabéticamente por nombre.");
    }

    */
  
    

    //consulta la lista
    
    public void consultar() {
        Nodo temporal = inicio;
        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        } else {
            do {
                JOptionPane.showMessageDialog(null,
                        "Nombre: " + temporal.getNombre() +
                        " La edad es: " + temporal.getEdad() +
                        " El promedio es: " + temporal.getPromedio());
                temporal = temporal.getEnlace();

            } while (temporal != null);
        }
    }
}
