package fisica;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;





public class Bobina extends JFrame implements ActionListener {
	JButton calcular;
	JTextField enlanbob;
	JTextField corrent;
	JTextField volt;
	JTextField resisten;
	JTextField atingir;
	
	JLabel resa;
	JLabel resB;
	
	Bobina(){
		this.setSize(1000, 600);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		
		enlanbob= new JTextField();
		corrent = new JTextField();
		volt = new JTextField();
		resisten = new JTextField();
		atingir = new JTextField();
		calcular= new JButton("calcular");
		
		JLabel l1 = new JLabel("Enlançamento da bobina(Weber):");
		JLabel l2 = new JLabel("Corrente(Amperes):");
		JLabel l3 = new JLabel("Voltagem do gerador(Volt):");
		JLabel l4 = new JLabel("Corrente esperada(Amperes)");
		JLabel l5 = new JLabel("Resistencia(ohms):");
		
		this.add(enlanbob);
		this.add(l1);
		enlanbob.setBounds(300, 100, 100, 40);
		l1.setBounds(50, 100, 200, 50);
		
		this.add(l2);
		this.add(corrent);
		corrent.setBounds(300,200, 100, 40);
		l2.setBounds(50, 200, 150, 50);
		
		this.add(l3);
		this.add(volt);
		volt.setBounds(300, 300, 100, 40);
		l3.setBounds(50, 300, 200, 50);
		
		this.add(l4);
		this.add(atingir);
		atingir.setBounds(300, 400, 100, 40);
		l4.setBounds(50,400,200,50);
		
		this.add(l5);
		this.add(resisten);
		resisten.setBounds(300, 500, 100, 40);
		l5.setBounds(50, 500, 200, 50);
		
		this.add(calcular);
		calcular.setBounds(500,400 , 100, 40);
		
	JLabel lege = new JLabel("...Resutados...");
	this.add(lege);
	lege.setBounds(500, 100, 100, 50);
		
	
	calcular.addActionListener(this);
			resa = new JLabel("");
			resB = new JLabel("");
			
			this.add(resa);
			resa.setBounds(450, 150, 300, 50);
			this.add(resB);
			resB.setBounds(450, 200,400,50);
		
	}
			
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==calcular) {
			String en= enlanbob.getText();
			String amp= corrent.getText();
			String v= volt.getText();
			String time= atingir.getText();
			String res= resisten.getText();
			
			resa.setText("");
			resB.setText("");
			
			
			try {
			Double enlan= Double.parseDouble(en);
			Double corre=Double.parseDouble(amp);
			Double volta=Double.parseDouble(v);
			Double obj = Double.parseDouble(time);
			Double resis=Double.parseDouble(res);
			
			
			
			Double indu= enlan/corre;
			
			Double t=indu/resis;
			Double temp=(volta/resis)*(1-Math.exp(-obj/t));
			
			
			
			resa.setText("indutancia de "+String.format("%.2f",indu)+" H");
			resB.setText("ira levar "+String.format("%.2f",temp)+" segundos para atingir a corrente especificada");
			
			
			}catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null,"insira dados válidos!!");
			}
			
		}
		
	}
	public static void main(String[]args) {
		new Bobina();;
	}
}


