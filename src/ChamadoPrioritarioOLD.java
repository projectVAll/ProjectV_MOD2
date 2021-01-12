
public class ChamadoPrioritarioOLD {

	private int        codigo;
	private String     descricao;
	private Prioridade prioridade;
	
	
	public ChamadoPrioritarioOLD() {
		
	}
	
	public ChamadoPrioritarioOLD(int codigo, String descricao, Prioridade prioridade) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.prioridade = prioridade;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "ChamadoPrioritario [codigo=" + codigo + ", descricao=" + descricao + ", prioridade=" + prioridade + "]";
	}


	
	
}
