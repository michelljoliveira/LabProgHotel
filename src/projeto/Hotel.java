/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Casa
 */
public class Hotel {
    
    private List<Quarto> listQuarto = new ArrayList<>();
    private QuartoSolteiro [] quartoSolteiro;
    private QuartoCasal[] quartoCasal;
    private QuartoFamilia[] quartoFamilia;
    
    
    
    public Hotel(){
        
        //Inicia o Hotel com 9 quartos 3 para solteiros, 3 para casais e 4 para familia
    	quartoSolteiro  = new QuartoSolteiro[3];
    	quartoCasal = new QuartoCasal[3];
    	quartoFamilia = new QuartoFamilia[3];
    	
    	for(int i=0; i<3; i++){
    		listQuarto.add(quartoSolteiro[i]);
    		listQuarto.add(quartoCasal[i]);
    		listQuarto.add(quartoFamilia[i]);
    	}
       
    }
    
    public List getList(){
        
        return this.listQuarto;
    }
    
    
    
}
