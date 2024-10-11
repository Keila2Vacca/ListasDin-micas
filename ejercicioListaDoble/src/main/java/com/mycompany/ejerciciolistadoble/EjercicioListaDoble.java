package com.mycompany.ejerciciolistadoble;

import javax.swing.JOptionPane;

public class EjercicioListaDoble {
    
    //ELIMINAR POR DATO Y POSICIÓN
    //ACTUALIZAR UN DATO
    //INSERTAR ANTES Y DESPUES DE UNA POSICIÓN

    Nodo inicio;

    EjercicioListaDoble() {
        inicio = null;
    }

    public void insertarFinal(String name, int age) {
        Nodo nuevo = new Nodo();

        nuevo.setName(name);
        nuevo.setAge(age);

        nuevo.setAnterior(null);
        nuevo.setSgt(null);

        if (inicio == null) {
            inicio = nuevo;
        } else {
            Nodo temporal = inicio;
            while (temporal.getSgt() != null) {
                temporal = temporal.getSgt();
            }
            temporal.setSgt(nuevo);
            nuevo.setAnterior(temporal);
            nuevo.setSgt(null);
        }
    }

    public void buscarPocisionAnteriorySiguiente() {
        String input = JOptionPane.showInputDialog("Diga la posición: ");

        int posicionBuscada = validateIntInput(input);
        Nodo temporal = inicio;
        int posicionActual = 0;

        while (temporal != null && (posicionActual + 1) < posicionBuscada) {
            temporal = temporal.getSgt();
            posicionActual++;
        }

        if (temporal != null) {
            if (temporal.getAnterior() != null) {
                Nodo anterior = temporal.getAnterior();
                JOptionPane.showMessageDialog(null, "Antes de la posición " + posicionBuscada + ":\n"
                        + "Nombre: " + anterior.getName() + "\n"
                        + "Edad: " + anterior.getAge());
            } else {
                JOptionPane.showMessageDialog(null, "No hay ningún nodo antes de la posición " + posicionBuscada);
            }

            if (temporal.getSgt() != null) {
                Nodo siguiente = temporal.getSgt();
                JOptionPane.showMessageDialog(null, "Después de la posición " + posicionBuscada + ":\n"
                        + "Nombre: " + siguiente.getName() + "\n"
                        + "Edad: " + siguiente.getAge());
            } else {
                JOptionPane.showMessageDialog(null, "No hay ningún nodo después de la posición " + posicionBuscada);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay ningún nodo en la posición " + posicionBuscada);
        }

    }

    public void consultarAdultos() {
        Nodo temporal = inicio;
        int posicion = 0;
        String resultado = "Adultos encontrados:\n";

        boolean hayAdultos = false;

        while (temporal != null) {
            if (temporal.getAge() >= 18) {
                resultado += "Posición: " + (posicion + 1)
                        + ", Nombre: " + temporal.getName()
                        + ", Edad: " + temporal.getAge() + "\n";
                hayAdultos = true;
            }
            posicion++;
            temporal = temporal.getSgt();
        }

        if (!hayAdultos) {
            JOptionPane.showMessageDialog(null, "No se encontraron adultos en la lista");
        } else {
            JOptionPane.showMessageDialog(null, resultado);
        }
    }

    public void eliminarMenores() {
        Nodo temporal = inicio;

        while (temporal != null) {
            if (temporal.getAge() < 18) {
                if (temporal == inicio) {
                    inicio = temporal.getSgt();
                    if (inicio != null) {
                        inicio.setAnterior(null);
                    }
                } else {
                    if (temporal.getAnterior() != null) {
                        temporal.getAnterior().setSgt(temporal.getSgt());
                    }
                    if (temporal.getSgt() != null) {
                        temporal.getSgt().setAnterior(temporal.getAnterior());
                    }
                }
                Nodo siguiente = temporal.getSgt();
                temporal = siguiente;
            } else {
                temporal = temporal.getSgt();
            }
        }
        JOptionPane.showMessageDialog(null, "Todos los menores de edad han sido eliminados de la lista.");
    }

    public void imprimir() {
        Nodo temporal = inicio;

        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "No hay nadie en la lista");
        } else {
            while (temporal != null) {
                JOptionPane.showMessageDialog(null, "Nombre: " + temporal.getName() + "\n Edad: " + temporal.getAge());
                temporal = temporal.getSgt();
            }
        }
    }

    public int validateIntInput(String str) {
        while (isNumber(str) == false) {
            str = JOptionPane.showInputDialog("Ingrese un número válido mayor a cero:");
        }
        return Integer.parseInt(str);
    }

    public static boolean isNumber(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}
