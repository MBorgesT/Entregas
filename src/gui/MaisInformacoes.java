package gui;

import dao.ClienteDAO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import models.Cliente;
import validators.ClienteFormValidation;

public class MaisInformacoes extends javax.swing.JFrame {

    private Cliente cliente;
    private MenuPrincipal menuPrincipal;
    private boolean isEditando;

    public MaisInformacoes(Cliente cliente, MenuPrincipal menuPrincipal) {
        initComponents();

        this.cliente = cliente;
        labelId.setText("ID: " + String.valueOf(cliente.getIdCliente()));
        preencherCampos();

        this.menuPrincipal = menuPrincipal;

        isEditando = false;
        ajustarCamposEdicao();
    }

    private void preencherCampos() {
        campoNome.setText(cliente.getNome());
        campoTelefone1.setText(cliente.getTelefone1());
        campoTelefone2.setText(cliente.getTelefone2());

        campoLogradouro.setText(cliente.getLogradouro());
        campoNumero.setText(String.valueOf(cliente.getNumero()));
        campoBairro.setText(cliente.getBairro());
        campoCidade.setText(cliente.getCidade());
        campoReferencia.setText(cliente.getReferencia());
    }

    private void ajustarCamposEdicao() {
        labelCamposObrigatorios.setVisible(isEditando);
        ast1.setVisible(isEditando);
        ast2.setVisible(isEditando);
        ast3.setVisible(isEditando);
        ast4.setVisible(isEditando);
        ast5.setVisible(isEditando);
        ast6.setVisible(isEditando);

        campoNome.setEnabled(isEditando);
        campoTelefone1.setEnabled(isEditando);
        campoTelefone2.setEnabled(isEditando);

        campoLogradouro.setEnabled(isEditando);
        campoNumero.setEnabled(isEditando);
        campoBairro.setEnabled(isEditando);
        campoCidade.setEnabled(isEditando);
        campoReferencia.setEnabled(isEditando);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelId = new javax.swing.JLabel();
        clientePanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        ast1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ast2 = new javax.swing.JLabel();
        campoTelefone1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoTelefone2 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        campoLogradouro = new javax.swing.JTextField();
        ast3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ast4 = new javax.swing.JLabel();
        campoNumero = new javax.swing.JTextField();
        campoBairro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        ast5 = new javax.swing.JLabel();
        campoCidade = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        ast6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        campoReferencia = new javax.swing.JTextField();
        labelCamposObrigatorios = new javax.swing.JLabel();
        botaoEditarInfo = new javax.swing.JButton();
        botaoCancelarEdicao = new javax.swing.JButton();
        botaoHistoricoEntregas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cliente");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/icons/motorcycle-48.png")).getImage());
        setResizable(false);

        labelId.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        labelId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/customer-red.png"))); // NOI18N
        labelId.setText("ID: 420");

        clientePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel3.setText("Nome:");

        campoNome.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        campoNome.setName("nome"); // NOI18N

        ast1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        ast1.setForeground(new java.awt.Color(255, 47, 52));
        ast1.setText("*");

        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel5.setText("Telefone 1:");

        ast2.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        ast2.setForeground(new java.awt.Color(255, 47, 52));
        ast2.setText("*");

        campoTelefone1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        campoTelefone1.setName("telefone1"); // NOI18N

        jLabel7.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel7.setText("Telefone 2:");

        campoTelefone2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        campoTelefone2.setName("telefone2"); // NOI18N

        jLabel8.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel8.setText("Logradouro:");

        campoLogradouro.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        campoLogradouro.setName("logradouro"); // NOI18N

        ast3.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        ast3.setForeground(new java.awt.Color(255, 47, 52));
        ast3.setText("*");

        jLabel10.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel10.setText("Número:");

        ast4.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        ast4.setForeground(new java.awt.Color(255, 47, 52));
        ast4.setText("*");

        campoNumero.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        campoNumero.setName("numero"); // NOI18N

        campoBairro.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        campoBairro.setName("bairro"); // NOI18N

        jLabel12.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel12.setText("Bairro:");

        ast5.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        ast5.setForeground(new java.awt.Color(255, 47, 52));
        ast5.setText("*");

        campoCidade.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        campoCidade.setName("cidade"); // NOI18N

        jLabel14.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel14.setText("Cidade:");

        ast6.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        ast6.setForeground(new java.awt.Color(255, 47, 52));
        ast6.setText("*");

        jLabel16.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel16.setText("Referência:");

        campoReferencia.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        campoReferencia.setName("referencia"); // NOI18N

        javax.swing.GroupLayout clientePanelLayout = new javax.swing.GroupLayout(clientePanel);
        clientePanel.setLayout(clientePanelLayout);
        clientePanelLayout.setHorizontalGroup(
            clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoReferencia)
                    .addGroup(clientePanelLayout.createSequentialGroup()
                        .addGroup(clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(clientePanelLayout.createSequentialGroup()
                                .addGroup(clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(clientePanelLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ast4)))
                                .addGap(18, 18, 18)
                                .addGroup(clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(clientePanelLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ast5)))
                                .addGap(18, 18, 18)
                                .addGroup(clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(clientePanelLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ast6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE))
                                    .addComponent(campoCidade)))
                            .addComponent(jSeparator1)
                            .addGroup(clientePanelLayout.createSequentialGroup()
                                .addGroup(clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(clientePanelLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ast2))
                                    .addComponent(campoTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(clientePanelLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(campoTelefone2)))
                            .addComponent(campoLogradouro)
                            .addGroup(clientePanelLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ast1))
                            .addGroup(clientePanelLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ast3))
                            .addComponent(jLabel16)
                            .addComponent(campoNome))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        clientePanelLayout.setVerticalGroup(
            clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ast1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clientePanelLayout.createSequentialGroup()
                        .addGroup(clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(ast2)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(clientePanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(campoTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(ast3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ast4)
                    .addComponent(jLabel12)
                    .addComponent(ast5)
                    .addComponent(jLabel14)
                    .addComponent(ast6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(clientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelCamposObrigatorios.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        labelCamposObrigatorios.setForeground(new java.awt.Color(255, 47, 52));
        labelCamposObrigatorios.setText("* Campos obrigatórios");

        botaoEditarInfo.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        botaoEditarInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit.png"))); // NOI18N
        botaoEditarInfo.setText("Editar Informações");
        botaoEditarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarInfoActionPerformed(evt);
            }
        });

        botaoCancelarEdicao.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        botaoCancelarEdicao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancel.png"))); // NOI18N
        botaoCancelarEdicao.setText("Cancelar Edição");
        botaoCancelarEdicao.setEnabled(false);
        botaoCancelarEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarEdicaoActionPerformed(evt);
            }
        });

        botaoHistoricoEntregas.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        botaoHistoricoEntregas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/motorcycle-32.png"))); // NOI18N
        botaoHistoricoEntregas.setText("Histórico de Entregas");
        botaoHistoricoEntregas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoHistoricoEntregasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelId)
                        .addGap(264, 264, 264)
                        .addComponent(labelCamposObrigatorios))
                    .addComponent(clientePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoCancelarEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoHistoricoEntregas)
                    .addComponent(botaoEditarInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelCamposObrigatorios)
                    .addComponent(labelId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoEditarInfo)
                        .addGap(18, 18, 18)
                        .addComponent(botaoCancelarEdicao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoHistoricoEntregas))
                    .addComponent(clientePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoEditarInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarInfoActionPerformed
        if (isEditando) {
            String[] options = {"SIM", "NÃO"};
            int reply = JOptionPane.showOptionDialog(null, "Você realmente deseja salvar as alterações?", "Alterações",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                    options, options[0]);

            if (reply == 0 && new ClienteFormValidation(clientePanel).validate()) {
                cliente.setNome(campoNome.getText().toUpperCase());
                cliente.setTelefone1(campoTelefone1.getText());
                cliente.setTelefone2(campoTelefone2.getText());

                cliente.setLogradouro(campoLogradouro.getText().toUpperCase());
                cliente.setNumero(Integer.parseInt(campoNumero.getText()));
                cliente.setBairro(campoBairro.getText().toUpperCase());
                cliente.setCidade(campoCidade.getText().toUpperCase());
                cliente.setReferencia(campoReferencia.getText().toUpperCase());

                ClienteDAO.updateCliente(cliente);

                preencherCampos();
                menuPrincipal.updateTabelaComBanco();

                isEditando = false;
                ajustarCamposEdicao();

                botaoEditarInfo.setIcon(new ImageIcon(getClass().getResource("/icons/edit.png")));
                botaoEditarInfo.setText("Editar Informações");

                botaoCancelarEdicao.setEnabled(false);
                botaoHistoricoEntregas.setEnabled(true);
            }

        } else {
            isEditando = true;
            ajustarCamposEdicao();

            botaoEditarInfo.setIcon(new ImageIcon(getClass().getResource("/icons/save-alterations.png")));
            botaoEditarInfo.setText("Salvar Alterações");

            botaoCancelarEdicao.setEnabled(true);
            botaoHistoricoEntregas.setEnabled(false);
        }
    }//GEN-LAST:event_botaoEditarInfoActionPerformed

    private void botaoCancelarEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarEdicaoActionPerformed
        isEditando = false;
        preencherCampos();
        ajustarCamposEdicao();

        botaoEditarInfo.setIcon(new ImageIcon(getClass().getResource("/icons/edit.png")));
        botaoEditarInfo.setText("Editar Informações");

        botaoCancelarEdicao.setEnabled(false);
        botaoHistoricoEntregas.setEnabled(true);
    }//GEN-LAST:event_botaoCancelarEdicaoActionPerformed

    private void botaoHistoricoEntregasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoHistoricoEntregasActionPerformed
        new HistoricoEntregas(cliente).setVisible(true);
    }//GEN-LAST:event_botaoHistoricoEntregasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ast1;
    private javax.swing.JLabel ast2;
    private javax.swing.JLabel ast3;
    private javax.swing.JLabel ast4;
    private javax.swing.JLabel ast5;
    private javax.swing.JLabel ast6;
    private javax.swing.JButton botaoCancelarEdicao;
    private javax.swing.JButton botaoEditarInfo;
    private javax.swing.JButton botaoHistoricoEntregas;
    private javax.swing.JTextField campoBairro;
    private javax.swing.JTextField campoCidade;
    private javax.swing.JTextField campoLogradouro;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoNumero;
    private javax.swing.JTextField campoReferencia;
    private javax.swing.JTextField campoTelefone1;
    private javax.swing.JTextField campoTelefone2;
    private javax.swing.JPanel clientePanel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelCamposObrigatorios;
    private javax.swing.JLabel labelId;
    // End of variables declaration//GEN-END:variables
}
