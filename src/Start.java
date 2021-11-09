import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

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
		frame.setBounds(100, 100, 427, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		caja1 = new JTextField();
		caja1.setForeground(Color.DARK_GRAY);
		caja1.setEnabled(false);
		caja1.setHorizontalAlignment(SwingConstants.RIGHT);
		caja1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		caja1.setBounds(29, 32, 353, 43);
		frame.getContentPane().add(caja1);
		caja1.setColumns(10);

		btnC = new JButton("C");
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
		btnC.setBounds(29, 104, 89, 43);
		frame.getContentPane().add(btnC);

		btnPar = new JButton("Par");
		btnPar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					btTxPar = caja1.getText();
					btInPar = Integer.parseInt(btTxPar);
					if (btInPar % 2 != 0) {
						caja1.setText("El numero es inpar");
						bloquearBtns();
					} else {
						caja1.setText("El numero es par");
						bloquearBtns();
					}
				} catch (Exception ex) {
					caja1.setText("Introduzca un numero");
					bloquearBtns();
				}
			}
		});
		btnPar.setBounds(134, 104, 89, 43);
		frame.getContentPane().add(btnPar);

		// -----------------------------------------------------------------------NUMMBER'S_BTNS-------------------------------
		btn10 = new JButton("0");
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
		btn10.setBounds(29, 343, 72, 43);
		frame.getContentPane().add(btn10);

		btn1 = new JButton("1");
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
		btn1.setBounds(29, 181, 72, 43);
		frame.getContentPane().add(btn1);

		btn2 = new JButton("2");
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
		btn2.setBounds(111, 181, 72, 43);
		frame.getContentPane().add(btn2);

		btn3 = new JButton("3");
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
		btn3.setBounds(193, 181, 72, 43);
		frame.getContentPane().add(btn3);

		btn4 = new JButton("4");
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
		btn4.setBounds(29, 235, 72, 43);
		frame.getContentPane().add(btn4);

		btn5 = new JButton("5");
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
		btn5.setBounds(111, 235, 72, 43);
		frame.getContentPane().add(btn5);

		btn6 = new JButton("6");
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
		btn6.setBounds(193, 235, 72, 43);
		frame.getContentPane().add(btn6);

		btn7 = new JButton("7");
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
		btn7.setBounds(29, 289, 72, 43);
		frame.getContentPane().add(btn7);

		btn8 = new JButton("8");
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
		btn8.setBounds(111, 289, 72, 43);
		frame.getContentPane().add(btn8);

		btn9 = new JButton("9");
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
		btn9.setBounds(193, 289, 72, 43);
		frame.getContentPane().add(btn9);

		// -------------------------------------------------------OPERACIONES-----------------
		btn12 = new JButton("+");
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
		btn12.setBounds(310, 181, 72, 43);
		frame.getContentPane().add(btn12);
		// -------------------------------------------------------------------------------
		btn13 = new JButton("-");
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
		btn13.setBounds(310, 235, 72, 43);
		frame.getContentPane().add(btn13);
		// -------------------------------------------------------------------------------
		btn14 = new JButton("*");
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
		btn14.setBounds(310, 289, 72, 43);
		frame.getContentPane().add(btn14);
		// -------------------------------------------------------------------------------
		btn15 = new JButton("/");
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
		btn15.setBounds(310, 343, 72, 43);
		frame.getContentPane().add(btn15);
		// -------------------------------------------------------------------------------

		btn11 = new JButton("=");
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
		btn11.setBounds(111, 343, 154, 43);
		frame.getContentPane().add(btn11);
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
