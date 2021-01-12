
public class Chamado {

	protected int codigo;
	protected String descricao;
	
	public Chamado() {
		
	}
	
	public void exibir() {
		System.out.println("Exibiu o Chamado");
	}
	
	
	
	public Chamado(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
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
		return "Chamado [codigo=" + codigo + ", descricao=" + descricao + "]";
	}	
	
	
	
}
