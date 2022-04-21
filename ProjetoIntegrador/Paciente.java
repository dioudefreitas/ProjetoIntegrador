package ProjetoIntegrador;

public class Paciente {
		
	private String nomeDoPaciente;
	private String cpfDoPaciente;
	private String endereco;
	private String Consulta;
	
	public Paciente(String nomeDoPaciente, String cpfDoPaciente, String endereco) {
		
		this.nomeDoPaciente = nomeDoPaciente;
		this.cpfDoPaciente = cpfDoPaciente;
		this.endereco = endereco;
	}

	public Paciente() {
	
	}

	public String getNomeDoPaciente() {
		return nomeDoPaciente;
	}

	public void setNomeDoPaciente(String nomeDoPaciente) {
		this.nomeDoPaciente = nomeDoPaciente;
	}

	public String getCpfDoPaciente() {
		return cpfDoPaciente;
	}

	public void setCpfDoPaciente(String cpfDoPaciente) {
		this.cpfDoPaciente = cpfDoPaciente;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String toString() {
		return "nomeDoPaciente=" + nomeDoPaciente
				+ ", cpfDoPaciente=" + cpfDoPaciente 
				+ ", endereco=" + endereco + "]";
	}


	public String getConsulta() {
		return Consulta;
	}



	public void setConsulta(String consulta) {
		Consulta = consulta;
	}
	
	
	}
	


