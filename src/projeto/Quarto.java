package projeto;


import static java.lang.System.lineSeparator;

import java.util.Calendar;
import java.util.Date;

import javax.swing.JPopupMenu;

public abstract  class Quarto {
    
    private int numQuarto;
    private int numCamas;
    private boolean status;
    private String vista;
    private Date dataEntrada;
    private Date dataSaída;
    protected double preco;
    
    

    public Quarto(){
        
        //Inicia ele como disponivel
        setStatus(true);
    }
    
    
    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getVista() {
        return vista;
    }

    public void setVista(String vista) {
        this.vista = vista;
    }

    public int getNumQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(int numQuarto) {
        this.numQuarto = numQuarto;
    }
    
    @Override
    public  String toString(){
        String dispoibilidade = isStatus()?"Disponivel":"Ocupado";
        String string = "Quarto " + getNumQuarto() + lineSeparator() +
                        " Quantidade de Camas: " + getNumCamas() + lineSeparator() +
                        " Disponibilidade : " + dispoibilidade;
        
        return string;
    }
    
    public abstract void setPreco(double preco);


	public Date getDataEntrada() {
		boolean status = true;
		return dataEntrada;
	}


	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}


	public Date getDataSaída() {
		return dataSaída;
	}


	public void setDataSaída(Date dataSaída) {
		this.dataSaída = dataSaída;
	}


	public double getPreco() {
		return preco;
	}
    
    
    
    
    
    
}
