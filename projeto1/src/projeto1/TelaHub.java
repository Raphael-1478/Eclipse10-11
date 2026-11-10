package projeto1;

import javax.swing.*;
import java.awt.Desktop;
import java.net.URI;

public class TelaHub extends JFrame {
	
	public TelaHub() {
		setTitle("Hub de Links");
		setSize(320, 310);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		JLabel titulo = new JLabel ("Escolha de um link");
		titulo.setBounds(100, 20, 150, 25);
		add(titulo);
		
		JButton btnWhats = new JButton ("Whatsapp");
		btnWhats.setBounds(80, 60, 150, 35);
		add(btnWhats);
		
		JButton btnYoutube = new JButton ("Youtube");
		btnYoutube.setBounds(80, 105, 150, 35);
		add(btnYoutube);
		
		JButton btnInsta = new JButton ("Instagram");
		btnInsta.setBounds(80, 150, 150, 35);
		add(btnInsta);
		
		JButton btnSair = new JButton ("Sair");
		btnSair.setBounds(80, 205, 150, 35);
		add(btnSair);
		
		btnWhats.addActionListener(e -> abrirLink ("https://wa.me/5541999999999"));
		btnYoutube.addActionListener(e -> abrirLink ("https://www.youtube.com/"));
		btnInsta.addActionListener(e -> abrirLink ("https://www.instagram.com/"));
		
		btnSair.addActionListener(e -> JOptionPane.showMessageDialog(this, "Saindo..."));
		btnSair.addActionListener(e -> {
			new TelaLogin();
			dispose();
		});
				
		setVisible(true);
	}
	
	private void abrirLink (String url) {
		try {
			Desktop.getDesktop().browse(new URI(url));
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, "Não foi possível abrir o link");
			
		}
	}

}
