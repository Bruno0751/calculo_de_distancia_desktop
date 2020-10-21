package pack;

import javax.swing.JOptionPane;

/**
 * @author Bruno Gressler da Silveira
 * @version 3
 * @since 21/10/20
 */
public class Principal extends javax.swing.JFrame {

    Controle objControle = new Controle();
    Pessoa objPessoa = new Pessoa();
    
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane = new javax.swing.JLayeredPane();
        jLabelDigiteX1 = new javax.swing.JLabel();
        jTextFieldX1 = new javax.swing.JTextField();
        jLabelY1 = new javax.swing.JLabel();
        jTextFieldX2 = new javax.swing.JTextField();
        jLabelX2 = new javax.swing.JLabel();
        jLabelY2 = new javax.swing.JLabel();
        jTextFieldY1 = new javax.swing.JTextField();
        jTextFieldY2 = new javax.swing.JTextField();
        jLayeredPaneAcoes = new javax.swing.JLayeredPane();
        jButtonCalcular = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calculo de Distancia\n");

        jLayeredPane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 102, 255), new java.awt.Color(51, 102, 255), new java.awt.Color(51, 102, 255), new java.awt.Color(51, 102, 255)));

        jLabelDigiteX1.setText("Digite X1:");

        jLabelY1.setText("Digite y1:");

        jLabelX2.setText("Digite x2:");

        jLabelY2.setText("Digite y2:");

        jLayeredPane.setLayer(jLabelDigiteX1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane.setLayer(jTextFieldX1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane.setLayer(jLabelY1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane.setLayer(jTextFieldX2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane.setLayer(jLabelX2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane.setLayer(jLabelY2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane.setLayer(jTextFieldY1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane.setLayer(jTextFieldY2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPaneLayout = new javax.swing.GroupLayout(jLayeredPane);
        jLayeredPane.setLayout(jLayeredPaneLayout);
        jLayeredPaneLayout.setHorizontalGroup(
            jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPaneLayout.createSequentialGroup()
                        .addComponent(jLabelDigiteX1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldX1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPaneLayout.createSequentialGroup()
                        .addComponent(jLabelY1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldX2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64)
                .addGroup(jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jLayeredPaneLayout.createSequentialGroup()
                        .addComponent(jLabelX2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldY1))
                    .addGroup(jLayeredPaneLayout.createSequentialGroup()
                        .addComponent(jLabelY2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldY2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jLayeredPaneLayout.setVerticalGroup(
            jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPaneLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDigiteX1)
                    .addComponent(jTextFieldX1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelX2)
                    .addComponent(jTextFieldY1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelY1)
                        .addComponent(jLabelY2)
                        .addComponent(jTextFieldX2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldY2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jLayeredPaneAcoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 102, 255), new java.awt.Color(51, 102, 255), new java.awt.Color(51, 102, 255), new java.awt.Color(51, 102, 255)));

        jButtonCalcular.setBackground(new java.awt.Color(0, 255, 0));
        jButtonCalcular.setText("Calcular");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        jButtonSair.setBackground(new java.awt.Color(255, 0, 0));
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonLimpar.setBackground(new java.awt.Color(255, 255, 0));
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jLayeredPaneAcoes.setLayer(jButtonCalcular, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPaneAcoes.setLayer(jButtonSair, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPaneAcoes.setLayer(jButtonLimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPaneAcoesLayout = new javax.swing.GroupLayout(jLayeredPaneAcoes);
        jLayeredPaneAcoes.setLayout(jLayeredPaneAcoesLayout);
        jLayeredPaneAcoesLayout.setHorizontalGroup(
            jLayeredPaneAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPaneAcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jLayeredPaneAcoesLayout.setVerticalGroup(
            jLayeredPaneAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPaneAcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPaneAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(jButtonSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane)
                    .addComponent(jLayeredPaneAcoes))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLayeredPaneAcoes)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        
        objControle.limpar(jButtonLimpar, jTextFieldX1 , jTextFieldX2, jTextFieldY1, jTextFieldY2);
        
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
        
        objControle.calcularDistancias(Double.parseDouble(jTextFieldX1.getText()),
                Double.parseDouble(jTextFieldX2.getText()),
                Double.parseDouble(jTextFieldY1.getText()),
                Double.parseDouble(jTextFieldY2.getText()));
        
        JOptionPane.showMessageDialog(null, objControle.toString(), "CALCULO", JOptionPane.INFORMATION_MESSAGE);
                
    }//GEN-LAST:event_jButtonCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabelDigiteX1;
    private javax.swing.JLabel jLabelX2;
    private javax.swing.JLabel jLabelY1;
    private javax.swing.JLabel jLabelY2;
    private javax.swing.JLayeredPane jLayeredPane;
    private javax.swing.JLayeredPane jLayeredPaneAcoes;
    private javax.swing.JTextField jTextFieldX1;
    private javax.swing.JTextField jTextFieldX2;
    private javax.swing.JTextField jTextFieldY1;
    private javax.swing.JTextField jTextFieldY2;
    // End of variables declaration//GEN-END:variables
}
