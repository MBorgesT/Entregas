package printers;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.Cliente;
import models.Entrega;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.json.JSONException;
import org.json.JSONObject;

public class Printer {

    private static String baseFolder = System.getProperty("user.home") + "/printer_scripts/";

    //private static String printCommand = "python3 " + baseFolder + "print_entrega.py";
    //private static String jsonFile = baseFolder + "entrega.json";
    
    private static String configFile = baseFolder + "config.txt";

    public static void printComprovante(Entrega entrega, Cliente cliente) {
        try {
            String valor = String.format("%.02f", entrega.getValor());
            valor = valor.replace('.', ',');

            String obs = entrega.getObservacao().isEmpty() ? "null" : entrega.getObservacao();
            String referencia = entrega.getReferencia().isEmpty() ? "null" : entrega.getReferencia();
            String telefone2 = cliente.getTelefone2().isEmpty() ? "null" : cliente.getTelefone2();

            JSONObject json = new JSONObject();
            json.put("id_entrega", String.valueOf(entrega.getIdEntrega()));
            json.put("nome_cliente", cliente.getNome());
            json.put("telefone1", cliente.getTelefone1());
            json.put("telefone2", telefone2);
            json.put("data", entrega.getFormattedData());
            json.put("valor", entrega.getFormattedValor());
            json.put("observacao", obs);

            json.put("logradouro", entrega.getLogradouro());
            json.put("numero", entrega.getNumero());
            json.put("bairro", entrega.getBairro());
            json.put("cidade", entrega.getCidade());
            json.put("referencia", referencia);
            
            File file = new File(configFile);
            Scanner sc = new Scanner(file);
            String ip = sc.nextLine();

            CloseableHttpClient httpClient = HttpClientBuilder.create().build();
            HttpPost request = new HttpPost("http://" + ip + "/entrega_cliente/");
            StringEntity params = new StringEntity(json.toString());
            request.addHeader("content-type", "application/json");
            request.setEntity(params);
            httpClient.execute(request);
            
            JOptionPane.showMessageDialog(null, "Confirme para imprimir a nota da padaria", "Recibo", JOptionPane.INFORMATION_MESSAGE);
            
            httpClient = HttpClientBuilder.create().build();
            request = new HttpPost("http://" + ip + "/entrega_padaria/");
            params = new StringEntity(json.toString());
            request.addHeader("content-type", "application/json");
            request.setEntity(params);
            httpClient.execute(request);
        } catch (JSONException ex) {
            Logger.getLogger(Printer.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Houve algum erro ao criar o arquivo JSON", "Error", JOptionPane.WARNING_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(Printer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
