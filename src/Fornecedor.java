public class Fornecedor {
    private String nome;
    private String cnpj;

    // Normalizar telefone
    private String telefone;
    private String email;

    public Fornecedor(){}

    public Fornecedor(String nome, String cnpj, String telefone, String email){
        this.nome = nome;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome(){ return this.nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCnpj() { return cnpj; }

    public void setCnpj(String cnpj) { this.cnpj = cnpj; }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
