package projeto1;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TelaLogin extends JFrame {


		
		private JTextField campoUsuario;
		private JTextField campoSenha;
		
		public TelaLogin() {
			setTitle("Login");
			setSize(320,220);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			setLayout(null);
			
			JLabel lblUsuario = new JLabel("Usuario:");
			lblUsuario.setBounds(30, 30, 80, 25);
			add(lblUsuario);
			
			campoUsuario = new JTextField();
			campoUsuario.setBounds(110, 30, 160, 25);
			add(campoUsuario);
			
			JLabel lblSenha = new JLabel("Senha:");
			lblSenha.setBounds(30, 70, 80, 25);
			add(lblSenha);
			
			campoSenha = new JTextField();
			campoSenha.setBounds(110, 70, 160, 25);
			add(campoSenha);
			
			KeyAdapter somenteNumeros = new KeyAdapter() {
				public void keyTyped(KeyEvent e) {
					char c = e.getKeyChar();
					if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE) {
						e.consume();
					}
				}
			};
			
			campoUsuario.addKeyListener(somenteNumeros);
			campoSenha.addKeyListener(somenteNumeros);
			
			JButton btnEntrar = new JButton ("Entrar");
			btnEntrar.setBounds(110, 115, 100, 30);
			add(btnEntrar);
			
			btnEntrar.addActionListener(e -> fazerLogin());
			
			setVisible(true);
			
		}
		
		private void fazerLogin() {
			String usuario = campoUsuario.getText();
			String senha = campoSenha.getText();
			
			boolean loginNumerico = usuario.equals("2024") && senha.equals("1234");
			
			boolean loginLetras = usuario.equals("maria") && senha.equals("abcd");
			
			if (loginNumerico || loginLetras) {
				new TelaHub();
				dispose();
			} else {
				JOptionPane.showMessageDialog(this, "Usuário ou senha Incorretos!");
			}
		}

	}

