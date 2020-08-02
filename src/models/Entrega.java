
package models;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Entrega {
    
    private int idEntrega, idCliente;
    private Calendar data;
    private float valor;
    private String observacao, logradouro;
    private int numero;
    private String bairro, cidade, referencia;

    public Entrega(int idEntrega, int idCliente, Calendar data, float valor, String observacao, String logradouro, int numero, String bairro, String cidade, String referencia) {
        this.idEntrega = idEntrega;
        this.idCliente = idCliente;
        this.data = data;
        this.valor = valor;
        this.observacao = observacao;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.referencia = referencia;
    }

    public Entrega(int idCliente, Calendar data, float valor, String observacao, String logradouro, int numero, String bairro, String cidade, String referencia) {
        this.idCliente = idCliente;
        this.data = data;
        this.valor = valor;
        this.observacao = observacao;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.referencia = referencia;
    }

    public Entrega(int idEntrega, int idCliente, Calendar data, float valor, String observacao) {
        this.idEntrega = idEntrega;
        this.idCliente = idCliente;
        this.data = data;
        this.valor = valor;
        this.observacao = observacao;
    }
    
    public Object[] getObjectArray(){
        return new Object[]{
            this.idEntrega,
            this.getFormattedData(),
            this.getFormattedValor()
        };
    }

    public String getFormattedValor() {
        String valor = String.format("%.02f", this.getValor());
        valor = valor.replace('.', ',');
        return valor;
    }

    public String getFormattedData() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return sdf.format(data.getTime());
    }

    public int getIdEntrega() {
        return idEntrega;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Calendar getData() {
        return data;
    }

    public float getValor() {
        return valor;
    }

    public String getObservacao() {
        return observacao;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setIdEntrega(int idEntrega) {
        this.idEntrega = idEntrega;
    }

    
    
}
