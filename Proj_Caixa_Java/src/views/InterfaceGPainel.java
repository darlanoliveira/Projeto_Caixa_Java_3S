package views;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.JButton;

//Ignorar o warning
@SuppressWarnings("serial")
public class InterfaceGPainel extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceGPainel frame = new InterfaceGPainel();
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
	public InterfaceGPainel() {
		setMinimumSize(new Dimension(500, 800));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		contentPane = new JPanel();
		contentPane.setEnabled(false);
		contentPane.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 1168, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 1138, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(160)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 402, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(121, Short.MAX_VALUE))
		);
		
		JButton btnCadastro = new JButton("Cadastro de Funcionarios");
		btnCadastro.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCadastro.setFont(new Font("Lucida Console", Font.BOLD, 25));
		btnCadastro.setPreferredSize(new Dimension(130, 130));
		
		JButton btnControleDeAcesso = new JButton("Controle de Acesso");
		btnControleDeAcesso.setFont(new Font("Lucida Console", Font.BOLD, 25));
		btnControleDeAcesso.setPreferredSize(new Dimension(130, 130));
		
		JButton btnAbrirCaixa = new JButton("Abrir Caixa");
		btnAbrirCaixa.setFont(new Font("Lucida Console", Font.BOLD, 25));
		btnAbrirCaixa.setPreferredSize(new Dimension(130, 130));
		
		JButton btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Lucida Console", Font.BOLD, 25));
		btnSair.setPreferredSize(new Dimension(130, 130));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(266)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnAbrirCaixa, GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
						.addComponent(btnCadastro, GroupLayout.PREFERRED_SIZE, 252, Short.MAX_VALUE))
					.addGap(30)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnSair, GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
						.addComponent(btnControleDeAcesso, GroupLayout.PREFERRED_SIZE, 252, Short.MAX_VALUE))
					.addGap(338))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCadastro, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnControleDeAcesso, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAbrirCaixa, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSair, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
					.addGap(22))
		);
		panel_1.setLayout(gl_panel_1);
		
		JLabel lblBemvindonome = new JLabel("Bem-Vindo *NOME*");
		lblBemvindonome.setFont(new Font("Lucida Console", Font.BOLD, 40));
		
		JLabel lblPainelGerencial = new JLabel("Painel Gerencial");
		lblPainelGerencial.setHorizontalAlignment(SwingConstants.CENTER);
		lblPainelGerencial.setFont(new Font("Lucida Console", Font.PLAIN, 40));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblBemvindonome)
					.addPreferredGap(ComponentPlacement.RELATED, 246, Short.MAX_VALUE)
					.addComponent(lblPainelGerencial, GroupLayout.PREFERRED_SIZE, 446, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblBemvindonome)
						.addComponent(lblPainelGerencial, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
