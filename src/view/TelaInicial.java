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
	
		this.setSize(600,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Reservas");
		
		JPanel tela = new JPanel();
		tela.setLayout(new GridBagLayout());
		
		GridBagConstraints constraints = new GridBagConstraints();
		
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.weightx = 50;
		constraints.weighty = 100;
		constraints.insets = new Insets(5,5,5,5);
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.fill = GridBagConstraints.BOTH;
		
		IconDemoApp icones = new IconDemoApp();
		
		JPanel tela1 = new JPanel(new GridBagLayout());
		JPanel tela2 = new JPanel(new GridBagLayout());
		JPanel tela3 = new JPanel(new GridBagLayout());
		
		JButton btn5 = new JButton("teste5");
		JButton btn6 = new JButton("teste6");
		tela1.add(btn5, constraints);
		constraints.gridx = 5;
		tela1.add(btn6, constraints);
		constraints.gridx = 9;
		tela1.add(icones, constraints);
		
		
		JButton btn7 = new JButton("teste7");
		JButton btn8 = new JButton("teste8");
		
		JButton btn9 = new JButton("teste9");
		JButton btn10 = new JButton("teste10");
		
		constraints.gridx = 1;
		tela2.add(new JSeparator(JSeparator.HORIZONTAL), constraints);
		tela2.add(btn7, constraints);
		constraints.gridx = 5;
		tela2.add(btn8, constraints);
		
		
		constraints.gridx = 1;
		tela3.add(btn9, constraints);
		constraints.gridx = 5;
		tela3.add(btn10, constraints);

		
		tela.add(tela1, constraints);
		
		
		constraints.gridy = 2;
		tela.add(tela2, constraints);
		
		constraints.gridy = 3;
//		tela.add(tela3, constraints);
		
		
		
		this.add(tela);

		this.setVisible(true);
		
		
	}

	
}