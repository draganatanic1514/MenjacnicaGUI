package menjacnica.gui;

import java.awt.EventQueue;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GUIKontroler {

	private static MenjacnicaGUI menjacnica;
	private static DodajKursGUI dodajKursGui;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menjacnica = new MenjacnicaGUI();
					menjacnica.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
	}

	public static void izadji() {
		int izbor = JOptionPane.showConfirmDialog(menjacnica.getContentPane(), "Da li zelite da izadjete iz programa?",
				"Exit", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (izbor == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}

	public static void podaciOAutoru() {
		JOptionPane.showMessageDialog(menjacnica.getContentPane(), "Autor: Dragana Tanic", "Podaci o autoru",
				JOptionPane.PLAIN_MESSAGE);
	}
	
	public static void prikaziDodajKursGUI() {
		if(dodajKursGui == null) {
			dodajKursGui = new DodajKursGUI();
			dodajKursGui.setLocationRelativeTo(null);
			dodajKursGui.setVisible(true);
		} else {
			dodajKursGui.toFront();
		}
	}
	
	public static void dodajKurs(String sifra, String naziv, double prodajniKurs, double kupovniKurs,
			double srednjiKurs, String skraceniNaziv) {
		String s = "Sifra:" + sifra + " Naziv: " + naziv + " Prodajni kurs: " + prodajniKurs + 
				" Kupovni kurs: " + kupovniKurs + " Srednji kurs: " + srednjiKurs + " Skraceni naziv: " + skraceniNaziv;
		
		menjacnica.getTextArea_1().append(s);
		
		DefaultTableModel d = (DefaultTableModel)menjacnica.getTable().getModel();
		d.addRow(new Object[] {sifra, skraceniNaziv, prodajniKurs, srednjiKurs, kupovniKurs, naziv});
		
		dodajKursGui.dispose();
	}
}
