package fisica;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Frame extends JFrame implements ActionListener {
	JButton b;
	JButton c;
	JTextField tv;
	JTextField bv;
	JTextField ip;
	JLabel res;
	Frame(){
		
		//velocidade dos trems
		 tv = new JTextField();
		//velocidade passaro
		 bv = new JTextField();
		//distancia inicial
	     ip = new JTextField();
		
		JLabel l1 = new JLabel("Velocidade dos trems");
		JLabel l2 = new JLabel("Velocidade do Passaro(km/h)");
		JLabel l3 = new JLabel("Distancia inicial dos trems(km)");
		JLabel l4 = new JLabel("O passaro percorreu:");
		 b = new JButton("Calcular");
		 c = new JButton("Resetar");
		
		//config do frame
		this.setSize(650,650);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(b); 
		this.add(c);
		this.setLayout(null);
		this.add(tv);
		this.add(bv);
		this.add(ip);
		this.add(l1);
		this.add(l2);
		this.add(l3);
		this.add(l4);
		
		//configuração das legendas
		l1.setBounds(210, 50, 180, 50);
		l2.setBounds(190, 150, 180, 50);
		l3.setBounds(190, 250, 180, 50);
		l4.setBounds(210, 350, 150, 50);
		
		//confing das caixas de texto
		tv.setPreferredSize(new Dimension(100,50));
		tv.setBounds(200, 100, 150, 50);
		
		bv.setPreferredSize(new Dimension(100,50));
		bv.setBounds(200, 200, 150, 50);
		
		ip.setPreferredSize(new Dimension(100,50));
		ip.setBounds(200, 300,150, 50);;
		
		//config botões
		b.setBounds(150,500,100,50);
		b.addActionListener(this);
		c.addActionListener(this);
		c.setBounds(300,500, 100, 50);	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b) {
			
		
			float Dp;
			float ap;
			float vap;
			
			
			
			
			String t= tv.getText();
			String b= bv.getText();
			String d= ip.getText();
			
			float tremv = Float.parseFloat(t);
			float birdv = Float.parseFloat(b);
			float dtint = Float.parseFloat(d);
			
			 ap = tremv + tremv;
		     vap = birdv/dtint;
			 Dp = ap/vap;
			 
			
			 
			
		 
			res = new JLabel(Dp+" killometros");
			this.add(res);
			res.setBounds(215, 400, 140, 50);
			 
			
			
		}else if(e.getSource()==c) {
			tv.setText("");
			bv.setText("");
			ip.setText("");
			if(res!=null) {
				this.remove(res);
				res=null;
				this.revalidate();
				this.repaint();
			}
			
			
		}
		
		
	}
	
	
}
