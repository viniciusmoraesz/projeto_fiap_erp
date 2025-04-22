public class Usuario {
    private String email;
    private String senha;
    private TipoUsuario tipo_usuario;
    private boolean ativo = true;
    public Usuario(){}
    public Usuario(String email, String senha, TipoUsuario tipo_usuario){
        this.email = email;
        this.senha = senha;
        this.tipo_usuario = tipo_usuario;
    }

    public void logout(){}

    public void login(){}

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        // Necessário realizar validações
        this.email = email;
    }
    public String getSenha(){
        return this.senha;
    }
    public void setSenha(String senha){
        // Necessário realizar validações e criptografar senha
        this.senha = senha;
    }
    public TipoUsuario getTipoUsuario(){
        return this.tipo_usuario;
    }

    public void setTipoUsuario(TipoUsuario tipo_usuario){
        this.tipo_usuario = tipo_usuario;
    }

    public boolean getAtivo(){
        return this.ativo;
    }

    public void setAtivo(boolean ativo){
        this.ativo = ativo;
    }
}
