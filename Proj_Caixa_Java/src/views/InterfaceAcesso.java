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
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;


//ignorar warning
@SuppressWarnings("serial")
public class InterfaceAcesso extends JFrame {

	private JPanel contentAcesso;
	private JTextField textProcurar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceAcesso frame = new InterfaceAcesso();
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
	public InterfaceAcesso() {
		setMinimumSize(new Dimension(500, 800));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		contentAcesso = new JPanel();
		contentAcesso.setName("Acesso");
		contentAcesso.setPreferredSize(new Dimension(95, 25));
		contentAcesso.setEnabled(false);
		contentAcesso.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentAcesso.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentAcesso);
		
		JPanel panel = new JPanel();
		
		JLabel label = new JLabel("Bem-Vindo *NOME*");
		label.setFont(new Font("Lucida Console", Font.BOLD, 40));
		
		JLabel lblControleDeAcesso = new JLabel("Controle de Acesso");
		lblControleDeAcesso.setHorizontalAlignment(SwingConstants.CENTER);
		lblControleDeAcesso.setFont(new Font("Lucida Console", Font.PLAIN, 40));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(label)
					.addPreferredGap(ComponentPlacement.RELATED, 261, Short.MAX_VALUE)
					.addComponent(lblControleDeAcesso, GroupLayout.PREFERRED_SIZE, 453, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(lblControleDeAcesso, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textProcurar = new JTextField();
		textProcurar.setToolTipText("");
		textProcurar.setPreferredSize(new Dimension(100, 30));
		textProcurar.setName("Procurar");
		textProcurar.setFont(new Font("Lucida Console", Font.PLAIN, 20));
		textProcurar.setColumns(50);
		panel_1.add(textProcurar);
		
		JButton btnProcurar = new JButton("Procurar");
		btnProcurar.setPreferredSize(new Dimension(160, 30));
		btnProcurar.setName("pesquisa");
		btnProcurar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnProcurar.setFont(new Font("Lucida Console", Font.PLAIN, 24));
		panel_1.add(btnProcurar);
		
		JButton btnSair = new JButton("Sair");
		GroupLayout gl_contentAcesso = new GroupLayout(contentAcesso);
		gl_contentAcesso.setHorizontalGroup(
			gl_contentAcesso.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentAcesso.createSequentialGroup()
					.addGroup(gl_contentAcesso.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentAcesso.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnSair, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
							.addGap(15))
						.addGroup(gl_contentAcesso.createSequentialGroup()
							.addGap(2)
							.addGroup(gl_contentAcesso.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentAcesso.createSequentialGroup()
									.addComponent(panel, GroupLayout.DEFAULT_SIZE, 1168, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_contentAcesso.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 1168, Short.MAX_VALUE)))))
					.addGap(0))
		);
		gl_contentAcesso.setVerticalGroup(
			gl_contentAcesso.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentAcesso.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addGap(113)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 447, Short.MAX_VALUE)
					.addComponent(btnSair, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		contentAcesso.setLayout(gl_contentAcesso);
	}
}
