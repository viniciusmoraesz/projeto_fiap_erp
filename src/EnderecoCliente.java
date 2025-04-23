public class EnderecoCliente {
    private String logradouro;
    private int numero;
    private String cep;
    private String cidade;
    private String estado;
    public EnderecoCliente(){}

    public EnderecoCliente(String logradouro, int numero, String cep, String cidade, String estado){
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String descrever(){
        return "Logradouro: "+this.logradouro+" "+this.numero+", "+this.cidade+", "+this.estado;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
