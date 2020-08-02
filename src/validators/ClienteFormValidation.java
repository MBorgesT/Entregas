package validators;

import dao.ClienteDAO;
import java.awt.Component;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Objects;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import models.Cliente;

public class ClienteFormValidation {

    JTextField nome, telefone1, telefone2, logradouro, numero, bairro, cidade, referencia;

    public ClienteFormValidation(JPanel panel) {

        Component[] components = panel.getComponents();
        HashMap componentMap = new HashMap<String, Component>();
        for (int i = 0; i < components.length; i++) {
            componentMap.put(components[i].getName(), components[i]);
        }

        nome = (JTextField) componentMap.get("nome");
        telefone1 = (JTextField) componentMap.get("telefone1");
        telefone2 = (JTextField) componentMap.get("telefone2");
        logradouro = (JTextField) componentMap.get("logradouro");
        numero = (JTextField) componentMap.get("numero");
        bairro = (JTextField) componentMap.get("bairro");
        cidade = (JTextField) componentMap.get("cidade");
        referencia = (JTextField) componentMap.get("referencia");
    }

    public boolean validate() {
        return (validarNumeroValorInteiro()
                && !temCampoVazio());
    }

    private boolean validarNumeroValorInteiro() {
        try {
            Integer.parseInt(numero.getText());
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O campo de número só pode conter somente valores numéricos", "Atenção", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    private boolean temCampoVazio() {
        if (nome.getText().isEmpty()
                || telefone1.getText().isEmpty()
                || logradouro.getText().isEmpty()
                || numero.getText().isEmpty()
                || bairro.getText().isEmpty()
                || cidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Favor preencher todos os campos obrigatórios", "Atenção", JOptionPane.WARNING_MESSAGE);
            return true;
        } else {
            return false;
        }
    }
}
