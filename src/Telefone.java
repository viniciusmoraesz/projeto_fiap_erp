public abstract class Telefone {
    protected String ddi;
    protected String ddd;
    protected String numero;

    public Telefone(){}

    public Telefone(String ddi, String ddd, String numero){
        this.ddi = ddi;
        this.ddd = ddd;
        this.numero = numero;
    }

    public abstract String descrever();

    public String getDdi() {
        return ddi;
    }

    public void setDdi(String ddi) {
        this.ddi = ddi;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
