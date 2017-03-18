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
    private Quarto quarto;
    
    
    public Hotel(){
        
        //Inicia o Hotel com 10 quartos 3 para solteiros, 3 para casais e 4 para familia
        for(int i =0; i <10; i++){
            quarto = new Quarto();
            
            quarto.setNumQuarto(i +1);
            if(i < 3)
                quarto.setNumCamas(1);
            else
                if(i<6)
                    quarto.setNumCamas(2);
            else
                    quarto.setNumCamas(4);
            
            listQuarto.add(quarto);
            
        }
    }
    
    public List getList(){
        
        return this.listQuarto;
    }
    
    
    
}
