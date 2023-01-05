package ClientePoo;

public class Cliente {
	private String nomeCliente;
	private String sobrenomeCliente;
	private String dataNasc;
	private int telefone;
	private int matricula;
	
	public Cliente(String nomeCliente, String sobrenomeCliente, String dataNasc, int telefone, int matricula) {
		
		this.nomeCliente = nomeCliente;
		this.sobrenomeCliente = sobrenomeCliente;
		this.dataNasc = dataNasc;
		this.telefone = telefone;
		this.matricula = matricula;
		
		
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getSobrenomeCliente() {
		return sobrenomeCliente;
	}

	public void setSobrenomeCliente(String sobrenomeCliente) {
		this.sobrenomeCliente = sobrenomeCliente;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
		
	}	
	public void imprimirInfo() {	
		System.out.println("\nNome: "+nomeCliente+" Sobrenome: "+sobrenomeCliente+" Nasc: "+dataNasc+"Telefone:"+telefone+" Matrícula "+matricula);
	
	}
	
	
}

