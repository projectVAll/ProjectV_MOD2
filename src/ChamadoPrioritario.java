
public class ChamadoPrioritario extends Chamado{
	private Prioridade prioridade;
	
	public ChamadoPrioritario() {
		
	}
	
	public void exibir() {
		System.out.println("Exibiu o Chamado prioritario");
	}
	
	
	
	public ChamadoPrioritario(int codigo,String descricao, Prioridade prioridade ) {
		super(codigo,descricao);
		this.prioridade = prioridade;
	}


	public Prioridade getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Prioridade prioridade) {
		this.prioridade = prioridade;
	}
	


	
}
