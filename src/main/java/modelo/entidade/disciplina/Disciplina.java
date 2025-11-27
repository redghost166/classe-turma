package modelo.entidade.disciplina;

public class Disciplina {

	private String nome;
	private double cargaHoraria;
	private String descricao;
	private Long id;

	public Disciplina(Long id, String nome, String descricao, double cargaHoraria) {
			
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.descricao = descricao;
		this.id = id;
			
	}

    public Disciplina(long disciplinaTurma) {
        id = disciplinaTurma;
    }

    public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setcargaHoraria(double cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
}
