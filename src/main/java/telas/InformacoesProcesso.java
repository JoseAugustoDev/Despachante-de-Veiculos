package telas;

import conexao.ConexaoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class InformacoesProcesso extends javax.swing.JFrame {

    private int idProcesso;
    private String servico;
    private String veiculo;
    private String marcaVeiculo;
    private String dataVenda;
    private String nomeDonoVeiculo;
    private String docNovoDono;
    private String docAntigoDono;
    private String vistoriaFeita;

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
        
        ConexaoDAO conexao = new ConexaoDAO();
        Connection conn = conexao.conectaBD();

        if (conn != null) {
            try {
                if (servico.equals("Emplacamento")) {
                    String sql = "SELECT * FROM emplacamento WHERE id_processo =?";
                    
                    PreparedStatement pstm = conn.prepareStatement(sql);
                    pstm.setInt(1, idProcesso);
                    
                    ResultSet resultado = pstm.executeQuery();
                    
                    if (resultado.next()) {
                        
                        marcaVeiculo = resultado.getString("marca_veiculo");
                        dataVenda = resultado.getString("data_da_venda");
                        nomeDonoVeiculo = resultado.getString("nome_dono_veiculo");

                        JLabel labelProcesso = new JLabel("ID do Processo: " + idProcesso);
                        JLabel labelServico = new JLabel("Serviço: " + servico);
                        JLabel labelVeiculo = new JLabel("Modelo Veículo: " + veiculo);
                        JLabel labelMarcaVeiculo = new JLabel("Marca Veículo: " + marcaVeiculo);
                        JLabel labelDataVenda = new JLabel("Data da Venda: " + dataVenda);
                        JLabel labelNomeDono = new JLabel("Nome do Dono do Veiculo: " + nomeDonoVeiculo);

                        pstm.close();
                        conn.close();

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
                                .addComponent(labelVeiculo)
                                .addComponent(labelMarcaVeiculo)
                                .addComponent(labelDataVenda)
                                .addComponent(labelNomeDono))
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelMarcaVeiculo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelDataVenda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelNomeDono)
                                .addContainerGap(30, Short.MAX_VALUE))
                        );

                        pack();
                        setLocationRelativeTo(null);
                    }
                    pstm.close();
                    conn.close();
                    
                } else if (servico.equals("Transferencia")) {
                    
                    String sql = "SELECT * FROM transferencia WHERE id_processo=?";
                    
                    PreparedStatement pstm = conn.prepareStatement(sql);
                    pstm.setInt(1, idProcesso);
                    
                    ResultSet resultado = pstm.executeQuery();
                    
                    if (resultado.next()) {
                        
                        docNovoDono = resultado.getString("doc_novo_dono");
                        docAntigoDono = resultado.getString("doc_antigo_dono");
                        boolean vistoria = resultado.getBoolean("vistoria_feita");

                        if (vistoria) {
                            vistoriaFeita = "Sim!";
                        } else {
                            vistoriaFeita = "Não!";
                        }

                        JLabel labelProcesso = new JLabel("ID do Processo: " + idProcesso);
                        JLabel labelServico = new JLabel("Serviço: " + servico);
                        JLabel labelVeiculo = new JLabel("Modelo Veículo: " + veiculo);
                        JLabel labelNovoDono = new JLabel("Documento do novo dono: " + docNovoDono);
                        JLabel labelAntigoDono = new JLabel("Documento do antigo dono: " + docAntigoDono);
                        JLabel labelVistoria = new JLabel("Vistoria Feita: " + vistoriaFeita);

                        pstm.close();
                        conn.close();

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
                                    .addComponent(labelVeiculo)
                                    .addComponent(labelNovoDono)
                                    .addComponent(labelAntigoDono)
                                    .addComponent(labelVistoria))
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelNovoDono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelAntigoDono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelVistoria)
                                .addContainerGap(30, Short.MAX_VALUE))
                        );

                        pack();
                        setLocationRelativeTo(null);
                    }
                }
                    

            } catch (SQLException ex) {
                Logger.getLogger(Processos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private void mostrarInformacoes() {
        
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
