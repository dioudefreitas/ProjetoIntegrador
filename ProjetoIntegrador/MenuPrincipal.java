package ProjetoIntegrador;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuPrincipal {
	
		
	private static ArrayList <Medico> listaDeMedicos = new ArrayList <Medico> ();
	private static ArrayList <Paciente> listaDePacientes = new ArrayList <Paciente> ();
	private static ArrayList <Consulta> listaDeConsultas = new ArrayList <Consulta> ();

		private static String endereco, nomeDoMedico, cpfDoMedico, especialidade,
		nomeDoPaciente, cpfDoPaciente;
	
		private static int numeroDaConsulta, hora, data;
	
		private static Consulta consulta; 
		private static Paciente paciente;
	
		public static void main(String[] args) {
		
				int opcao;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		Paciente paciente;
		Medico medico;
		Consulta consulta;
		
		do{
			System.out.println("|------------------------------------|");
			System.out.println("|----------------MENU----------------|");
			System.out.println("|------------------------------------|");
			System.out.println("|--Escolha a opção que você deseja:--|");
			System.out.println("|------------------------------------|");
			System.out.println("|----- 1 Para Cadastrar Médico.------|");
			System.out.println("|----- 2 Para Cadastrar Paciente.----|");
			System.out.println("|----- 3 Para Agendar Consulta.------|");
			System.out.println("|- 4 Lista de Consulta por paciente.-|");
			System.out.println("|- 5 Lista de Consulta por Medico----|");
			System.out.println("|- 6 Lista de Medicos Cadastrados.---|");
			System.out.println("|- 7 Lista de Pacientes Cadastrados--|");
			System.out.println("|- 8 Lista de Consultas Agendadas----|");
			System.out.println("|------------------------------------|");
			
			opcao = teclado.nextInt();
			teclado.nextLine();
			
			switch (opcao) {
			///CADASTRAR MÉDICO
			case 1:
				System.out.println("/nNome do Médico: ");
				String nomeDoMedico = teclado.nextLine();
				System.out.println("/nEspecilidade do médico: ");
				String especialidade = teclado.nextLine();
				System.out.println("/nCPF do Médico: ");
				String cpfDoMedico = teclado.nextLine();
				
				medico = new Medico(nomeDoMedico, especialidade, cpfDoMedico);
				
				listaDeMedicos.add(medico);
				break;
				
			///CADASTRAR PACIENTE	
			case 2:
				System.out.println("/nNome do Paciente:");
				String nomeDoPaciente = teclado.nextLine();
				System.out.println("/nEndereco do Paciente");
				String endereco = teclado.nextLine();
				System.out.println("/nCPF do paciente: ");
				String cpfDoPaciente = teclado.nextLine();
				
				paciente = new Paciente(nomeDoPaciente, endereco, cpfDoPaciente);
				
				listaDePacientes.add(paciente);
				break;
				
			///AGENDAR CONSULTA
			case 3:
				System.out.println("/nNome do Paciente: ");
				setNomeDoPaciente(teclado.nextLine());
				System.out.println("Especialidade Procurada: ");
				setEspecialidade(teclado.nextLine());
				System.out.println("/nEscolha a data usando o formato DD.MM.AAAA:");
				setData(teclado.nextInt());
				System.out.println("n/Escolha a hora para a consulta:");
				setHora(teclado.nextInt());
				
				consulta = new Consulta(getNomeDoPaciente(), getEspecialidade(),
						data, hora, numeroDaConsulta);
				
				
				listaDeConsultas.add(consulta);
				
				break;
			///LISTA DE CONSULTA POR PACIENTE	
			case 4:
				
				
				break;
			///LISTA DE CONSULTA POR MEDICO	
			case 5:
				
				
				break;
			
			///LISTA DE MEDICOS CADASTRADOS
			case 6:
				for (int i = 0 ; i < listaDeMedicos.size(); i ++) {
					medico = listaDeMedicos.get(i);
				
					System.out.println("/nNome do Medico: " + medico.getNomeDoMedico());
					System.out.println("/nEspecialidade: " + medico.getEspecialidade());
					System.out.println("/nCPF do Médico: " + medico.getCpfDoMedico());
					
					}
				
				break;
			///LISTA DE PACIENTES CADASTRADOS
			case 7:	
				for (int i = 0 ; i < listaDeMedicos.size(); i ++) {
					paciente = listaDePacientes.get(i);
					
					System.out.println("/nNome do Paciente: " + paciente.getNomeDoPaciente());
					System.out.println("/nEndereço: " + paciente.getEndereco());
					System.out.println("/nCPF do Paciente: " + paciente.getCpfDoPaciente());
					
					}
					
				break;
				
				
			///LISTA DE CONSULTAS AGENDADAS	
			case 8:	
			
				break;
						
				
			default:
				System.out.println("Opção Invalida!");
			}
		}while(opcao != 0);
	
		
		
		
		teclado.close();
		
		
			
		}

	public static ArrayList<Medico> getListaDeMedicos() {
		return listaDeMedicos;
	}

	public static void setListaDeMedicos(ArrayList<Medico> listaDeMedicos) {
		MenuPrincipal.listaDeMedicos = listaDeMedicos;
	}

	public static ArrayList<Paciente> getListaDePacientes() {
		return listaDePacientes;
	}

	public static void setListaDePacientes(ArrayList<Paciente> listaDePacientes) {
		MenuPrincipal.listaDePacientes = listaDePacientes;
	}

	public static ArrayList<Consulta> getListaDeConsultas() {
		return listaDeConsultas;
	}

	public static void setListaDeConsultas(ArrayList<Consulta> listaDeConsultas) {
		MenuPrincipal.listaDeConsultas = listaDeConsultas;
	}

	public static Paciente getPaciente() {
		return paciente;
	}

	public static void setPaciente(Paciente paciente) {
		MenuPrincipal.paciente = paciente;
	}

	public static String getEndereco() {
		return endereco;
	}

	public static void setEndereco(String endereco) {
		MenuPrincipal.endereco = endereco;
	}

	public static String getCpfDoMedico() {
		return cpfDoMedico;
	}

	public static void setCpfDoMedico(String cpfDoMedico) {
		MenuPrincipal.cpfDoMedico = cpfDoMedico;
	}

	public static String getEspecialidade() {
		return especialidade;
	}

	public static void setEspecialidade(String especialidade) {
		MenuPrincipal.especialidade = especialidade;
	}

	public static String getNomeDoPaciente() {
		return nomeDoPaciente;
	}

	public static void setNomeDoPaciente(String nomeDoPaciente) {
		MenuPrincipal.nomeDoPaciente = nomeDoPaciente;
	}

	public static String getCpfDoPaciente() {
		return cpfDoPaciente;
	}

	public static void setCpfDoPaciente(String cpfDoPaciente) {
		MenuPrincipal.cpfDoPaciente = cpfDoPaciente;
	}

	public static String getNomeDoMedico() {
		return nomeDoMedico;
	}

	public static void setNomeDoMedico(String nomeDoMedico) {
		MenuPrincipal.nomeDoMedico = nomeDoMedico;
	}

	public static int getNumeroDaConsulta() {
		return numeroDaConsulta;
	}

	public static void setNumeroDaConsulta(int numeroDaConsulta) {
		MenuPrincipal.numeroDaConsulta = numeroDaConsulta;
	}

	public static int getData() {
		return data;
	}

	public static void setData(int data) {
		MenuPrincipal.data = data;
	}

	public static int getHora() {
		return hora;
	}

	public static void setHora(int hora) {
		MenuPrincipal.hora = hora;
	}

	public static Consulta getConsulta() {
		return consulta;
	}

	public static void setConsulta(Consulta consulta) {
		MenuPrincipal.consulta = consulta;
	}

	
		
	}

	
	
		
	

