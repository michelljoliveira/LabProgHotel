package projeto;

import java.util.ArrayList;
import java.util.List;

public class Cliente  {
	private String nome,sobrenome,cpf; 
	double saldo = 0;
	protected List<Quarto> quartos = new ArrayList<>();
	
	public Cliente(String nome,String sobrenome, String cpf){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void adicionaSaldo(double saldo) {
		this.saldo += saldo;
	}
	public void subtraiSaldo(double saldo) {
		this.saldo -= saldo;
	}

	@Override
	public String toString() {
		return "Cliente [Nome: " + nome + ", Sobrenome: " + sobrenome + ", cpf: " + cpf + ", Saldo Atual: " + saldo + "]";
	}
}
