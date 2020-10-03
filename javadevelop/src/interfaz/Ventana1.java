package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtPrimerValor;
	private JTextField txtSegundoValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 frame = new Ventana1();
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
	public Ventana1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese los datos de su serie:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setBounds(10, 33, 254, 37);
		contentPane.add(lblNewLabel);
		
		txtPrimerValor = new JTextField();
		txtPrimerValor.setBounds(119, 94, 96, 19);
		contentPane.add(txtPrimerValor);
		txtPrimerValor.setColumns(10);
		
		txtSegundoValor = new JTextField();
		txtSegundoValor.setBounds(132, 148, 96, 19);
		contentPane.add(txtSegundoValor);
		txtSegundoValor.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Primer Valor:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 95, 96, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Segundo Valor:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(10, 141, 121, 29);
		contentPane.add(lblNewLabel_2);
		
		JButton btnMostrarSerie = new JButton("MostrarSerie");
		btnMostrarSerie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int ValorAnterior= Integer.parseInt(txtPrimerValor.getText());
		        int ValorSiguiente= Integer.parseInt(txtSegundoValor.getText());
		        int ValorProximo = 1;
		        

		        do {
		            ValorAnterior=ValorSiguiente;
		            ValorSiguiente=ValorProximo;
		            ValorProximo = ValorAnterior + ValorSiguiente;
		            JOptionPane.showMessageDialog(null, ValorProximo);

		        } while (ValorProximo < 100);
				
			}
		});
		btnMostrarSerie.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnMostrarSerie.setBounds(296, 93, 106, 21);
		contentPane.add(btnMostrarSerie);
	}
}
