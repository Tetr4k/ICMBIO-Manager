/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.arraial.ICMBIO.telas.cadastros;

import br.arraial.ICMBIO.DAO.EmbarcacaoDAO;
import br.arraial.ICMBIO.DAO.ModalidadesDAO;
import javax.swing.JComboBox;

/**
 *
 * @author Aluno
 */
public class TelaCadEmbarcacao extends javax.swing.JInternalFrame {

    /**
     * Creates new form Embarcacao
     */
    private String codigo = null;
    private String codAtr = "nome_embarcacao";

    public TelaCadEmbarcacao() {
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

        jPanel3 = new javax.swing.JPanel();
        TelaEmbarcacao = new javax.swing.JTabbedPane();
        pnConsulta = new javax.swing.JPanel();
        txtPesquisa = new javax.swing.JTextField();
        cbAtriuto = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbEmbarcacao = new javax.swing.JTable();
        pnCadastro = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btLimpar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbNomeEmbarcacao = new javax.swing.JLabel();
        txtNomeEmbarcacao = new javax.swing.JTextField();
        lbTie = new javax.swing.JLabel();
        lbNomeProprietario = new javax.swing.JLabel();
        txtNomeProprietario = new javax.swing.JTextField();
        lbNPassageiros = new javax.swing.JLabel();
        cgNumeroPassageiros = new javax.swing.JSpinner();
        lbTEmbarcacao = new javax.swing.JLabel();
        lbCPassageiros = new javax.swing.JLabel();
        cgCapacidadePassageiros = new javax.swing.JSpinner();
        lbLocal = new javax.swing.JLabel();
        txtLocal = new javax.swing.JTextField();
        fmTamanhoEmbarcacao = new javax.swing.JFormattedTextField();
        fmTie = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObeservacao = new javax.swing.JTextArea();
        lbObs = new javax.swing.JLabel();
        lbModalidade = new javax.swing.JLabel();
        cbModalidade = new javax.swing.JComboBox();
        ModalidadesDAO.PegarDados2(cbModalidade);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 571, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
        );

        setClosable(true);
        setTitle("Cadastro de Embarcação");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        TelaEmbarcacao.setBackground(new java.awt.Color(255, 255, 255));
        TelaEmbarcacao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TelaEmbarcacao.setOpaque(true);
        TelaEmbarcacao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TelaEmbarcacaoFocusGained(evt);
            }
        });
        TelaEmbarcacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TelaEmbarcacaoMouseEntered(evt);
            }
        });

        pnConsulta.setBackground(java.awt.Color.white);

        txtPesquisa.setText("Digite o nome da embarcação");
        txtPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPesquisaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtPesquisaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtPesquisaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPesquisaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtPesquisaMouseReleased(evt);
            }
        });
        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });

        cbAtriuto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nome", "Codigo", "TIE", "Modalidade" }));
        cbAtriuto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAtriutoItemStateChanged(evt);
            }
        });

        tbEmbarcacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "TIE", "Modalidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbEmbarcacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbEmbarcacaoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbEmbarcacao);

        javax.swing.GroupLayout pnConsultaLayout = new javax.swing.GroupLayout(pnConsulta);
        pnConsulta.setLayout(pnConsultaLayout);
        pnConsultaLayout.setHorizontalGroup(
            pnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                    .addGroup(pnConsultaLayout.createSequentialGroup()
                        .addComponent(cbAtriuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPesquisa)))
                .addContainerGap())
        );
        pnConsultaLayout.setVerticalGroup(
            pnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAtriuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addContainerGap())
        );

        TelaEmbarcacao.addTab("Consultar", pnConsulta);

        pnCadastro.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.setEnabled(false);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btExcluir)
                .addGap(10, 10, 10)
                .addComponent(btLimpar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btExcluir)
                        .addComponent(btSalvar))
                    .addComponent(btLimpar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbNomeEmbarcacao.setText("Nome da embarcação:");

        txtNomeEmbarcacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeEmbarcacaoActionPerformed(evt);
            }
        });

        lbTie.setText("TIE:");

        lbNomeProprietario.setText("Nome do proprietário:");

        txtNomeProprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProprietarioActionPerformed(evt);
            }
        });

        lbNPassageiros.setText("Número de passageiros:");

        cgNumeroPassageiros.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        lbTEmbarcacao.setText("Tamanho da embarcação: ");

        lbCPassageiros.setText("Capacidade de passageiros:");

        cgCapacidadePassageiros.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        lbLocal.setText("Local de atuação:");

        txtLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocalActionPerformed(evt);
            }
        });

        fmTamanhoEmbarcacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        fmTamanhoEmbarcacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fmTamanhoEmbarcacaoActionPerformed(evt);
            }
        });

        fmTie.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########/####"))));
        fmTie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fmTieActionPerformed(evt);
            }
        });

        txtObeservacao.setColumns(20);
        txtObeservacao.setRows(5);
        jScrollPane1.setViewportView(txtObeservacao);

        lbObs.setText("Observação:");

        lbModalidade.setText("Modalidade:");

        cbModalidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbModalidadeFocusLost(evt);
            }
        });
        cbModalidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbModalidadeMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cbModalidadeMouseReleased(evt);
            }
        });
        cbModalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbModalidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(cgNumeroPassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbCPassageiros)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cgCapacidadePassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtNomeProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fmTamanhoEmbarcacao)
                        .addComponent(txtLocal))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbLocal)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbTie)
                                .addComponent(lbNomeEmbarcacao, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbNomeProprietario)
                                .addComponent(lbTEmbarcacao))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fmTie, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNomeEmbarcacao, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(lbNPassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbObs)
                            .addComponent(lbModalidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                            .addComponent(cbModalidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeEmbarcacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNomeEmbarcacao))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fmTie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTie))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNomeProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNPassageiros)
                    .addComponent(cgNumeroPassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCPassageiros)
                    .addComponent(cgCapacidadePassageiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTEmbarcacao)
                    .addComponent(fmTamanhoEmbarcacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLocal)
                    .addComponent(txtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbObs)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbModalidade)
                    .addComponent(cbModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnCadastroLayout = new javax.swing.GroupLayout(pnCadastro);
        pnCadastro.setLayout(pnCadastroLayout);
        pnCadastroLayout.setHorizontalGroup(
            pnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCadastroLayout.createSequentialGroup()
                .addGroup(pnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnCadastroLayout.setVerticalGroup(
            pnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCadastroLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TelaEmbarcacao.addTab("Cadastrar", pnCadastro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TelaEmbarcacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TelaEmbarcacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeProprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProprietarioActionPerformed

    }//GEN-LAST:event_txtNomeProprietarioActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        txtNomeEmbarcacao.setText("");
        fmTie.setText("");
        txtNomeProprietario.setText("");
        cgNumeroPassageiros.setValue(0);
        fmTamanhoEmbarcacao.setText("");
        cgCapacidadePassageiros.setValue(0);
        txtLocal.setText("");
        txtObeservacao.setText("");
        cbModalidade.setSelectedIndex(0);
        this.codigo = null;
    }//GEN-LAST:event_btLimparActionPerformed

    private void fmTamanhoEmbarcacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fmTamanhoEmbarcacaoActionPerformed

    }//GEN-LAST:event_fmTamanhoEmbarcacaoActionPerformed

    private void txtLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocalActionPerformed

    }//GEN-LAST:event_txtLocalActionPerformed

    private void txtNomeEmbarcacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeEmbarcacaoActionPerformed

    }//GEN-LAST:event_txtNomeEmbarcacaoActionPerformed

    private void fmTieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fmTieActionPerformed

    }//GEN-LAST:event_fmTieActionPerformed

    private void cbModalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbModalidadeActionPerformed

    }//GEN-LAST:event_cbModalidadeActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (codigo == null) {
            EmbarcacaoDAO.Cadastrar(txtNomeEmbarcacao.getText(),
                    fmTie.getText(),
                    txtNomeProprietario.getText(),
                    cgNumeroPassageiros.getValue().toString(),
                    fmTamanhoEmbarcacao.getText(),
                    cgCapacidadePassageiros.getValue().toString(),
                    txtLocal.getText(),
                    txtObeservacao.getText(),
                    cbModalidade.getSelectedIndex());
        } else {
            EmbarcacaoDAO.Alterar(codigo,
                    txtNomeEmbarcacao.getText(),
                    fmTie.getText(),
                    txtNomeProprietario.getText(),
                    cgNumeroPassageiros.getValue().toString(),
                    fmTamanhoEmbarcacao.getText(),
                    cgCapacidadePassageiros.getValue().toString(),
                    txtLocal.getText(),
                    txtObeservacao.getText(),
                    cbModalidade.getSelectedIndex());
        }
        txtNomeEmbarcacao.setText("");
        fmTie.setText("");
        txtNomeProprietario.setText("");
        cgNumeroPassageiros.setValue(0);
        fmTamanhoEmbarcacao.setText("");
        cgCapacidadePassageiros.setValue(0);
        txtLocal.setText("");
        txtObeservacao.setText("");
        cbModalidade.setSelectedIndex(0);
        EmbarcacaoDAO.Consultar(txtPesquisa.getText(), tbEmbarcacao, codAtr);
        TelaEmbarcacao.setSelectedIndex(0);
        this.codigo = null;
        btExcluir.setEnabled(false);
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        EmbarcacaoDAO.Excluir(codigo);
        txtNomeEmbarcacao.setText("");
        fmTie.setText("");
        txtNomeProprietario.setText("");
        cgNumeroPassageiros.setValue(0);
        fmTamanhoEmbarcacao.setText("");
        cgCapacidadePassageiros.setValue(0);
        txtLocal.setText("");
        txtObeservacao.setText("");
        cbModalidade.setSelectedIndex(0);
        EmbarcacaoDAO.Consultar(txtPesquisa.getText(), tbEmbarcacao, codAtr);
        TelaEmbarcacao.setSelectedIndex(0);
        this.codigo = null;
        btExcluir.setEnabled(false);
    }//GEN-LAST:event_btExcluirActionPerformed

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed

    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void tbEmbarcacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbEmbarcacaoMouseClicked
        TelaEmbarcacao.setSelectedIndex(1);
        this.codigo = tbEmbarcacao.getValueAt(tbEmbarcacao.getSelectedRow(), 0).toString();
        EmbarcacaoDAO.PegarDados(codigo,
                txtNomeEmbarcacao,
                fmTie,
                txtNomeProprietario,
                cgNumeroPassageiros,
                fmTamanhoEmbarcacao,
                cgCapacidadePassageiros,
                txtLocal,
                txtObeservacao,
                cbModalidade);
        switch (cbAtriuto.getItemAt(cbAtriuto.getSelectedIndex()).toString()) {
            case "Nome":
                txtPesquisa.setText("Digite o nome da embarcação");
                codAtr = "nome_embarcacao";
                break;
            case "Codigo":
                txtPesquisa.setText("Digite o codigo da embarcação");
                codAtr = "codigo_embarcacao";
                break;
            case "TIE":
                txtPesquisa.setText("Digite o TIE");
                codAtr = "TIE";
                break;
            case "Modalidade":
                txtPesquisa.setText("Digite a modalidade");
                codAtr = "codigo_modalidade";
                break;
        }
        btExcluir.setEnabled(true);
    }//GEN-LAST:event_tbEmbarcacaoMouseClicked

    private void cbAtriutoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAtriutoItemStateChanged
        switch (cbAtriuto.getItemAt(cbAtriuto.getSelectedIndex()).toString()) {
            case "Nome":
                txtPesquisa.setText("Digite o nome da embarcação");
                codAtr = "nome_embarcacao";
                break;
            case "Codigo":
                txtPesquisa.setText("Digite o codigo da embarcação");
                codAtr = "codigo_embarcacao";
                break;
            case "TIE":
                txtPesquisa.setText("Digite o TIE");
                codAtr = "TIE";
                break;
            case "Modalidade":
                txtPesquisa.setText("Digite a modalidade");
                codAtr = "codigo_modalidade";
                break;
        }
    }//GEN-LAST:event_cbAtriutoItemStateChanged

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        EmbarcacaoDAO.Consultar(txtPesquisa.getText(), tbEmbarcacao, codAtr);
    }//GEN-LAST:event_txtPesquisaKeyReleased
    private void cbModalidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbModalidadeMouseClicked
    }//GEN-LAST:event_cbModalidadeMouseClicked
    private void TelaEmbarcacaoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TelaEmbarcacaoFocusGained
    }//GEN-LAST:event_TelaEmbarcacaoFocusGained
    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
    }//GEN-LAST:event_formMouseEntered
    private void cbModalidadeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbModalidadeMouseReleased
    }//GEN-LAST:event_cbModalidadeMouseReleased
    private void TelaEmbarcacaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelaEmbarcacaoMouseEntered
    }//GEN-LAST:event_TelaEmbarcacaoMouseEntered
    private void cbModalidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbModalidadeFocusLost
    }//GEN-LAST:event_cbModalidadeFocusLost

    private void txtPesquisaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPesquisaMouseEntered

    }//GEN-LAST:event_txtPesquisaMouseEntered

    private void txtPesquisaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPesquisaMouseExited

    }//GEN-LAST:event_txtPesquisaMouseExited

    private void txtPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPesquisaMouseClicked

    }//GEN-LAST:event_txtPesquisaMouseClicked

    private void txtPesquisaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPesquisaMouseReleased

    }//GEN-LAST:event_txtPesquisaMouseReleased

    private void txtPesquisaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPesquisaMousePressed
        txtPesquisa.setText("");
    }//GEN-LAST:event_txtPesquisaMousePressed

    public JComboBox getCbModalidade() {
        return cbModalidade;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TelaEmbarcacao;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox cbAtriuto;
    private javax.swing.JComboBox cbModalidade;
    private javax.swing.JSpinner cgCapacidadePassageiros;
    private javax.swing.JSpinner cgNumeroPassageiros;
    private javax.swing.JFormattedTextField fmTamanhoEmbarcacao;
    private javax.swing.JFormattedTextField fmTie;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbCPassageiros;
    private javax.swing.JLabel lbLocal;
    private javax.swing.JLabel lbModalidade;
    private javax.swing.JLabel lbNPassageiros;
    private javax.swing.JLabel lbNomeEmbarcacao;
    private javax.swing.JLabel lbNomeProprietario;
    private javax.swing.JLabel lbObs;
    private javax.swing.JLabel lbTEmbarcacao;
    private javax.swing.JLabel lbTie;
    private javax.swing.JPanel pnCadastro;
    private javax.swing.JPanel pnConsulta;
    private javax.swing.JTable tbEmbarcacao;
    private javax.swing.JTextField txtLocal;
    private javax.swing.JTextField txtNomeEmbarcacao;
    private javax.swing.JTextField txtNomeProprietario;
    private javax.swing.JTextArea txtObeservacao;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
