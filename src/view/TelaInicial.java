package view;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Insets;

import javax.swing.*;

public class TelaInicial extends JFrame {

	public static void main(String[] args) {

		new TelaInicial();
		
	}

	public TelaInicial(){
	
		this.setSize(1024,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Reservas");
		
		JPanel tela = new JPanel();
		tela.setLayout(new GridLayout(0,3,2,2));
	
		IconDemoApp icones = new IconDemoApp();

		ImageIcon icon = new ImageIcon("/images/sunw01.jpg", "teste");
		
		JButton btn7 = new JButton("teste7");
		
		tela.add(icones);

		
		this.add(tela);

		this.setVisible(true);
		
		
	}

	
}