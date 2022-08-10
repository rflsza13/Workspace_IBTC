import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import javax.swing.JMenuBar;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField textUsuario;
	private JTextField textSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
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
	public Formulario() {
		setTitle("Formulário de Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuário");
		lblNewLabel.setBounds(48, 37, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(48, 72, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(95, 34, 139, 20);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		textSenha = new JTextField();
		textSenha.setBounds(95, 69, 139, 20);
		contentPane.add(textSenha);
		textSenha.setColumns(10);
		
		JButton btn1 = new JButton("Limpar");
		btn1.setBounds(126, 104, 89, 23);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textUsuario.setText("");
				textSenha.setText("");
			}
		});
		contentPane.add(btn1);
	}
}
