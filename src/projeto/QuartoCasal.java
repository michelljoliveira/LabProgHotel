package projeto;

public class QuartoCasal extends Quarto {

	
	
public QuartoCasal(){
		
		setNumCamas(2);
	}
	
	
	@Override
	public void setPreco(double preco) {
		// TODO Auto-generated method stub
		
		super.preco = preco * getNumCamas();

	}

	@Override
	public String toString() {
		return "QuartoFamilia [preco=" + preco + ", toString()=" + super.toString() + "]";
	}
	

}
