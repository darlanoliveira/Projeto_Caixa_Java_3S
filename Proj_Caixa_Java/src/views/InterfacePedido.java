package views;

import java.awt.Dimension;

import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.*;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import java.awt.Color;
import org.eclipse.wb.swing.FocusTraversalOnArray;

import DAO.FuncionarioDAO;
import DAO.PedidosDAO;
import model.Funcionario;
import model.Pedidos;

import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.JButton;

//Ignorar o warning
@SuppressWarnings("serial")
public class InterfacePedido extends JFrame {

	private JPanel contentPane;
	private static JTextField textField;
	private static JComboBox comboBox;
	private static JComboBox comboBox_1;
	private static JComboBox comboBox_2;
	private static JComboBox comboBox_3;
	private static JComboBox comboBox_4;
	private static JComboBox comboBox_5;
	private static JComboBox comboBox_6;
	private static JComboBox comboBox_7;
	private static JComboBox comboBox_8;
	private static JComboBox comboBox_9;
	private static JComboBox comboBox_10;
	private static JComboBox comboBox_11;
	private static JComboBox comboBox_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfacePedido frame = new InterfacePedido();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	// Método que reseta todos os campos
	public static void limparCampos() {
		textField.setText("R$ ");
		comboBox_1.setSelectedIndex(0);
		comboBox_2.setSelectedIndex(0);
		comboBox_3.setSelectedIndex(0);
		comboBox_4.setSelectedIndex(0);
		comboBox_5.setSelectedIndex(0);
		comboBox_6.setSelectedIndex(0);
		comboBox_7.setSelectedIndex(0);
		comboBox_8.setSelectedIndex(0);
		comboBox_9.setSelectedIndex(0);
		comboBox_10.setSelectedIndex(0);
		comboBox_11.setSelectedIndex(0);
		comboBox_12.setSelectedIndex(0);

	}

	// Metódo que calcula o valor gasto na mesa
	public static void calcular() {

		Pedidos ped1 = (Pedidos) comboBox_1.getSelectedItem();
		Pedidos ped2 = (Pedidos) comboBox_3.getSelectedItem();
		Pedidos ped3 = (Pedidos) comboBox_5.getSelectedItem();
		Pedidos ped4 = (Pedidos) comboBox_7.getSelectedItem();
		Pedidos ped5 = (Pedidos) comboBox_9.getSelectedItem();
		Pedidos ped6 = (Pedidos) comboBox_11.getSelectedItem();

		double valor1 = ped1.getValor_prato();
		double valor2 = ped2.getValor_prato();
		double valor3 = ped3.getValor_prato();
		double valor4 = ped4.getValor_prato();
		double valor5 = ped5.getValor_prato();
		double valor6 = ped6.getValor_prato();

		int qtd1 = (int) comboBox_2.getSelectedItem();
		int qtd2 = (int) comboBox_4.getSelectedItem();
		int qtd3 = (int) comboBox_6.getSelectedItem();
		int qtd4 = (int) comboBox_8.getSelectedItem();
		int qtd5 = (int) comboBox_10.getSelectedItem();
		int qtd6 = (int) comboBox_12.getSelectedItem();

		double valortotal = (valor1 * qtd1) + (valor2 * qtd2) + (valor3 * qtd3) + (valor4 * qtd4) + (valor5 * qtd5)
				+ (valor6 * qtd6);
		String vt = String.valueOf(valortotal);
		textField.setText("R$ " + vt);
	}

	/**
	 * Create the frame.
	 */

	public InterfacePedido() {
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

		JPanel panel_2 = new JPanel();

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblPrato_1 = new JLabel("Prato 2");
		lblPrato_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		panel_3.add(lblPrato_1);

		// Criando as combobox

		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 22));
		panel_1.add(comboBox);

		comboBox_1 = new JComboBox();
		comboBox_1.setPreferredSize(new Dimension(300, 26));

		comboBox_3 = new JComboBox();
		comboBox_3.setPreferredSize(new Dimension(300, 26));
		panel_3.add(comboBox_3);

		comboBox_4 = new JComboBox();
		panel_3.add(comboBox_4);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblPrato_2 = new JLabel("Prato 3");
		lblPrato_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		panel_4.add(lblPrato_2);

		comboBox_5 = new JComboBox();
		comboBox_5.setPreferredSize(new Dimension(300, 26));
		panel_4.add(comboBox_5);

		comboBox_6 = new JComboBox();
		panel_4.add(comboBox_6);

		JPanel panel_5 = new JPanel();
		panel_5.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblPrato_3 = new JLabel("Prato 4");
		lblPrato_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		panel_5.add(lblPrato_3);

		comboBox_7 = new JComboBox();
		comboBox_7.setPreferredSize(new Dimension(300, 26));
		panel_5.add(comboBox_7);

		comboBox_8 = new JComboBox();
		panel_5.add(comboBox_8);

		JPanel panel_6 = new JPanel();
		panel_6.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblPrato_4 = new JLabel("Prato 5");
		lblPrato_4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		panel_6.add(lblPrato_4);

		comboBox_9 = new JComboBox();
		comboBox_9.setPreferredSize(new Dimension(300, 26));
		panel_6.add(comboBox_9);

		comboBox_10 = new JComboBox();
		panel_6.add(comboBox_10);

		JPanel panel_7 = new JPanel();
		panel_7.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblPrato_5 = new JLabel("Prato 6");
		lblPrato_5.setFont(new Font("Tahoma", Font.PLAIN, 22));
		panel_7.add(lblPrato_5);

		comboBox_11 = new JComboBox();
		comboBox_11.setPreferredSize(new Dimension(300, 26));
		panel_7.add(comboBox_11);

		comboBox_12 = new JComboBox();
		panel_7.add(comboBox_12);

		comboBox_2 = new JComboBox();
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		// Populando as combobox

		// Combobox das mesas
		for (int i = 1; i <= 20; i++) {
			comboBox.addItem(i);
		}

		// Combobox de pratos
		PedidosDAO dao = new PedidosDAO();
		for (Pedidos p : dao.getListaDePedidos()) {

			comboBox_3.addItem(p);
			comboBox_5.addItem(p);
			comboBox_1.addItem(p);
			comboBox_9.addItem(p);
			comboBox_11.addItem(p);
			comboBox_7.addItem(p);

		}

		// Combobox de quantidade
		for (int i = 0; i <= 9; i++) {
			comboBox_2.addItem(i);
			comboBox_4.addItem(i);
			comboBox_6.addItem(i);
			comboBox_8.addItem(i);
			comboBox_10.addItem(i);
			comboBox_12.addItem(i);
		}

		JPanel panel_8 = new JPanel();
		panel_8.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblTotal = new JLabel("Total");
		lblTotal.setForeground(Color.RED);
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_8.add(lblTotal);

		JPanel panel_9 = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 1168, Short.MAX_VALUE)
				.addComponent(panel_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 1168, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 1138, Short.MAX_VALUE).addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
						.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 1138, Short.MAX_VALUE).addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
						.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 1138, Short.MAX_VALUE).addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
						.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 1138, Short.MAX_VALUE).addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
						.addComponent(panel_6, GroupLayout.DEFAULT_SIZE, 1138, Short.MAX_VALUE).addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
						.addComponent(panel_7, GroupLayout.DEFAULT_SIZE, 1138, Short.MAX_VALUE).addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
						.addComponent(panel_8, GroupLayout.DEFAULT_SIZE, 1138, Short.MAX_VALUE).addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap().addComponent(panel_9,
						GroupLayout.DEFAULT_SIZE, 1153, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addComponent(panel, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
				.addGap(100)
				.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(18)
				.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(117).addComponent(panel_9, GroupLayout.PREFERRED_SIZE, 39, Short.MAX_VALUE).addContainerGap()));

		// Ação do botão cancelar.
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int botao = JOptionPane.YES_NO_OPTION;
				int dialogResult = JOptionPane.showConfirmDialog(null, "Deseja Cancelar essa mesa?", "Cancelar", botao);
				if (dialogResult == JOptionPane.YES_OPTION) {

					limparCampos();

				}
			}
		});

		// Ação do botão Concluir.
		JButton btnConcluir = new JButton("Fechar Mesa");
		btnConcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int botao = JOptionPane.YES_NO_OPTION;
				int dialogresult = JOptionPane.showConfirmDialog(null, "Deseja fechar a conta desta mesa?",
						"Fechar conta", botao);
				if (dialogresult == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "O valor total a ser pago é " + textField.getText());
					limparCampos();
				}
			}
		});

		// Ação do botão Sair
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}

		});

		GroupLayout gl_panel_9 = new GroupLayout(panel_9);
		gl_panel_9.setHorizontalGroup(gl_panel_9.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_9.createSequentialGroup().addContainerGap()
						.addComponent(btnSair, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 770, Short.MAX_VALUE)
						.addComponent(btnConcluir, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		gl_panel_9.setVerticalGroup(gl_panel_9.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_9.createSequentialGroup()
						.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING)
								.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnConcluir, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnSair, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));
		panel_9.setLayout(gl_panel_9);

		// TextField do valor Total.
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(6, 40));
		textField.setEditable(false);
		textField.setText("R$ ");
		panel_8.add(textField);
		textField.setColumns(10);

		// "Escutando" os botões e chamando o metódo calcular.
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}

		});
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}

		});
		comboBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}

		});
		comboBox_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}

		});
		comboBox_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}

		});
		comboBox_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}

		});
		comboBox_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}

		});
		comboBox_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}

		});
		comboBox_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}

		});
		comboBox_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}

		});
		comboBox_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}

		});
		comboBox_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}

		});

		// Labels.
		JLabel lblPrato = new JLabel("Prato 1");
		lblPrato.setFont(new Font("Tahoma", Font.PLAIN, 22));
		panel_2.add(lblPrato);
		panel_2.add(comboBox_1);
		panel_2.add(comboBox_2);
		panel_2.setFocusTraversalPolicy(
				new FocusTraversalOnArray(new Component[] { lblPrato, comboBox_1, comboBox_2 }));
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblNumeroDaMesa = new JLabel("Numero da Mesa");
		lblNumeroDaMesa.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNumeroDaMesa.setFont(new Font("Tahoma", Font.PLAIN, 22));
		panel_1.add(lblNumeroDaMesa);

		JLabel lblNewLabel = new JLabel("Bem-vindo:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));

		JLabel lblNewLabel_1 = new JLabel("16/05/2018 - 16:00h");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));

		JLabel lblNewLabel_2 = new JLabel("Pedidos");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 48));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup().addContainerGap()
				.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE).addGap(17)
				.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGap(49).addComponent(lblNewLabel_1).addContainerGap()));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup().addGap(24).addComponent(lblNewLabel_1))
								.addGroup(gl_panel.createSequentialGroup().addGap(27).addComponent(lblNewLabel))
								.addGroup(gl_panel.createSequentialGroup().addGap(8).addComponent(lblNewLabel_2)))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);

	}

}
