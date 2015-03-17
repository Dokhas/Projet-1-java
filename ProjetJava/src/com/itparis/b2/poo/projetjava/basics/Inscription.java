package com.itparis.b2.poo.projetjava.basics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inscription extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	public Inscription() {
		this.setSize(700, 400);
		
		JPanel panel = new JPanel();
		this.setContentPane(panel);
		panel.setLayout(null);
		
		JLabel lblInscription = new JLabel("Inscription");
		lblInscription.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblInscription.setBounds(285, 13, 83, 36);
		panel.add(lblInscription);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setBounds(45, 70, 56, 16);
		panel.add(lblNom);
		
		JLabel lblPrnom = new JLabel("Pr\u00E9nom");
		lblPrnom.setBounds(45, 99, 56, 16);
		panel.add(lblPrnom);
		
		JLabel label = new JLabel(":");
		label.setBounds(136, 70, 11, 16);
		panel.add(label);
		
		JLabel label_1 = new JLabel(":");
		label_1.setBounds(136, 99, 11, 16);
		panel.add(label_1);
		
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setBounds(45, 128, 56, 16);
		panel.add(lblAdresse);
		
		JLabel label_2 = new JLabel(":");
		label_2.setBounds(136, 157, 11, 16);
		panel.add(label_2);
		
		JLabel lblCodePostal = new JLabel("Code postal");
		lblCodePostal.setBounds(45, 157, 79, 16);
		panel.add(lblCodePostal);
		
		JLabel lblVille = new JLabel("Ville");
		lblVille.setBounds(491, 128, 56, 16);
		panel.add(lblVille);
		
		JLabel lblMail = new JLabel("Mail");
		lblMail.setBounds(45, 209, 56, 16);
		panel.add(lblMail);
		
		JLabel label_4 = new JLabel(":");
		label_4.setBounds(136, 209, 11, 16);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel(":");
		label_5.setBounds(136, 128, 11, 16);
		panel.add(label_5);
		
		textField = new JTextField();
		textField.setBounds(146, 67, 116, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(146, 96, 116, 22);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(146, 125, 333, 22);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(146, 154, 116, 22);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(554, 125, 116, 22);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(146, 206, 333, 22);
		panel.add(textField_5);
		
		JLabel lblNewLabel = new JLabel("Activit\u00E9");
		lblNewLabel.setBounds(45, 238, 56, 16);
		panel.add(lblNewLabel);
		
		JLabel label_6 = new JLabel(":");
		label_6.setBounds(136, 238, 11, 16);
		panel.add(label_6);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(146, 235, 116, 22);
		panel.add(textField_6);
		
		JLabel label_7 = new JLabel(":");
		label_7.setBounds(543, 128, 11, 16);
		panel.add(label_7);
		
		JLabel lblPays = new JLabel("Pays");
		lblPays.setBounds(346, 157, 56, 16);
		panel.add(lblPays);
		
		JLabel label_3 = new JLabel(":");
		label_3.setBounds(414, 157, 11, 16);
		panel.add(label_3);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(424, 154, 116, 22);
		panel.add(textField_7);
		
		JLabel lblTel = new JLabel("Tel");
		lblTel.setBounds(45, 268, 56, 16);
		panel.add(lblTel);
		
		JLabel label_8 = new JLabel(":");
		label_8.setBounds(136, 268, 11, 16);
		panel.add(label_8);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(146, 265, 116, 22);
		panel.add(textField_8);
		
		JButton btnEnvoyer = new JButton("Envoyer");
		btnEnvoyer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//TO DO
			}
		});
		btnEnvoyer.setBounds(285, 315, 97, 25);
		panel.add(btnEnvoyer);
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


