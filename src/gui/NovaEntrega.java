package gui;

import dao.EntregaDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import models.Cliente;
import models.Entrega;
import printers.Printer;
import validators.EntregaFormValidation;

public class NovaEntrega extends javax.swing.JFrame {

    Cliente cliente;
    Calendar now;

    public NovaEntrega(Cliente cliente) {
        initComponents();
        
        this.cliente = cliente;
        campoCliente.setText(cliente.getNome());

        this.now = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        campoData.setText(sdf.format(this.now.getTime()));

        campoLogradouro.setText(cliente.getLogradouro());
        campoNumero.setText(String.valueOf(cliente.getNumero()));
        campoBairro.setText(cliente.getBairro());
        campoCidade.setText(cliente.getCidade());
        campoReferencia.setText(cliente.getReferencia());

        simRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (simRadioButton.isSelected()) {
                    campoLogradouro.setEnabled(false);
                    campoNumero.setEnabled(false);
                    campoBairro.setEnabled(false);
                    campoCidade.setEnabled(false);
                    campoReferencia.setEnabled(false);

                    campoLogradouro.setText(cliente.getLogradouro());
                    campoNumero.setText(String.valueOf(cliente.getNumero()));
                    campoBairro.setText(cliente.getBairro());
                    campoCidade.setText(cliente.getCidade());
                    campoReferencia.setText(cliente.getReferencia());
                }
            }
        });

        naoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (naoRadioButton.isSelected()) {
                    campoLogradouro.setEnabled(true);
                    campoNumero.setEnabled(true);
                    campoBairro.setEnabled(true);
                    campoCidade.setEnabled(true);
                    campoReferencia.setEnabled(true);

                    campoLogradouro.setText("");
                    campoNumero.setText("");
                    campoBairro.setText("");
                    campoCidade.setText("");
                    campoReferencia.setText("");
                }
            }
        });
        
        
        dinheiroRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (dinheiroRadioButton.isSelected()){
                    campoTroco.setEnabled(true);
                }
            }
        });
        
        cartaoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (cartaoRadioButton.isSelected()){
                    campoTroco.setEnabled(false);
                    campoTroco.setText("");
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enderecoButtonGroup = new javax.swing.ButtonGroup();
        metodoPagamentoRadioGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        entregaPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        campoCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoValor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoObservacao = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        campoData = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        simRadioButton = new javax.swing.JRadioButton();
        naoRadioButton = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        campoLogradouro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        campoNumero = new javax.swing.JTextField();
        campoReferencia = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        campoBairro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        campoCidade = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        dinheiroRadioButton = new javax.swing.JRadioButton();
        cartaoRadioButton = new javax.swing.JRadioButton();
        campoTroco = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        botaoConfirmar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nova Entrega");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/icons/motorcycle-48.png")).getImage());
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/motorcycle-48.png"))); // NOI18N
        jLabel1.setText("Nova Entrega");

        entregaPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel2.setText("Cliente:");

        campoCliente.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        campoCliente.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel3.setText("Valor (R$):");

        campoValor.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        campoValor.setName("valor"); // NOI18N

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel4.setText("Método de Pagamento:");

        campoObservacao.setColumns(20);
        campoObservacao.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        campoObservacao.setLineWrap(true);
        campoObservacao.setRows(5);
        jScrollPane1.setViewportView(campoObservacao);

        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 47, 52));
        jLabel5.setText("*");

        campoData.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        campoData.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel7.setText("Data:");

        jLabel8.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel8.setText("O endereço de entrega é o já cadastrado no cliente?");

        enderecoButtonGroup.add(simRadioButton);
        simRadioButton.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        simRadioButton.setSelected(true);
        simRadioButton.setText("Sim");

        enderecoButtonGroup.add(naoRadioButton);
        naoRadioButton.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        naoRadioButton.setText("Não");

        jLabel9.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel9.setText("Logradouro:");

        campoLogradouro.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        campoLogradouro.setEnabled(false);
        campoLogradouro.setName("logradouro"); // NOI18N

        jLabel10.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel10.setText("Número:");

        campoNumero.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        campoNumero.setEnabled(false);
        campoNumero.setName("numero"); // NOI18N

        campoReferencia.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        campoReferencia.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel11.setText("Referência:");

        campoBairro.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        campoBairro.setEnabled(false);
        campoBairro.setName("bairro"); // NOI18N

        jLabel12.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel12.setText("Bairro:");

        campoCidade.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        campoCidade.setEnabled(false);
        campoCidade.setName("cidade"); // NOI18N

        jLabel13.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel13.setText("Cidade:");

        jLabel14.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 47, 52));
        jLabel14.setText("*");

        jLabel15.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 47, 52));
        jLabel15.setText("*");

        jLabel16.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 47, 52));
        jLabel16.setText("*");

        jLabel17.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 47, 52));
        jLabel17.setText("*");

        jLabel18.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 47, 52));
        jLabel18.setText("*");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel19.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel19.setText("Observação:");

        metodoPagamentoRadioGroup.add(dinheiroRadioButton);
        dinheiroRadioButton.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        dinheiroRadioButton.setText("Dinheiro");
        dinheiroRadioButton.setName("dinheiro"); // NOI18N

        metodoPagamentoRadioGroup.add(cartaoRadioButton);
        cartaoRadioButton.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        cartaoRadioButton.setText("Cartão");
        cartaoRadioButton.setName("cartao"); // NOI18N

        campoTroco.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        campoTroco.setEnabled(false);
        campoTroco.setName("troco"); // NOI18N

        jLabel20.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel20.setText("Troco (vazio se não precisar):");

        jLabel21.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 47, 52));
        jLabel21.setText("*");

        javax.swing.GroupLayout entregaPanelLayout = new javax.swing.GroupLayout(entregaPanel);
        entregaPanel.setLayout(entregaPanelLayout);
        entregaPanelLayout.setHorizontalGroup(
            entregaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entregaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(entregaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(entregaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(campoCliente, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(entregaPanelLayout.createSequentialGroup()
                            .addGroup(entregaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addGroup(entregaPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel5)))
                            .addGap(18, 18, 18)
                            .addGroup(entregaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, entregaPanelLayout.createSequentialGroup()
                            .addComponent(dinheiroRadioButton)
                            .addGap(18, 18, 18)
                            .addComponent(cartaoRadioButton))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, entregaPanelLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel21)))
                    .addComponent(campoTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(entregaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoCidade)
                    .addComponent(campoLogradouro)
                    .addGroup(entregaPanelLayout.createSequentialGroup()
                        .addGroup(entregaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(entregaPanelLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17))
                            .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(entregaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(entregaPanelLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16))
                            .addComponent(campoBairro)))
                    .addGroup(entregaPanelLayout.createSequentialGroup()
                        .addGroup(entregaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(entregaPanelLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18))
                            .addGroup(entregaPanelLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15))
                            .addGroup(entregaPanelLayout.createSequentialGroup()
                                .addComponent(simRadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(naoRadioButton))
                            .addGroup(entregaPanelLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14))
                            .addComponent(jLabel11))
                        .addGap(0, 63, Short.MAX_VALUE))
                    .addComponent(campoReferencia))
                .addContainerGap())
        );
        entregaPanelLayout.setVerticalGroup(
            entregaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entregaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(entregaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(entregaPanelLayout.createSequentialGroup()
                        .addGroup(entregaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(entregaPanelLayout.createSequentialGroup()
                                .addGroup(entregaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(entregaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(simRadioButton)
                                    .addComponent(naoRadioButton))
                                .addGap(30, 30, 30)
                                .addGroup(entregaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(entregaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(entregaPanelLayout.createSequentialGroup()
                                        .addGroup(entregaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel17))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(entregaPanelLayout.createSequentialGroup()
                                        .addGroup(entregaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel16))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(entregaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(entregaPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(entregaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(entregaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(entregaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel21))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(entregaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dinheiroRadioButton)
                                    .addComponent(cartaoRadioButton))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoTroco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(entregaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(entregaPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(entregaPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 47, 52));
        jLabel6.setText("* Campos obrigatórios");

        botaoConfirmar.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        botaoConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ok.png"))); // NOI18N
        botaoConfirmar.setText("Confirmar");
        botaoConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmarActionPerformed(evt);
            }
        });

        botaoCancelar.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        botaoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancel.png"))); // NOI18N
        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
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
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addComponent(entregaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoConfirmar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(entregaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCancelar)
                    .addComponent(botaoConfirmar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmarActionPerformed
        String[] options = {"SIM", "NÃO"};
        int reply = JOptionPane.showOptionDialog(null, "Realmente deseja cadastrar a entrega?", "Entrega",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                options, options[0]);

        if (reply == 0 && new EntregaFormValidation(entregaPanel).validate()) {
            String strValor = campoValor.getText();
            strValor = strValor.replaceAll(",", ".");
            
            String strTroco = campoTroco.getText();
            strTroco = strTroco.replaceAll(",", ".");
            
            float valor = Float.parseFloat(strValor);
            float troco = strTroco.isEmpty() ? null : Float.parseFloat(strValor);
            
            Entrega entrega = new Entrega(
                    cliente.getIdCliente(),
                    this.now,
                    valor,
                    dinheiroRadioButton.isSelected() ? 0 : 1,
                    troco,
                    campoObservacao.getText().toUpperCase(),
                    campoLogradouro.getText().toUpperCase(),
                    Integer.parseInt(campoNumero.getText()),
                    campoBairro.getText().toUpperCase( ),
                    campoCidade.getText().toUpperCase(),
                    campoReferencia.getText().toUpperCase()
            );

            int idEntrega = EntregaDAO.insertEntrega(entrega);
            entrega.setIdEntrega(idEntrega);
            
            Printer.printComprovante(entrega, cliente);
            
            JOptionPane.showMessageDialog(null, "Entrega cadastrada com sucesso", "Informação", JOptionPane.INFORMATION_MESSAGE);
            
            this.dispose();
        }
    }//GEN-LAST:event_botaoConfirmarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoConfirmar;
    private javax.swing.JTextField campoBairro;
    private javax.swing.JTextField campoCidade;
    private javax.swing.JTextField campoCliente;
    private javax.swing.JTextField campoData;
    private javax.swing.JTextField campoLogradouro;
    private javax.swing.JTextField campoNumero;
    private javax.swing.JTextArea campoObservacao;
    private javax.swing.JTextField campoReferencia;
    private javax.swing.JTextField campoTroco;
    private javax.swing.JTextField campoValor;
    private javax.swing.JRadioButton cartaoRadioButton;
    private javax.swing.JRadioButton dinheiroRadioButton;
    private javax.swing.ButtonGroup enderecoButtonGroup;
    private javax.swing.JPanel entregaPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.ButtonGroup metodoPagamentoRadioGroup;
    private javax.swing.JRadioButton naoRadioButton;
    private javax.swing.JRadioButton simRadioButton;
    // End of variables declaration//GEN-END:variables
}
