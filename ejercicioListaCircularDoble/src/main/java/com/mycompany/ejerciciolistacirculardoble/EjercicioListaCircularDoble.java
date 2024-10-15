package com.mycompany.ejerciciolistacirculardoble;

import javax.swing.JOptionPane;

public class EjercicioListaCircularDoble {
    
    //ELIMINAR POR DATO Y POSICIÓN
    //ACTUALIZAR UN DATO
    //INSERTAR ANTES Y DESPUES DE UNA POSICIÓN
    
    Nodo inicio;

    EjercicioListaCircularDoble() {
        inicio = null;
    }

    public void insertarInicio(String name, int age) {
        Nodo nuevo = new Nodo();

        nuevo.setAnterior(nuevo);
        nuevo.setSgt(nuevo);
        nuevo.setAge(age);
        nuevo.setName(name);
        if (inicio != null) {
            nuevo.setSgt(inicio);
            nuevo.setAnterior(inicio.getAnterior());
            nuevo.getAnterior().setSgt(nuevo);
            inicio.setAnterior(nuevo);
        }
        inicio = nuevo;
    }

    public void insertarFinal(String name, int age) {
        Nodo nuevo = new Nodo();
        nuevo.setName(name);
        nuevo.setAge(age);

        if (inicio == null) {
            nuevo.setAnterior(nuevo);
            nuevo.setSgt(nuevo);
            inicio = nuevo;
        } else {
            Nodo ultimo = inicio.getAnterior();

            nuevo.setSgt(inicio);
            nuevo.setAnterior(ultimo);
            ultimo.setSgt(nuevo);
            inicio.setAnterior(nuevo);
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

        do {
            if (temporal.getAge() >= 18) {
                resultado += "Posición: " + (posicion + 1)
                        + ", Nombre: " + temporal.getName()
                        + ", Edad: " + temporal.getAge() + "\n";
                hayAdultos = true;
            }
            posicion++;
            temporal = temporal.getSgt();
        } while (temporal != inicio);

        if (!hayAdultos) {
            JOptionPane.showMessageDialog(null, "No se encontraron adultos en la lista");
        } else {
            JOptionPane.showMessageDialog(null, resultado);
        }
    }

    public void eliminarMenores() {
        Nodo temporal = inicio;

        do {
            if (temporal.getAge() < 18) {
                if (temporal == inicio) {
                    inicio = temporal.getSgt();
                    if (inicio != null) {
                        inicio.setAnterior(inicio);
                    }
                } else {
                    if (temporal.getAnterior() != null) {
                        temporal.getAnterior().setSgt(temporal.getSgt());
                    }
                    if (temporal.getSgt() != null) {
                        temporal.getSgt().setAnterior(temporal.getAnterior());
                    }
                }
                if (temporal == inicio) {
                    inicio = null;
                }
            }
            temporal = temporal.getSgt();
        } while (temporal != inicio);

        JOptionPane.showMessageDialog(null, "Todos los menores de edad han sido eliminados de la lista.");
    }

    public void imprimir() {
        Nodo temporal = inicio;

        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "No hay nadie en la lista");
        } else {

            do {
                JOptionPane.showMessageDialog(null, "Nombre: " + temporal.getName() + "\n Edad: " + temporal.getAge());
                temporal = temporal.getSgt();
            } while (temporal != inicio);
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
