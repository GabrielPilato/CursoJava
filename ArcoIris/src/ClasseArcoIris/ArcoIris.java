package ClasseArcoIris;

import java.util.HashSet;
import java.util.Set;

public class ArcoIris{
	
	private Set<String> cores = new HashSet<String>();

	public ArcoIris() {
		this.cores.add("Vermelho");
		this.cores.add("Laranja");
		this.cores.add("Amarelo");
		this.cores.add("Verde");
		this.cores.add("Azul");
		this.cores.add("Anil");
		this.cores.add("Violeta");
	}

	public Set<String> getCores() {
		return cores;
	}

	public void setCores(Set<String> cores) {
		this.cores = cores;
		
	}
	
	public void remove(String valor)
	{
		cores.removeIf(corAtual -> corAtual.toUpperCase().startsWith(valor));
	}
	
	
	

}
