package ProjetoIntegrador;

public class Medico {
			
	private String nomeDoMedico;
	private String especialidade;
	private String cpfDoMedico;
	
	
		public Medico(String nomeDoMedico, String especialidade, String cpfDoMedico) {
		
		this.nomeDoMedico = nomeDoMedico;
		this.especialidade = especialidade;
		this.cpfDoMedico = cpfDoMedico;
	}
		
			public Medico() {
		}

public String getNomeDoMedico() {
	return nomeDoMedico;
}
public void setNomeDoMedico(String nomeDoMedico) {
	this.nomeDoMedico = nomeDoMedico;
}
public String getCpfDoMedico() {
	return cpfDoMedico;
}
public void setCpfDoMedico(String cpfDoMedico) {
	this.cpfDoMedico = cpfDoMedico;
}
public String getEspecialidade() {
	return especialidade;
}
public void setEspecialidade(String especialidade) {
	this.especialidade = especialidade;
}


@Override
public String toString() {
	return "Medico [nomeDoMedico=" + nomeDoMedico + 
			", cpfDoMedico=" + cpfDoMedico + 
			", especialidade=" + especialidade + "]";
}
	
	
	}
