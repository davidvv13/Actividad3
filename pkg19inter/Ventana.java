/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer.pkg19inter;

/**
 *
 * @author Usuario
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnCalcularPeri = new javax.swing.JButton();
        BtnCalcularAltura = new javax.swing.JButton();
        BtnCalcularArea = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BtnCalcularTodo = new javax.swing.JButton();
        TxtLado = new javax.swing.JTextField();
        BtnBorrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        OutAltura = new javax.swing.JTextField();
        OutPerimetro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        OutArea = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnCalcularPeri.setText("Calcular Perímetro");
        BtnCalcularPeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcularPeriActionPerformed(evt);
            }
        });

        BtnCalcularAltura.setText("Calcular Altura");
        BtnCalcularAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcularAlturaActionPerformed(evt);
            }
        });

        BtnCalcularArea.setText("Calcular Área");
        BtnCalcularArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcularAreaActionPerformed(evt);
            }
        });

        jLabel1.setText("Lado");

        BtnCalcularTodo.setText("Calcular Todo");
        BtnCalcularTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcularTodoActionPerformed(evt);
            }
        });

        BtnBorrar.setText("Borrar");
        BtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarActionPerformed(evt);
            }
        });

        jLabel2.setText("Altura");

        jLabel3.setText("Perímetro");

        jLabel4.setText("Área");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(BtnCalcularPeri)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(BtnCalcularArea, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(BtnBorrar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(32, 32, 32)
                                .addComponent(TxtLado, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(BtnCalcularAltura, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                    .addComponent(BtnCalcularTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(OutAltura, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(OutPerimetro)
                    .addComponent(OutArea))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtLado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(OutAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OutPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(OutArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(BtnCalcularTodo)
                        .addGap(18, 18, 18)
                        .addComponent(BtnCalcularAltura)
                        .addGap(18, 18, 18)
                        .addComponent(BtnCalcularPeri)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnCalcularArea)
                            .addComponent(BtnBorrar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCalcularPeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcularPeriActionPerformed
        OutAltura.setText("");
        OutArea.setText("");
        double lado=Double.parseDouble(TxtLado.getText());
        TrianguloEquilatero triangulo= new TrianguloEquilatero(lado);
        double Perimetro=triangulo.calcularPerimetro();
        OutPerimetro.setText(String.valueOf(Perimetro));
    }//GEN-LAST:event_BtnCalcularPeriActionPerformed

    private void BtnCalcularAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcularAlturaActionPerformed
        OutPerimetro.setText("");
        OutArea.setText("");
        double lado=Double.parseDouble(TxtLado.getText());
        TrianguloEquilatero triangulo= new TrianguloEquilatero(lado);
        double Altura=triangulo.calcularAltura();
        OutAltura.setText(String.valueOf(Altura));
    }//GEN-LAST:event_BtnCalcularAlturaActionPerformed

    private void BtnCalcularAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcularAreaActionPerformed
        OutAltura.setText("");
        OutPerimetro.setText("");
        double lado=Double.parseDouble(TxtLado.getText());
        TrianguloEquilatero triangulo= new TrianguloEquilatero(lado);
        double Area=triangulo.calcularArea();
        OutArea.setText(String.valueOf(Area));
    }//GEN-LAST:event_BtnCalcularAreaActionPerformed

    private void BtnCalcularTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcularTodoActionPerformed
        double lado=Double.parseDouble(TxtLado.getText());
        TrianguloEquilatero triangulo= new TrianguloEquilatero(lado);
        double Altura=triangulo.calcularAltura();
        double Perimetro=triangulo.calcularPerimetro();
        double Area=triangulo.calcularArea();
        OutPerimetro.setText(String.valueOf(Perimetro));
        OutArea.setText(String.valueOf(Area));
        OutAltura.setText(String.valueOf(Altura));
    }//GEN-LAST:event_BtnCalcularTodoActionPerformed

    private void BtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarActionPerformed
        OutAltura.setText("");
        OutPerimetro.setText("");
        OutArea.setText("");
        TxtLado.setText("");
    }//GEN-LAST:event_BtnBorrarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBorrar;
    private javax.swing.JButton BtnCalcularAltura;
    private javax.swing.JButton BtnCalcularArea;
    private javax.swing.JButton BtnCalcularPeri;
    private javax.swing.JButton BtnCalcularPeri1;
    private javax.swing.JButton BtnCalcularTodo;
    private javax.swing.JTextField OutAltura;
    private javax.swing.JTextField OutArea;
    private javax.swing.JTextField OutPerimetro;
    private javax.swing.JTextField TxtLado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
