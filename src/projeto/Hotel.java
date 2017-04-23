/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Hotel {
    
    private List<Quarto> listQuarto = new ArrayList<>();
    private int contador = 1;
    
    
    
    public Hotel(){
        
        //Inicia o Hotel com 9 quartos 3 para solteiros, 3 para casais e 4 para familia
    	
    	for(int i=0; i<3; i++){
    		Quarto q = new QuartoSolteiro(contador++);
    		listQuarto.add(q);
    	}
    	for(int i=0; i<3; i++){
    		Quarto q = new QuartoCasal(contador++);
    		listQuarto.add(q);
    	}
    	for(int i=0; i<3; i++){
    		Quarto q = new QuartoFamilia(contador++);
    		listQuarto.add(q);
    	}
       
    }
    
    public List getList(){
        
        return listQuarto;
    }
    
    
    
}
