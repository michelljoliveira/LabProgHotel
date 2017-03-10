package projeto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MenuPrincipal {
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<Pessoa> clientes = new ArrayList<Pessoa>(); 

	public static void main(String[] args) {
		
		System.out.println("Sistema de Administração"+System.lineSeparator());
		int op;
		do{
			imprimeMenuPrincipal();
			op = sc.nextInt();
			switch (op){

			case 1:		menuCadastroClientes();break;

			case 2:		menuGerenciaHotel();break;

			case 3:		menuContabilidade();break;

			case 4:		System.out.println("Sistema Encerado.");break;


			default:    System.out.println("Opção invalida "+System.lineSeparator());
			}
		}while(op>=1 && op<4);
	}

	private static void menuContabilidade() {
		imprimeMenuContabilidade();
		int op;
		do{
			op = sc.nextInt();
			switch (op){


			case 1:		break;

			case 2:		break;

			case 3:		break;

			case 4:		break;

			default:    System.out.println("Opção invalida "+System.lineSeparator());
			}
		}while(op>=1 && op<4);
	}

	private static void menuGerenciaHotel() {
		imprimeMenuGerenciaHotel();
		int op;
		do{
			op = sc.nextInt();
			switch (op){

			case 1:		break;

			case 2:		break;

			case 3:		break;

			case 4:		break;
			
			case 5:		break;


			default:    System.out.println("Opção invalida "+System.lineSeparator());
			}
		}while(op>=1 && op<5);
	}

	private static void menuCadastroClientes() {
		imprimeMenuCadastroClientes();
		int op;
		do{
			op = sc.nextInt();
			switch (op){


			case 1:		cadastroNovoCliente();break;

			case 2:		menuEditarCliente();break;

			case 3:		break;

			case 4:		break;

			default:    System.out.println("Opção invalida "+System.lineSeparator());
			}
		}while(op>=1 && op<4);
		
	}

	private static void cadastroNovoCliente() {
		System.out.println("Novo Cliente"+ System.lineSeparator());
		String nome = obtem("Nome: ",3);
		String sobrenome = obtem("Sobrenome: ",3);
		String cpf = obtem("Cpf: ",11);
		Pessoa p1 = new Cliente(nome,sobrenome,cpf);
		clientes.add(p1);
	}
	private static void menuEditarCliente() {
		//TODO
		System.out.println("Menu Editar Cliente"+System.lineSeparator());
		int op = 0;
		boolean condi = false;
		String nome;
		Cliente aux = null;
		
		do{
			System.out.print("Digite o nome do cliente a ser editado:");
			nome = sc.next();
			aux = retornaCliente(nome);
			if (aux == null) {
				System.out.println("O cliente" + nome +"nao foi encontrado.");
			}
			
			
		}while(condi);
		System.out.println("Digite o campo a ser editado:"+System.lineSeparator()+"1 - Nome; 2 - Sobrenome");
			
		
		do{
				op = sc.nextInt();
				switch (op){


				case 1:		nome = obtem("Novo nome",3);break;

				case 2:		break;
				

				default:    System.out.println("Opção invalida "+System.lineSeparator());
				}
			}while(op>=1 &&op<3);
		
	}
	
	/**
	 * Metodo para pesquisa de um cliente atraves do nome
	 * @param nome A ser pesquisado
	 * @return Instancia do cliente pesquisado ou null caso nao exista.
	 */
	private static Cliente retornaCliente(String nome) {
		Iterator it = clientes.iterator();
		while (it.hasNext()){
			Cliente aux = (Cliente) it.next();
			if (aux.getNome().equals(nome)){
				return aux;
			}
		}
		return null;
	}
	
	/**
	 * Metodo para obtencao de uma string  
	 * @param string Informacao a ser impressa na tela
	 * @param tamanhoMin restricao do tamanho
	 * @return String solicitada
	 */
	private static String obtem(String string,int tamanhoMin) {
		String nome;
		do{
			System.out.print(string);
			nome = sc.next();
			if(nome.length()<tamanhoMin){
				System.out.println("Valor invalido."+ System.lineSeparator());
			}
		}while(nome.length()<tamanhoMin);
		
		return nome;
	}

	private static void imprimeMenuPrincipal() {
		System.out.println("Menu Administracao"+System.lineSeparator());
		System.out.println("1 - Clientes");
		System.out.println("2 - Gerencia do hotel");
		System.out.println("3 - Contabilidade");
		System.out.println("4 - Sair"+System.lineSeparator());
		System.out.print("Opcao: ");
	}
	private static void imprimeMenuCadastroClientes() {
		System.out.println("Menu Cadastro de clientes"+System.lineSeparator());
		System.out.println("1 - Cadastro de novo cliente");
		System.out.println("2 - Editar um cliente");
		System.out.println("3 - Remover um cliente");
		System.out.println("4 - Voltar"+System.lineSeparator());
		System.out.print("Opcao: ");
	}
	private static void imprimeMenuGerenciaHotel() {
		System.out.println("Menu Gerencia Hotel"+System.lineSeparator());
		System.out.println("1 - Nova reserva");
		System.out.println("2 - Registrar Saida");
		System.out.println("3 - Relacao de quartos disponiveis");
		System.out.println("4 - Saldo Atual por cliente");
		System.out.println("5 - Voltar "+System.lineSeparator());
		System.out.print("Opcao: ");
	}
	private static void imprimeMenuContabilidade() {
		System.out.println("Menu Contabilidade"+System.lineSeparator());
		System.out.println("1 - Planilha de lucro atual");
		System.out.println("2 - Projecao orcamentaria");
		System.out.println("3 - Em breve");
		System.out.println("4 - Voltar"+System.lineSeparator());
		System.out.print("Opcao: ");
		
	}
}
