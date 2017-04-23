package projeto;

public class QuartoFamilia extends Quarto {

	public QuartoFamilia(){
		
		setNumCamas(4);
	}
	public QuartoFamilia(int numQuarto){
		super(numQuarto);
		setNumCamas(4);
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
