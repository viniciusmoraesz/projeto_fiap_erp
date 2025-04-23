public class TelefoneCliente extends Telefone {
    private Cliente cliente;
    public TelefoneCliente(String ddi, String ddd, String numero, Cliente cliente){
        super(ddi, ddd, numero);
        this.cliente = cliente;
    }

    @Override
    public String descrever() {
        return "Telefone de " + cliente.getNome() + ": +" + this.ddi + " " + this.ddd + " " + this.numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
