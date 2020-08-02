package gui;

import dao.ClienteDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Cliente;

public class MenuPrincipal extends javax.swing.JFrame {

    ArrayList<Cliente> todosClientes;
    ArrayList<Cliente> clientesNaTabela;
    Cliente clienteSelecionado;

    public MenuPrincipal() {
        initComponents();

        this.todosClientes = ClienteDAO.selectTodosClientes();
        updateTabelaComBanco();

        tabelaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = tabelaClientes.rowAtPoint(evt.getPoint());
                if (row >= 0) {
                    selecionarCliente(clientesNaTabela.get(row));
                }
            }
        });
    }

    public void updateTabelaComBanco() {
        this.todosClientes = ClienteDAO.selectTodosClientes();
        clientesNaTabela = todosClientes;

        DefaultTableModel tableModel = (DefaultTableModel) tabelaClientes.getModel();
        tableModel.setRowCount(0);

        clientesNaTabela.forEach((cliente) -> {
            tableModel.addRow(cliente.getObjectArray());
        });
    }
    
    public void preencherTabela(){
        DefaultTableModel tableModel = (DefaultTableModel) tabelaClientes.getModel();
        tableModel.setRowCount(0);

        clientesNaTabela.forEach((cliente) -> {
            tableModel.addRow(cliente.getObjectArray());
        });
    }

    private void selecionarCliente(Cliente cliente) {
        clienteSelecionado = cliente;
        botaoDeselecionarCliente.setEnabled(true);
        labelClienteSelecionado.setText("<html>" + cliente.getNome() + "</html>");

        botaoNovaEntrega.setEnabled(true);
        botaoMaisInformacoes.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupBuscar = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        idRadioButton = new javax.swing.JRadioButton();
        nomeRadioButton = new javax.swing.JRadioButton();
        campoBusca = new javax.swing.JTextField();
        botaoBuscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        botaoNovoCliente = new javax.swing.JButton();
        botaoMaisInformacoes = new javax.swing.JButton();
        botaoNovaEntrega = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelClienteSelecionado = new javax.swing.JLabel();
        botaoDeselecionarCliente = new javax.swing.JButton();
        botaoLimparBusca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Entregas");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/icons/motorcycle-48.png")).getImage());
        setResizable(false);

        tabelaClientes.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaClientes);
        if (tabelaClientes.getColumnModel().getColumnCount() > 0) {
            tabelaClientes.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabelaClientes.getColumnModel().getColumn(1).setPreferredWidth(610);
        }

        buttonGroupBuscar.add(idRadioButton);
        idRadioButton.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        idRadioButton.setText("ID");

        buttonGroupBuscar.add(nomeRadioButton);
        nomeRadioButton.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        nomeRadioButton.setSelected(true);
        nomeRadioButton.setText("Nome");

        campoBusca.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N

        botaoBuscar.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        botaoBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        botaoBuscar.setText("Buscar");
        botaoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        botaoNovoCliente.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        botaoNovoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/new-customer.png"))); // NOI18N
        botaoNovoCliente.setText("Novo Cliente");
        botaoNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoClienteActionPerformed(evt);
            }
        });

        botaoMaisInformacoes.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        botaoMaisInformacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/more-info.png"))); // NOI18N
        botaoMaisInformacoes.setText("Mais Informações");
        botaoMaisInformacoes.setEnabled(false);
        botaoMaisInformacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMaisInformacoesActionPerformed(evt);
            }
        });

        botaoNovaEntrega.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        botaoNovaEntrega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delivery-32.png"))); // NOI18N
        botaoNovaEntrega.setText("Nova Entrega");
        botaoNovaEntrega.setEnabled(false);
        botaoNovaEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovaEntregaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoNovoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoMaisInformacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoNovaEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoNovaEntrega)
                .addGap(18, 18, 18)
                .addComponent(botaoMaisInformacoes)
                .addGap(18, 18, 18)
                .addComponent(botaoNovoCliente)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/customer-red.png"))); // NOI18N
        jLabel1.setText("Cliente selecionado:");

        labelClienteSelecionado.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        labelClienteSelecionado.setText(" ");

        botaoDeselecionarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close-cross.png"))); // NOI18N
        botaoDeselecionarCliente.setEnabled(false);
        botaoDeselecionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDeselecionarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(botaoDeselecionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelClienteSelecionado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(botaoDeselecionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelClienteSelecionado)
                .addContainerGap())
        );

        botaoLimparBusca.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        botaoLimparBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eraser.png"))); // NOI18N
        botaoLimparBusca.setText("Limpar");
        botaoLimparBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparBuscaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nomeRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(idRadioButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(campoBusca)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoLimparBusca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoBuscar))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idRadioButton)
                            .addComponent(nomeRadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoBuscar)
                            .addComponent(botaoLimparBusca))
                        .addGap(51, 51, 51)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoClienteActionPerformed
        new NovoCliente(this).setVisible(true);
    }//GEN-LAST:event_botaoNovoClienteActionPerformed

    private void botaoNovaEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovaEntregaActionPerformed
        new NovaEntrega(clienteSelecionado).setVisible(true);
    }//GEN-LAST:event_botaoNovaEntregaActionPerformed

    private void botaoDeselecionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDeselecionarClienteActionPerformed
        clienteSelecionado = null;
        botaoDeselecionarCliente.setEnabled(false);
        labelClienteSelecionado.setText(" ");

        botaoNovaEntrega.setEnabled(false);
        botaoMaisInformacoes.setEnabled(false);
        
        tabelaClientes.getSelectionModel().clearSelection();
    }//GEN-LAST:event_botaoDeselecionarClienteActionPerformed

    private void botaoMaisInformacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMaisInformacoesActionPerformed
        new MaisInformacoes(clienteSelecionado, this).setVisible(true);
    }//GEN-LAST:event_botaoMaisInformacoesActionPerformed

    private void botaoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscarActionPerformed
        String searchParam = campoBusca.getText();
        if (!searchParam.isEmpty()) {
            if (idRadioButton.isSelected()) {
                try {
                    int idBusca = Integer.parseInt(searchParam);
                    clientesNaTabela = new ArrayList<>();

                    boolean flag = false;
                    for (Cliente c : todosClientes) {
                        if (c.getIdCliente() == idBusca) {
                            clientesNaTabela.add(c);
                            flag = true;
                            break;
                        }
                    }

                    preencherTabela();

                    if (!flag) {
                        JOptionPane.showMessageDialog(null, "Não foi possível achar um resultado", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Favor inserir somente números no campo de busca por ID", "Atenção", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                searchParam = searchParam.toUpperCase();
                clientesNaTabela = new ArrayList<>();

                boolean flag = false;
                for (Cliente c : todosClientes) {
                    if (c.getNome().contains(searchParam)) {
                        clientesNaTabela.add(c);
                        flag = true;
                    }
                }

                preencherTabela();

                if (!flag) {
                    JOptionPane.showMessageDialog(null, "Não foi possível achar um resultado", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else {
            clientesNaTabela = todosClientes;
            preencherTabela();
        }
        botaoDeselecionarCliente.doClick();
    }//GEN-LAST:event_botaoBuscarActionPerformed

    private void botaoLimparBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparBuscaActionPerformed
        campoBusca.setText("");
        clientesNaTabela = todosClientes;
        preencherTabela();
    }//GEN-LAST:event_botaoLimparBuscaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoBuscar;
    private javax.swing.JButton botaoDeselecionarCliente;
    private javax.swing.JButton botaoLimparBusca;
    private javax.swing.JButton botaoMaisInformacoes;
    private javax.swing.JButton botaoNovaEntrega;
    private javax.swing.JButton botaoNovoCliente;
    private javax.swing.ButtonGroup buttonGroupBuscar;
    private javax.swing.JTextField campoBusca;
    private javax.swing.JRadioButton idRadioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelClienteSelecionado;
    private javax.swing.JRadioButton nomeRadioButton;
    private javax.swing.JTable tabelaClientes;
    // End of variables declaration//GEN-END:variables
}
