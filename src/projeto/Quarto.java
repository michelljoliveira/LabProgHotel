package projeto;


import static java.lang.System.lineSeparator;

import java.util.Calendar;


public abstract  class Quarto {
    
    private int numQuarto,diaReserva,mesReserva,anoReserva;
    private int numCamas,diaFinalReserva,mesFinalReserva,anoFinalReserva;
    private boolean status;
    private String vista;
    private Calendar c = Calendar.getInstance();
    protected double preco;
    

    public Quarto(){
        
        //Inicia ele como disponivel
        setStatus(true);
        diaReserva = c.get(Calendar.DAY_OF_MONTH);
        mesReserva = c.get(Calendar.MONTH) +1;
        anoReserva = c.get(Calendar.YEAR);
        diaFinalReserva = diaReserva;
        mesFinalReserva = mesReserva;
        anoFinalReserva = anoReserva;
    }
    
    
    public int getNumCamas() {
        return numCamas;
    }

    public boolean isStatus() {
        return status;
    }
    
    public int getNumQuarto() {
        return numQuarto;
    }
    

    public String getVista() {
        return vista;
    }
    
    public int getDiaReserva() {
		return diaReserva;
	}

	public int getMesReserva() {
		return mesReserva +1;
	}

	public int getAnoReserva() {
		return anoReserva;
	}

	public int getDiaFinalReserva() {
		return diaFinalReserva;
	}

	public int getMesFinalReserva() {
		return mesFinalReserva +1;
	}

	public int getAnoFinalReserva() {
		return anoFinalReserva;
	}

    public void setVista(String vista) {
        this.vista = vista;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void setNumQuarto(int numQuarto) {
        this.numQuarto = numQuarto;
    }
    
	public void setDiaReserva(int diaReserva) {
		if (diaReserva>0 && diaReserva<32 && diaReserva >= c.get(Calendar.DAY_OF_MONTH)){
			this.diaReserva = diaReserva;
		}
	}

	public void setMesReserva(int mesReserva) {
		if (mesReserva>0 && mesReserva<13 && mesReserva >= c.get(Calendar.MONTH) +1){
			this.mesReserva = mesReserva -1;
		}
	}

	public void setAnoReserva(int anoReserva) {
		if (anoReserva >= c.get(Calendar.YEAR) && anoReserva >= c.get(Calendar.YEAR)+1){
			this.anoReserva = anoReserva;
		}
	}

	public void setDiaFinalReserva(int diaFinalReserva) {
		if(diaReserva>0 && diaReserva<32){
			if(mesReserva==mesFinalReserva && anoReserva== anoFinalReserva){
				if(diaFinalReserva>=diaReserva){ //diaFinalReserva Deve ser maior ou igual ao dia 
					this.diaFinalReserva = diaFinalReserva;
				}
			}else{
				if(mesReserva>=mesFinalReserva){
					this.diaFinalReserva = diaFinalReserva;
				}
			}
		}
	}


	public void setMesFinalReserva(int mesFinalReserva) {
		if (mesReserva>0 && mesReserva<13 && mesReserva >= c.get(Calendar.MONTH) +1){
			if(mesReserva<=mesFinalReserva && anoReserva == anoFinalReserva){
				this.mesFinalReserva = mesFinalReserva -1;
			}
		}
	}


	public void setAnoFinalReserva(int anoFinalReserva) {
		if(anoFinalReserva >= anoReserva &&anoFinalReserva <= anoReserva + 1){
			this.anoFinalReserva = anoFinalReserva;
		}
		
	}
	
	public abstract void setPreco(double preco);
	@Override
    public  String toString(){
        String dispoibilidade = isStatus()?"Disponivel":"Ocupado";
        String string = "Quarto " + getNumQuarto() + lineSeparator() +
                        " Quantidade de Camas: " + getNumCamas() + lineSeparator() +
                        " Disponibilidade : " + dispoibilidade;
        return string;
    }
}
