package view.usuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import net.miginfocom.swing.MigLayout;
import util.ConversorData;

public class PainelUsuarioAlterar extends JPanel {
	private JTextField txtIdUsuario;
	private JTextField txtNome;
	private JTextField txtSobrenome;
	private JTextField txtEmail;
	private JFormattedTextField txtDataNascimento;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Create the panel.
	 */
	public PainelUsuarioAlterar() {
		setLayout(new MigLayout("", "[71px][135.00,grow][107.00,grow][99.00][63.00,grow]", "[22px][][][][][][][][][][][][]"));
		
		JLabel lblIdUsuario = new JLabel("Digite o id do usuario");
		add(lblIdUsuario, "cell 1 2,alignx left");
		
		txtIdUsuario = new JTextField();
		txtIdUsuario.setText("13");
		txtIdUsuario.setColumns(10);
		add(txtIdUsuario, "cell 2 2 2 1,growx");
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add(btnPesquisar, "cell 4 2");
		
		JLabel lblNome = new JLabel("Nome");
		add(lblNome, "cell 1 3");
		
		txtNome = new JTextField();
		txtNome.setText("Vitor de Souza ");
		add(txtNome, "cell 1 4 4 1,growx");
		txtNome.setColumns(10);
		
		JLabel lblSobrenome = new JLabel("Sobrenome");
		add(lblSobrenome, "cell 1 5");
		
		JLabel lblTelefone = new JLabel("Telefone");
		add(lblTelefone, "cell 4 5");
		
		txtSobrenome = new JTextField();
		txtSobrenome.setText("Ribeiro");
		add(txtSobrenome, "cell 1 6 3 1,growx");
		txtSobrenome.setColumns(10);
		
		JRadioButton rdbtnMovel = new JRadioButton("Movel");
		buttonGroup.add(rdbtnMovel);
		rdbtnMovel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add(rdbtnMovel, "flowx,cell 4 6");
		
		JLabel lblDataNascimento = new JLabel("Data de Nascimento");
		add(lblDataNascimento, "cell 1 7");
		
		JLabel lblDdd = new JLabel("DDD");
		add(lblDdd, "cell 4 7");
		
		try {
			MaskFormatter maskFormatter = new MaskFormatter("##/##/####");
			txtDataNascimento = new JFormattedTextField(maskFormatter);
			add(txtDataNascimento, "cell 1 8,growx");
		} catch (ParseException e1) {
			System.out.println("Erro na máscara de formatação de data no painel de alteração de usuário.");
			e1.printStackTrace();
		}
		
		try {
			MaskFormatter maskFormatter = new MaskFormatter("##");
			JFormattedTextField txtDdd = new JFormattedTextField(maskFormatter);
			add(txtDdd, "cell 4 8,growx");
		} catch (ParseException e1) {
			System.out.println("Erro na máscara de formatação ddo DDD no painel de alteração de usuário.");
			e1.printStackTrace();
		}
				
		JLabel lblEmail = new JLabel("Email");
		add(lblEmail, "cell 1 9");
		
		txtEmail = new JTextField();
		txtEmail.setText("vittoribeiro12@gmail.com");
		add(txtEmail, "cell 1 10 3 1,growx");
		txtEmail.setColumns(10);
		
		JRadioButton rdbtnFixo = new JRadioButton("Fixo");
		buttonGroup.add(rdbtnFixo);
		rdbtnFixo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add(rdbtnFixo, "cell 4 6");
		
		JButton btnSalvar = new JButton("Salvar Alteracoes");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(ConversorData.converterTextoEmData(txtDataNascimento.getText()));
			}
		});
		add(btnSalvar, "cell 1 12");
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add(btnExcluir, "cell 2 12,alignx center");

	}

}
