package modelo.entidade.usuario;


public class Usuario {

    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private String senha;

    public Usuario(Long id, String nome, String email, String telefone, String endereco, String senha) {
        setId(id);
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
        setEndereco(endereco);
        setSenha(senha);
    }

    public Usuario(String nome, String email, String telefone, String endereco, String senha) {
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
        setEndereco(endereco);
        setSenha(senha);
    }



    public Usuario(long id) {
        setId(id);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
