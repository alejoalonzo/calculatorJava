import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Start {

	// Attributes---------------------------------------------------------------------------------------------------------
	private JFrame frame;
	private JTextField caja1;
	private JButton btnC;
	private JButton btnPar;
	private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15;

	private String btTxMas, btTxMenos, btTxPor, btTxEntre, btTxIgual, btTxPar;
	private int btInMas, btInMenos, btInPor, btInEntre, btInIgual, btInPar, resultado;

	private String info = "";
	private JLabel lblNewLabel;
	private JPanel panel1;
	private JPanel panel2;
	private JLabel etiquetaCerrar;
	// ------------------------------------------------------------------------------------------------------------------

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 270, 460);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		caja1 = new JTextField();
		caja1.setBorder(null);
		caja1.setBackground(new Color(201, 201, 201));
		caja1.setForeground(new Color(109, 66, 81));
		caja1.setHorizontalAlignment(SwingConstants.RIGHT);
		caja1.setFont(new Font("Raleway", Font.PLAIN, 30));
		caja1.setBounds(10, 23, 235, 60);
		frame.getContentPane().add(caja1);
		caja1.setColumns(10);

		btnC = new JButton("");
		btnC.setBorder(null);
		btnC.setRolloverIcon(new ImageIcon(Start.class.getResource("/img/btnC3.jpg")));
		btnC.setFocusPainted(false);
		btnC.setIcon(new ImageIcon(Start.class.getResource("/img/btnC.jpg")));
		btnC.setForeground(new Color(30, 144, 255));
		btnC.setBackground(new Color(135, 206, 250));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Reset--------------------------------
				desbloquearBtns();
				info = "";
				resultado = 0;
				btInIgual = 0;
				btInMas = 0;
				btInMenos = 0;
				btInPor = 0;
				btInEntre = 0;
				caja1.setText("");
			}
		});
		btnC.setBounds(0, 159, 65, 50);
		frame.getContentPane().add(btnC);

		btnPar = new JButton("");
		btnPar.setDisabledIcon(new ImageIcon(Start.class.getResource("/img/btnsPar2.jpg")));
		btnPar.setBorder(null);
		btnPar.setRolloverIcon(new ImageIcon(Start.class.getResource("/img/btnsPar3.jpg")));
		btnPar.setFocusPainted(false);
		btnPar.setIcon(new ImageIcon(Start.class.getResource("/img/btnsPar.jpg")));
		btnPar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					btTxPar = caja1.getText();
					btInPar = Integer.parseInt(btTxPar);
					if (btInPar % 2 != 0) {
						caja1.setText("Inpar");
						bloquearBtns();
					} else {
						caja1.setText("Par");
						bloquearBtns();
					}
				} catch (Exception ex) {
					caja1.setText("Introduzca");
					bloquearBtns();
				}
			}
		});
		btnPar.setBounds(64, 159, 65, 50);
		frame.getContentPane().add(btnPar);

		// -----------------------------------------------------------------------NUMMBER'S_BTNS-------------------------------
		btn10 = new JButton("");
		btn10.setDisabledIcon(new ImageIcon(Start.class.getResource("/img/btnsCero2.jpg")));
		btn10.setBorder(null);
		btn10.setRolloverIcon(new ImageIcon(Start.class.getResource("/img/btnscero3.jpg")));
		btn10.setFocusPainted(false);
		btn10.setIcon(new ImageIcon(Start.class.getResource("/img/btnsCero.jpg")));
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				info = caja1.getText();

				if (caja1.getText() == "") {// Conditional to add digits to operands.
					caja1.setText("0");
				} else {
					caja1.setText(info + "0");
				}
			}
		});
		btn10.setBounds(64, 371, 65, 50);
		frame.getContentPane().add(btn10);

		btn1 = new JButton("");
		btn1.setDisabledIcon(new ImageIcon(Start.class.getResource("/img/btnUno2.jpg")));
		btn1.setBorder(null);
		btn1.setRolloverIcon(new ImageIcon(Start.class.getResource("/img/btnUno3.jpg")));
		btn1.setFocusPainted(false);
		btn1.setIcon(new ImageIcon(Start.class.getResource("/img/btnUno.jpg")));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				info = caja1.getText();
				if (caja1.getText() == "") {
					caja1.setText("1");
				} else {
					caja1.setText(info + "1");
				}
			}
		});
		btn1.setBounds(0, 213, 65, 50);
		frame.getContentPane().add(btn1);

		btn2 = new JButton("");
		btn2.setDisabledIcon(new ImageIcon(Start.class.getResource("/img/btnDos2.jpg")));
		btn2.setBorder(null);
		btn2.setRolloverIcon(new ImageIcon(Start.class.getResource("/img/btnDos3.jpg")));
		btn2.setFocusPainted(false);
		btn2.setIcon(new ImageIcon(Start.class.getResource("/img/btnsdos.jpg")));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				info = caja1.getText();
				if (caja1.getText() == "") {
					caja1.setText("2");
				} else {
					caja1.setText(info + "2");
				}
			}
		});
		btn2.setBounds(64, 213, 65, 50);
		frame.getContentPane().add(btn2);

		btn3 = new JButton("");
		btn3.setDisabledIcon(new ImageIcon(Start.class.getResource("/img/btntres2.jpg")));
		btn3.setBorder(null);
		btn3.setRolloverIcon(new ImageIcon(Start.class.getResource("/img/btntres3.jpg")));
		btn3.setFocusPainted(false);
		btn3.setIcon(new ImageIcon(Start.class.getResource("/img/btntres.jpg")));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				info = caja1.getText();
				if (caja1.getText() == "") {
					caja1.setText("3");
				} else {
					caja1.setText(info + "3");
				}
			}
		});
		btn3.setBounds(128, 213, 65, 50);
		frame.getContentPane().add(btn3);

		btn4 = new JButton("");
		btn4.setDisabledIcon(new ImageIcon(Start.class.getResource("/img/btncuatro2.jpg")));
		btn4.setBorder(null);
		btn4.setRolloverIcon(new ImageIcon(Start.class.getResource("/img/btncuatro3.jpg")));
		btn4.setFocusPainted(false);
		btn4.setIcon(new ImageIcon(Start.class.getResource("/img/btncuatro.jpg")));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				info = caja1.getText();
				if (caja1.getText() == "") {
					caja1.setText("4");
				} else {
					caja1.setText(info + "4");
				}
			}
		});
		btn4.setBounds(0, 267, 65, 50);
		frame.getContentPane().add(btn4);

		btn5 = new JButton("");
		btn5.setDisabledIcon(new ImageIcon(Start.class.getResource("/img/btncinco2.jpg")));
		btn5.setBorder(null);
		btn5.setRolloverIcon(new ImageIcon(Start.class.getResource("/img/btncinco3.jpg")));
		btn5.setFocusPainted(false);
		btn5.setIcon(new ImageIcon(Start.class.getResource("/img/btncinco.jpg")));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				info = caja1.getText();
				if (caja1.getText() == "") {
					caja1.setText("5");
				} else {
					caja1.setText(info + "5");
				}
			}
		});
		btn5.setBounds(64, 267, 65, 50);
		frame.getContentPane().add(btn5);

		btn6 = new JButton("");
		btn6.setDisabledIcon(new ImageIcon(Start.class.getResource("/img/btnseis2.jpg")));
		btn6.setBorder(null);
		btn6.setRolloverIcon(new ImageIcon(Start.class.getResource("/img/btnseis3.jpg")));
		btn6.setFocusPainted(false);
		btn6.setIcon(new ImageIcon(Start.class.getResource("/img/btnseis.jpg")));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				info = caja1.getText();
				if (caja1.getText() == "") {
					caja1.setText("6");
				} else {
					caja1.setText(info + "6");
				}
			}
		});
		btn6.setBounds(128, 267, 65, 50);
		frame.getContentPane().add(btn6);

		btn7 = new JButton("");
		btn7.setDisabledIcon(new ImageIcon(Start.class.getResource("/img/btnsiete2.jpg")));
		btn7.setBorder(null);
		btn7.setRolloverIcon(new ImageIcon(Start.class.getResource("/img/btnsiete3.jpg")));
		btn7.setFocusPainted(false);
		btn7.setIcon(new ImageIcon(Start.class.getResource("/img/btnsiete.jpg")));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				info = caja1.getText();
				if (caja1.getText() == "") {
					caja1.setText("7");
				} else {
					caja1.setText(info + "7");
				}
			}
		});
		btn7.setBounds(0, 321, 65, 50);
		frame.getContentPane().add(btn7);

		btn8 = new JButton("");
		btn8.setDisabledIcon(new ImageIcon(Start.class.getResource("/img/btnsOcho2.jpg")));
		btn8.setBorder(null);
		btn8.setRolloverIcon(new ImageIcon(Start.class.getResource("/img/btnsOcho3.jpg")));
		btn8.setFocusPainted(false);
		btn8.setIcon(new ImageIcon(Start.class.getResource("/img/btnsOcho.jpg")));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				info = caja1.getText();
				if (caja1.getText() == "") {
					caja1.setText("8");
				} else {
					caja1.setText(info + "8");
				}
			}
		});
		btn8.setBounds(64, 321, 65, 50);
		frame.getContentPane().add(btn8);

		btn9 = new JButton("");
		btn9.setDisabledIcon(new ImageIcon(Start.class.getResource("/img/btnsNueve2.jpg")));
		btn9.setBorder(null);
		btn9.setRolloverIcon(new ImageIcon(Start.class.getResource("/img/btnsNueve3.jpg")));
		btn9.setFocusPainted(false);
		btn9.setIcon(new ImageIcon(Start.class.getResource("/img/btnsNueve.jpg")));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				info = caja1.getText();
				if (caja1.getText() == "") {
					caja1.setText("9");
				} else {
					caja1.setText(info + "9");
				}
			}
		});
		btn9.setBounds(128, 321, 65, 50);
		frame.getContentPane().add(btn9);

		// -------------------------------------------------------OPERACIONES-----------------
		btn12 = new JButton("");
		btn12.setDisabledIcon(new ImageIcon(Start.class.getResource("/img/btnMas2.jpg")));
		btn12.setBorder(null);
		btn12.setRolloverIcon(new ImageIcon(Start.class.getResource("/img/btnMas3.jpg")));
		btn12.setFocusPainted(false);
		btn12.setIcon(new ImageIcon(Start.class.getResource("/img/btnMas.jpg")));
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btInMas = 0;// if is empty, go to the Exception
					btTxMas = caja1.getText();// I save in a variable the value it brings from outside
					btInMas = Integer.parseInt(btTxMas);// Parsed
					caja1.setText("");// Clean the box

				} catch (Exception ex) {
					caja1.setText("Error");
					bloquearBtns();
				}

			}
		});
		btn12.setBounds(128, 159, 65, 50);
		frame.getContentPane().add(btn12);
		// -------------------------------------------------------------------------------
		btn13 = new JButton("");
		btn13.setDisabledIcon(new ImageIcon(Start.class.getResource("/img/btnMenos3.jpg")));
		btn13.setBorder(null);
		btn13.setRolloverIcon(new ImageIcon(Start.class.getResource("/img/btnMenos2.jpg")));
		btn13.setFocusPainted(false);
		btn13.setIcon(new ImageIcon(Start.class.getResource("/img/btnMenos.jpg")));
		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btInMenos = 0;
					btTxMenos = caja1.getText();
					btInMenos = Integer.parseInt(btTxMenos);
					caja1.setText("");

				} catch (Exception ex) {
					caja1.setText("Error");
					bloquearBtns();
				}
			}
		});
		btn13.setBounds(190, 159, 65, 50);
		frame.getContentPane().add(btn13);
		// -------------------------------------------------------------------------------
		btn14 = new JButton("");
		btn14.setDisabledIcon(new ImageIcon(Start.class.getResource("/img/btnPor2.jpg")));
		btn14.setBorder(null);
		btn14.setRolloverIcon(new ImageIcon(Start.class.getResource("/img/btnPor3.jpg")));
		btn14.setFocusPainted(false);
		btn14.setIcon(new ImageIcon(Start.class.getResource("/img/btnPor.jpg")));
		btn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btInPor = 0;
					btTxPor = caja1.getText();
					btInPor = Integer.parseInt(btTxPor);
					caja1.setText("");

				} catch (Exception ex) {
					caja1.setText("Error");
					bloquearBtns();
				}
			}
		});
		btn14.setBounds(190, 213, 65, 50);
		frame.getContentPane().add(btn14);
		// -------------------------------------------------------------------------------
		btn15 = new JButton("");
		btn15.setDisabledIcon(new ImageIcon(Start.class.getResource("/img/btnEntre2.jpg")));
		btn15.setBorder(null);
		btn15.setRolloverIcon(new ImageIcon(Start.class.getResource("/img/btnEntre3.jpg")));
		btn15.setFocusPainted(false);
		btn15.setIcon(new ImageIcon(Start.class.getResource("/img/btnEntre.jpg")));
		btn15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btInEntre = 0;
					btTxEntre = caja1.getText();
					btInEntre = Integer.parseInt(btTxEntre);
					caja1.setText("");

				} catch (Exception ex) {
					caja1.setText("Error");
					bloquearBtns();
				}
			}
		});
		btn15.setBounds(190, 267, 65, 50);
		frame.getContentPane().add(btn15);
		// -------------------------------------------------------------------------------

		btn11 = new JButton("");
		btn11.setDisabledIcon(new ImageIcon(Start.class.getResource("/img/btnIgual4.jpg")));
		btn11.setBorder(null);
		btn11.setRolloverIcon(new ImageIcon(Start.class.getResource("/img/btnIgual3.jpg")));
		btn11.setFocusPainted(false);
		btn11.setIcon(new ImageIcon(Start.class.getResource("/img/btnIgual.jpg")));
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					btTxIgual = caja1.getText();
					btInIgual = Integer.parseInt(btTxIgual);

					if (btInMas != 0) {
						resultado = btInMas + btInIgual;
						caja1.setText("" + resultado);
					} else if (btInMenos != 0) {
						resultado = btInMenos - btInIgual;
						caja1.setText("" + resultado);
					} else if (btInPor != 0) {
						resultado = btInPor * btInIgual;
						caja1.setText("" + resultado);
					}
					
					bloquearBtns();

				} catch (Exception ex) {

					caja1.setText("Error");
					bloquearBtns();
				}

				// Division --->I make it apart
				try {
					if (btInEntre != 0) {
						resultado = btInEntre / btInIgual;
						caja1.setText("" + resultado);
					}
					if (btInIgual == 0) {
						caja1.setText("Error");
						bloquearBtns();
					}
				} catch (Exception ex) {
					divisionEntreCero(btInIgual);
				}
			}
		});
		btn11.setBounds(193, 321, 65, 100);
		frame.getContentPane().add(btn11);
		
		panel1 = new JPanel();
		panel1.setBackground(new Color(201, 201, 201));
		panel1.setBounds(0, 0, 276, 111);
		frame.getContentPane().add(panel1);
		
		panel2 = new JPanel();
		panel2.setBackground(new Color(141, 80, 123));
		panel2.setBounds(0, 159, 276, 284);
		frame.getContentPane().add(panel2);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Start.class.getResource("/img/olas.jpg")));
		lblNewLabel.setBounds(0, 110, 276, 50);
		frame.getContentPane().add(lblNewLabel);
		
	}

	// ----------------------------------------------------------FUNCTIONS--------------------------------
	public void bloquearBtns() {
		// btn1.setEnabled(false);

		int i = 0;
		JButton[] botones = { btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14,
				btn15, btnPar };

		for (i = 0; i < botones.length; i++) {
			botones[i].setEnabled(false);
		}
	}

	public void desbloquearBtns() {
		int i = 0;
		JButton[] botones = { btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14,
				btn15, btnPar };

		for (i = 0; i < botones.length; i++) {
			botones[i].setEnabled(true);
		}

	}

	public void divisionEntreCero(int x) {

		if (x == 0) {
			caja1.setText("Indeterminación");
			bloquearBtns();
		}
	}
}