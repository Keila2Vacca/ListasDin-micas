
package com.mycompany.ejerciciolistadoble;

import javax.swing.JOptionPane;


public class Menu extends javax.swing.JFrame {
    
    EjercicioListaDoble objLista = new EjercicioListaDoble();
    
    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tittle = new javax.swing.JLabel();
        AddLast = new javax.swing.JButton();
        SearchPosition = new javax.swing.JButton();
        SearchAdultAndPosition = new javax.swing.JButton();
        DeleteUnderAge = new javax.swing.JButton();
        SearchList = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tittle.setText("Práctica");

        AddLast.setText("Agregar de último");
        AddLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddLastActionPerformed(evt);
            }
        });

        SearchPosition.setText("Consultar quién está antes y después");
        SearchPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchPositionActionPerformed(evt);
            }
        });

        SearchAdultAndPosition.setText("Buscar adultos y su posición");
        SearchAdultAndPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchAdultAndPositionActionPerformed(evt);
            }
        });

        DeleteUnderAge.setText("Eliminar menores de edad");
        DeleteUnderAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteUnderAgeActionPerformed(evt);
            }
        });

        SearchList.setText("Imprimir");
        SearchList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(tittle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(AddLast))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(SearchPosition))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DeleteUnderAge)
                            .addComponent(SearchAdultAndPosition)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(SearchList)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tittle)
                .addGap(21, 21, 21)
                .addComponent(AddLast)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SearchPosition)
                .addGap(18, 18, 18)
                .addComponent(SearchAdultAndPosition)
                .addGap(18, 18, 18)
                .addComponent(DeleteUnderAge)
                .addGap(18, 18, 18)
                .addComponent(SearchList)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchListActionPerformed
        objLista.imprimir();
    }//GEN-LAST:event_SearchListActionPerformed

    private void AddLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddLastActionPerformed
        objLista.insertarFinal(JOptionPane.showInputDialog("Diga el mombre: "),
                validateIntInput(JOptionPane.showInputDialog("Diga la edad: ")));
    }//GEN-LAST:event_AddLastActionPerformed

    private void SearchAdultAndPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchAdultAndPositionActionPerformed
        objLista.consultarAdultos(); 
    }//GEN-LAST:event_SearchAdultAndPositionActionPerformed

    private void SearchPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchPositionActionPerformed
        objLista.buscarPocisionAnteriorySiguiente();
        
    }//GEN-LAST:event_SearchPositionActionPerformed

    private void DeleteUnderAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteUnderAgeActionPerformed
        objLista.eliminarMenores();
    }//GEN-LAST:event_DeleteUnderAgeActionPerformed

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
    private javax.swing.JButton AddLast;
    private javax.swing.JButton DeleteUnderAge;
    private javax.swing.JButton SearchAdultAndPosition;
    private javax.swing.JButton SearchList;
    private javax.swing.JButton SearchPosition;
    private javax.swing.JLabel tittle;
    // End of variables declaration//GEN-END:variables
}
