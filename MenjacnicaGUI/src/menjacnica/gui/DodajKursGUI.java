package menjacnica.gui;

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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DodajKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblSifra;
	private JTextField textFieldSifra;
	private JLabel lblNaziv;
	private JTextField textFieldNaziv;
	private JLabel lblProdajniKurs;
	private JTextField textFieldProdajniKurs;
	private JLabel lblKupovniKurs;
	private JTextField textFieldKupovniKurs;
	private JLabel lblSrednjiKurs;
	private JTextField textFieldSrednjiKurs;
	private JLabel lblSkraceniNaziv;
	private JTextField textFieldSkraceniNaziv;
	private JButton btnDodaj;
	private JButton btnOdustani;
	private static MenjacnicaGUI menjacnica;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DodajKursGUI frame = new DodajKursGUI();
					menjacnica = new MenjacnicaGUI();
					frame.setVisible(true);
					menjacnica.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DodajKursGUI() {
		setResizable(false);
		setTitle("Dodaj kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 294, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblSifra());
		contentPane.add(getTextFieldSifra());
		contentPane.add(getLblNaziv());
		contentPane.add(getTextFieldNaziv());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getTextFieldProdajniKurs());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getTextFieldKupovniKurs());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getTextFieldSrednjiKurs());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getTextFieldSkraceniNaziv());
		contentPane.add(getBtnDodaj());
		contentPane.add(getBtnOdustani());
	}
	
	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setBounds(10, 24, 71, 26);
		}
		return lblSifra;
	}
	private JTextField getTextFieldSifra() {
		if (textFieldSifra == null) {
			textFieldSifra = new JTextField();
			textFieldSifra.setBounds(10, 61, 112, 26);
			textFieldSifra.setColumns(10);
		}
		return textFieldSifra;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setBounds(147, 30, 71, 26);
		}
		return lblNaziv;
	}
	private JTextField getTextFieldNaziv() {
		if (textFieldNaziv == null) {
			textFieldNaziv = new JTextField();
			textFieldNaziv.setBounds(147, 61, 106, 26);
			textFieldNaziv.setColumns(10);
		}
		return textFieldNaziv;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(10, 107, 94, 26);
		}
		return lblProdajniKurs;
	}
	private JTextField getTextFieldProdajniKurs() {
		if (textFieldProdajniKurs == null) {
			textFieldProdajniKurs = new JTextField();
			textFieldProdajniKurs.setBounds(10, 144, 112, 26);
			textFieldProdajniKurs.setColumns(10);
		}
		return textFieldProdajniKurs;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(147, 107, 86, 26);
		}
		return lblKupovniKurs;
	}
	private JTextField getTextFieldKupovniKurs() {
		if (textFieldKupovniKurs == null) {
			textFieldKupovniKurs = new JTextField();
			textFieldKupovniKurs.setBounds(147, 144, 106, 26);
			textFieldKupovniKurs.setColumns(10);
		}
		return textFieldKupovniKurs;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setBounds(10, 188, 94, 26);
		}
		return lblSrednjiKurs;
	}
	private JTextField getTextFieldSrednjiKurs() {
		if (textFieldSrednjiKurs == null) {
			textFieldSrednjiKurs = new JTextField();
			textFieldSrednjiKurs.setBounds(10, 225, 112, 26);
			textFieldSrednjiKurs.setColumns(10);
		}
		return textFieldSrednjiKurs;
	}
	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setBounds(147, 191, 86, 20);
		}
		return lblSkraceniNaziv;
	}
	private JTextField getTextFieldSkraceniNaziv() {
		if (textFieldSkraceniNaziv == null) {
			textFieldSkraceniNaziv = new JTextField();
			textFieldSkraceniNaziv.setBounds(147, 225, 106, 26);
			textFieldSkraceniNaziv.setColumns(10);
		}
		return textFieldSkraceniNaziv;
	}
	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String sifra = textFieldSifra.getText();
					String naziv = textFieldNaziv.getText();
					String skraceniNaziv = textFieldSkraceniNaziv.getText();
					double prodajniKurs = Double.parseDouble(textFieldProdajniKurs.getText());
					double kupovniKurs = Double.parseDouble(textFieldKupovniKurs.getText());
					double srednjiKurs = Double.parseDouble(textFieldSrednjiKurs.getText());
					
					GUIKontroler.dodajKurs(sifra, naziv, prodajniKurs, kupovniKurs, srednjiKurs, skraceniNaziv);
				}
			});
			btnDodaj.setBounds(10, 277, 112, 26);
		}
		return btnDodaj;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnOdustani.setBounds(144, 277, 109, 26);
		}
		return btnOdustani;
	}
}
