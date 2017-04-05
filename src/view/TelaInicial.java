package view;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaInicial extends JFrame {

	public static void main(String[] args) {

		new TelaInicial();
		
	}

	public TelaInicial(){
	
		setSize(1024,768);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Reservas");
		
		JPanel tela = new JPanel();
		tela.setLayout(new GridLayout(0,3,2,2));

		
		IconDemoApp icones = new IconDemoApp();
		DescricaoHotel descricao = new DescricaoHotel();

		tela.add(icones);
		tela.add(descricao);
		
		add(tela);
		setVisible(true);
		
		
	}

	
}