package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;

public class VentanaFibo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaFibo frame = new VentanaFibo();
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
	public VentanaFibo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblLabel = new JLabel("Serie Fibonacci");
		lblLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(lblLabel, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("Click Aqui para ver la serie.");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int ValorAnterior= 0;
		        int ValorSiguiente= 0;
		        int ValorProximo = 1;
		        

		        do {
		            ValorAnterior=ValorSiguiente;
		            ValorSiguiente=ValorProximo;
		            ValorProximo = ValorAnterior + ValorSiguiente;
		            JOptionPane.showMessageDialog(null, ValorProximo);

		        } while (ValorProximo < 100);
		        
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
	}

}
