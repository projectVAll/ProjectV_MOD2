
public class Principal {

	public static void main(String[] args) {
		Chamado c = new Chamado(1,"teste");
		ChamadoPrioritarioOLD cp = new ChamadoPrioritarioOLD(2,"Urgente",Prioridade.BAIXA);
		
		
		System.out.println(c);
		System.out.println("Chamado prioritario " + cp);
	}

}
