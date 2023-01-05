package FarmaciaPoo;

public class Farmacia {
	private String nomeFarm;
	private String endereco;
	private String estado;
	private String tipo;
	private int unidade;
	
	public Farmacia(String nomeFarm, String endereco, String estado, String tipo, int unidade) {
		super();
		this.nomeFarm = nomeFarm;
		this.endereco = endereco;
		this.estado = estado;
		this.tipo = tipo;
		this.unidade = unidade;
		
		
		
	}

	public String getnomeFarm() {
		return nomeFarm;
	}

	public void setnomeFarm(String nomeFarm) {
		this.nomeFarm = nomeFarm;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getUnidade() {
		return unidade;
	}

	public void setUnidade(int unidade) {
		this.unidade = unidade;
	}	
	public void imprimirInfo() {
		System.out.println("\nNome: "+nomeFarm+" Endereco: "+endereco+" Estado: "+estado+" Tipo "+tipo+" unidade "+unidade);
	
	
}

	
}
