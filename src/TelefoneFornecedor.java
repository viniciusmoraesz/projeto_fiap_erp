public class TelefoneFornecedor extends Telefone {
    private Fornecedor fornecedor;
    public TelefoneFornecedor(String ddi, String ddd, String numero, Fornecedor fornecedor){
        super(ddi, ddd, numero);
        this.fornecedor = fornecedor;
    }

    @Override
    public String descrever() {
        return "Telefone de " + fornecedor.getNome() + ": +" + this.ddi + " " + this.ddd + " " + this.numero;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
