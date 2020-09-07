package validators;

import java.awt.Component;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class EntregaFormValidation {

    JTextField valor, logradouro, numero, bairro, cidade, troco;
    JRadioButton dinheiro, cartao;

    public EntregaFormValidation(JPanel panel) {
        Component[] components = panel.getComponents();
        HashMap componentMap = new HashMap<String, Component>();
        for (int i = 0; i < components.length; i++) {
            componentMap.put(components[i].getName(), components[i]);
        }

        valor = (JTextField) componentMap.get("valor");
        dinheiro = (JRadioButton) componentMap.get("dinheiro");
        cartao = (JRadioButton) componentMap.get("cartao");
        troco = (JTextField) componentMap.get("troco");
        logradouro = (JTextField) componentMap.get("logradouro");
        numero = (JTextField) componentMap.get("numero");
        bairro = (JTextField) componentMap.get("bairro");
        cidade = (JTextField) componentMap.get("cidade");
    }

    public boolean validate() {
        return (validarMetodoPagamentoSelecionado() && !campoVazio() && validarValor() && validarTroco() && validarNumero());
    }

    private boolean campoVazio() {
        if (valor.getText().isEmpty()
                || logradouro.getText().isEmpty()
                || numero.getText().isEmpty()
                || bairro.getText().isEmpty()
                || cidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Algum campo obrigatório está vazio", "Atenção", JOptionPane.WARNING_MESSAGE);
            return true;
        } else {
            return false;
        }
    }

    private boolean validarMetodoPagamentoSelecionado() {
        if (dinheiro.isSelected() || cartao.isSelected()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Favor selecionar um método de pagamento.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    private boolean validarValor() {
        String valor = this.valor.getText();
        valor = valor.replaceAll(",", ".");

        try {
            Float.parseFloat(valor);
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O valor da compra é inválido", "Atenção", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    private boolean validarTroco() {
        if (this.troco.getText().isEmpty()) {
            return true;
        } else {
            String troco = this.troco.getText();
            troco = troco.replaceAll(",", ".");

            try {
                Float.parseFloat(troco);
                return true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "O valor do troco é inválido", "Atenção", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }
    }

    private boolean validarNumero() {
        try {
            Integer.parseInt(numero.getText());
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O número do endereço é inválido", "Atenção", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

}
