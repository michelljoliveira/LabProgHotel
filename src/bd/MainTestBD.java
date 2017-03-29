package bd;

import projeto.Cliente;

public class MainTestBD {
	
	public static void main(String args[]){
		
		Cliente cliente1 = new Cliente("Italo", "Caio","922.333.222-11");
		Cliente cliente2 = new Cliente("Michel", "Jackson","923.333.222-11");
		Cliente cliente3 = new Cliente("Job", "B","924.333.222-11");
		
		
		ClienteDAO.inserirCliente(cliente1);
		ClienteDAO.inserirCliente(cliente2);
		ClienteDAO.inserirCliente(cliente3);
		
	}
	
	
	

}
