package views;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.FuncionarioDAO;
import model.Funcionario;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


//ignorar o warning
@SuppressWarnings("serial")
public class InterfaceCadastroFuncionario extends JFrame {

	private JPanel contentCadastroFuncionario;
	private JTextField txtpesquisa;
	private JTextField txtNome;
	private JTextField txtCpf;
	private JTextField txtEmail;
	private JTextField txtSenha;
	private JComboBox<String> comboCargo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceCadastroFuncionario frame = new InterfaceCadastroFuncionario();
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
	public InterfaceCadastroFuncionario() {
		setMinimumSize(new Dimension(500, 800));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		contentCadastroFuncionario = new JPanel();
		contentCadastroFuncionario.setName("CadastroFuncionario");
		contentCadastroFuncionario.setPreferredSize(new Dimension(95, 25));
		contentCadastroFuncionario.setEnabled(false);
		contentCadastroFuncionario.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentCadastroFuncionario.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentCadastroFuncionario);
		
		JPanel panel = new JPanel();
		
		JLabel label = new JLabel("Bem-Vindo *NOME*");
		label.setFont(new Font("Lucida Console", Font.BOLD, 40));
		
		JLabel lblCadastroFuncionario = new JLabel("Cadastro Funcionario");
		lblCadastroFuncionario.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroFuncionario.setFont(new Font("Lucida Console", Font.PLAIN, 40));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(label)
					.addPreferredGap(ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
					.addComponent(lblCadastroFuncionario, GroupLayout.PREFERRED_SIZE, 514, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCadastroFuncionario, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(7)
							.addComponent(label)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setPreferredSize(new Dimension(100, 30));
		lblNome.setFont(new Font("Lucida Console", Font.PLAIN, 24));
		lblNome.setMinimumSize(new Dimension(51, 20));
		lblNome.setMaximumSize(new Dimension(51, 20));
		panel_2.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Lucida Console", Font.PLAIN, 20));
		txtNome.setPreferredSize(new Dimension(100, 30));
		txtNome.setSize(new Dimension(43, 0));
		txtNome.setColumns(35);
		panel_2.add(txtNome);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setFont(new Font("Lucida Console", Font.PLAIN, 24));
		lblCPF.setPreferredSize(new Dimension(100, 30));
		lblCPF.setMinimumSize(new Dimension(51, 20));
		lblCPF.setMaximumSize(new Dimension(51, 20));
		panel_3.add(lblCPF);
		
		txtCpf = new JTextField();
		txtCpf.setFont(new Font("Lucida Console", Font.PLAIN, 20));
		txtCpf.setPreferredSize(new Dimension(100, 30));
		txtCpf.setColumns(35);
		panel_3.add(txtCpf);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setPreferredSize(new Dimension(100, 30));
		lblEmail.setFont(new Font("Lucida Console", Font.PLAIN, 24));
		panel_4.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Lucida Console", Font.PLAIN, 20));
		txtEmail.setPreferredSize(new Dimension(100, 30));
		txtEmail.setColumns(35);
		panel_4.add(txtEmail);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setPreferredSize(new Dimension(100, 30));
		lblSenha.setFont(new Font("Lucida Console", Font.PLAIN, 24));
		panel_5.add(lblSenha);
		
		txtSenha = new JTextField();
		txtSenha.setFont(new Font("Lucida Console", Font.PLAIN, 20));
		txtSenha.setMaximumSize(new Dimension(999, 999));
		txtSenha.setPreferredSize(new Dimension(100, 30));
		txtSenha.setColumns(35);
		panel_5.add(txtSenha);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setPreferredSize(new Dimension(100, 30));
		lblCargo.setFont(new Font("Lucida Console", Font.PLAIN, 24));
		panel_6.add(lblCargo);
		
		JPanel panel_7 = new JPanel();
		GroupLayout gl_contentCadastroFuncionario = new GroupLayout(contentCadastroFuncionario);
		gl_contentCadastroFuncionario.setHorizontalGroup(
			gl_contentCadastroFuncionario.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentCadastroFuncionario.createSequentialGroup()
					.addGroup(gl_contentCadastroFuncionario.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentCadastroFuncionario.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentCadastroFuncionario.createParallelGroup(Alignment.TRAILING)
							.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 1168, Short.MAX_VALUE)
							.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(panel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1168, Short.MAX_VALUE)
							.addComponent(panel_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1168, Short.MAX_VALUE)
							.addComponent(panel_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1168, Short.MAX_VALUE)
							.addComponent(panel_5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1168, Short.MAX_VALUE)
							.addComponent(panel_6, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1168, Short.MAX_VALUE)))
					.addGap(0))
		);
		gl_contentCadastroFuncionario.setVerticalGroup(
			gl_contentCadastroFuncionario.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentCadastroFuncionario.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addGap(109)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(75)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
					.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		FlowLayout fl_panel_7 = new FlowLayout(FlowLayout.CENTER, 5, 5);
		fl_panel_7.setAlignOnBaseline(true);
		panel_7.setLayout(fl_panel_7);
		
		JButton btnAtualiazr = new JButton("Atualizar");
		btnAtualiazr.setFont(new Font("Lucida Console", Font.PLAIN, 24));
		btnAtualiazr.setPreferredSize(new Dimension(160, 35));
		btnAtualiazr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_7.add(btnAtualiazr);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Instanciando a classe de funcionarios e criando objetos
				Funcionario funcionario = new Funcionario();
				String item = (String) comboCargo.getSelectedItem();
				funcionario.setNome(txtNome.getText());
				funcionario.setCpf(txtCpf.getText());
				funcionario.setEmail(txtEmail.getText());
				funcionario.setSenha(txtSenha.getText());
				funcionario.setCargo(item);		
				
				//Validação dos itens
				if((txtNome.getText().isEmpty()) || (txtCpf.getText().isEmpty()) || (txtEmail.getText().isEmpty()) || (txtSenha.getText().isEmpty())){
					JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
				}else{					
					//instanciando a classe FuncionarioDAO e criando seu objeto
					FuncionarioDAO dao = new FuncionarioDAO();
					dao.adicionaFuncionario(funcionario);
					JOptionPane.showMessageDialog(null, "usuario "+funcionario.getNome()+" adicionado com sucesso!");
				}
				
				txtNome.setText("");
				txtCpf.setText("");
				txtEmail.setText("");
				txtSenha.setText("");
				comboCargo.setSelectedItem(null);
			}
		});
		btnCadastrar.setFont(new Font("Lucida Console", Font.PLAIN, 24));
		btnCadastrar.setPreferredSize(new Dimension(160, 35));
		panel_7.add(btnCadastrar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnFechar.setFont(new Font("Lucida Console", Font.PLAIN, 24));
		btnFechar.setPreferredSize(new Dimension(160, 35));
		panel_7.add(btnFechar);
		
		comboCargo = new JComboBox<String>();
		comboCargo.addItem("Gerente");
		comboCargo.addItem("Funcionario");
		comboCargo.setSelectedItem(null);
		comboCargo.setName("Cargo");
		comboCargo.setFont(new Font("Lucida Console", Font.PLAIN, 20));
		comboCargo.setPreferredSize(new Dimension(425, 30));
		panel_6.add(comboCargo);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		txtpesquisa = new JTextField();
		txtpesquisa.setFont(new Font("Lucida Console", Font.PLAIN, 20));
		txtpesquisa.setToolTipText("");
		txtpesquisa.setName("pesquisa");
		txtpesquisa.setPreferredSize(new Dimension(100, 30));
		panel_1.add(txtpesquisa);
		txtpesquisa.setColumns(50);
		
		JButton btnpesquisa = new JButton("Pesquisar");
		btnpesquisa.setFont(new Font("Lucida Console", Font.PLAIN, 24));
		btnpesquisa.setName("pesquisa");
		btnpesquisa.setPreferredSize(new Dimension(160, 30));
		btnpesquisa.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_1.add(btnpesquisa);
		contentCadastroFuncionario.setLayout(gl_contentCadastroFuncionario);
	}
}
