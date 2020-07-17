package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.ContatoModel;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class ViewPrimeiraTela extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtSobrenome;
	private JTextField txtEmpresa;
	private JTextField txtEmail;
	private JTextField txtNumero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewPrimeiraTela frame = new ViewPrimeiraTela();
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
	public ViewPrimeiraTela() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNome = new JTextField();
		txtNome.setBounds(10, 28, 124, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(10, 11, 124, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblSobrenome = new JLabel("Sobrenome");
		lblSobrenome.setBounds(144, 11, 124, 14);
		contentPane.add(lblSobrenome);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setBounds(144, 28, 124, 20);
		contentPane.add(txtSobrenome);
		txtSobrenome.setColumns(10);
		
		JLabel lblEmpresa = new JLabel("Empresa");
		lblEmpresa.setBounds(10, 59, 258, 14);
		contentPane.add(lblEmpresa);
		
		txtEmpresa = new JTextField();
		txtEmpresa.setBounds(10, 77, 258, 20);
		contentPane.add(txtEmpresa);
		txtEmpresa.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(10, 108, 258, 14);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(10, 123, 258, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setBounds(10, 154, 258, 14);
		contentPane.add(lblNumero);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(10, 173, 258, 20);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		JLabel lblTipoNumero = new JLabel("Tipo Telefone");
		lblTipoNumero.setBounds(10, 204, 124, 14);
		contentPane.add(lblTipoNumero);
		
		JComboBox cmbTipoTelefone = new JComboBox();
		cmbTipoTelefone.setBounds(10, 219, 124, 20);
		cmbTipoTelefone.addItem("Fixo");
		cmbTipoTelefone.addItem("Celular");
		contentPane.add(cmbTipoTelefone);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(315, 76, 89, 23);
		contentPane.add(btnVoltar);
		
		//Listener btnAdd
				JButton btnAdd = new JButton("Adicionar");
				btnAdd.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						if(checarCampos()) {
							ContatoModel contatoModel = new ContatoModel();
							contatoModel.setNome(txtNome.getText());
							contatoModel.setSobrenome(txtSobrenome.getText());
							contatoModel.setEmpresa(txtEmpresa.getText());
							contatoModel.setEmail(txtEmail.getText());
							contatoModel.setNumero(txtNumero.getText());
							contatoModel.setTipotelefone(String.valueOf(cmbTipoTelefone.getSelectedItem()));
							JOptionPane.showMessageDialog(null, "Contato Salvo");
							System.out.println(contatoModel);
						}
						
					}
				});
				btnAdd.setBounds(315, 39, 89, 23);
				contentPane.add(btnAdd);
		
	}
	
	//metodo para checar os campos
	private boolean checarCampos() {
		
		if(txtNome.getText().toString() == "") {
			JOptionPane.showMessageDialog(this, "Campo nome deve ser preenchido.");
			return false;
		}else if(txtSobrenome.getText().toString() == ""){
			JOptionPane.showMessageDialog(this, "Campo sobrenome deve ser preenchido.");
			return false;
		}
		
		return true;
	}
	
}
