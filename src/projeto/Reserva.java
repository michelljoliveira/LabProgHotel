package projeto;

import java.util.Date;

public class Reserva {
	
	private Cliente reservista;
	
	
	
	public Reserva(Cliente cliente,int index, Date entrada, Date saida){
		 
		Quarto quarto = (Quarto) Hotel.getList().get(index);
		
		quarto.setDataEntrada(entrada);
		quarto.setDataSaída(saida);
		
		this.setReservista(cliente);
		
		if(quarto.isStatus() == false)
			System.out.println("Quarto Ocupado");
		
		
		
	}



	public Cliente getReservista() {
		return reservista;
	}



	public void setReservista(Cliente reservista) {
		this.reservista = reservista;
	}
	
	

}
