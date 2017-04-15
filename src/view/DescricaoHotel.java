package view;

import java.awt.GridLayout;
import javax.swing.*;

public class DescricaoHotel extends JPanel {
	
	public DescricaoHotel(){
		
		JPanel geral = new JPanel();
		geral.setLayout(new GridLayout(2,1,2,2));
		
		JPanel estrelas = new JPanel();
		estrelas.setLayout(new GridLayout(1,5,2,2));
		
	
		for (int i = 0; i < 5; i++) {
			java.net.URL imgURL = getClass().getResource("../images/estrela2.png");
			ImageIcon icon = new ImageIcon(imgURL, "teste");
			JLabel estrela1 = new JLabel();
			estrela1.setIcon(icon);
			estrelas.add(estrela1);
		}
		
		JPanel descricao = new JPanel();
		descricao.setLayout(new GridLayout(4,1,2,2));
		
		JLabel cama = new JLabel();
		cama.setText("Cama King Size");
		
		JLabel servivos = new JLabel();
		servivos.setText("cafe da manha");
		
		JLabel vista = new JLabel();
		vista.setText("vista para o mar");
		
		descricao.add(cama);
		descricao.add(servivos);
		descricao.add(vista);
		
		geral.add(estrelas);
		geral.add(descricao);
		add(geral);

	}

	
}