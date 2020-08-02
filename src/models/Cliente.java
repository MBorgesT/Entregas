
package models;

public class Cliente {
    
    private int idCliente;
    private String nome, telefone1, telefone2, logradouro;
    private int numero;
    private String bairro, cidade, referencia;

    public Cliente(int idCliente, String nome, String telefone1, String telefone2, String logradouro, int numero, String bairro, String cidade, String referencia) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.referencia = referencia;
    }

    public Cliente(String nome, String telefone1, String telefone2, String logradouro, int numero, String bairro, String cidade, String referencia) {
        this.nome = nome;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.referencia = referencia;
    }
    
    public Object[] getObjectArray(){
        return new Object[]{
            this.idCliente,
            this.nome
        };
    }

    public int getIdCliente() {
        return idCliente;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public String getLogradouro() {
        return logradouro;
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

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }
    
    
    
}
