package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.Entrega;

public class EntregaDAO {

    private static Entrega extractEntregaFromRs(ResultSet rs) throws SQLException {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Calendar data = Calendar.getInstance();
            data.setTime(sdf.parse(rs.getString("data")));
            
            return new Entrega(
                    rs.getInt("idEntrega"),
                    rs.getInt("idCliente"),
                    data,
                    rs.getFloat("valor"),
                    rs.getInt("metodoPagamento"),
                    rs.getFloat("troco"),
                    rs.getString("observacao")
            );
        } catch (ParseException ex) {
            Logger.getLogger(EntregaDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro na extração de entrega", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public static int insertEntrega(Entrega entrega) {
        try {
            Connection conn = DriverManager.getConnection(DAOPaths.dbPath);
            String sql = "INSERT INTO entrega(idCliente, data, valor, metodoPagamento, troco, observacao, logradouro, numero, bairro, cidade, referencia) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            String data = sdf.format(entrega.getData().getTime());

            ps.setInt(1, entrega.getIdCliente());
            ps.setString(2, data);
            ps.setFloat(3, entrega.getValor());
            ps.setInt(4, entrega.getMetodoPagamento());
            ps.setFloat(5, entrega.getTroco());
            ps.setString(6, entrega.getObservacao());
            ps.setString(7, entrega.getLogradouro());
            ps.setInt(8, entrega.getNumero());
            ps.setString(9, entrega.getBairro());
            ps.setString(10, entrega.getCidade());
            ps.setString(11, entrega.getReferencia());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            int insertedId;
            if (rs.next()) {
                insertedId = rs.getInt(1);
            } else {
                insertedId = 0;
            }

            conn.close();

            JOptionPane.showMessageDialog(null, "Entrega cadastrada com sucesso", "Informação", JOptionPane.INFORMATION_MESSAGE);

            return insertedId;
        } catch (SQLException ex) {
            Logger.getLogger(EntregaDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro na inserção do cliente", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return 0;
    }

    public static ArrayList<Entrega> selectTodasEntregasDeCliente(int idCliente) {
        try {
            Connection conn = DriverManager.getConnection(DAOPaths.dbPath);

            Statement stmt = conn.createStatement();
            ResultSet rs;
            ArrayList<Entrega> arrayEntregas = new ArrayList<>();

            rs = stmt.executeQuery("SELECT * FROM entrega WHERE idCliente = " + String.valueOf(idCliente));

            while (rs.next()) {
                arrayEntregas.add(extractEntregaFromRs(rs));
            }

            conn.close();

            return arrayEntregas;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro na seleção", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

}
