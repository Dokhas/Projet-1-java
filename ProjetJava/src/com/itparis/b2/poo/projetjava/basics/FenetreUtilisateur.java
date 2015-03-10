package com.itparis.b2.poo.projetjava.basics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import java.awt.Font;

public class FenetreUtilisateur extends JFrame {
	public FenetreUtilisateur() {
		this.setSize(700, 400);
		
		JLayeredPane layeredPane = new JLayeredPane();
		getContentPane().add(layeredPane, BorderLayout.CENTER);
		
		JLabel lblBienvenue = new JLabel("Bienvenue");
		lblBienvenue.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBienvenue.setBounds(286, 23, 81, 22);
		layeredPane.add(lblBienvenue);
		
		JButton btnAnglais = new JButton("Anglais");
		btnAnglais.setBounds(159, 138, 100, 87);
		layeredPane.add(btnAnglais);
		
		JButton btnNewButton = new JButton("Fran\u00E7ais");
		btnNewButton.setBounds(419, 138, 100, 87);
		layeredPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAnglais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
