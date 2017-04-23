package projeto;

public class QuartoCasal extends Quarto {

	
	
	public QuartoCasal(){
		
		setNumCamas(2);
	}
	public QuartoCasal(int numQuarto){
		super(numQuarto);
		setNumCamas(2);
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
