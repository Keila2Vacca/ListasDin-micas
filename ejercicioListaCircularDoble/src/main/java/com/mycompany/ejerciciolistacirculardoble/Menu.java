
package com.mycompany.ejerciciolistacirculardoble;

import javax.swing.JOptionPane;


public class Menu extends javax.swing.JFrame {

  EjercicioListaCircularDoble objLista = new EjercicioListaCircularDoble();
    public Menu() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tittle = new javax.swing.JLabel();
        addLast = new javax.swing.JButton();
        search = new javax.swing.JButton();
        addFirst = new javax.swing.JButton();
        searchpocition = new javax.swing.JButton();
        searchAdult = new javax.swing.JButton();
        RemoveNoAdult = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tittle.setText("Práctica");

        addLast.setText("Agregar al final");
        addLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLastActionPerformed(evt);
            }
        });

        search.setText("Imprimir");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        addFirst.setText("Agregar al principio");
        addFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFirstActionPerformed(evt);
            }
        });

        searchpocition.setText("Buscar posición anterior y siguiente");
        searchpocition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchpocitionActionPerformed(evt);
            }
        });

        searchAdult.setText("Consultar adultos");
        searchAdult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchAdultActionPerformed(evt);
            }
        });

        RemoveNoAdult.setText("Eliminar menores");
        RemoveNoAdult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveNoAdultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(tittle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(addFirst))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(searchpocition)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(search)
                    .addComponent(addLast))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchAdult, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RemoveNoAdult, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tittle)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addLast)
                    .addComponent(searchAdult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search)
                    .addComponent(RemoveNoAdult))
                .addGap(25, 25, 25)
                .addComponent(addFirst)
                .addGap(16, 16, 16)
                .addComponent(searchpocition)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLastActionPerformed
        objLista.insertarFinal(JOptionPane.showInputDialog("Diga el nombre: "),
                validateIntInput(JOptionPane.showInputDialog("Diga la edad: ")));
    }//GEN-LAST:event_addLastActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        objLista.imprimir();
    }//GEN-LAST:event_searchActionPerformed

    private void addFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFirstActionPerformed
        objLista.insertarInicio(JOptionPane.showInputDialog("Diga el nombre: "),
                validateIntInput(JOptionPane.showInputDialog("Diga la edad: ")));
    }//GEN-LAST:event_addFirstActionPerformed

    private void searchpocitionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchpocitionActionPerformed
       objLista.buscarPocisionAnteriorySiguiente();
    }//GEN-LAST:event_searchpocitionActionPerformed

    private void searchAdultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchAdultActionPerformed
       objLista.consultarAdultos();
    }//GEN-LAST:event_searchAdultActionPerformed

    private void RemoveNoAdultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveNoAdultActionPerformed
        objLista.eliminarMenores();
    }//GEN-LAST:event_RemoveNoAdultActionPerformed

  
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
    private javax.swing.JButton RemoveNoAdult;
    private javax.swing.JButton addFirst;
    private javax.swing.JButton addLast;
    private javax.swing.JButton search;
    private javax.swing.JButton searchAdult;
    private javax.swing.JButton searchpocition;
    private javax.swing.JLabel tittle;
    // End of variables declaration//GEN-END:variables
}
