public enum TipoUsuario {
    ADMINISTRADOR("Administrador"),
    CLIENTE("Cliente");

    private final String descricao;

    TipoUsuario(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }
}
