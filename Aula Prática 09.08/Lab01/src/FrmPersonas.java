import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmPersonas extends JFrame {

	private JPanel contentPane;
	public static JTextField textUsuario;
	public static JTextField textSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPersonas frame = new FrmPersonas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmPersonas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(46, 35, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(46, 83, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(102, 32, 86, 20);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		textSenha = new JTextField();
		textSenha.setBounds(102, 80, 86, 20);
		contentPane.add(textSenha);
		textSenha.setColumns(10);
		
		final DadosUsuario data = new DadosUsuario();		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(data.validaSenha() == 1) {
					JOptionPane.showMessageDialog(null, "Seja Bem-Vindo!");
				} else {
					JOptionPane.showMessageDialog(null, "Usuário Inválido!");
				}
			}
		});
		btnEntrar.setBounds(102, 134, 89, 23);
		contentPane.add(btnEntrar);
	}
}
