package projeto;

public class QuartoSolteiro extends Quarto {

	
	
	public QuartoSolteiro(){
		
		setNumCamas(1);
	}
	public QuartoSolteiro(int numQuarto){
		super(numQuarto);
		setNumCamas(1);
		setPreco(200);
	}
	
	@Override
	public void setPreco(double preco) {
		super.preco = preco * getNumCamas();
	}
	public double getPreco(){
		return preco;
	}

	@Override
	public String toString() {
		return "QuartoFamilia [preco=" + preco + ", toString()=" + super.toString() + "]";
	}
	

}
