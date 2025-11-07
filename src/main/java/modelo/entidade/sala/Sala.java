package modelo.entidade.sala;

public class Sala {

    private Long id;
    private String nomeSala;

    public Sala(Long id, String nomeSala) {
        this.id = id;
        this.nomeSala = nomeSala;
    }

    public Sala(String nomeSala) {
        this.nomeSala = nomeSala;
    }

    public Sala(long salaTurma) {
        this.id = salaTurma;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeSala() {
        return nomeSala;
    }

    public void setNomeSala(String nomeSala) {
        this.nomeSala = nomeSala;
    }
}
