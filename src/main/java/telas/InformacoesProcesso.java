package telas;

import javax.swing.JLabel;

public class InformacoesProcesso extends javax.swing.JFrame {

    private int idProcesso;
    private String servico;
    private String veiculo;

    /**
     * Creates new form InformacoesProcesso
     */
    public InformacoesProcesso(int idProcesso, String servico, String veiculo) {
        this.idProcesso = idProcesso;
        this.servico = servico;
        this.veiculo = veiculo;

        initComponents();
        mostrarInformacoes();
    }

    private InformacoesProcesso() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private void initComponents() {

        JLabel labelProcesso = new JLabel("ID do Processo: " + idProcesso);
        JLabel labelServico = new JLabel("Serviço: " + servico);
        JLabel labelVeiculo = new JLabel("Veículo: " + veiculo);

        // Configuração básica do layout
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelProcesso)
                    .addComponent(labelServico)
                    .addComponent(labelVeiculo))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(labelProcesso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelServico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelVeiculo)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }

    private void mostrarInformacoes() {
        // Você pode usar os valores de idProcesso, servico, e veiculo para buscar mais informações
        // ou simplesmente exibi-los. A lógica adicional depende das suas necessidades.
    }
    
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
            java.util.logging.Logger.getLogger(TransferenciaDeVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransferenciaDeVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransferenciaDeVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransferenciaDeVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacoesProcesso().setVisible(true);
            }
        });
    }
}
