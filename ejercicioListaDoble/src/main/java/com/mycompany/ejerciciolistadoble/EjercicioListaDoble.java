package com.mycompany.ejerciciolistadoble;

import javax.swing.JOptionPane;

public class EjercicioListaDoble {

    Nodo inicio;

    EjercicioListaDoble() {
        inicio = null;
    }

    public void insertarInicio(String name, int age) {
        Nodo nuevo = new Nodo();

        nuevo.setAnterior(null);
        nuevo.setSgt(null);
        nuevo.setAge(age);
        nuevo.setName(name);
        if (inicio != null) {
            nuevo.setSgt(inicio);
            inicio.setAnterior(nuevo);
        }
        inicio = nuevo;
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

    public void eliminarPorPosicion() {
        String input = JOptionPane.showInputDialog("Diga la posición del nodo a eliminar: ");
        int posicionBuscada = validateIntInput(input);

        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "No hay nadie en la lista");
            return;
        }

        if (posicionBuscada == 1) {
            Nodo temporal = inicio;
            inicio = inicio.getSgt();
            if (inicio != null) {
                inicio.setAnterior(null);
            }
            temporal = null;
            JOptionPane.showMessageDialog(null, "Nodo eliminado con éxito");
        } else {
            Nodo temporal = inicio;
            int posicionActual = 1;

            while (temporal != null && posicionActual < posicionBuscada - 1) {
                temporal = temporal.getSgt();
                posicionActual++;
            }

            if (temporal != null && temporal.getSgt() != null) {
                Nodo nodoAEliminar = temporal.getSgt();
                temporal.setSgt(nodoAEliminar.getSgt());
                if (nodoAEliminar.getSgt() != null) {
                    nodoAEliminar.getSgt().setAnterior(temporal);
                }
                nodoAEliminar = null;
                JOptionPane.showMessageDialog(null, "Nodo eliminado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "No hay ningún nodo en la posición " + posicionBuscada);
            }
        }
    }

    public void insertarAntesDePosicion() {
        String input = JOptionPane.showInputDialog("Diga la posición: ");
        int posicionBuscada = validateIntInput(input);

        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "No hay nadie en la lista");
            return;
        }

        String nombre = JOptionPane.showInputDialog("Diga el nombre: ");
        int edad = validateIntInput(JOptionPane.showInputDialog("Diga la edad: "));

        if (posicionBuscada == 1) {
            insertarInicio(nombre, edad);
        } else {
            Nodo temporal = inicio;
            int posicionActual = 1;

            while (temporal != null && posicionActual < posicionBuscada - 1) {
                temporal = temporal.getSgt();
                posicionActual++;
            }

            if (temporal != null) {
                Nodo nuevo = new Nodo();
                nuevo.setName(nombre);
                nuevo.setAge(edad);

                nuevo.setSgt(temporal.getSgt());
                nuevo.setAnterior(temporal);
                temporal.setSgt(nuevo);
                nuevo.getSgt().setAnterior(nuevo);

                if (temporal == inicio) {
                    inicio = nuevo;
                }

                JOptionPane.showMessageDialog(null, "Nodo insertado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "No hay ningún nodo en la posición " + posicionBuscada);
            }
        }
    }

    public void insertarDespuesDePosicion() {
        String input = JOptionPane.showInputDialog("Diga la posición: ");
        int posicionBuscada = validateIntInput(input);

        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "No hay nadie en la lista");
            return;
        }

        String nombre = JOptionPane.showInputDialog("Diga el nombre: ");
        int edad = validateIntInput(JOptionPane.showInputDialog("Diga la edad: "));

        if (posicionBuscada == 1) {
            Nodo nuevo = new Nodo();
            nuevo.setName(nombre);
            nuevo.setAge(edad);

            nuevo.setSgt(inicio.getSgt());
            nuevo.setAnterior(inicio);
            inicio.setSgt(nuevo);
            nuevo.getSgt().setAnterior(nuevo);

            if (inicio.getSgt() == inicio) {
                inicio.setSgt(nuevo);
                nuevo.setAnterior(inicio);
            }

            JOptionPane.showMessageDialog(null, "Nodo insertado con éxito");
        } else {
            Nodo temporal = inicio;
            int posicionActual = 1;

            while (temporal != null && posicionActual < posicionBuscada) {
                temporal = temporal.getSgt();
                posicionActual++;
            }

            if (temporal != null) {
                Nodo nuevo = new Nodo();
                nuevo.setName(nombre);
                nuevo.setAge(edad);

                nuevo.setSgt(temporal.getSgt());
                nuevo.setAnterior(temporal);
                temporal.setSgt(nuevo);
                nuevo.getSgt().setAnterior(nuevo);

                JOptionPane.showMessageDialog(null, "Nodo insertado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "No hay ningún nodo en la posición " + posicionBuscada);
            }
        }
    }

    public void actualizarNombre() {
        String input = JOptionPane.showInputDialog("Diga la posición del nodo a actualizar el nombre: ");
        int posicionBuscada = validateIntInput(input);

        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "No hay nadie en la lista");
            return;
        }

        Nodo temporal = inicio;
        int posicionActual = 1;

        while (temporal != null && posicionActual < posicionBuscada) {
            temporal = temporal.getSgt();
            posicionActual++;
        }

        if (temporal != null) {
            String nuevoNombre = JOptionPane.showInputDialog("Diga el nuevo nombre: ");
            temporal.setName(nuevoNombre);
            JOptionPane.showMessageDialog(null, "Nombre actualizado con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "No hay ningún nodo en la posición " + posicionBuscada);
        }
    }

    public void actualizarEdad() {
        String input = JOptionPane.showInputDialog("Diga la posición del nodo a actualizar la edad: ");
        int posicionBuscada = validateIntInput(input);

        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "No hay nadie en la lista");
            return;
        }

        Nodo temporal = inicio;
        int posicionActual = 1;

        while (temporal != null && posicionActual < posicionBuscada) {
            temporal = temporal.getSgt();
            posicionActual++;
        }

        if (temporal != null) {
            int nuevaEdad = validateIntInput(JOptionPane.showInputDialog("Diga la nueva edad: "));
            temporal.setAge(nuevaEdad);
            JOptionPane.showMessageDialog(null, "Edad actualizada con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "No hay ningún nodo en la posición " + posicionBuscada);
        }
    }

    public void eliminarPorNombre() {
        String nombre = JOptionPane.showInputDialog("Diga el nombre del nodo a eliminar: ");

        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "No hay nadie en la lista");
            return;
        }

        Nodo temporal = inicio;

        while (temporal != null) {
            if (temporal.getName().equalsIgnoreCase(nombre)) {
                if (temporal == inicio) {
                    inicio = temporal.getSgt();
                    if (inicio != null) {
                        inicio.setAnterior(null);
                    }
                } else {
                    temporal.getAnterior().setSgt(temporal.getSgt());
                    if (temporal.getSgt() != null) {
                        temporal.getSgt().setAnterior(temporal.getAnterior());
                    }
                }
                temporal = null;
                JOptionPane.showMessageDialog(null, "Nodo eliminado con éxito");
                return;
            }
            temporal = temporal.getSgt();
        }

        JOptionPane.showMessageDialog(null, "No hay ningún nodo con el nombre " + nombre);
    }

    public void eliminarPorEdad() {
        int edad = validateIntInput(JOptionPane.showInputDialog("Diga la edad del nodo a eliminar: "));

        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "No hay nadie en la lista");
            return;
        }

        Nodo temporal = inicio;

        while (temporal != null) {
            if (temporal.getAge() == edad) {
                if (temporal == inicio) {
                    inicio = temporal.getSgt();
                    if (inicio != null) {
                        inicio.setAnterior(null);
                    }
                } else {
                    temporal.getAnterior().setSgt(temporal.getSgt());
                    if (temporal.getSgt() != null) {
                        temporal.getSgt().setAnterior(temporal.getAnterior());
                    }
                }
                temporal = null;
                JOptionPane.showMessageDialog(null, "Nodo eliminado con éxito");
                return;
            }
            temporal = temporal.getSgt();
        }

        JOptionPane.showMessageDialog(null, "No hay ningún nodo con la edad " + edad);
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
