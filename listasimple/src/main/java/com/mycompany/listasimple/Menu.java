package com.mycompany.listasimple;

import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    Listasimple objlista = new Listasimple();

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tittle = new javax.swing.JLabel();
        create = new javax.swing.JButton();
        search = new javax.swing.JButton();
        nameString = new javax.swing.JTextField();
        ageInt = new javax.swing.JTextField();
        averageFloat = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        average = new javax.swing.JLabel();
        intoLast = new javax.swing.JButton();
        addPosition = new javax.swing.JButton();
        addData = new javax.swing.JButton();
        deleteIndice = new javax.swing.JButton();
        deleteData = new javax.swing.JButton();
        orderAlphabetically = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tittle.setText("Lista simple");

        create.setText("Crear lista inicio");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });

        search.setText("Consultar");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        name.setText("Nombre");

        age.setText("Edad");

        average.setText("Promedio");

        intoLast.setText("Insertar al final");
        intoLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intoLastActionPerformed(evt);
            }
        });

        addPosition.setText("Agregar por posición");
        addPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPositionActionPerformed(evt);
            }
        });

        addData.setText("Agregar por Dato");
        addData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDataActionPerformed(evt);
            }
        });

        deleteIndice.setText("Eliminar por posición");
        deleteIndice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteIndiceActionPerformed(evt);
            }
        });

        deleteData.setText("Eliminar por dato");
        deleteData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDataActionPerformed(evt);
            }
        });

        orderAlphabetically.setText("Ordenar alfabéticamente");
        orderAlphabetically.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderAlphabeticallyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name)
                    .addComponent(age)
                    .addComponent(average))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameString, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(ageInt)
                    .addComponent(averageFloat)
                    .addComponent(tittle))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(orderAlphabetically, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(deleteData, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                        .addComponent(deleteIndice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addPosition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(intoLast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(create, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(tittle)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(create)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameString, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name)
                    .addComponent(search))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageInt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age)
                    .addComponent(intoLast))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(averageFloat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(average)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(addPosition)))
                .addGap(18, 18, 18)
                .addComponent(addData)
                .addGap(19, 19, 19)
                .addComponent(deleteIndice)
                .addGap(18, 18, 18)
                .addComponent(deleteData)
                .addGap(18, 18, 18)
                .addComponent(orderAlphabetically)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        objlista.insertarInicio(
                nameString.getText(),
                Integer.parseInt(ageInt.getText()),
                Float.parseFloat(averageFloat.getText()));
    }//GEN-LAST:event_createActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        objlista.consultar();
    }//GEN-LAST:event_searchActionPerformed

    private void intoLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intoLastActionPerformed
        objlista.insertarFinal(
                nameString.getText(),
                Integer.parseInt(ageInt.getText()),
                Float.parseFloat(averageFloat.getText()));
    }//GEN-LAST:event_intoLastActionPerformed

    private void addPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPositionActionPerformed
        objlista.insertarPorPosicion(
                nameString.getText(),
                Integer.parseInt(ageInt.getText()),
                Float.parseFloat(averageFloat.getText()),
                validateIntInput(JOptionPane.showInputDialog("Ingrese el indice:")));
    }//GEN-LAST:event_addPositionActionPerformed

    private void deleteIndiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteIndiceActionPerformed
        objlista.eliminarPorPosicion(
                nameString.getText(),
                Integer.parseInt(ageInt.getText()),
                Float.parseFloat(averageFloat.getText()),
                validateIntInput(JOptionPane.showInputDialog("Ingrese el indice:")));
    }//GEN-LAST:event_deleteIndiceActionPerformed

    private void deleteDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDataActionPerformed

        String[] opciones = {"Nombre", "Edad", "Promedio"};
        String seleccion = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione por qué tipo de dato desea eliminar el nodo: ",
                "Opciones de eliminación: ",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );

        if (seleccion != null) {
            switch (seleccion) {
                case "Nombre":
                    objlista.eliminarPorNombre(
                            nameString.getText(),
                            Integer.parseInt(ageInt.getText()),
                            Float.parseFloat(averageFloat.getText()),
                            JOptionPane.showInputDialog("Ingrese el nombre:"));

                case "Edad":
                    objlista.eliminarPorEdad(
                            nameString.getText(),
                            Integer.parseInt(ageInt.getText()),
                            Float.parseFloat(averageFloat.getText()),
                            validateIntInput(JOptionPane.showInputDialog("Ingrese la edad:")));

                case "Promedio":
                    objlista.eliminarPorPromedio(
                            nameString.getText(),
                            Integer.parseInt(ageInt.getText()),
                            Float.parseFloat(averageFloat.getText()),
                            validateFloatInput(JOptionPane.showInputDialog("Ingrese el promedio:")));

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "No seleccionó ninguna opción");
        }
    }//GEN-LAST:event_deleteDataActionPerformed

    private void addDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDataActionPerformed
  
        String[] opciones = {"Nombre", "Edad", "Promedio"};
        String seleccion = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione por qué tipo de dato desea insertar el nodo: ",
                "Opciones para inserción: ",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );

        if (seleccion != null) {
            switch (seleccion) {
                case "Nombre":
                    objlista.insertarPorNombre(
                            nameString.getText(),
                            Integer.parseInt(ageInt.getText()),
                            Float.parseFloat(averageFloat.getText()),
                            JOptionPane.showInputDialog("Ingrese el nombre:"));

                case "Edad":
                    objlista.insertarPorEdad(
                            nameString.getText(),
                            Integer.parseInt(ageInt.getText()),
                            Float.parseFloat(averageFloat.getText()),
                            validateIntInput(JOptionPane.showInputDialog("Ingrese la edad:")));

                case "Promedio":
                    objlista.insertarPorPromedio(
                            nameString.getText(),
                            Integer.parseInt(ageInt.getText()),
                            Float.parseFloat(averageFloat.getText()),
                            validateFloatInput(JOptionPane.showInputDialog("Ingrese el promedio:")));

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "No seleccionó ninguna opción");
        }
    }//GEN-LAST:event_addDataActionPerformed

    private void orderAlphabeticallyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderAlphabeticallyActionPerformed
        objlista.ordenarPorNombre();
    }//GEN-LAST:event_orderAlphabeticallyActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    public int validateIntInput(String str) {
        while (isNumber(str) == false) {
            str = JOptionPane.showInputDialog("Ingrese un número válido mayor a cero:");
        }
        return Integer.parseInt(str);
    }

    public float validateFloatInput(String str) {
        while (isNumber(str) == false) {
            str = JOptionPane.showInputDialog("Ingrese un número válido (decimal) mayor a cero:");
        }
        return Float.parseFloat(str);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addData;
    private javax.swing.JButton addPosition;
    private javax.swing.JLabel age;
    private javax.swing.JTextField ageInt;
    private javax.swing.JLabel average;
    private javax.swing.JTextField averageFloat;
    private javax.swing.JButton create;
    private javax.swing.JButton deleteData;
    private javax.swing.JButton deleteIndice;
    private javax.swing.JButton intoLast;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameString;
    private javax.swing.JButton orderAlphabetically;
    private javax.swing.JButton search;
    private javax.swing.JLabel tittle;
    // End of variables declaration//GEN-END:variables
}
