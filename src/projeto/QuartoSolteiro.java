package projeto;

public class QuartoSolteiro extends Quarto {

	
	
	public QuartoSolteiro(){
		
		setNumCamas(1);
	}
	
	@Override
	public void setPreco(double preco) {
		
		
		super.preco = preco * getNumCamas();
	}

	@Override
	public String toString() {
		return "QuartoFamilia [preco=" + preco + ", toString()=" + super.toString() + "]";
	}
	

}
