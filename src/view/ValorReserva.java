package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;

public class ValorReserva extends JPanel {
	
	public ValorReserva(){
		
		JPanel geral = new JPanel();
		geral.setLayout(new GridLayout(3,1,5,5));
			
		
		JLabel reservado = new JLabel();
		reservado.setText("Reservado");
		reservado.setForeground(Color.RED);
		reservado.setFont(new Font("SansSerif", Font.BOLD, 18));
		
		JLabel valor = new JLabel();
		valor.setText("R$200,00");
		valor.setFont(new Font("SansSerif", Font.BOLD, 28));
		
		JButton reservar = new JButton("RESERVAR");
		
		geral.add(reservado);
		geral.add(valor);
		geral.add(reservar);

		add(geral);

	}

	
}