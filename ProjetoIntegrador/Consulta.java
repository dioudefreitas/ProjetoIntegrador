package ProjetoIntegrador;

public class Consulta {
	
	private String Medico;
	private String Paciente;
	private String nomeDoMedico;
	private String nomeDoPaciente;
	private double data;
	private int hora;
	private int numeroDaConsulta;
	
	 public Consulta (String  nomeDoMedico, String nomeDoPaciente, 
			double data, int hora, int numeroDaConsulta ) {
		this. nomeDoMedico =  nomeDoMedico;
		this.nomeDoPaciente = nomeDoPaciente;
		this.data = data;
		this.hora = hora;
		this.numeroDaConsulta = numeroDaConsulta =+ 1; ///ver se funciona
		}
	public Consulta() {
		
	}
	
		public String getNomeDoMedico() {
		return nomeDoMedico;
	}
	public void setNomeDoMedico(String nomeDoMedico) {
		this.nomeDoMedico = nomeDoMedico;
	}
	public String getNomeDoPaciente() {
		return nomeDoPaciente;
	}
	public void setNomeDoPaciente(String nomeDoPaciente) {
		this.nomeDoPaciente = nomeDoPaciente;
	}
	public double getData() {
		return data;
	}
	public void setData(double d) {
		this.data = d;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getNumeroDaConsulta() {
		return numeroDaConsulta;
	}
	public void setNumeroDaConsulta(int numeroDaConsulta) {
		this.numeroDaConsulta = numeroDaConsulta;
	}
	
	////****
	public String getMedico() {
		return Medico;
	}
	public void setMedico(String medico) {
		Medico = medico;
	}
	public String getPaciente() {
		return Paciente;
	}
	public void setPaciente(String paciente) {
		Paciente = paciente;
	}
	
}
