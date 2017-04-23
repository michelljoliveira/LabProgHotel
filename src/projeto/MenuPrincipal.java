package projeto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MenuPrincipal {
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>(); 
	private static Hotel  ht = new Hotel();

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

			case 4:		System.out.println("Sistema Encerrado.");break;


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
		//TODO
		int op;
		do{
			imprimeMenuGerenciaHotel();
			op = sc.nextInt();
			switch (op){

			case 1:		cadastroNovaReserva();break;

			case 2:		break;

			case 3:		mostrarQuartosDisponiveis();break;

			case 4:		break;
			
			case 5:		break;


			default:    System.out.println("Opção invalida "+System.lineSeparator());
			}
		}while(op>=1 && op<5);
	}

	private static void menuCadastroClientes() {
		
		int op;
		do{
			imprimeMenuCadastroClientes();
			op = sc.nextInt();
			switch (op){


			case 1:		cadastroNovoCliente();break;

			case 2:		menuEditarCliente();break;

			case 3:		menuRemoverCliente();break;

			case 4:		mostrarClientesCadastrados();break;
			
			case 5:		break;

			default:    System.out.println("Opção invalida "+System.lineSeparator());
			}
		}while(op>=1 && op<4);
		
	}

	private static void menuRemoverCliente() {
		boolean condi = true;
		boolean condi2 = true;
		do{
			String nome = obtem("Digite o nome do cliente a ser excluido: ",3);
			if(retornaCliente(nome) == null){
				System.out.println(nome +" nao encontrado.");
				condi = false;
			}else{
				@SuppressWarnings("rawtypes")
				Iterator it = clientes.iterator();
				while(it.hasNext()){
					if(((Cliente) it.next()).getNome().equals(nome)){
						do{
							System.out.println("Voce realmente deseja remover o(a) cliente "+ nome+ "?");
							System.out.println("1 - Sim ou 2 - Nao");
							int op = sc.nextInt();
							if (op == 1){
								it.remove();
								System.out.println("O(A) Cliente "+ nome + " foi removido com sucesso."+ System.lineSeparator());
								condi = false;condi2=false;
							}else if(op == 2){
								System.out.println("Remocao Cancelada.");
								condi = false;condi2=false;
							}else{
								System.out.println("Opcao invalida. Digite um valor: 1 - Sim ou 2 - Nao");
							}
						}while(condi2);
					}
				}
			}
		}while(condi);
	}

	private static void mostrarClientesCadastrados() {
		Iterator it = clientes.iterator();
		if(clientes.size() == 0){
			System.out.println("Nao foram cadastrados clientes ate o momento" + System.lineSeparator());
		}else{
			System.out.println("Total de clientes cadastrados: "+ clientes.size()+ System.lineSeparator());
			while(it.hasNext()){
				
				System.out.println(it.next());
				System.out.println("--------------------"+ System.lineSeparator());
			}
		}
		
	}

	private static void cadastroNovoCliente() {
		System.out.println("Novo(a) Cliente"+ System.lineSeparator());
		String nome = obtem("Nome: ",3);
		String sobrenome = obtem("Sobrenome: ",3);
		String cpf = obtem("Cpf: ",11);
		Cliente p1 = new Cliente(nome,sobrenome,cpf);
		clientes.add(p1);
		System.out.println("O(A) Cliente "+ nome + " "+ sobrenome+ " foi cadastrado(a) com sucesso."+ System.lineSeparator());
	}
	
	private static void cadastroNovaReserva(){
		boolean condi = true;
		Cliente novo;
		do{


			String nome = obtem("Digite o nome do(a) Cliente: "+ System.lineSeparator(),3);
			novo = retornaCliente(nome);
			if (novo != null){
				mostrarQuartosDisponiveis();
				
				
				int numQuarto =obtemInt("Digite o numero do quarto a ser reservado. (Zero cancela a operacao): ", 9);
				if(numQuarto == 0){
					condi = false;
					System.out.println("Operacao de reserva cancelada."+ System.lineSeparator());
				}else{
					Quarto q = buscaQuarto(numQuarto);
					if (q!= null){
						//TODO
						System.out.println("Quarto Escolhido: " + System.lineSeparator()+q);
						
						condi = false;
					}else{
						condi = false;
					}
				}
				
				condi = false;

			}else{
				System.out.println("O(a) cliente "+ nome+ " nao foi encontrado.");
				condi = false;
			}
			

		}while(condi);
		
	}
	private static Quarto buscaQuarto(int numQuarto) {
		Iterator it = ht.getList().iterator();
		while(it.hasNext()){
			Quarto q = (Quarto) it.next();
			if (q.getNumQuarto()==numQuarto){
				return q;
			}
			
		}
		
		return null;
	}

	private static void mostrarQuartosDisponiveis() {
		Iterator it = ht.getList().iterator();
		while(it.hasNext()){
			Quarto q = (Quarto) it.next();
			if (q.isStatus()){
				System.out.println(q + System.lineSeparator());
			}
			
		}
		
	}

	private static void menuEditarCliente() {
		System.out.println("Menu Editar Cliente"+System.lineSeparator());
		int op = 0;
		boolean condi = true;
		do{
				System.out.println("Digite o campo a ser editado:"+System.lineSeparator()+"1 - Nome; 2 - Sobrenome");
				op = sc.nextInt();
				switch (op){


				case 1:		editarNome();condi = false;break;

				case 2:		editarsobrenome();condi = false;break;
				

				default:    System.out.println("Opção invalida "+System.lineSeparator());
				}
			}while(condi);
		
	}
	
	private static void editarNome() {
		boolean condi1 = true;
		boolean condi2 = true;
		Cliente auxiliar;
		while(condi1){
			String nome = obtem("Digite o nome do cliente a ser editado: ",3);
			if(retornaCliente(nome) == null){
				System.out.println("Nome nao encontrado.");
				condi1 = false;
			}else{
				auxiliar = retornaCliente(nome);
				while(condi2){
					auxiliar.setNome(obtem("Digite o novo nome:", 3));
					condi2= false;
					condi1= false;
				}
				condi1 = false;
				condi2= false;
			}
		}
	}
	private static void editarsobrenome() {
		boolean condi1 = true;
		boolean condi2 = true;
		Cliente auxiliar;
		while(condi1){
			String nome = obtem("Digite o nome do cliente a ser editado: ",3);
			if(retornaCliente(nome) == null){
				System.out.println("Nome nao encontrado.");
				condi1 = false;
			}else{
				auxiliar = retornaCliente(nome);
				while(condi2){
					auxiliar.setSobrenome(obtem("Digite o novo Sobrenome: ", 3));
					condi2= false;
					condi1= false;
					
				}
				condi1 = false;
				condi2= false;
			}
		}
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
	
	private static int obtemInt(String string,int tamanhoMax) {
		int num;
		boolean condi = true;
		do{
			System.out.print(string);
			num = sc.nextInt();
			if(num>tamanhoMax){
				System.out.println("Valor invalido."+ System.lineSeparator());
			}else{
				condi = false;
			}
			
		}while(condi);
		
		return num;
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
		System.out.println("4 - Mostrar Clientes Cadastrados");
		System.out.println("5 - Voltar"+System.lineSeparator());
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
