package Domaci4;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.text.Document;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.JList;

public class TamaraGUI {

	private JFrame frmUnosPodatakaO;
	private JTextField imeFiled;
	private JTextField prezimeField;
	private JTextField nadimakField;
	private JTextField gradField;
	private JTextField Email_field;
	private ArrayList<String[]> lista = new ArrayList<String[]>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TamaraGUI window = new TamaraGUI();
					window.frmUnosPodatakaO.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TamaraGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUnosPodatakaO = new JFrame();
		frmUnosPodatakaO.setTitle("Unos podataka o osobi");
		frmUnosPodatakaO.setBounds(100, 100, 450, 425);
		frmUnosPodatakaO.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUnosPodatakaO.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Li\u010Dni podaci:",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		panel.setBounds(10, 11, 414, 137);
		frmUnosPodatakaO.getContentPane().add(panel);
		panel.setLayout(null);

		imeFiled = new JTextField();
		imeFiled.setBounds(66, 52, 144, 20);
		panel.add(imeFiled);
		imeFiled.setColumns(10);

		prezimeField = new JTextField();
		prezimeField.setBounds(66, 84, 144, 20);
		panel.add(prezimeField);
		prezimeField.setColumns(10);

		nadimakField = new JTextField();
		nadimakField.setBounds(276, 52, 128, 20);
		panel.add(nadimakField);
		nadimakField.setColumns(10);

		gradField = new JTextField();
		gradField.setBounds(276, 84, 128, 20);
		panel.add(gradField);
		gradField.setColumns(10);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "Ime", "Prezime", "Ime i prezime", "Prezime i ime", "Nadimak" }));
		comboBox.setBounds(93, 109, 311, 20);
		panel.add(comboBox);

		JLabel lblNewLabel = new JLabel("Ime");
		lblNewLabel.setBounds(10, 55, 46, 14);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Prezime");
		lblNewLabel_1.setBounds(10, 87, 46, 14);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Nadimak");
		lblNewLabel_2.setBounds(220, 55, 46, 14);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Grad:");
		lblNewLabel_3.setBounds(220, 87, 46, 14);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Nacin prikaza:");
		lblNewLabel_4.setBounds(10, 112, 78, 14);
		panel.add(lblNewLabel_4);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "E-mail", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panel_1.setBounds(10, 159, 414, 216);
		frmUnosPodatakaO.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		Email_field = new JTextField();
		Email_field.setBounds(108, 33, 180, 20);
		panel_1.add(Email_field);
		Email_field.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("E-mail adresa:");
		lblNewLabel_5.setBounds(10, 36, 91, 14);
		panel_1.add(lblNewLabel_5);
		DefaultListModel<String> dlm = new DefaultListModel<String>();
		JList<String> listaView = new JList<>(dlm);
		listaView.setBounds(10, 64, 278, 144);
		panel_1.add(listaView);

		JButton btnDodaj = new JButton("Dodaj");
		btnDodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// lista.add({textField.getText(),textField_1.getText(),textField_2.getText(),textField_3.getText()});
				lista.add(new String[] { imeFiled.getText(), prezimeField.getText(), nadimakField.getText(),
						gradField.getText(), Email_field.getText() });
				int brojac = 0;

				switch (comboBox.getSelectedItem().toString()) {
				case ("Ime"):
					dlm.addElement(imeFiled.getText());
					break;

				case ("Prezime"):
					dlm.addElement(prezimeField.getText());
					break;
				case ("Ime i prezime"):
					dlm.addElement(imeFiled.getText() + " " + prezimeField.getText());
					break;
				case ("Prezime i ime"):
					dlm.addElement(prezimeField.getText() + " " + imeFiled.getText());
					break;
				case ("Nadimak"):
					dlm.addElement(nadimakField.getText());
					break;
				}
			}
		});

		btnDodaj.setBounds(315, 79, 89, 23);
		panel_1.add(btnDodaj);
		
		JButton sacuvajIzmene = new JButton("Sacuvaj");
	
		
		JButton btnIzmeni = new JButton("Izmeni");
		btnIzmeni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sacuvajIzmene.setBounds(315, 181, 89, 23);
				panel_1.add(sacuvajIzmene);
				imeFiled.setText(lista.get(listaView.getSelectedIndex())[0]);
				prezimeField.setText(lista.get(listaView.getSelectedIndex())[1]);
				nadimakField.setText(lista.get(listaView.getSelectedIndex())[2]);
				gradField.setText(lista.get(listaView.getSelectedIndex())[3]);
				Email_field.setText(lista.get(listaView.getSelectedIndex())[4]);
				
				
				sacuvajIzmene.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						panel_1.remove(sacuvajIzmene);
						lista.get(listaView.getSelectedIndex())[0]=imeFiled.getText();
						lista.get(listaView.getSelectedIndex())[1]=prezimeField.getText();
						lista.get(listaView.getSelectedIndex())[2]=nadimakField.getText();
						lista.get(listaView.getSelectedIndex())[3]=gradField.getText();
						lista.get(listaView.getSelectedIndex())[4]=Email_field.getText();
						
					}
				});
				
			}
			
		});
		btnIzmeni.setBounds(315, 113, 89, 23);
		panel_1.add(btnIzmeni);

		JButton btnIzbaci = new JButton("Izbaci");
		btnIzbaci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dlm.removeElementAt(listaView.getSelectedIndex());
			}
		});
		btnIzbaci.setBounds(315, 147, 89, 23);
		panel_1.add(btnIzbaci);
		
		
	}
}
