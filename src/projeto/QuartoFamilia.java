package projeto;

public class QuartoFamilia extends Quarto {

	public QuartoFamilia(){
		
		setNumCamas(4);
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
