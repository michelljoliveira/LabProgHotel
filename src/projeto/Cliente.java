package projeto;

public class Cliente implements Pessoa {
	private String nome,sobrenome,cpf;
	
	public Cliente(String nome,String sobrenome, String cpf){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}

	@Override
	public String getNome() {
		return nome;
	}
	@Override
	public String getSobrenome() {
		return sobrenome;
	}

	@Override
	public void setNome(String novoNome) {
		if (!(novoNome.isEmpty())){
			nome = novoNome;
		}
	}

	@Override
	public String getCpf() {
		return cpf;
	}
	@Override
	public String toString(){
		return "Nome do cliente: "+ getNome() + " "+getSobrenome()+ System.lineSeparator()+"Cpf: "+getCpf();
	}

	@Override
	public void setSobrenome(String novoSobrenome) {
		sobrenome = novoSobrenome;
		
	}

	

}
