package menjacnica.gui;

import java.awt.EventQueue;

import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class GUIKontroler {

	private static MenjacnicaGUI menjacnica;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				menjacnica = new MenjacnicaGUI();
				menjacnica.setVisible(true);
			}
		});
	}
	
	public static void izadji() {
		int izbor = JOptionPane.showConfirmDialog(menjacnica.getContentPane(), 
				"Da li zelite da izadjete iz programa?", "Exit", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (izbor == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
	
	public static void podaciOAutoru() {
		JOptionPane.showMessageDialog(menjacnica.getContentPane(), "Autor: Dragana Tanic", "Podaci o autoru",
				JOptionPane.PLAIN_MESSAGE);
	}
}
