package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class MainForm extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel panel = new JPanel();
	private JMenu menu = new JMenu("Usu�rio");
	private JMenuBar barra = new JMenuBar();
	private JMenuItem itemConfig = new JMenuItem("Configura��es");
	private JMenuItem itemCadastrar = new JMenuItem("Cadastrar");
	private JMenuItem itemListar = new JMenuItem("Listar");
	private JMenuItem itemSair = new JMenuItem("Sair");
	private JLabel lbNome = new JLabel("Nome");
	private JTextField tfNome = new JTextField();
	private JButton btBuscar = new JButton("Buscar");
	private DefaultTableModel dtm;
	private JTable table;
	private JScrollPane scroll;

	MainForm() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("�rea do Usu�rio. ");
		setBounds(300, 100, 800, 550);
		setJMenuBar(barra);
		setContentPane(panel);
		setLayout(null);

		barra.add(menu);
		menu.add(itemConfig);
		menu.add(itemCadastrar);
		menu.add(itemListar);
		menu.addSeparator();
		menu.add(itemSair);

		lbNome.setBounds(130, 60, 100, 30);
		tfNome.setBounds(180, 60, 300, 30);
		btBuscar.setBounds(484, 61, 100, 26);
		panel.add(lbNome);
		panel.add(tfNome);
		panel.add(btBuscar);
		
		dtm = new DefaultTableModel();
		dtm.addColumn("Nome");
		dtm.addColumn("Cidade");
		dtm.addColumn("Telefone");
		
		table = new JTable(dtm);
		scroll = new JScrollPane(table);
		scroll.setBounds(20,100,740,380);
		panel.add(scroll);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

	public static void main(String[] args) {

		MainForm mf = new MainForm();
		mf.setVisible(true);

		LoginForm lf = new LoginForm();
		lf.setModal(true);
		lf.setVisible(true);

	}

}
