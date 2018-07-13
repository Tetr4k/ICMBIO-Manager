package br.arraial.ICMBIO.telas.cadastros;

import br.arraial.ICMBIO.DAO.EmbarcacaoDAO;
import br.arraial.ICMBIO.DAO.SolicitacaoDAO;
import br.arraial.ICMBIO.DAO.SolicitanteDAO;

/**
 *
 * @author Aluno
 */
public class TelaCadSolicitacao extends javax.swing.JInternalFrame {

    private String codigo = null;
    private String codAtr = "numero_processo";

    public TelaCadSolicitacao() {
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

        TelaSolicitacao = new javax.swing.JTabbedPane();
        pnConsulta = new javax.swing.JPanel();
        txtPesquisa = new javax.swing.JTextField();
        cbAtributo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSolicitacao = new javax.swing.JTable();
        lblPesquisa = new javax.swing.JLabel();
        pnCadastro = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNumeroProc = new javax.swing.JTextField();
        txtSequencia = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMotivo = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNomeSolicitante = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbSolicitante = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbEmbarcacao = new javax.swing.JTable();
        lblNome2 = new javax.swing.JLabel();
        txtNomeEmbarcacao = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btSalvar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro de Solicitação");

        TelaSolicitacao.setBackground(new java.awt.Color(255, 255, 255));
        TelaSolicitacao.setOpaque(true);

        pnConsulta.setBackground(java.awt.Color.white);

        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });

        cbAtributo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Numero do Processo", "Codigo", "Solicitante", "Embarcação" }));
        cbAtributo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAtributoItemStateChanged(evt);
            }
        });

        tbSolicitacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Numero Processo", "Status", "Solicitante", "Embarcação"
            }
        ));
        tbSolicitacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSolicitacaoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbSolicitacao);

        lblPesquisa.setBackground(java.awt.Color.white);
        lblPesquisa.setText("Digite o numero do processo:");

        javax.swing.GroupLayout pnConsultaLayout = new javax.swing.GroupLayout(pnConsulta);
        pnConsulta.setLayout(pnConsultaLayout);
        pnConsultaLayout.setHorizontalGroup(
            pnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
                    .addGroup(pnConsultaLayout.createSequentialGroup()
                        .addComponent(cbAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnConsultaLayout.setVerticalGroup(
            pnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPesquisa)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                .addContainerGap())
        );

        TelaSolicitacao.addTab("Consulta", pnConsulta);

        pnCadastro.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Numero do processo:");

        jLabel2.setText("Sequencia:");

        jLabel3.setText("Status");

        jLabel4.setText("Motivo:");

        txtMotivo.setColumns(20);
        txtMotivo.setRows(5);
        jScrollPane2.setViewportView(txtMotivo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSequencia)
                    .addComponent(txtNumeroProc)
                    .addComponent(txtStatus)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumeroProc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSequencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Solicitantes"));

        lblNome.setText("Digite o nome:");

        txtNomeSolicitante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeSolicitanteKeyReleased(evt);
            }
        });

        tbSolicitante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF/CNPJ", "Endereço"
            }
        ));
        jScrollPane3.setViewportView(tbSolicitante);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomeSolicitante)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNomeSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Embarcação"));

        tbEmbarcacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF/CNPJ", "Endereço"
            }
        ));
        jScrollPane4.setViewportView(tbEmbarcacao);

        lblNome2.setText("Digite o Nome");

        txtNomeEmbarcacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeEmbarcacaoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblNome2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeEmbarcacao))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome2)
                    .addComponent(txtNomeEmbarcacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        btSalvar.setBackground(new java.awt.Color(255, 255, 255));
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btExcluir.setBackground(new java.awt.Color(255, 255, 255));
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btLimpar.setBackground(new java.awt.Color(255, 255, 255));
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btLimpar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btExcluir)
                    .addComponent(btLimpar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnCadastroLayout = new javax.swing.GroupLayout(pnCadastro);
        pnCadastro.setLayout(pnCadastroLayout);
        pnCadastroLayout.setHorizontalGroup(
            pnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnCadastroLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCadastroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnCadastroLayout.setVerticalGroup(
            pnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TelaSolicitacao.addTab("Cadastro", pnCadastro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaSolicitacao)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TelaSolicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeSolicitanteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeSolicitanteKeyReleased
        SolicitanteDAO.Consultar(txtNomeSolicitante.getText(), tbSolicitante, "nome");
    }//GEN-LAST:event_txtNomeSolicitanteKeyReleased

    private void txtNomeEmbarcacaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeEmbarcacaoKeyReleased
        EmbarcacaoDAO.Consultar(txtNomeEmbarcacao.getText(), tbEmbarcacao, "nome_embarcacao");
    }//GEN-LAST:event_txtNomeEmbarcacaoKeyReleased

    private void cbAtributoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAtributoItemStateChanged
        switch (cbAtributo.getItemAt(cbAtributo.getSelectedIndex()).toString()) {
            case "Numero do Processo":
                lblPesquisa.setText("Digite o nome:");
                codAtr = "numero_processo";
                break;
            case "Codigo":
                lblPesquisa.setText("Digite o Codigo da solicitação:");
                codAtr = "codigo_solicitacao";
                break;
            case "Solicitante":
                lblPesquisa.setText("Digite o nome do solicitante:");
                codAtr = "codigo_solicitante";
                break;
            case "Embarcação":
                lblPesquisa.setText("Digite o nome da embarcação");
                codAtr = "codigo_embarcacao";
                break;
        }
    }//GEN-LAST:event_cbAtributoItemStateChanged

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        SolicitacaoDAO.Consultar(txtPesquisa.getText(), tbSolicitacao, codAtr);
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void tbSolicitacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSolicitacaoMouseClicked
        txtPesquisa.setText("");
        TelaSolicitacao.setSelectedIndex(1);
        this.codigo = tbSolicitacao.getValueAt(tbSolicitacao.getSelectedRow(), 0).toString();
        SolicitacaoDAO.PegarDados(codigo, txtNumeroProc, txtSequencia, txtStatus, txtMotivo);
        txtPesquisa.setText("");
    }//GEN-LAST:event_tbSolicitacaoMouseClicked

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        txtMotivo.setText("");
        txtNumeroProc.setText("");
        txtStatus.setText("");
        txtSequencia.setText("");
        txtNomeEmbarcacao.setText("");
        tbEmbarcacao.clearSelection();
        txtNomeSolicitante.setText("");
        tbSolicitante.clearSelection();
        this.codigo = null;
    }//GEN-LAST:event_btLimparActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        SolicitacaoDAO.Excluir(codigo);
        txtMotivo.setText("");
        txtNumeroProc.setText("");
        txtStatus.setText("");
        txtSequencia.setText("");
        txtNomeEmbarcacao.setText("");
        tbEmbarcacao.clearSelection();
        txtNomeSolicitante.setText("");
        tbSolicitante.clearSelection();
        SolicitacaoDAO.Consultar(txtPesquisa.getText(), tbSolicitacao, codAtr);
        TelaSolicitacao.setSelectedIndex(0);
        this.codigo = null;
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (codigo == null) {
            SolicitacaoDAO.Cadastrar(txtNumeroProc.getText(), txtSequencia.getText(), txtStatus.getText(), txtMotivo.getText(), tbSolicitante.getValueAt(tbSolicitante.getSelectedRow(), 0).toString(), tbEmbarcacao.getValueAt(tbEmbarcacao.getSelectedRow(), 0).toString());
        } else {
            SolicitacaoDAO.Alterar(txtNumeroProc.getText(), txtSequencia.getText(), txtStatus.getText(), txtMotivo.getText(), tbSolicitante.getValueAt(tbSolicitante.getSelectedRow(), 0).toString(), tbEmbarcacao.getValueAt(tbEmbarcacao.getSelectedRow(), 0).toString());
        }
        SolicitacaoDAO.Consultar(txtPesquisa.getText(), tbSolicitacao, codAtr);
        TelaSolicitacao.setSelectedIndex(0);
        this.codigo = null;
    }//GEN-LAST:event_btSalvarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TelaSolicitacao;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox cbAtributo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JLabel lblPesquisa;
    private javax.swing.JPanel pnCadastro;
    private javax.swing.JPanel pnConsulta;
    private javax.swing.JTable tbEmbarcacao;
    private javax.swing.JTable tbSolicitacao;
    private javax.swing.JTable tbSolicitante;
    private javax.swing.JTextArea txtMotivo;
    private javax.swing.JTextField txtNomeEmbarcacao;
    private javax.swing.JTextField txtNomeSolicitante;
    private javax.swing.JTextField txtNumeroProc;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtSequencia;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
