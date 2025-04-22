public enum StatusProjeto {
    REALIZADO("Realizado"),
    EM_ANDAMENTO("Em andamento"),
    A_FAZER("A fazer"),
    PAUSADO("Pausado");

    private final String descricao;

    StatusProjeto(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }
}
