package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.Cliente;

public class ClienteDAO {

    private static Cliente extractClienteFromRs(ResultSet rs) throws SQLException {
        return new Cliente(
                rs.getInt("idCliente"),
                rs.getString("nome"),
                rs.getString("telefone1"),
                rs.getString("telefone2"),
                rs.getString("logradouro"),
                rs.getInt("numero"),
                rs.getString("bairro"),
                rs.getString("cidade"),
                rs.getString("referencia")
        );
    }

    public static void insertCliente(Cliente cliente) {
        try {
            Connection conn = DriverManager.getConnection(DAOPaths.dbPath);
            String sql = "INSERT INTO cliente(nome, telefone1, telefone2, logradouro, numero, bairro, cidade, referencia) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getTelefone1());
            ps.setString(3, cliente.getTelefone2());
            ps.setString(4, cliente.getLogradouro());
            ps.setInt(5, cliente.getNumero());
            ps.setString(6, cliente.getBairro());
            ps.setString(7, cliente.getCidade());
            ps.setString(8, cliente.getReferencia());

            ps.executeUpdate();

            conn.close();

            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso", "Informação", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(EntregaDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro na inserção do cliente", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static ArrayList<Cliente> selectTodosClientes() {
        try {
            Connection conn = DriverManager.getConnection(DAOPaths.dbPath);

            Statement stmt = conn.createStatement();
            ResultSet rs;
            ArrayList<Cliente> arrayClientes = new ArrayList<>();

            rs = stmt.executeQuery("SELECT * FROM cliente");

            while (rs.next()) {
                arrayClientes.add(extractClienteFromRs(rs));
            }

            conn.close();

            return arrayClientes;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro na seleção", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public static void updateCliente(Cliente cliente) {
        try {
            Connection conn = DriverManager.getConnection(DAOPaths.dbPath);
            String sql = "UPDATE cliente SET nome = ?, telefone1 = ?, telefone2 = ?, logradouro = ?, numero = ?, bairro = ?, cidade = ?, referencia = ? WHERE idCliente = ?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getTelefone1());
            ps.setString(3, cliente.getTelefone2());
            ps.setString(4, cliente.getLogradouro());
            ps.setInt(5, cliente.getNumero());
            ps.setString(6, cliente.getBairro());
            ps.setString(7, cliente.getCidade());
            ps.setString(8, cliente.getReferencia());

            ps.setInt(9, cliente.getIdCliente());

            ps.executeUpdate();

            conn.close();

            JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso", "Informação", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(EntregaDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro na inserção do cliente", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
