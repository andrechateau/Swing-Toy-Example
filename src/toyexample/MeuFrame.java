
package toyexample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Andre Chateaubriand
 */
public class MeuFrame extends JFrame {

	public MeuFrame() {
		super("Frame Java Group"); // Título do Frame
		setSize(300, 200); // Tamanho do Meu Frame
		setLayout(null); // Nao usaremos layout manager nesse exemplo

		initComponents(); // metodo para inicializar os componentes

		// Metodo padrao ao apertar o X: Finalizar o programa
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Janela inizializa no meio da tela (relativa a nada)
		setLocationRelativeTo(null);
		// Montar a janela de fato (fazendo-a visivel)
		setVisible(true);
	}

	public static void main(String[] args) {
		new MeuFrame();

	}

	private void initComponents() {
		// Rotulo do 'Texto'
		JLabel lbTexto = new JLabel("Faça seu Login");
		lbTexto.setBounds(100, 10, 100, 25);
		add(lbTexto);

		// Rotulo do 'Login'
		JLabel lbLogin = new JLabel("Login: ");
		lbLogin.setBounds(10, 50, 50, 25);
		add(lbLogin);

		// Campo de Texto
		JTextField tfLogin = new JTextField();
		tfLogin.setBounds(60, 50, 200, 25);
		add(tfLogin);

		// Rotulo da 'Senha'
		JLabel lbSenha = new JLabel("Senha: ");
		lbSenha.setBounds(10, 80, 50, 25);
		add(lbSenha);

		// Campo de Texto
		JPasswordField tfSenha = new JPasswordField();
		tfSenha.setBounds(60, 80, 200, 25);
		add(tfSenha);

		// Botao
		JButton btLogin = new JButton("Login");
		btLogin.setBounds(160, 125, 100, 25);
		add(btLogin);

		btLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Login clicado!");
			}
		});

	}

}
